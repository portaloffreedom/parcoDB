/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import parcodb.database.DatabaseConnection;


public class Albergo extends Struttura {
    protected String categoria;
    protected int numero_posti;
    protected String telefono;
            
    public Albergo(String nome, String categoria, int numero_posti, String telefono, String indirizzo, String orario_apertura, Date periodo_inizio, Date periodo_fine, Paese paese) {
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
        PreparedStatement insertStatement = conn.getConn().prepareStatement("INSERT INTO `bdati`.`Albergo` (`nome`, `categoria`, `numero_posti`, `telefono`) VALUES ( ? , ? , ? , ? );");
        
        insertStatement.setString(1, nome);
        insertStatement.setString(2, categoria);
        insertStatement.setInt(3, numero_posti);
        insertStatement.setString(4, telefono);
        insertStatement.execute();
        
    }
    
}
