/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database;

import java.sql.SQLException;

/**
 *
 * @author matteo
 */
public class MySQLconnector extends DatabaseConnector{

    public MySQLconnector() throws ClassNotFoundException {
        this("localhost",3306);
    }
    
    public MySQLconnector(String databaseAddress,int port) throws ClassNotFoundException {
        super(databaseAddress,port);
        Class.forName("com.mysql.jdbc.Driver");
        //this.databseAddress = "jdbc:mysql://"+databseAddress+':'+port+"/prova2";
        System.out.println(this.genereteAddr("mysql"));
        
        
    }
    
    @Override
    public void connect() throws SQLException {
        super.connect("bdati", "transformer");
    }
    
}
