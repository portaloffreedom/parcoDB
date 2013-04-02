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


public class Albergo extends Struttura {
    protected String categoria;
    protected int numero_posti;
    protected String telefono;
            
    public Albergo(String nome, String categoria, int numero_posti, String telefono, String indirizzo, String orario_apertura, QDate periodo_inizio, QDate periodo_fine, Paese paese) {
        this(nome, categoria, numero_posti, telefono, indirizzo, orario_apertura, transformDate(periodo_inizio), transformDate(periodo_fine), paese);
    }

    protected Albergo(String nome, String categoria, int numero_posti, String telefono, String indirizzo, String orario_apertura, Date periodo_inizio, Date periodo_fine, Paese paese) {
        super(nome, indirizzo, orario_apertura, periodo_inizio, periodo_fine, paese);
        this.categoria = categoria;
        this.numero_posti = numero_posti;
        this.telefono = telefono;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNumero_posti() {
        return numero_posti;
    }

    public void setNumero_posti(int numero_posti) {
        this.numero_posti = numero_posti;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        super.insertIntoDB(conn);
        PreparedStatement insertStatement = conn.prepareInsertStatement("INSERT INTO Albergo (nome, categoria, numero_posti, telefono) VALUES ( ? , ? , ? , ? );");
        
        insertStatement.setString(1, nome);
        insertStatement.setString(2, categoria);
        insertStatement.setInt(3, numero_posti);
        insertStatement.setString(4, telefono);
        insertStatement.execute();
        
    }
    
    static public Albergo[] getAlberghi(DatabaseConnection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareQueryStatement("SELECT nome, categoria, numero_posti, telefono FROM Albergo");
        
        ResultSet result = preparedStatement.executeQuery();
        
        int DIM = DatabaseConnection.getResultDim(result);
        Albergo[] alberghi = new Albergo[DIM];
        int i;
        for (i=0; result.next(); i++) {
            String nome = result.getString(1);
            Struttura struttura = getStruttura(conn, nome);
            alberghi[i] = new Albergo(
                    nome, 
                    result.getString(2), 
                    result.getInt(3),
                    result.getString(4),
                    struttura.indirizzo,
                    struttura.orario_apertura,
                    struttura.periodo_inizio,
                    struttura.periodo_fine,
                    struttura.paese
                    );
        }
        
        if (i != DIM)
            throw new SQLException("il numero di risultati di getAlberghi() è incongruo ("+i+','+DIM+')');
        
        return alberghi;
    }
}
