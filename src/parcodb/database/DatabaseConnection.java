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
    
    public void close() throws SQLException {
        conn.close();
    }
    
    public void getCaratteristiche() throws SQLException {
        ResultSet result = getCaratteristicheStatement.executeQuery();
        while (result.next()) {
            System.out.println("Caratteristica: "+result.getString(1));
        }
    }
    
}
