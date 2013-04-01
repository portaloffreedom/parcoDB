/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import com.trolltech.qt.core.QDate;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import parcodb.database.DatabaseConnection;


public class Museo extends Struttura {

    protected String descrizione;
    protected String telefono;
    
    public Museo(String nome, String descrizione, String telefono, String indirizzo, String orario_apertura, QDate periodo_inizio, QDate periodo_fine, Paese paese) {
        super(nome, indirizzo, orario_apertura, periodo_inizio, periodo_fine, paese);
        this.descrizione = descrizione;
        this.telefono = telefono;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        super.insertIntoDB(conn);
        PreparedStatement insertStatement = conn.getConn().prepareStatement("INSERT INTO Fiume (nome, descirzione, telefono) VALUES ( ? , ? , ? );");
        
        insertStatement.setString(1, nome);
        insertStatement.setString(2, descrizione);
        insertStatement.setString(3, telefono);
        insertStatement.execute();
    }
    
}
