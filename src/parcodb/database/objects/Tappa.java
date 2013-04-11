/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.database.objects;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import parcodb.database.DatabaseConnection;


public class Tappa implements RemoteDBobject {
    
    protected Zona inizio;
    protected Zona fine;
    protected float lunghezza;

    public Tappa(Zona inizio, Zona fine, float lunghezza) {
        this.inizio = inizio;
        this.fine = fine;
        this.lunghezza = lunghezza;
    }

    public Zona getInizio() {
        return inizio;
    }

    public Zona getFine() {
        return fine;
    }

    public float getLunghezza() {
        return lunghezza;
    }
    
    public Caratteristica[] getInteressati(DatabaseConnection conn) throws SQLException {
        return Caratteristica.getInteressati(conn, this);
    }

    @Override
    public void insertIntoDB(DatabaseConnection conn) throws SQLException {
        PreparedStatement insertStatement = conn.prepareInsertStatement("INSERT INTO Tappa (inizio, fine, lunghezza) VALUES ( ? , ? , ? );");
        
        insertStatement.setString(1, inizio.getNome());
        insertStatement.setString(2, fine.getNome());
        insertStatement.setFloat(3, lunghezza);
        
        insertStatement.execute();
    }
    
    static private Tappa[] populateTappe(PreparedStatement statement,String nomeFunzione,int posInizio, int posFine, int posLunghezza) throws SQLException {
        ResultSet result = statement.executeQuery();
        
        int DIM = DatabaseConnection.getResultDim(result);
        Tappa[] tappe = new Tappa[DIM];
        int i;
        for (i=0; result.next(); i++) {
            tappe[i] = new Tappa(
                    new Zona(result.getString(posInizio)),
                    new Zona(result.getString(posFine)),
                    result.getFloat(posLunghezza)
                );
        }
        
        if (i != DIM)
            throw new SQLException("il numero di risultati di "+nomeFunzione+" è incongruo ("+i+','+DIM+')');
        
        return tappe;
    }
    
    static public Tappa[] getTappe(DatabaseConnection conn) throws SQLException {
        String nomeFunzione = "getTappeInteresseCaratteristica(caratteristica)";
        PreparedStatement preparedStatement = conn.prepareQueryStatement(
                "SELECT inizio,fine,lunghezza FROM Tappa ");
        return populateTappe(preparedStatement, nomeFunzione,1,2,3);

    }
    
    static public Tappa[] getTappeInteresseCaratteristica(DatabaseConnection conn, Caratteristica caratteristica) throws SQLException {
        return Tappa.getTappeInteresseCaratteristica(conn, caratteristica.getNome());
    }
    
    static public Tappa[] getTappeInteresseCaratteristica(DatabaseConnection conn, String caratteristica) throws SQLException {
        String nomeFunzione = "getTappeInteresseCaratteristica(caratteristica)";
        PreparedStatement preparedStatement = conn.prepareQueryStatement(
                "SELECT T.inizio,T.fine,T.lunghezza "
                + "FROM Interesse AS I,Tappa AS T "
                + "WHERE I.caratteristica = ? "
                + "AND I.tappa_inizio = T.inizio "
                + "AND I.tappa_fine = T.fine");
        
        preparedStatement.setString(1, caratteristica);
        
        return populateTappe(preparedStatement, nomeFunzione, 1, 2, 3);
    }
    
    static public Tappa[] getTappeDiSentiero(DatabaseConnection conn, Sentiero sentiero) throws SQLException {
        return getTappeDiSentiero(conn, sentiero.getNumero_sentiero());
    }
    
    public Tappa[] getTappeSequenzialiPlausibili(DatabaseConnection conn) throws SQLException {
        String nomeFunzione = "getTappeSequenzialiPlausibili(tappa)";
        PreparedStatement preparedStatement = conn.prepareQueryStatement(
                "SELECT inizio,fine,lunghezza "
                + "FROM Tappa "
                + "WHERE inizio = ? ");
        preparedStatement.setString(1, this.getFine().getNome());
        
        return populateTappe(preparedStatement, nomeFunzione, 1, 2, 3);
    }
        
    static public Tappa[] getTappeDiSentiero(DatabaseConnection conn, int sentiero) throws SQLException {
        String nomeFunzione = "getTappeDiSentiero(sentiero)";
        PreparedStatement preparedStatement = conn.prepareQueryStatement(
                "SELECT T.inizio,T.fine,T.lunghezza "
                + "FROM Composto AS C, Tappa as T "
                + "WHERE C.sentiero = ? "
                + "AND C.inizio = T.inizio "
                + "AND C.fine = T.fine");
        
        preparedStatement.setInt(1, sentiero);
        
        return populateTappe(preparedStatement, nomeFunzione, 1, 2, 3);
    }

    @Override
    public String toString() {
        return this.getInizio().toString()+" - "+this.getFine().toString();
    }
    
}
