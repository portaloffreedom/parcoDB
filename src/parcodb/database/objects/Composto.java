/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import parcodb.database.DatabaseConnection;


class Composto implements RemoteDBobject {

    protected Tappa tappa;
    protected Sentiero sentiero;
    protected int numero_tappa;

    public Composto(Tappa tappa, Sentiero sentiero, int numero_tappa) {
        this.tappa = tappa;
        this.sentiero = sentiero;
        this.numero_tappa = numero_tappa;
    }

    public Tappa getTappa() {
        return tappa;
    }

    public Sentiero getSentiero() {
        return sentiero;
    }

    public int getNumero_tappa() {
        return numero_tappa;
    }
    
    @Override
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        PreparedStatement insertStatement = conn.getConn().prepareStatement("INSERT INTO `bdati`.`Composto` (`inizio`, `fine`, `sentiero`, `numero_tappa`) VALUES ( ? , ? );");
        
        insertStatement.setString(1, tappa.getInizio().getNome());
        insertStatement.setString(2, tappa.getFine().getNome());
        insertStatement.setInt(3, sentiero.getNumero_sentiero());
        insertStatement.setFloat(4, numero_tappa);
        
        insertStatement.execute();
    }
    
}
