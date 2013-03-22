/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

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
    
    public Struttura(String nome, String indirizzo, String orario_apertura, Date periodo_inizio, Date periodo_fine, Paese paese) {
        super(nome);
        this.indirizzo = indirizzo;
        this.orario_apertura = orario_apertura;
        this.periodo_inizio = periodo_inizio;
        this.periodo_fine = periodo_fine;
        this.paese = paese;
    }

    public String getOrario_apertura() {
        return orario_apertura;
    }

    public void setOrario_apertura(String orario_apertura) {
        this.orario_apertura = orario_apertura;
    }

    public Date getPeriodo_inizio() {
        return periodo_inizio;
    }

    public void setPeriodo_inizio(Date periodo_inizio) {
        this.periodo_inizio = periodo_inizio;
    }

    public Date getPeriodo_fine() {
        return periodo_fine;
    }

    public void setPeriodo_fine(Date periodo_fine) {
        this.periodo_fine = periodo_fine;
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
    
        PreparedStatement insertStatement = conn.getConn().prepareStatement("INSERT INTO `bdati`.`Struttura` (`nome`, `indirizzo`, `orario_apertura`, `periodo_inizio`, `periodo_fine`, `localizzazione`) VALUES ( ? , ? , ? , ? , ? , ? );");
            
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
