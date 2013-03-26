package parcodb.gui;

import com.trolltech.qt.gui.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import parcodb.gui.builders.*;

public class Widget_Inserimento extends Widget_Centrale
{
    private Macro_widget_struttura strut_com;
    private Macro_widget_caratteristica car_com;
    private Macro_widget_iniziativa ini_com;
    private Ui_Dialog_errore_nodati dialog_errore_nodati;
    
    public Widget_Inserimento(MainGUI mainui)
    {
        super(mainui);
        dialog_errore_nodati = new parcodb.gui.builders.Ui_Dialog_errore_nodati();
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
        car_com = new Macro_widget_caratteristica();
        set_central_widget(car_com);
        car_com.select_car_specific();
    }
    
    @Override   
    protected void set_struttura(){
        toggle_button(bottone_struttura);
        strut_com = new Macro_widget_struttura();
        set_central_widget(strut_com);
        strut_com.select_struttura_specific();
    }
    
    @Override
    protected void set_iniziativa(){
        toggle_button(bottone_iniziativa);
        ini_com = new Macro_widget_iniziativa();
        set_central_widget(ini_com);
    }
    
    @Override
    protected void set_tappa(){
        toggle_button(bottone_tappa);
        set_central_widget(new Ui_widget_tappa());
    }
    
    @Override
    protected void set_sentiero(){
        toggle_button(bottone_sentiero);
        set_central_widget(new Ui_widget_sentieri());
    }
    
    @Override
    protected void set_comune(){
        toggle_button(bottone_comune);
        set_central_widget(new Ui_widget_comune());
    }

    @Override
    protected void inserisci(){
        insertor = strut_com.getInsertor();
        try {
            insertor.insertIntoDB(maiunui.conn);
        } catch (SQLException ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

