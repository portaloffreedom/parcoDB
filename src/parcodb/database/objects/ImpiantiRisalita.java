/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ImpiantiRisalita extends Struttura {
    
    protected String tipologia;

    public ImpiantiRisalita(String nome, String tipologia, String indirizzo, String orario_apertura, Date periodo_inizio, Date periodo_fine, Paese paese) {
        super(nome, indirizzo, orario_apertura, periodo_inizio, periodo_fine, paese);
        this.tipologia = tipologia;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    @Override
    public void insertIntoDB(Connection conn) throws SQLException {
        super.insertIntoDB(conn);
        
        PreparedStatement insertStatement = conn.prepareStatement("INSERT INTO `bdati`.`ImpiantiRisalita` (`nome`, `tipologia`) VALUES ( ? , ? );");
            
        insertStatement.clearParameters();
        insertStatement.setString(1, nome);
        insertStatement.setString(2, tipologia);
        insertStatement.execute();
    }
    
    
    
}
