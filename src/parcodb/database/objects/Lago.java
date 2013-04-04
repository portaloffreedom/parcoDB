/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import parcodb.database.DatabaseConnection;


public class Lago extends Caratteristica {

    protected float estensione;
    
    public Lago(String nome, float estensione, Comune[] comuni) throws Exception {
        super(nome, comuni);
        this.estensione = estensione;
    }
    
    protected Lago(String nome, float estensione) {
        super(nome);
        this.estensione = estensione;
    }

    public float getEstensione() {
        return estensione;
    }

    @Override
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        super.insertIntoDB(conn); 
        PreparedStatement insertStatement = conn.prepareInsertStatement("INSERT INTO Lago (nome, estensione) VALUES ( ? , ? );");
    
        insertStatement.setString(1, nome);
        insertStatement.setFloat(2, estensione);
        
        insertStatement.execute();
    }
    
    static public Lago[] getLaghi(DatabaseConnection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareQueryStatement("SELECT nome, estensione FROM Lago");
        
        ResultSet result = preparedStatement.executeQuery();
        
        int DIM = DatabaseConnection.getResultDim(result);
        Lago[] laghi = new Lago[DIM];
        int i;
        for (i=0; result.next(); i++) {
            laghi[i] = new Lago(result.getString(1), result.getFloat(2));
        }
        
        if (i != DIM)
            throw new SQLException("il numero di risultati di getLaghi() è incongruo ("+i+','+DIM+')');
        
        return laghi;
    }
    
}
