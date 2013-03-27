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
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public Clima[] getClima() throws SQLException {
        if (climaArray == null)
            throw new SQLException("operazione non ancora supportata");
        return climaArray;
    }

    @Override
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        PreparedStatement insertStatement = conn.getConn().prepareStatement("INSERT INTO `bdati`.`Comune` (`nome`, `provincia`, `superficie`) VALUES ( ? , ? , ? );");
        
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
    
    static public Comune[] getComuni(DatabaseConnection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.getConn().prepareStatement("SELECT `nome`, `provincia`, `superficie` FROM `bdati`.`Comune`");
        
        ResultSet result = preparedStatement.executeQuery();
        
        int DIM = DatabaseConnection.getResultDim(result);
        Comune[] comuni = new Comune[DIM];
        int i;
        for (i=0; result.next(); i++) {
            comuni[i] = new Comune(result.getString(1), result.getString(2), result.getFloat(3));
        }
        
        if (i != DIM)
            throw new SQLException("il numero di risultati di getComuni() è incongruo ("+i+','+DIM+')');
        
        return comuni;
    }
    
    @Override
    public String toString(){
        return nome;
    }
}
