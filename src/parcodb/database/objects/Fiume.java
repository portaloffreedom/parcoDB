/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    
    public Fiume(String nome, float lunghezza, boolean navigabile) {
        super(nome);
        this.lunghezza = lunghezza;
        this.navigabile = navigabile;
    }

    public float getLunghezza() {
        return lunghezza;
    }

    public boolean getNavigabile() {
        return navigabile;
    }

    @Override
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        super.insertIntoDB(conn);
        PreparedStatement insertStatement = conn.prepareInsertStatement(
                "INSERT INTO Fiume (nome, lunghezza, navigabile) "
                + "VALUES ( ? , ? , ? );");
        
        insertStatement.clearParameters();
        insertStatement.setString(1, nome);
        insertStatement.setFloat(2, lunghezza);
        insertStatement.setBoolean(3, navigabile);
        
        insertStatement.execute();
    }
    
    static public Fiume[] getFiumi(DatabaseConnection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareQueryStatement(
                "SELECT nome, lunghezza, navigabile "
                + "FROM Fiume");
        
        ResultSet result = preparedStatement.executeQuery();
        
        int DIM = DatabaseConnection.getResultDim(result);
        Fiume[] fiumi = new Fiume[DIM];
        int i;
        for (i=0; result.next(); i++) {
            fiumi[i] = new Fiume(result.getString(1), result.getFloat(2), result.getBoolean(3));
        }
        
        if (i != DIM)
            throw new SQLException("il numero di risultati di getFiumi() "
                    + "è incongruo ("+i+','+DIM+')');
        
        return fiumi;
    }
    
}
