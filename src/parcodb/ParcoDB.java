/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import parcodb.database.PostgreSQL;
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
            PostgreSQL database = new PostgreSQL();
            Logger.getLogger(ParcoDB.class.getName()).log(Level.INFO,"[1] Driver Loaded");
            
            Logger.getLogger(ParcoDB.class.getName()).log(Level.INFO,"[2] Connecting...");
            database.connect();
            Logger.getLogger(ParcoDB.class.getName()).log(Level.INFO,"[2] Connected");
            
            Logger.getLogger(ParcoDB.class.getName()).log(Level.INFO,"[3] Closing...");
            database.close();
            Logger.getLogger(ParcoDB.class.getName()).log(Level.INFO,"[3] Closed");
            
        } catch (SQLException ex) {
            databaseError();
            Logger.getLogger(ParcoDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            databaseError();
            Logger.getLogger(ParcoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        MainGUI gui = new MainGUI(args);
        gui.SetupUi();
        gui.exec();
    }
    
    private static void databaseError() {
        Logger.getLogger(ParcoDB.class.getName()).log(Level.SEVERE, "###Connessione al database non riscita");
    }
}
