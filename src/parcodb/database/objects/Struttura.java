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


public class Struttura extends Zona {

    protected String indirizzo;
    protected String orario_apertura;
    protected Date periodo_inizio;
    protected Date periodo_fine;
    
    protected Paese paese;
    
    protected static Date transformDate(QDate data) {
        return new Date(data.year(), data.month(), data.day());
    }
    protected static QDate transformDate(Date data) {
        return new QDate(data.getYear(), data.getMonth(), data.getDay());
    }
    
    public Struttura(String nome, String indirizzo, String orario_apertura, QDate periodo_inizio, QDate periodo_fine, Paese paese) {
        this(nome, 
             indirizzo, 
             orario_apertura, 
             transformDate(periodo_inizio), 
             transformDate(periodo_fine),
             paese
            );
    }
    
    protected Struttura(String nome, String indirizzo, String orario_apertura, Date periodo_inizio, Date periodo_fine, Paese paese) {
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
    
        PreparedStatement insertStatement = conn.prepareInsertStatement("INSERT INTO Struttura (nome, indirizzo, orario_apertura, periodo_inizio, periodo_fine, localizzazione) VALUES ( ? , ? , ? , ? , ? , ? );");
            
        insertStatement.clearParameters();
        insertStatement.setString(1, nome);
        insertStatement.setString(2, indirizzo);
        insertStatement.setString(3, orario_apertura);
        insertStatement.setDate(4, periodo_inizio);
        insertStatement.setDate(5, periodo_fine);
        insertStatement.setString(6, paese.getNome());
        insertStatement.execute();
    }
    
        static public Struttura[] getStrutture(DatabaseConnection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareQueryStatement("SELECT nome, indirizzo, orario_apertura, periodo_inizio, periodo_fine, localizzazione FROM Struttura");
        
        ResultSet result = preparedStatement.executeQuery();
        
        int DIM = DatabaseConnection.getResultDim(result);
        Struttura[] strutture = new Struttura[DIM];
        int i;
    
        for (i=0; result.next(); i++) {
            strutture[i] = new Struttura(
                    result.getString(1), 
                    result.getString(2), 
                    result.getString(3),
                    result.getDate(4),
                    result.getDate(5),
                    Paese.getPaese(conn,result.getString(6))
                    );
        }
        
        if (i != DIM)
            throw new SQLException("il numero di risultati di getStrutture() è incongruo ("+i+','+DIM+')');
        
        return strutture;
    }
        
    static public Struttura getStruttura(DatabaseConnection conn, String nome) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareQueryStatement("SELECT nome, indirizzo, orario_apertura, periodo_inizio, periodo_fine, localizzazione FROM Struttura WHERE nome = ? ");
        preparedStatement.setString(1, nome);
        
        ResultSet result = preparedStatement.executeQuery();
        
        int DIM = DatabaseConnection.getResultDim(result);
        if (DIM != 1)
            throw new SQLException("il numero di risultati di getStruttura(nome) è incongruo ( dovrebbe essere 1 , invece è "+DIM+')');
    
        result.next();
        Struttura struttura = new Struttura(
            result.getString(1), 
            result.getString(2), 
            result.getString(3),
            result.getDate(4),
            result.getDate(5),
            Paese.getPaese(conn,result.getString(6))
        );
        
        return struttura;
    }
    
}
