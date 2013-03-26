/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import com.trolltech.qt.core.QDate;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import parcodb.database.DatabaseConnection;


public class Monumento extends Struttura {

    protected int anno;
    protected String descrizione;
    
    public Monumento(String nome, int anno, String descrizione, String indirizzo, String orario_apertura, QDate periodo_inizio, QDate periodo_fine, Paese paese) {
        super(nome, indirizzo, orario_apertura, periodo_inizio, periodo_fine, paese);
        this.anno = anno;
        this.descrizione = descrizione;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        super.insertIntoDB(conn);
        PreparedStatement insertStatement = conn.getConn().prepareStatement("INSERT INTO `bdati`.`Monumento` (`nome`, `anno`, `descrizione`) VALUES ( ? , ? , ? );");
        
        insertStatement.setString(1, nome);
        insertStatement.setInt(2, anno);
        insertStatement.setString(3, descrizione);
        insertStatement.execute();
    }    
    
}
