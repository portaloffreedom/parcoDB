/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author matteo
 */
public class DatabaseConnection {
    
    protected Connection conn;
    

    DatabaseConnection(Connection conn) throws SQLException {
        this.conn = conn;
        
    }
    
    public void close() throws SQLException {
        conn.close();
    }
    
    static public int getResultDim(ResultSet result) throws SQLException {
        int rowCount = 0;
        if(result.last()){
           rowCount = result.getRow(); 
           result.beforeFirst();
}       return rowCount;
    }
    
    public PreparedStatement prepareQueryStatement(String query) throws SQLException {
        return conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
    }
    
    public PreparedStatement prepareInsertStatement(String query) throws SQLException {
        return conn.prepareStatement(query);
    }
        
    
}
