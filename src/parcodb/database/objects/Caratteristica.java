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
        if (this.comuni.length < 1)
            throw new Exception("Almeno in un comune questa caratteristica si deve trovare");
        this.comuni = comuni;
    }
    
    protected Caratteristica(String nome) {
        super(nome);
        this.comuni = null;
    }

    public Comune[] getComuni() throws SQLException {
        if (comuni == null)
            throw new SQLException("operazione non ancora supportata");
        return comuni;
    }

    @Override
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        super.insertIntoDB(conn);
        PreparedStatement insertStatement = conn.getConn().prepareStatement("INSERT INTO `bdati`.`Caratteristica` (`nome`) VALUES ( ? );");
        
        insertStatement.setString(1, nome);
        
        insertStatement.execute();
        
        for (int i=0; i<comuni.length; i++) {
            Appartiene appartiene = new Appartiene(comuni[i], this);
            appartiene.insertIntoDB(conn);
        }
    }
    
        static public Caratteristica[] getCaratteristiche(DatabaseConnection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                "SELECT `nome` FROM  `Caratteristica` ");
        
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
    
}
