/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.SQLException;
import parcodb.database.DatabaseConnection;

/**
 *
 * @author matteo
 */
public interface RemoteDBobject {
    
    void insertIntoDB(DatabaseConnection conn) throws SQLException;
}
