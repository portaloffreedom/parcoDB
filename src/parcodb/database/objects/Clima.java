/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import parcodb.database.DatabaseConnection;


//public class Clima {
public class Clima implements RemoteDBobject {

    protected int mese;
    protected float temperatura;
    protected float umidita;
    protected float pioggia;
    protected Comune comune;

    public Clima(int mese, float temperatura, float umidita, float pioggia) throws Exception {
        if (mese < 1 || mese > 12 )
            throw new Exception("Mese non valido");
        this.mese = mese;
        this.temperatura = temperatura;
        this.umidita = umidita;
        this.pioggia = pioggia;
    }    

    public int getMese() {
        return mese;
    }

    public float getTemperatura() {
        return temperatura;
    }
    
    public float getUmidita() {
        return umidita;
    }

    public float getPioggia() {
        return pioggia;
    }

    public Comune getComune() {
        return comune;
    }

    void setComune(Comune comune) {
        this.comune = comune;
    }

    @Override
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        throw new UnsupportedOperationException("Will never be supported. "
                + "It is can be called only from inside the package");
    }
        
    void insertIntoDBpackage(DatabaseConnection conn) throws SQLException {
        if (comune == null)
            throw new SQLException("Comune non impostato nel clima");
        PreparedStatement insertIntoZonaStatement = conn.prepareInsertStatement(
   "INSERT INTO Clima (comune, provincia, mese, pioggia, temperatura, umidita) "
        + "VALUES ( ? , ? , ? , ? , ? , ? );");
        
        insertIntoZonaStatement.setString(1, comune.getNome());
        insertIntoZonaStatement.setString(2, comune.getProvincia());
        insertIntoZonaStatement.setInt(3, mese);
        insertIntoZonaStatement.setFloat(4, pioggia);
        insertIntoZonaStatement.setFloat(5, temperatura);
        insertIntoZonaStatement.setFloat(6, umidita);
        
        insertIntoZonaStatement.execute();
    }
    
    static public Clima[] getClimaDiComune(DatabaseConnection conn, String comune, String provincia) throws SQLException {
        //TODO return Clima.getClimaDiComune(conn, Comune.);
        return null;
    }
    
    
    static public Clima[] getClimaDiComune(DatabaseConnection conn, Comune comune) throws SQLException {
        String nomeFunzione = "getClimaDiComune(comune)";
        PreparedStatement preparedStatement = conn.prepareQueryStatement(
                "SELECT comune,provincia,mese,pioggia,temperatura,umidita "
                + "FROM Clima "
                + "WHERE comune = ? AND provincia = ? "
                + "ORDER BY mese ASC");
        
        preparedStatement.setString(1, comune.getNome());
        preparedStatement.setString(2, comune.getProvincia());
        
        ResultSet result = preparedStatement.executeQuery();
        
        int DIM = DatabaseConnection.getResultDim(result);
        Clima[] climi = new Clima[DIM];
        int i;
        for (i=0; result.next(); i++) {
            int mese =  result.getInt(3);
            if (i+1 != mese)
                throw new SQLException("i mesi di "+comune+" nella funzione "
                        + nomeFunzione + " sono incongrui ("+i+','+mese+')');
            try {
                climi[i] = new Clima(
                        mese,
                        result.getFloat(5), 
                        result.getFloat(6), 
                        result.getFloat(4)
                    );            
                climi[i].setComune(comune);
            } catch (Exception ex) {
                Logger.getLogger(Clima.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (i != DIM)
            throw new SQLException("il numero di risultati di " + nomeFunzione
                    + " è incongruo ("+i+','+DIM+')');
        
        return climi;
    }
    
}
