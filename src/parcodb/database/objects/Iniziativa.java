/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import parcodb.database.DatabaseConnection;


public class Iniziativa implements RemoteDBobject {
    
    protected Paese paese;
    protected int settimana;
    protected String tipo;
    protected String nome;
    protected String dettagli;

    public Iniziativa(Paese paese, int settimana, String tipo, String nome, String dettagli) {
        this.paese = paese;
        this.settimana = settimana;
        this.tipo = tipo;
        this.nome = nome;
        this.dettagli = dettagli;
    }

    public Paese getPaese() {
        return paese;
    }

    public int getSettimana() {
        return settimana;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getDettagli() {
        return dettagli;
    }

    @Override
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        PreparedStatement insertStatement = conn.getConn().prepareStatement("INSERT INTO Iniziativa (paese, settimana, tipo, nome, dettagli) VALUES ( ? , ? , ? , ? , ? );");
        
        insertStatement.setString(1, paese.getNome());
        insertStatement.setInt(2, settimana);
        insertStatement.setString(3, tipo);
        insertStatement.setString(4, nome);
        insertStatement.setString(5, dettagli);
        
        insertStatement.execute();
    }
    
}
