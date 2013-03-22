/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author matteo
 */
public class DatabaseConnection {
    
    protected Connection conn;
    
    private final PreparedStatement getCaratteristicheStatement;
    

    DatabaseConnection(Connection conn) throws SQLException {
        this.conn = conn;
        this.getCaratteristicheStatement = this.conn.prepareStatement("SELECT `nome` FROM `Caratteristica` ");
        
    }

    public Connection getConn() {
        return conn;
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
    
}
