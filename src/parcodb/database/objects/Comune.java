/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author matteo
 */
public class Comune implements remoteDBobject {
    protected String nome;
    protected String provincia;
    protected float superficie;

    public Comune(String nome, String provincia, float superficie) {
        this.nome = nome;
        this.provincia = provincia;
        this.superficie = superficie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    @Override
    public void insertIntoDB(Connection conn) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
