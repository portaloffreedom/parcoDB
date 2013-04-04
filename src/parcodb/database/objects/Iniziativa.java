/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        return tipo.trim();
    }

    public String getNome() {
        return nome.trim();
    }

    public String getDettagli() {
        return dettagli.trim();
    }

    @Override
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        PreparedStatement insertStatement = conn.prepareInsertStatement(
                "INSERT INTO Iniziativa (paese, settimana, tipo, nome, dettagli)"
                + " VALUES ( ? , ? , ? , ? , ? );");
        
        insertStatement.setString(1, paese.getNome());
        insertStatement.setInt(2, settimana);
        insertStatement.setString(3, tipo);
        insertStatement.setString(4, nome);
        insertStatement.setString(5, dettagli);
        
        insertStatement.execute();
    }
    
    static public Iniziativa[] getIniziative(DatabaseConnection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareQueryStatement(
                "SELECT paese, settimana, tipo, nome, dettagli "
                + "FROM Monumento");
        
        ResultSet result = preparedStatement.executeQuery();
        
        int DIM = DatabaseConnection.getResultDim(result);
        Iniziativa[] iniziative = new Iniziativa[DIM];
        int i;
        for (i=0; result.next(); i++) {
            String nome_paese = result.getString(1);
            Paese paese = Paese.getPaese(conn, nome_paese);
            iniziative[i] = new Iniziativa(
                    paese, 
                    result.getInt(2), 
                    result.getString(3),
                    result.getString(4),
                    result.getString(5)
                    );
        }
        
        if (i != DIM)
            throw new SQLException("il numero di risultati di getMonumento() è incongruo ("+i+','+DIM+')');
        
        return iniziative;
    }
    
        static public Iniziativa[] getIniziative(DatabaseConnection conn, Paese paese) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareQueryStatement(
                "SELECT paese, settimana, tipo, nome, dettagli "
                + "FROM Monumento"
                + "WHERE paese = ? ");
        preparedStatement.setString(1, paese.getNome());
        
        ResultSet result = preparedStatement.executeQuery();
        
        int DIM = DatabaseConnection.getResultDim(result);
        Iniziativa[] iniziative = new Iniziativa[DIM];
        int i;
        for (i=0; result.next(); i++) {
            iniziative[i] = new Iniziativa(
                    paese, 
                    result.getInt(2), 
                    result.getString(3),
                    result.getString(4),
                    result.getString(5)
                    );
        }
        
        if (i != DIM)
            throw new SQLException("il numero di risultati di getMonumento() è incongruo ("+i+','+DIM+')');
        
        return iniziative;
    }
        
        static public Iniziativa[] getIniziative(DatabaseConnection conn, String paese) throws SQLException {
            Paese _paese = Paese.getPaese(conn, paese);
            return getIniziative(conn, _paese);
        }
    
}
