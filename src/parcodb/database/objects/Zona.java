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
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        PreparedStatement insertIntoZonaStatement = conn.getConn().prepareStatement("INSERT INTO `bdati`.`Zona` (`nome`) VALUES ( ? );");
        
        insertIntoZonaStatement.setString(1, nome);
        
        insertIntoZonaStatement.execute();
    }
    
    static public Zona[] getZone(DatabaseConnection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                "SELECT `nome` FROM  `Zona` ");
        
        ResultSet result = preparedStatement.executeQuery();
        
        int DIM = DatabaseConnection.getResultDim(result);
        Zona[] zone = new Zona[DIM];
        int i;
        for (i=0; result.next(); i++) {
            zone[i] = new Zona(result.getString(1));
        }
        
        if (i != DIM)
            throw new SQLException("il numero di risultati di getZones() è incongruo ("+i+','+DIM+')');
        
        return zone;
    }
    
}
