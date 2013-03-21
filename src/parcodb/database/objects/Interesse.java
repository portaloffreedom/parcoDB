/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Interesse implements RemoteDBobject {
    
    protected Caratteristica caratteristica;
    protected Tappa tappa;

    public Interesse(Caratteristica caratteristica, Tappa tappa) {
        this.caratteristica = caratteristica;
        this.tappa = tappa;
    }

    public Caratteristica getCaratteristica() {
        return caratteristica;
    }

    public Tappa getTappa() {
        return tappa;
    }
    
    @Override
    public void insertIntoDB(Connection conn) throws SQLException {
        PreparedStatement insertStatement = conn.prepareStatement("INSERT INTO `bdati`.`Interesse` (`caratteristica`, `tappa_inizio`, `tappa_fine`) VALUES ( ? , ? , ? );");
        
        insertStatement.setString(1, caratteristica.getNome());
        insertStatement.setString(2, tappa.getInizio().getNome());
        insertStatement.setString(3, tappa.getFine().getNome());
        
        insertStatement.execute();
    }
    
}
