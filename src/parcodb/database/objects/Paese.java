/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Paese extends Caratteristica {

    protected int abitanti;
    protected int CAP;
    
    public Paese(String nome, int abitanti, int CAP, Comune[] comuni) throws Exception {
        super(nome, comuni);
        this.abitanti = abitanti;
        this.CAP = CAP;
    }

    public int getAbitanti() {
        return abitanti;
    }

    public int getCAP() {
        return CAP;
    }

    public void setAbitanti(int abitanti) {
        this.abitanti = abitanti;
    }

    public void setCAP(int CAP) {
        this.CAP = CAP;
    }

    @Override
    public void insertIntoDB(Connection conn) throws SQLException {
        super.insertIntoDB(conn); 
        PreparedStatement insertStatement = conn.prepareStatement("INSERT INTO `bdati`.`Paese` (`nome`, `abitanti`, `cap`) VALUES ( ? , ? , ? );");
        
        insertStatement.setString(1, nome);
        insertStatement.setInt(2, abitanti);
        insertStatement.setInt(3, CAP);
        
        insertStatement.execute();
    }
    
}
