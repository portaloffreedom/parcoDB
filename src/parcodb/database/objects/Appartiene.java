/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import parcodb.database.DatabaseConnection;

/**
 *
 * @author matteo
 */
class Appartiene implements RemoteDBobject {

    protected Comune comune;
    protected Caratteristica caratteristica;

    Appartiene(Comune comune, Caratteristica caratteristica) {
        this.comune = comune;
        this.caratteristica = caratteristica;
    }

    public Comune getComune() {
        return comune;
    }

    public Caratteristica getCaratteristica() {
        return caratteristica;
    }
    
    @Override
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        if (comune == null)
            throw new SQLException("Comune non impostato in \"Appartiene\"");
        if (caratteristica == null)
            throw new SQLException("Caratteristica non impostata in \"Appartiene\"");
        
        PreparedStatement insertIntoZonaStatement = conn.getConn().prepareStatement("INSERT INTO `bdati`.`Appartiene` (`caratteristica`, `comune`, `provincia`) VALUES ( ? , ? , ? );");
        
        insertIntoZonaStatement.setString(1, caratteristica.getNome());
        insertIntoZonaStatement.setString(2, comune.getNome());
        insertIntoZonaStatement.setString(3, comune.getProvincia());
        
        insertIntoZonaStatement.execute();
        
    }
    
}
