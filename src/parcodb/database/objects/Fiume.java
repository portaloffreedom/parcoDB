/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import parcodb.database.DatabaseConnection;


public class Fiume extends Caratteristica {

    protected float lunghezza;
    protected boolean navigabile;
    
    public Fiume(String nome, float lunghezza, boolean navigabile, Comune[] comuni) throws Exception {
        super(nome, comuni);
        this.lunghezza = lunghezza;
        this.navigabile = navigabile;
    }

    public float getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(float lunghezza) {
        this.lunghezza = lunghezza;
    }

    public boolean isNavigabile() {
        return navigabile;
    }

    public void setNavigabile(boolean navigabile) {
        this.navigabile = navigabile;
    }

    @Override
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        super.insertIntoDB(conn);
        PreparedStatement insertStatement = conn.getConn().prepareStatement("INSERT INTO Fiume (nome, lunghezza, navigabile) VALUES ( ? , ? , ? );");
        
        insertStatement.clearParameters();
        insertStatement.setString(1, nome);
        insertStatement.setFloat(2, lunghezza);
        insertStatement.setBoolean(3, navigabile);
        
        insertStatement.execute();
    }
    
    
}
