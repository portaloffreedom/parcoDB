package parcodb.gui;

import com.trolltech.qt.gui.QListWidget;
import com.trolltech.qt.gui.QListWidgetItem;
import com.trolltech.qt.gui.QWidget;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import parcodb.database.DatabaseConnection;
import parcodb.database.objects.RemoteDBobject;
import parcodb.database.objects.Sentiero;
import parcodb.database.objects.Tappa;
import parcodb.gui.builders.Ui_widget_sentieri;

/**
 *
 * @author stengun
 */
public class Macro_widget_sentieri extends Ui_widget_sentieri implements Insertor{
    
    private DatabaseConnection conn;
    private ArrayList<QListWidget> listewidget;
    
    @Override
    public void setupUi(QWidget widget){
        super.setupUi(widget);
        listewidget = new ArrayList<>();
        hideWidgets(0);
    }
    public void setDatabaseConnection(DatabaseConnection conn){
        this.conn = conn;
    }
    
    public void setConnectors(){
        listWidget_tappa.itemSelectionChanged.connect(this, "selezionaTappa2()");
        listWidget_tappa2.itemSelectionChanged.connect(this, "selezionaTappa3()");
        listWidget_tappa3.itemSelectionChanged.connect(this, "selezionaTappa4()");
        listWidget_tappa4.itemSelectionChanged.connect(this, "selezionaTappa5()");
        listWidget_tappa5.itemSelectionChanged.connect(this, "selezionaTappa6()");
        listWidget_tappa6.itemSelectionChanged.connect(this, "selezionaTappa7()");
        listWidget_tappa7.itemSelectionChanged.connect(this, "selezionaTappa8()");
        listWidget_tappa8.itemSelectionChanged.connect(this, "selezionaTappa9()");
        listWidget_tappa9.itemSelectionChanged.connect(this, "selezionaTappa10()");
    }
    
    private void disconnettiRimuovi(int posizione){
        while(posizione < listewidget.size()){
            listewidget.get(posizione).disconnect();
            listewidget.remove(posizione);
        }
    }
    
    private void hideWidgets(int from){
        switch(from){
            default:
            case 2:
                widget_tappa2.hide();
            case 3:
                widget_tappa3.hide();
            case 4:
                widget_tappa4.hide();
            case 5:
                widget_tappa5.hide();
            case 6:
                widget_tappa6.hide();
            case 7:
                widget_tappa7.hide();
            case 8:
                widget_tappa8.hide();
            case 9:
                widget_tappa9.hide();
            case 10:
                widget_tappa10.hide();
        }
    }
    
