/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import parcodb.database.DatabaseConnection;


public class Caratteristica extends Zona {

    protected Comune[] comuni;
    
    protected Caratteristica(String nome, Comune[] comuni) throws Exception {
        this(nome);
        this.comuni = comuni;
        if (this.comuni.length < 1)
            throw new Exception("Almeno in un comune questa caratteristica si deve trovare");
        
    }
    
    protected Caratteristica(String nome) {
        super(nome);
        this.comuni = null;
    }

    public Comune[] getComuni() throws Exception {
        if (comuni == null)
            throw new Exception("connessione al database richiesta");
        return comuni;
    }
    
    public Comune[] getComuni(DatabaseConnection conn) throws SQLException {
        if (comuni == null)
            comuni = Comune.getComuniDiCaratteristica(conn, this);
        return comuni;
    }
    
    public Caratteristica[] getCaratteristicheVicine(DatabaseConnection conn) throws SQLException {
        return Caratteristica.getCaratteristicheVicine(conn, this);
    }
    
    public Tappa[] getTappeInteressate(DatabaseConnection conn) throws SQLException {
        return Tappa.getTappeInteresseCaratteristica(conn, this);
    }
        
    @Override
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        super.insertIntoDB(conn);
        PreparedStatement insertStatement = conn.prepareInsertStatement("INSERT INTO Caratteristica (nome) VALUES ( ? );");
        
        insertStatement.setString(1, nome);
        
        insertStatement.execute();
        
        for (int i=0; i<comuni.length; i++) {
            Appartiene appartiene = new Appartiene(comuni[i], this);
            appartiene.insertIntoDB(conn);
        }
    }
    
    static public Caratteristica[] getCaratteristiche(DatabaseConnection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareQueryStatement(
                "SELECT nome FROM  Caratteristica ");
        
        ResultSet result = preparedStatement.executeQuery();
        
        int DIM = DatabaseConnection.getResultDim(result);
        Caratteristica[] caratteristiche = new Caratteristica[DIM];
        int i;
        for (i=0; result.next(); i++) {
            caratteristiche[i] = new Caratteristica(result.getString(1));
        }
        
        if (i != DIM)
            throw new SQLException("il numero di risultati di getCaratteristiche() è incongruo ("+i+','+DIM+')');
        
        return caratteristiche;
    }
    
    static public Caratteristica[] getCaratteristicheVicine(DatabaseConnection conn, Caratteristica caratteristica) throws SQLException {
        String nomeFunzione = "getCaratteristicheVicine(caratteristica)";
        PreparedStatement preparedStatement = conn.prepareQueryStatement(
                "SELECT nomea,nomeb "
                + "FROM Vicino "
                + "WHERE nomea = ? OR nomeb = ? ");
        
        String nome = caratteristica.getNome();
        preparedStatement.setString(1, nome);
        preparedStatement.setString(2, nome);
        
        ResultSet result = preparedStatement.executeQuery();
        
        int DIM = DatabaseConnection.getResultDim(result);
        Caratteristica[] caratteristiche = new Caratteristica[DIM];
        int i;
        for (i=0; result.next(); i++) {
            String nomea,nomeb;
            nomea = result.getString(1);
            nomeb = result.getString(2);
            if (nomea.equals(nome))
                caratteristiche[i] = new Caratteristica(nomeb);
            else if (nomeb.equals(nome))
                caratteristiche[i] = new Caratteristica(nomeb);
            else
                throw new SQLException("Errore nella costruzione di array in "+nomeFunzione);
        }
        
        if (i != DIM)
            throw new SQLException("il numero di risultati di "+nomeFunzione+" è incongruo ("+i+','+DIM+')');
        
        return caratteristiche;
    }

    static public Caratteristica[] getSpecificCaratteristiche(DatabaseConnection conn) throws SQLException {
        
        Paese[] paesi = Paese.getPaesi(conn);
        Monte[] monti = Monte.getMonti(conn);
        Fiume[] fiumi = Fiume.getFiumi(conn);
        Lago[] laghi = Lago.getLaghi(conn);
        
        int DIM_CARATTERISTICHE = paesi.length 
                + monti.length 
                + fiumi.length
                + laghi.length;
        Caratteristica[] caratteristiche = new Caratteristica[DIM_CARATTERISTICHE];
        
        int i=0;
        for (int j=0; j< paesi.length; i++, j++) {
            caratteristiche[i] = paesi[j];
        }
        for (int j=0; j< monti.length; i++, j++) {
            caratteristiche[i] = monti[j];
        }
        for (int j=0; j< fiumi.length; i++, j++) {
            caratteristiche[i] = fiumi[j];
        }
        for (int j=0; j< laghi.length; i++, j++) {
            caratteristiche[i] = laghi[j];
        }
        
        return caratteristiche;
    }
    
    @Override
    public String toString() {
        return this.getNome().trim();
    }
        
        
    
}
