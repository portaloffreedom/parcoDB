/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Vicino implements RemoteDBobject {
    
    protected Caratteristica caratteristicaA;
    protected Caratteristica caratteristicaB;

    public Vicino(Caratteristica caratteristicaA, Caratteristica caratteristicaB) {
        this.caratteristicaA = caratteristicaA;
        this.caratteristicaB = caratteristicaB;
    }

    public Caratteristica getCaratteristicaA() {
        return caratteristicaA;
    }

    public Caratteristica getCaratteristicaB() {
        return caratteristicaB;
    }

    @Override
    public void insertIntoDB(Connection conn) throws SQLException {
        PreparedStatement insertStatement = conn.prepareStatement("INSERT INTO `bdati`.`Vicino` (`nomeA`, `nomeB`) VALUES ( ? , ? );");
        
        insertStatement.setString(1, caratteristicaA.getNome());
        insertStatement.setString(2, caratteristicaB.getNome());
        
        insertStatement.execute();
    }
    
}
