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


public class Museo extends Struttura {

    protected String descrizione;
    protected String telefono;
    
    public Museo(String nome, String descrizione, String telefono, String indirizzo, String orario_apertura, QDate periodo_inizio, QDate periodo_fine, Paese paese) {
        this(nome, descrizione, telefono, indirizzo, orario_apertura, transformDate(periodo_inizio), transformDate(periodo_fine), paese);
    }
    
    protected Museo(String nome, String descrizione, String telefono, String indirizzo, String orario_apertura, Date periodo_inizio, Date periodo_fine, Paese paese) {
        super(nome, indirizzo, orario_apertura, periodo_inizio, periodo_fine, paese);
        this.descrizione = descrizione;
        this.telefono = telefono;
    }
    
    public String getDescrizione() {
        return descrizione.trim();
    }

    public String getTelefono() {
        return telefono.trim();
    }
    @Override
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        super.insertIntoDB(conn);
        PreparedStatement insertStatement = conn.prepareInsertStatement("INSERT INTO Museo (nome, descrizione, telefono) VALUES ( ? , ? , ? );");
        
        insertStatement.setString(1, nome);
        insertStatement.setString(2, descrizione);
        insertStatement.setString(3, telefono);
        insertStatement.execute();
    }
    
    static public Museo[] getMusei(DatabaseConnection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareQueryStatement("SELECT nome, descrizione, telefono FROM Museo");
        
        ResultSet result = preparedStatement.executeQuery();
        
        int DIM = DatabaseConnection.getResultDim(result);
        Museo[] musei = new Museo[DIM];
        int i;
        for (i=0; result.next(); i++) {
            String nome = result.getString(1);
            Struttura struttura = getStruttura(conn, nome);
            musei[i] = new Museo(
                    nome, 
                    result.getString(2), 
                    result.getString(3),
                    struttura.indirizzo,
                    struttura.orario_apertura,
                    struttura.periodo_inizio,
                    struttura.periodo_fine,
                    struttura.paese
                    );
        }
        
        if (i != DIM)
            throw new SQLException("il numero di risultati di getMusei() è incongruo ("+i+','+DIM+')');
        
        return musei;
    }
    
}
