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
public class PostgreSQL {
    
    private String databseAddress;
    private int port;
    private String login = "admin";
    private String passwd = "fillo89";
    
    private Connection con;

    public PostgreSQL() throws ClassNotFoundException {
        this("localhost",5432);
    }
    
    public PostgreSQL(String databaseAddress,int port) throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        this.databseAddress = databaseAddress;
        this.port = port;
    }
    
    public void connect() throws SQLException {
        //con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/prova2","admin","fillo89");
        con = DriverManager.getConnection("jdbc:postgresql://"+databseAddress+':'+port+"/prova2", login, passwd);
    }
    
    public void close() throws SQLException {
        con.close();
    }
    
}
