/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author matteo
 */
abstract public class DatabaseConnector {
    
    protected String databseIPAddress;
    protected String databseAddress;
    protected int port;
    
    protected Connection con;
    
    //public DatabaseConnector(String databaseAddress,int port) throws ClassNotFoundException
    protected DatabaseConnector(String databaseAddress,int port) throws ClassNotFoundException {
        this.databseIPAddress = databaseAddress;
        this.port = port;
    }
    
    public DatabaseConnection connect(String username, String password) throws SQLException {
        con = DriverManager.getConnection(databseAddress,username,password);
        return new DatabaseConnection(con);
    }
    
    abstract public DatabaseConnection connect() throws SQLException;
    
    protected String genereteAddr(String databaseName) {
        this.databseAddress = "jdbc:"+databaseName+"://"+databseIPAddress+':'+port+"/bdati";
        return this.databseAddress;
    }
    
}