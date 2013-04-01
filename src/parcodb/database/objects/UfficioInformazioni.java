/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import com.trolltech.qt.core.QDate;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import parcodb.database.DatabaseConnection;


public class UfficioInformazioni extends Struttura {

    protected int numero;
    protected String telefono;
    
    public UfficioInformazioni(String nome, int numero, String telefono, String indirizzo, String orario_apertura, QDate periodo_inizio, QDate periodo_fine, Paese paese) {
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
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        super.insertIntoDB(conn);
        
        PreparedStatement insertStatement = conn.getConn().prepareStatement("INSERT INTO UfficioInformazioni (nome, numero, telefono) VALUES ( ? , ? , ? );");
            
        insertStatement.clearParameters();
        insertStatement.setString(1, nome);
        insertStatement.setInt(2, numero);
        insertStatement.setString(3, telefono);
        insertStatement.execute();
    }
    
    
}
