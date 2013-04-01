/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import com.trolltech.qt.core.QDate;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import parcodb.database.DatabaseConnection;


public class Struttura extends Zona {

    protected String indirizzo;
    protected String orario_apertura;
    protected Date periodo_inizio;
    protected Date periodo_fine;
    
    protected Paese paese;
    
    public Struttura(String nome, String indirizzo, String orario_apertura, QDate periodo_inizio, QDate periodo_fine, Paese paese) {
        super(nome);
        this.indirizzo = indirizzo;
        this.orario_apertura = orario_apertura;
        this.periodo_inizio = new Date(periodo_inizio.year(), periodo_inizio.month(), periodo_inizio.day());
        this.periodo_fine = new Date(periodo_fine.year(), periodo_fine.month(), periodo_fine.day());
        this.paese = paese;
    }

    public String getOrario_apertura() {
        return orario_apertura;
    }

    public Date getPeriodo_inizio() {
        return periodo_inizio;
    }

    public Date getPeriodo_fine() {
        return periodo_fine;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    @Override
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        super.insertIntoDB(conn); //To change body of generated methods, choose Tools | Templates.
    
        PreparedStatement insertStatement = conn.getConn().prepareStatement("INSERT INTO Struttura (nome, indirizzo, orario_apertura, periodo_inizio, periodo_fine, localizzazione) VALUES ( ? , ? , ? , ? , ? , ? );");
            
        insertStatement.clearParameters();
        insertStatement.setString(1, nome);
        insertStatement.setString(2, indirizzo);
        insertStatement.setString(3, orario_apertura);
        insertStatement.setDate(4, periodo_inizio);
        insertStatement.setDate(5, periodo_fine);
        insertStatement.setString(6, paese.getNome());
        insertStatement.execute();
    }
    
}
