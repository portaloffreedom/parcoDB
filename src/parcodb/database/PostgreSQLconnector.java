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
public class PostgreSQLconnector extends DatabaseConnector {

    public PostgreSQLconnector() throws ClassNotFoundException {
        this("localhost",5432);
    }
    
    public PostgreSQLconnector(String databaseAddress,int port) throws ClassNotFoundException {
        super(databaseAddress,port);
        Class.forName("org.postgresql.Driver");
        //this.databseAddress = "jdbc:postgresql://"+databseAddress+':'+port+"/prova2";
        this.genereteAddr("postgresql");
    }

    @Override
    public DatabaseConnection connect() throws SQLException {
        return (super.connect("admin", "fillo89"));
    }
    

}
