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
    
    private final PreparedStatement getCaratteristicheStatement;
    private final PreparedStatement insertIntoZoneStatement;
    private final PreparedStatement insertIntoCaratteristicaStatement;
    private final PreparedStatement insertIntoLagoStatement1;
    private final PreparedStatement insertIntoLagoStatement2;
    

    DatabaseConnection(Connection conn) throws SQLException {
        this.conn = conn;
        this.getCaratteristicheStatement = this.conn.prepareStatement("SELECT `nome` FROM `Caratteristica` ");
        this.insertIntoZoneStatement = this.conn.prepareStatement("INSERT INTO `bdati`.`Zona` (`nome`) VALUES ( ? );");
        this.insertIntoCaratteristicaStatement = this.conn.prepareStatement("INSERT INTO `bdati`.`Caratteristica` (`nome`) VALUES ( ? );");
        this.insertIntoLagoStatement1 = this.conn.prepareStatement("INSERT INTO `bdati`.`Lago` (`nome`, `estensione`) VALUES ( ? , ? );");
        this.insertIntoLagoStatement2 = this.conn.prepareStatement("INSERT INTO `bdati`.`Lago` (`nome`) VALUES ( ? );");
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
    
    private void insertIntoZone(String name) throws SQLException {
        this.insertIntoZoneStatement.clearParameters();
        this.insertIntoZoneStatement.setString(1, name);
        this.insertIntoZoneStatement.execute();
    }
    
    private void insertIntoCaratteristica(String name) throws SQLException {
        this.insertIntoZone(name);
        
        this.insertIntoCaratteristicaStatement.setString(1, name);
        this.insertIntoCaratteristicaStatement.execute();
    }
    
    public void insertIntoLago1(String name, float extension) throws SQLException {
        this.insertIntoCaratteristica(name);
        
        this.insertIntoLagoStatement1.setString(1, name);
        this.insertIntoLagoStatement1.setFloat(2, extension);
        this.insertIntoLagoStatement1.execute();
    }
    
}
