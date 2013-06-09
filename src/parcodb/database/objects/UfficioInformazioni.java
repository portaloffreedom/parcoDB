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


public class UfficioInformazioni extends Struttura {

    protected int numero;
    protected String telefono;
    
    public UfficioInformazioni(String nome, int numero, String telefono, String indirizzo, String orario_apertura, QDate periodo_inizio, QDate periodo_fine, Paese paese) {
        this(nome, numero, telefono, indirizzo, orario_apertura, transformDate(periodo_inizio), transformDate(periodo_fine), paese);
    }
    
    protected UfficioInformazioni(String nome, int numero, String telefono, String indirizzo, String orario_apertura, Date periodo_inizio, Date periodo_fine, Paese paese) {
        super(nome, indirizzo, orario_apertura, periodo_inizio, periodo_fine, paese);
        this.numero = numero;
        this.telefono = telefono;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTelefono() {
        return telefono.trim();
    }
    
    @Override
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        super.insertIntoDB(conn);
        
        PreparedStatement insertStatement = conn.prepareInsertStatement(
                "INSERT INTO UfficioInformazioni (nome, numero, telefono) "
                + "VALUES ( ? , ? , ? );");
            
        insertStatement.clearParameters();
        insertStatement.setString(1, nome);
        insertStatement.setInt(2, numero);
        insertStatement.setString(3, telefono);
        insertStatement.execute();
    }
    
    static public UfficioInformazioni[] getUfficiInformazioni(DatabaseConnection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareQueryStatement(
                "SELECT nome, numero, telefono "
                + "FROM UfficioInformazioni");
        
        ResultSet result = preparedStatement.executeQuery();
        
        int DIM = DatabaseConnection.getResultDim(result);
        UfficioInformazioni[] ufficiInformazioni = new UfficioInformazioni[DIM];
        int i;
        for (i=0; result.next(); i++) {
            String nome = result.getString(1);
            Struttura struttura = getStruttura(conn, nome);
            ufficiInformazioni[i] = new UfficioInformazioni(
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
            throw new SQLException("il numero di risultati di "
                    + "getUfficioInformazioni() è incongruo ("+i+','+DIM+')');
        
        return ufficiInformazioni;
    }
    
}
