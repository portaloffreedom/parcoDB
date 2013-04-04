/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import parcodb.database.DatabaseConnection;


public class Monte extends Caratteristica {

    protected float altitudine;
    
    public Monte(String nome, float altitudine, Comune[] comuni) throws Exception {
        super(nome, comuni);
        this.altitudine = altitudine;
    }
    
    private Monte(String nome, float altitudine) {
        super(nome);
        this.altitudine = altitudine;
    }

    public float getAltitudine() {
        return altitudine;
    }

    @Override
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        super.insertIntoDB(conn);
        PreparedStatement insertStatement = conn.prepareInsertStatement("INSERT INTO Monte (nome, altitudine) VALUES ( ? , ? );");
        
        insertStatement.clearParameters();
        insertStatement.setString(1, nome);
        insertStatement.setFloat(2, altitudine);
        
        insertStatement.execute();
    }
    
    static public Monte[] getMonti(DatabaseConnection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareQueryStatement("SELECT nome, altitudine FROM Monte");
        
        ResultSet result = preparedStatement.executeQuery();
        
        int DIM = DatabaseConnection.getResultDim(result);
        Monte[] monti = new Monte[DIM];
        int i;
        for (i=0; result.next(); i++) {
            monti[i] = new Monte(result.getString(1), result.getFloat(2));
        }
        
        if (i != DIM)
            throw new SQLException("il numero di risultati di getMonti() è incongruo ("+i+','+DIM+')');
        
        return monti;
    }
    
}
