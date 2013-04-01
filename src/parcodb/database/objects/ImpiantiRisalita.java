/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import com.trolltech.qt.core.QDate;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import parcodb.database.DatabaseConnection;
import static parcodb.database.objects.Struttura.getStruttura;


public class ImpiantiRisalita extends Struttura {
    
    protected String tipologia;
    protected int capacita;

    public ImpiantiRisalita(String nome, String tipologia, int capacita, String indirizzo, String orario_apertura, QDate periodo_inizio, QDate periodo_fine, Paese paese) {
        this(nome, tipologia, capacita, indirizzo, orario_apertura, transformDate(periodo_inizio), transformDate(periodo_fine), paese);
    }
    
    protected ImpiantiRisalita(String nome, String tipologia, int capacita, String indirizzo, String orario_apertura, Date periodo_inizio, Date periodo_fine, Paese paese) {
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
        PreparedStatement insertStatement = conn.getConn().prepareStatement("INSERT INTO ImpiantiRisalita (nome, tipologia, capacita) VALUES ( ? , ? , ? );");
            
        insertStatement.clearParameters();
        insertStatement.setString(1, nome);
        insertStatement.setString(2, tipologia);
        insertStatement.setInt(3, capacita);
        insertStatement.execute();
    }
    
    static public ImpiantiRisalita[] getImpiantiRisalita(DatabaseConnection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.getConn().prepareStatement("SELECT nome, tipologia, capacita FROM Albergo");
        
        ResultSet result = preparedStatement.executeQuery();
        
        int DIM = DatabaseConnection.getResultDim(result);
        ImpiantiRisalita[] impiantiRisalita = new ImpiantiRisalita[DIM];
        int i;
        for (i=0; result.next(); i++) {
            String nome = result.getString(1);
            Struttura struttura = getStruttura(conn, nome);
            impiantiRisalita[i] = new ImpiantiRisalita(
                    nome, 
                    result.getString(2), 
                    result.getInt(3),
                    struttura.indirizzo,
                    struttura.orario_apertura,
                    struttura.periodo_inizio,
                    struttura.periodo_fine,
                    struttura.paese
                    );
        }
        
        if (i != DIM)
            throw new SQLException("il numero di risultati di getImpiantiRisalita() è incongruo ("+i+','+DIM+')');
        
        return impiantiRisalita;
    }
    
}
