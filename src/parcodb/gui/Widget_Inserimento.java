package parcodb.gui;

import com.trolltech.qt.gui.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import parcodb.database.objects.Caratteristica;
import parcodb.database.objects.Comune;
import parcodb.database.objects.Paese;
import parcodb.database.objects.Tappa;
import parcodb.database.objects.Zona;
import parcodb.gui.builders.*;

public class Widget_Inserimento extends Widget_Centrale
{
    private Macro_widget_struttura strut_com;
    private Macro_widget_caratteristica car_com;
    private Macro_widget_iniziativa ini_com;
    private Macro_widget_tappa tappa_com;
    private Macro_widget_sentieri sentiero_com;
    private Macro_widget_comune comune_com;
    
    private Ui_Dialog_errore_nodati dialog_errore_nodati;
    private Insertor active;
    public Widget_Inserimento(MainGUI mainui)
    {
        super(mainui);
        dialog_errore_nodati = new parcodb.gui.builders.Ui_Dialog_errore_nodati();
        strut_com = new Macro_widget_struttura();
        car_com = new Macro_widget_caratteristica();        
        ini_com = new Macro_widget_iniziativa();
        tappa_com = new Macro_widget_tappa();
        sentiero_com = new Macro_widget_sentieri();
        comune_com = new Macro_widget_comune();
    }
    
    //Funzioni che vengono chiamate dai click di alcuni bottoni
    @Override
    public void showdialog(){
        QDialog dialog = new QDialog(qMainWindow);
        dialog_errore_nodati.setupUi(dialog);
        dialog.show();
    }
    
    @Override
    protected void set_signals(){
        super.set_signals();
        
    }
    
    @Override
    protected void set_caratteristica(){
        toggle_button(bottone_terreno);
        set_central_widget(car_com);
        car_com.select_car_specific();
        try {
            popolaListaComune(car_com.listWidget_comune);
            popolaListaTappe(car_com.listWidget_tappe);
            popolaListaCaratt(car_com.lista_vicinanza);
        } catch (SQLException ex) {
            Logger.getLogger(Widget_Inserimento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        active = car_com;
    }
    
    @Override   
    protected void set_struttura(){
        toggle_button(bottone_struttura);
        set_central_widget(strut_com);
        try {
            popolaComboPaesi(strut_com.combo_situato);
        } catch (SQLException ex) {
            Logger.getLogger(Widget_Inserimento.class.getName()).log(Level.SEVERE, null, ex);
        }
        strut_com.select_struttura_specific();
        active = strut_com;
    }
    
    @Override
    protected void set_iniziativa(){
        toggle_button(bottone_iniziativa);
        set_central_widget(ini_com);
        try {
            popolaComboPaesi(ini_com.combo_paese);
        } catch (SQLException ex) {
            Logger.getLogger(Widget_Inserimento.class.getName()).log(Level.SEVERE, null, ex);
        }
        active = ini_com;
    }
    
    @Override
    protected void set_tappa(){
        toggle_button(bottone_tappa);
        set_central_widget(tappa_com);
        try {
            Zona[] zone = Zona.getZone(maiunui.conn);
            for(Zona zona:zone){
                tappa_com.comboBox_inizio.addItem(zona.getNome(), zona);
                tappa_com.comboBox_fine.addItem(zona.getNome(), zona);
            }
            popolaListaCaratt(tappa_com.list_interesse);
        } catch (SQLException ex) {
            Logger.getLogger(Widget_Inserimento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        active = tappa_com;
    }
    
    @Override
    protected void set_sentiero(){
        toggle_button(bottone_sentiero);
        set_central_widget(sentiero_com);
        try {
            popolaListaTappe(sentiero_com.listWidget);
        } catch (SQLException ex) {
            Logger.getLogger(Widget_Inserimento.class.getName()).log(Level.SEVERE, null, ex);
        }
        active = sentiero_com;
    }
    
    @Override
    protected void set_comune(){
        toggle_button(bottone_comune);
        set_central_widget(comune_com);
        active = comune_com;
    }
    
    @Override
    protected void inserisci(){
        insertor = active.getInsertor();
        try {
            insertor.insertIntoDB(maiunui.conn);
        } catch (SQLException ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Inserito con successo");
    }
    
    //popolatori di widget
    
    private void popolaListaTappe(QListWidget where) throws SQLException{
        Tappa[] tappe = Tappa.getTappe(maiunui.conn);
        for(Tappa tappa:tappe){
            QListWidgetItem list = new QListWidgetItem();
            list.setData(0, tappa);
            where.addItem(list);
        }
    }
    
    private void popolaListaCaratt(QListWidget where) throws SQLException{
        Caratteristica[] caratteristiche = Caratteristica.getCaratteristiche(maiunui.conn);
        for (Caratteristica caratteristica : caratteristiche) {
            QListWidgetItem list = new QListWidgetItem();
            list.setData(0, caratteristica);
            where.addItem(list);
        }
    }
    
    private void popolaListaComune(QListWidget where) throws SQLException{
        Comune[] comuni = Comune.getComuni(this.maiunui.conn);
        for(Comune comune:comuni){
            QListWidgetItem list = new QListWidgetItem();
            list.setData(0, comune);
            where.addItem(list);
        }
    }
    
    private void popolaComboPaesi(QComboBox where) throws SQLException{
        Paese[] paesi = Paese.getPaesi(this.maiunui.conn);
        for (Paese paese : paesi) {
           where.addItem(paese.getNome(), paese);
        }
    }
    
}

