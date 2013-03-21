/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Sentiero implements RemoteDBobject {

    protected int numero_sentiero;
    protected float lunghezza;
    protected Tappa[] tappe;

    public Sentiero(int numero_sentiero, float lunghezza, Tappa[] tappe) throws Exception {
        if (tappe.length < 4 || tappe.length > 10)
            throw new Exception("il sentiero deve essere composto da 4 a 10 tappe");
        this.numero_sentiero = numero_sentiero;
        this.lunghezza = lunghezza;
        this.tappe = tappe;
    }

    public int getNumero_sentiero() {
        return numero_sentiero;
    }

    public float getLunghezza() {
        return lunghezza;
    }
    
    @Override
    public void insertIntoDB(Connection conn) throws SQLException {
        for (int i=0; i<tappe.length; i++) {
            Composto composto = new Composto(tappe[i], this, i);
            composto.insertIntoDB(conn);
        }
        
        PreparedStatement insertStatement = conn.prepareStatement("INSERT INTO `bdati`.`Sentiero` (`numero_sentiero`, `lunghezza`) VALUES ( ? , ? );");
        
        insertStatement.setInt(1, numero_sentiero);
        insertStatement.setFloat(2, lunghezza);
        
        insertStatement.execute();
    }
    
}
