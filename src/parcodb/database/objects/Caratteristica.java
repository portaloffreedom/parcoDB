/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public abstract class Caratteristica extends Zona {

    protected Caratteristica(String nome) {
        super(nome);
    }

    @Override
    public void insertIntoDB(Connection conn) throws SQLException {
        super.insertIntoDB(conn);
        PreparedStatement insertStatement = conn.prepareStatement("INSERT INTO `bdati`.`Caratteristica` (`nome`) VALUES ( ? );");
        
        insertStatement.setString(1, nome);
        
        insertStatement.execute();
    }
    
}
