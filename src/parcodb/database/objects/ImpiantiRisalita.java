/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import com.trolltech.qt.core.QDate;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import parcodb.database.DatabaseConnection;


public class ImpiantiRisalita extends Struttura {
    
    protected String tipologia;
    protected int capacita;

    public ImpiantiRisalita(String nome, String tipologia, int capacita, String indirizzo, String orario_apertura, QDate periodo_inizio, QDate periodo_fine, Paese paese) {
        super(nome, indirizzo, orario_apertura, periodo_inizio, periodo_fine, paese);
        this.tipologia = tipologia;
        this.capacita = capacita;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    @Override
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        super.insertIntoDB(conn);
        
        //TODO impostare anche la capacità
        PreparedStatement insertStatement = conn.getConn().prepareStatement("INSERT INTO `bdati`.`ImpiantiRisalita` (`nome`, `tipologia`, `capacita`) VALUES ( ? , ? , ? );");
            
        insertStatement.clearParameters();
        insertStatement.setString(1, nome);
        insertStatement.setString(2, tipologia);
        insertStatement.setInt(3, capacita);
        insertStatement.execute();
    }
    
    
    
}
