/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author matteo
 */
public abstract class Zona implements remoteDBobject {
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
    public void insertIntoDB(Connection conn) throws SQLException {
        PreparedStatement insertIntoZonaStatement = conn.prepareStatement("INSERT INTO `bdati`.`Zona` (`nome`) VALUES ( ? );");
        
        insertIntoZonaStatement.setString(1, nome);
        
        insertIntoZonaStatement.execute();
    }
    
}
