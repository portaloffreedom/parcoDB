/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Tappa implements RemoteDBobject {
    
    protected Zona inizio;
    protected Zona fine;
    protected float lunghezza;

    public Tappa(Zona inizio, Zona fine, float lunghezza) {
        this.inizio = inizio;
        this.fine = fine;
        this.lunghezza = lunghezza;
    }

    public Zona getInizio() {
        return inizio;
    }

    public Zona getFine() {
        return fine;
    }

    public float getLunghezza() {
        return lunghezza;
    }

    @Override
    public void insertIntoDB(Connection conn) throws SQLException {
        PreparedStatement insertStatement = conn.prepareStatement("INSERT INTO `bdati`.`Tappa` (`inizio`, `fine`, `lunghezza`) VALUES ( ? , ? , ? );");
        
        insertStatement.setString(1, inizio.getNome());
        insertStatement.setString(2, fine.getNome());
        insertStatement.setFloat(3, lunghezza);
        
        insertStatement.execute();
    }
    
}
