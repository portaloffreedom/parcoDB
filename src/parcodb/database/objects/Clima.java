/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.PreparedStatement;
import java.sql.SQLException;
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

    public void setMese(int mese) {
        this.mese = mese;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getUmidita() {
        return umidita;
    }

    public void setUmidita(float umidita) {
        this.umidita = umidita;
    }

    public float getPioggia() {
        return pioggia;
    }

    public void setPioggia(float pioggia) {
        this.pioggia = pioggia;
    }

    public Comune getComune() {
        return comune;
    }

    public void setComune(Comune comune) {
        this.comune = comune;
    }

    @Override
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        throw new UnsupportedOperationException("Will never be supported. It is can be called only from inside the package");
    }
        
    void insertIntoDBpackage(DatabaseConnection conn) throws SQLException {
        if (comune == null)
            throw new SQLException("Comune non impostato nel clima");
        PreparedStatement insertIntoZonaStatement = conn.getConn().prepareStatement("INSERT INTO Clima (comune, provincia, mese, pioggia, temperatura, umidita) VALUES ( ? , ? , ? , ? , ? , ? );");
        
        insertIntoZonaStatement.setString(1, comune.getNome());
        insertIntoZonaStatement.setString(2, comune.getProvincia());
        insertIntoZonaStatement.setInt(3, mese);
        insertIntoZonaStatement.setFloat(4, pioggia);
        insertIntoZonaStatement.setFloat(5, temperatura);
        insertIntoZonaStatement.setFloat(6, umidita);
        
        insertIntoZonaStatement.execute();
    }
    
}
