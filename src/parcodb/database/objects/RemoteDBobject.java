/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author matteo
 */
public interface RemoteDBobject {
    
    void insertIntoDB(Connection conn) throws SQLException;
}
