package parcodb.gui;

import com.trolltech.qt.gui.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import parcodb.database.objects.Comune;
import parcodb.database.objects.Paese;
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
            Comune[] comuni = Comune.getComuni(this.maiunui.conn);
            for(Comune comune:comuni){
                QListWidgetItem list = new QListWidgetItem();
                list.setData(0, comune);
                car_com.listWidget_comune.addItem(list);
            }
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
            Paese[] paesi = Paese.getPaesi(this.maiunui.conn);
            for (Paese paese : paesi) {
                strut_com.combo_situato.addItem(paese.getNome(), paese);
            }
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
            Paese[] paesi = Paese.getPaesi(this.maiunui.conn);
            for (Paese paese : paesi) {
                ini_com.combo_paese.addItem(paese.getNome(), paese);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Widget_Inserimento.class.getName()).log(Level.SEVERE, null, ex);
        }
        active = ini_com;
    }
    
    @Override
    protected void set_tappa(){
        toggle_button(bottone_tappa);
        set_central_widget(tappa_com);
        active = tappa_com;
    }
    
    @Override
    protected void set_sentiero(){
        toggle_button(bottone_sentiero);
        set_central_widget(sentiero_com);
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

}

