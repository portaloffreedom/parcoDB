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
public class Comune implements RemoteDBobject {
    protected String nome;
    protected String provincia;
    protected float superficie;
    protected Clima[] climaArray;

    public Comune(String nome, String provincia, float superficie, Clima[] climaArray) throws Exception {
        if (climaArray.length != 12)
            throw new Exception("ad ogni comune devono essere associati 12 climi, uno per ogni mese");
        this.nome = nome;
        this.provincia = provincia;
        this.superficie = superficie;
        this.climaArray = climaArray;
        
        this.ClimaSetUP();
    }
    
    private void ClimaSetUP() {
        for (int i=0; i< climaArray.length; i++) {
            climaArray[i].setComune(this);
        }
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
        PreparedStatement insertIntoZonaStatement = conn.prepareStatement("INSERT INTO `bdati`.`Comune` (`nome`, `provincia`, `superficie`) VALUES ( ? , ? , ? );");
        
        insertIntoZonaStatement.setString(1, nome);
        insertIntoZonaStatement.setString(2, provincia);
        insertIntoZonaStatement.setFloat(3, superficie);
        
        insertIntoZonaStatement.execute();
        
         for (int i=0; i< climaArray.length; i++) {
            climaArray[i].insertIntoDBpackage(conn);
        }
    }
    
    
}
