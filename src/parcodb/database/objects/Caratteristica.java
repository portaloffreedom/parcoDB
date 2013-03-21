/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public abstract class Caratteristica extends Zona {

    protected Comune[] comuni;
    
    protected Caratteristica(String nome, Comune[] comuni) throws Exception {
        super(nome);
        if (this.comuni.length < 1)
            throw new Exception("Almeno in un comune questa caratteristica si deve trovare");
        this.comuni = comuni;
    }

    @Override
    public void insertIntoDB(Connection conn) throws SQLException {
        super.insertIntoDB(conn);
        PreparedStatement insertStatement = conn.prepareStatement("INSERT INTO `bdati`.`Caratteristica` (`nome`) VALUES ( ? );");
        
        insertStatement.setString(1, nome);
        
        insertStatement.execute();
        
        for (int i=0; i<comuni.length; i++) {
            Appartiene appartiene = new Appartiene(comuni[i], this);
            appartiene.insertIntoDB(conn);
        }
    }
    
}
