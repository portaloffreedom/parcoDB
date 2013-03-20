/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Lago extends Caratteristica {

    protected float estensione;
    
    public Lago(String nome, float estensione) {
        super(nome);
        this.estensione = estensione;
    }

    public float getEstensione() {
        return estensione;
    }

    public void setEstensione(float estensione) {
        this.estensione = estensione;
    }

    @Override
    public void insertIntoDB(Connection conn) throws SQLException {
        super.insertIntoDB(conn); 
        PreparedStatement insertStatement = conn.prepareStatement("INSERT INTO `bdati`.`Lago` (`nome`, `estensione`) VALUES ( ? , ? );");
    
        insertStatement.setString(1, nome);
        insertStatement.setFloat(2, estensione);
        
        insertStatement.execute();
    }
    
}
