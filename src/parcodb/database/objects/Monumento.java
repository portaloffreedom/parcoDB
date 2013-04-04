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


public class Monumento extends Struttura {

    protected int anno;
    protected String descrizione;
    
    public Monumento(String nome, int anno, String descrizione, String indirizzo, String orario_apertura, QDate periodo_inizio, QDate periodo_fine, Paese paese) {
        this(nome, anno, descrizione, indirizzo, orario_apertura, transformDate(periodo_inizio), transformDate(periodo_fine), paese);
    }
    
    protected Monumento(String nome, int anno, String descrizione, String indirizzo, String orario_apertura, Date periodo_inizio, Date periodo_fine, Paese paese) {
        super(nome, indirizzo, orario_apertura, periodo_inizio, periodo_fine, paese);
        this.anno = anno;
        this.descrizione = descrizione;
    }

    public int getAnno() {
        return anno;
    }
    public String getDescrizione() {
        return descrizione.trim();
    }

    @Override
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        super.insertIntoDB(conn);
        PreparedStatement insertStatement = conn.prepareInsertStatement("INSERT INTO Monumento (nome, anno, descrizione) VALUES ( ? , ? , ? );");
        
        insertStatement.setString(1, nome);
        insertStatement.setInt(2, anno);
        insertStatement.setString(3, descrizione);
        insertStatement.execute();
    }
    
    static public Monumento[] getMonumenti(DatabaseConnection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareQueryStatement("SELECT nome, anno, descrizione FROM Monumento");
        
        ResultSet result = preparedStatement.executeQuery();
        
        int DIM = DatabaseConnection.getResultDim(result);
        Monumento[] monumenti = new Monumento[DIM];
        int i;
        for (i=0; result.next(); i++) {
            String nome = result.getString(1);
            Struttura struttura = getStruttura(conn, nome);
            monumenti[i] = new Monumento(
                    nome, 
                    result.getInt(2), 
                    result.getString(3),
                    struttura.indirizzo,
                    struttura.orario_apertura,
                    struttura.periodo_inizio,
                    struttura.periodo_fine,
                    struttura.paese
                    );
        }
        
        if (i != DIM)
            throw new SQLException("il numero di risultati di getMonumento() è incongruo ("+i+','+DIM+')');
        
        return monumenti;
    }
    
}
