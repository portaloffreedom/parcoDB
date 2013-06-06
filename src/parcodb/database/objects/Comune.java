/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import parcodb.database.DatabaseConnection;

/**
 *
 * @author matteo
 */
public class Comune implements RemoteDBobject {
    protected String nome;
    protected String provincia;
    protected float superficie;
    protected Clima[] climaArray;

    public Comune(String nome, String provincia, float superficie, Clima[] climaArray) throws Exception {
        this(nome, provincia, superficie);
        if (climaArray.length != 12)
            throw new Exception("ad ogni comune devono essere associati 12 climi, uno per ogni mese");
        this.climaArray = climaArray;
        
        this.ClimaSetUP();
    }

    private Comune(String nome, String provincia, float superficie) {
        this.nome = nome;
        this.provincia = provincia;
        this.superficie = superficie;
    }
            
    private void ClimaSetUP() {
        for (int i=0; i< climaArray.length; i++) {
            climaArray[i].setComune(this);
        }
    }

    public String getNome() {
        return nome.trim();
    }

    public String getProvincia() {
        return provincia.trim();
    }

    public float getSuperficie() {
        return superficie;
    }

    public Clima[] getClima() throws SQLException {
        if (climaArray == null)
            throw new SQLException("connessione al database richiesta");
        return climaArray;
    }
    
    public Clima[] getClima(DatabaseConnection conn) throws SQLException {
        if (climaArray == null)
            climaArray = Clima.getClimaDiComune(conn, this);
        return climaArray;
    }

    @Override
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        PreparedStatement insertStatement = conn.prepareInsertStatement(
                "INSERT INTO Comune (nome, provincia, superficie) "
                + "VALUES ( ? , ? , ? );");
        
        insertStatement.setString(1, nome);
        insertStatement.setString(2, provincia);
        if (superficie > 0)
            insertStatement.setFloat(3, superficie);
        else
            insertStatement.setNull(3, Types.FLOAT);
        
        insertStatement.execute();
        
         for (int i=0; i< climaArray.length; i++) {
            climaArray[i].insertIntoDBpackage(conn);
        }
    }
    
    static private Comune[] populateComuni(PreparedStatement smt, String nomeFunzione, int posNome, int posProvincia, int posSuperficie) throws SQLException {
        ResultSet result = smt.executeQuery();
        
        int DIM = DatabaseConnection.getResultDim(result);
        Comune[] comuni = new Comune[DIM];
        int i;
        for (i=0; result.next(); i++) {
            comuni[i] = new Comune(
                    result.getString(posNome), 
                    result.getString(posProvincia), 
                    result.getFloat(posSuperficie)
                );
        }
        
        if (i != DIM)
            throw new SQLException("il numero di risultati di " + nomeFunzione
                    + " è incongruo ("+i+','+DIM+')');
        
        return comuni;
    }
    
    static public Comune[] getComuni(DatabaseConnection conn) throws SQLException {
        String nomeFunzione = "getComuni()";
        PreparedStatement preparedStatement = conn.prepareQueryStatement(
                "SELECT nome, provincia, superficie "
                + "FROM Comune "
                + "ORDER BY provincia,nome ");
        
        return populateComuni(preparedStatement, nomeFunzione, 1, 2, 3);
    }
    
    static public Comune[] getComuniDiCaratteristica(DatabaseConnection conn, String caratteristica) throws SQLException {
        String nomeFunzione = "getComuniDiCaratteristica()";
        PreparedStatement preparedStatement = conn.prepareQueryStatement(
                "SELECT Comune.nome, Comune.provincia, Comune.superficie "
                + "FROM Comune,Appartiene "
                + "WHERE Comune.nome = Appartiene.comune "
                + "AND Comune.provincia = Appartiene.provincia "
                + "AND Appartiene.caratteristica = ? "
                + "ORDER BY Comune.provincia,Comune.nome ");
        
        preparedStatement.setString(1, caratteristica);
        
        return populateComuni(preparedStatement, nomeFunzione, 1, 2, 3);
    }
    
    static public Comune[] getComuniDiCaratteristica(DatabaseConnection conn, Caratteristica caratteristica) throws SQLException {
        return Comune.getComuniDiCaratteristica(conn, caratteristica.getNome());
    }
    
    @Override
    public String toString(){
        return getNome() + " ("+getProvincia()+')';
    }
}
