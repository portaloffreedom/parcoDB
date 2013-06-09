/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import parcodb.database.DatabaseConnection;

/**
 *
 * @author matteo
 */
public class Zona implements RemoteDBobject {
    protected String nome;

    protected Zona(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome.trim();
    }
    
    @Override
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        PreparedStatement insertIntoZonaStatement = conn.prepareInsertStatement(
                "INSERT INTO Zona (nome) "
                + "VALUES ( ? );");
        
        insertIntoZonaStatement.setString(1, nome);
        
        insertIntoZonaStatement.execute();
    }
    
    static public Zona[] getZone(DatabaseConnection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareQueryStatement(
                "SELECT nome "
                + "FROM  Zona "
                + "ORDER BY nome");
        
        ResultSet result = preparedStatement.executeQuery();
        
        int DIM = DatabaseConnection.getResultDim(result);
        Zona[] zone = new Zona[DIM];
        int i;
        for (i=0; result.next(); i++) {
            zone[i] = new Zona(result.getString(1));
        }
        
        if (i != DIM)
            throw new SQLException("il numero di risultati di getZone() "
                                 + "è incongruo ("+i+','+DIM+')');
        
        return zone;
    }
    
    static public Zona[] getSpecificZona(DatabaseConnection conn) throws SQLException {
        Caratteristica[] caratteristiche = Caratteristica.getSpecificCaratteristiche(conn);
        Struttura[] strutture = Struttura.getSpecificStruttura(conn);
        
        int DIM_ZONE = caratteristiche.length 
                + strutture.length;
        Zona[] zone = new Zona[DIM_ZONE];
        
        int i=0;
        for (int j=0; j< caratteristiche.length; i++, j++) {
            zone[i] = caratteristiche[j];
        }
        for (int j=0; j< strutture.length; i++, j++) {
            zone[i] = strutture[j];
        }
        
        return zone;
    }
    
    @Override
    public String toString(){
        return getNome().trim();
    }
}
