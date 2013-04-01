/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import parcodb.database.DatabaseConnection;


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
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        PreparedStatement insertStatement = conn.getConn().prepareStatement("INSERT INTO Tappa (inizio, fine, lunghezza) VALUES ( ? , ? , ? );");
        
        insertStatement.setString(1, inizio.getNome());
        insertStatement.setString(2, fine.getNome());
        insertStatement.setFloat(3, lunghezza);
        
        insertStatement.execute();
    }
    
        static public Tappa[] getTappe(DatabaseConnection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                "SELECT inizio,fine,lunghezza FROM  Tappa ");
        
        ResultSet result = preparedStatement.executeQuery();
        
        int DIM = DatabaseConnection.getResultDim(result);
        Tappa[] tappe = new Tappa[DIM];
        int i;
        for (i=0; result.next(); i++) {
            tappe[i] = new Tappa(new Zona(result.getString(1)),new Zona(result.getString(2)),result.getFloat(3));
        }
        
        if (i != DIM)
            throw new SQLException("il numero di risultati di getTappe() è incongruo ("+i+','+DIM+')');
        
        return tappe;
    }
    
    
}
