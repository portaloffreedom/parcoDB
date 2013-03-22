/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import parcodb.database.DatabaseConnection;
import parcodb.database.DatabaseConnector;
import parcodb.database.MySQLconnector;
import parcodb.database.PostgreSQLconnector;
import parcodb.database.objects.Caratteristica;
import parcodb.database.objects.Zona;
import parcodb.gui.MainGUI;

/**
 *
 * @author matteo
 */
public class ParcoDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Logger.getLogger(ParcoDB.class.getName()).setLevel(Level.ALL); 
        
        try {
            Logger.getLogger(ParcoDB.class.getName()).log(Level.INFO,"[1] Loading Driver...");
            DatabaseConnector database = new MySQLconnector();
            Logger.getLogger(ParcoDB.class.getName()).log(Level.INFO,"[1] Driver Loaded");
            
            Logger.getLogger(ParcoDB.class.getName()).log(Level.INFO,"[2] Connecting...");
            DatabaseConnection conn = database.connect();
            Logger.getLogger(ParcoDB.class.getName()).log(Level.INFO,"[2] Connected");
            
            Logger.getLogger(ParcoDB.class.getName()).log(Level.INFO,"[3] Querying...");
            Zona[] zone = Zona.getZone(conn);
            for (int i=0; i<zone.length; i++){
                System.out.println("Zona "+i+":"+zone[i].getNome());
            }
            Caratteristica[] caratteristiche = Caratteristica.getCaratteristiche(conn);
            for (int i=0; i<caratteristiche.length; i++){
                System.out.println("Caratteristica "+i+":"+caratteristiche[i].getNome());
            }
            Logger.getLogger(ParcoDB.class.getName()).log(Level.INFO,"[3] Query done");
            
            Logger.getLogger(ParcoDB.class.getName()).log(Level.INFO,"[3] Closing...");
            conn.close();
            Logger.getLogger(ParcoDB.class.getName()).log(Level.INFO,"[3] Closed");
            
        } catch (SQLException ex) {
            databaseError();
            Logger.getLogger(ParcoDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            databaseError();
            Logger.getLogger(ParcoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        MainGUI gui = new MainGUI(args);
        gui.exec();
    }
    
    private static void databaseError() {
        Logger.getLogger(ParcoDB.class.getName()).log(Level.SEVERE, "###Connessione al database non riscita");
    }
}