    private void selezionaTappa2(){
        int posizione = 0;
        disconnettiRimuovi(posizione);
        listWidget_tappa.itemSelectionChanged.connect(this, "selezionaTappa2()");
        hideWidgets(2);
        try {
            Tappa[] prossime = ((Tappa)listWidget_tappa.currentItem().data(0)).getTappeSequenzialiPlausibili(conn);
            listWidget_tappa2.clear();
            for(Tappa tappa:prossime){
                QListWidgetItem item = new QListWidgetItem();
                item.setData(0, tappa);
                listWidget_tappa2.addItem(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Macro_widget_sentieri.class.getName()).log(Level.SEVERE, null, ex);
        }
        listewidget.add(posizione,listWidget_tappa);
        widget_tappa2.show();
        listWidget_tappa2.itemSelectionChanged.connect(this, "selezionaTappa3()");
    }
    
    private void selezionaTappa3(){
        int posizione = 1;
        disconnettiRimuovi(posizione);
        listWidget_tappa2.itemSelectionChanged.connect(this, "selezionaTappa3()");
        hideWidgets(3);
        try {
            Tappa[] prossime = ((Tappa)listWidget_tappa2.currentItem().data(0)).getTappeSequenzialiPlausibili(conn);
            listWidget_tappa3.clear();
            for(Tappa tappa:prossime){
                QListWidgetItem item = new QListWidgetItem();
                item.setData(0, tappa);
                listWidget_tappa3.addItem(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Macro_widget_sentieri.class.getName()).log(Level.SEVERE, null, ex);
        }
        listewidget.add(posizione,listWidget_tappa2);
        widget_tappa3.show();
        listWidget_tappa3.itemSelectionChanged.connect(this, "selezionaTappa4()");
    }
        
    private void selezionaTappa4(){
        int posizione = 2;
        disconnettiRimuovi(posizione);
        listWidget_tappa3.itemSelectionChanged.connect(this, "selezionaTappa4()");
        hideWidgets(4);
        try {
            Tappa[] prossime = ((Tappa)listWidget_tappa3.currentItem().data(0)).getTappeSequenzialiPlausibili(conn);
            listWidget_tappa4.clear();
            for(Tappa tappa:prossime){
                QListWidgetItem item = new QListWidgetItem();
                item.setData(0, tappa);
                listWidget_tappa4.addItem(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Macro_widget_sentieri.class.getName()).log(Level.SEVERE, null, ex);
        }
        listewidget.add(posizione,listWidget_tappa3);
        widget_tappa4.show();
        listWidget_tappa4.itemSelectionChanged.connect(this, "selezionaTappa5()");
    }
    
    private void selezionaTappa5(){
        int posizione = 3;
        disconnettiRimuovi(posizione);
        listWidget_tappa4.itemSelectionChanged.connect(this, "selezionaTappa5()");
        hideWidgets(5);
        try {
            Tappa[] prossime = ((Tappa)listWidget_tappa4.currentItem().data(0)).getTappeSequenzialiPlausibili(conn);
            listWidget_tappa5.clear();
            for(Tappa tappa:prossime){
                QListWidgetItem item = new QListWidgetItem();
                item.setData(0, tappa);
                listWidget_tappa5.addItem(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Macro_widget_sentieri.class.getName()).log(Level.SEVERE, null, ex);
        }    
        listewidget.add(posizione,listWidget_tappa4);
        
        widget_tappa5.show();
        listWidget_tappa5.itemSelectionChanged.connect(this, "selezionaTappa6()");
    }
    
    private void selezionaTappa6(){
        int posizione = 4;
        disconnettiRimuovi(posizione);
        listWidget_tappa5.itemSelectionChanged.connect(this, "selezionaTappa6()");
        hideWidgets(6);
        try {
            Tappa[] prossime = ((Tappa)listWidget_tappa5.currentItem().data(0)).getTappeSequenzialiPlausibili(conn);
            listWidget_tappa6.clear();
            for(Tappa tappa:prossime){
                QListWidgetItem item = new QListWidgetItem();
                item.setData(0, tappa);
                listWidget_tappa6.addItem(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Macro_widget_sentieri.class.getName()).log(Level.SEVERE, null, ex);
        }  
        listewidget.add(posizione,listWidget_tappa5);
        widget_tappa6.show();
        listWidget_tappa6.itemSelectionChanged.connect(this, "selezionaTappa7()");
    }
    
    private void selezionaTappa7(){
        int posizione = 5;
        disconnettiRimuovi(posizione);
        listWidget_tappa6.itemSelectionChanged.connect(this, "selezionaTappa7()");
        hideWidgets(7);
        try {
            Tappa[] prossime = ((Tappa)listWidget_tappa6.currentItem().data(0)).getTappeSequenzialiPlausibili(conn);
            listWidget_tappa7.clear();
            for(Tappa tappa:prossime){
                QListWidgetItem item = new QListWidgetItem();
                item.setData(0, tappa);
                listWidget_tappa7.addItem(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Macro_widget_sentieri.class.getName()).log(Level.SEVERE, null, ex);
        }
        listewidget.add(posizione,listWidget_tappa6);
        widget_tappa7.show();
        listWidget_tappa7.itemSelectionChanged.connect(this, "selezionaTappa8()");
    }
    
    private void selezionaTappa8(){
        int posizione = 6;
        disconnettiRimuovi(posizione);
        listWidget_tappa7.itemSelectionChanged.connect(this, "selezionaTappa8()");
        hideWidgets(8);
        try {
            Tappa[] prossime = ((Tappa)listWidget_tappa7.currentItem().data(0)).getTappeSequenzialiPlausibili(conn);
            listWidget_tappa8.clear();
            for(Tappa tappa:prossime){
                QListWidgetItem item = new QListWidgetItem();
                item.setData(0, tappa);
                listWidget_tappa8.addItem(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Macro_widget_sentieri.class.getName()).log(Level.SEVERE, null, ex);
        }
        listewidget.add(posizione,listWidget_tappa7);
        widget_tappa8.show();
        listWidget_tappa8.itemSelectionChanged.connect(this, "selezionaTappa9()");
    }
    
    private void selezionaTappa9(){
        int posizione = 7;
        disconnettiRimuovi(posizione);
        listWidget_tappa8.itemSelectionChanged.connect(this, "selezionaTappa9()");
        hideWidgets(9);
        try {
            Tappa[] prossime = ((Tappa)listWidget_tappa8.currentItem().data(0)).getTappeSequenzialiPlausibili(conn);
            listWidget_tappa9.clear();
            for(Tappa tappa:prossime){
                QListWidgetItem item = new QListWidgetItem();
                item.setData(0, tappa);
                listWidget_tappa9.addItem(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Macro_widget_sentieri.class.getName()).log(Level.SEVERE, null, ex);
        }   
        listewidget.add(posizione,listWidget_tappa8);
        widget_tappa9.show();
        listWidget_tappa9.itemSelectionChanged.connect(this, "selezionaTappa10()");
    }
    
    private void selezionaTappa10(){
        int posizione = 8;
        disconnettiRimuovi(posizione);
        listWidget_tappa9.itemSelectionChanged.connect(this, "selezionaTappa10()");
        hideWidgets(10);
        try {
            Tappa[] prossime = ((Tappa)listWidget_tappa9.currentItem().data(0)).getTappeSequenzialiPlausibili(conn);
            listWidget_tappa10.clear();
            for(Tappa tappa:prossime){
                QListWidgetItem item = new QListWidgetItem();
                item.setData(0, tappa);
                listWidget_tappa10.addItem(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Macro_widget_sentieri.class.getName()).log(Level.SEVERE, null, ex);
        }       
        listewidget.add(posizione,listWidget_tappa9);
        widget_tappa10.show();
        listWidget_tappa9.itemSelectionChanged.connect(this, "selezionaTappaUl()");
    }
    
    private void selezionaTappaUl(){
        int posizione = 9;
        disconnettiRimuovi(posizione);
        listWidget_tappa9.itemSelectionChanged.connect(this, "selezionaTappaUl()");
        listewidget.add(posizione,listWidget_tappa10);
    }
    
    @Override
    public List<RemoteDBobject> getInsertor() {
        Sentiero sentiero = null;
        try {
            sentiero = new Sentiero(spinBox.value(),
                    getTappe());
        } catch (Exception ex) {
            Logger.getLogger(Macro_widget_sentieri.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<RemoteDBobject> lista = new ArrayList<>();
        lista.add(sentiero);
        return lista;
    }
    
    private Tappa[] getTappe(){
        Tappa[] tappe= new Tappa[listewidget.size()];
        int i=0;
        for(QListWidget tappa:listewidget){
            tappe[i++] = (Tappa)tappa.currentItem().data(0);
        }
        return tappe;
    }
    
}
