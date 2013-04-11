/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import parcodb.database.DatabaseConnection;


public class Sentiero implements RemoteDBobject {

    protected int numero_sentiero;
    protected float lunghezza;
    protected Tappa[] tappe;

    public Sentiero(int numero_sentiero, Tappa[] tappe) throws Exception {
        this(numero_sentiero);
        if (tappe.length < 4 || tappe.length > 10)
            throw new Exception("il sentiero deve essere composto da 4 a 10 tappe");
        //for(int i=0;i<tappe.length;i++) this.lunghezza = this.lunghezza + tappe[i].getLunghezza();
        this.tappe = tappe;
    }
    
    protected Sentiero(int numero_sentiero) {
        this(numero_sentiero, 0.0f);
    }
    
    protected Sentiero(int numero_sentiero, float lunghezza) {
       this.numero_sentiero = numero_sentiero; 
       this.lunghezza = lunghezza;
    }
        

    public int getNumero_sentiero() {
        return numero_sentiero;
    }

    public float getLunghezza() {
        return lunghezza;
    }

    public Tappa[] getTappe() throws Exception {
        if (tappe == null)
            throw new Exception("connessione al database richiesta");
        return tappe;
    }
    
    public Tappa[] getTappe(DatabaseConnection conn) throws Exception {
        if (tappe == null)
            tappe = Tappa.getTappeDiSentiero(conn, this);
        return tappe;
    }
    
    @Override
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        PreparedStatement insertStatement = conn.prepareInsertStatement("INSERT INTO Sentiero (numero_sentiero, lunghezza) VALUES ( ? , ? );");
        
        insertStatement.setInt(1, numero_sentiero);
        insertStatement.setFloat(2, lunghezza);
        
        insertStatement.execute();
        
        for (int i=0; i<tappe.length; i++) {
            Composto composto = new Composto(tappe[i], this, i+1);
            composto.insertIntoDB(conn);
        }
        
    }
    
    static public Sentiero[] getSentieri(DatabaseConnection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareQueryStatement("SELECT * FROM Sentiero;");
        
        ResultSet result = preparedStatement.executeQuery();
        
        int DIM = DatabaseConnection.getResultDim(result);
        Sentiero[] sentieri = new Sentiero[DIM];
        int i;
        for (i=0; result.next(); i++) {
            sentieri[i] = new Sentiero(result.getInt(1), result.getFloat(2));
        }
        
        if (i != DIM)
            throw new SQLException("il numero di risultati di getMonti() è incongruo ("+i+','+DIM+')');
        
        return sentieri;
    }

    @Override
    public String toString() {
        return "Sentiero numero "+this.getNumero_sentiero();
    }
    
}
