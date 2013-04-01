/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import parcodb.database.DatabaseConnection;


public class Monte extends Caratteristica {

    protected float altitudine;
    
    public Monte(String nome, float altitudine, Comune[] comuni) throws Exception {
        super(nome, comuni);
        this.altitudine = altitudine;
    }

    public float getAltitudine() {
        return altitudine;
    }

    public void setAltitudine(float altitudine) {
        this.altitudine = altitudine;
    }

    @Override
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        super.insertIntoDB(conn);
        PreparedStatement insertStatement = conn.getConn().prepareStatement("INSERT INTO Fiume (nome, altitudine) VALUES ( ? , ? );");
        
        insertStatement.clearParameters();
        insertStatement.setString(1, nome);
        insertStatement.setFloat(2, altitudine);
        
        insertStatement.execute();
    }
    
}
