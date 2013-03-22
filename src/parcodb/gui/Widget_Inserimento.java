package parcodb.gui;

import com.trolltech.qt.QUiForm;
import com.trolltech.qt.gui.*;
import parcodb.gui.builders.*;

public class Widget_Inserimento extends parcodb.gui.builders.Ui_widget_inserimento
{
    private Macro_widget_struttura strut_com;
    private Macro_widget_caratteristica car_com;
    private Macro_widget_iniziativa ini_com;
    private Ui_Dialog_errore_nodati dialog_errore_nodati;
    private QMainWindow qMainWindow;
    
    public Widget_Inserimento(QMainWindow qMainWindow)
    {
        super();
        this.qMainWindow = qMainWindow;
        dialog_errore_nodati = new parcodb.gui.builders.Ui_Dialog_errore_nodati();
    }
    
    @Override
    public void setupUi(QWidget widget_inserimento){
        super.setupUi(widget_inserimento);
        this.set_signals_inserimento();
    }
    
    private void set_signals_inserimento(){
        this.bottone_struttura.clicked.connect(this, "set_struttura()");
        this.bottone_iniziativa.clicked.connect(this, "set_iniziativa()");
        this.bottone_terreno.clicked.connect(this, "set_caratteristica()");
        this.bottone_sentiero.clicked.connect(this, "set_sentiero()");
        this.bottone_tappa.clicked.connect(this, "set_tappa()");
        this.bottone_comune.clicked.connect(this, "set_comune()");
        this.bottone_inserisci.clicked.connect(this, "showdialog()");
    }
 
    // widget changer   

    
    private void set_central_widget(QUiForm _special){
        if(this.widget_common != null ) this.widget_common.dispose();
        this.widget_common = new QWidget(this.widget_selection);
        this.layout_special.insertWidget(0,this.widget_common);
        _special.setupUi(this.widget_common);
        this.widget_common.show();
    }
    
    private void bottoni_untoggle(){
        this.bottone_comune.setChecked(false);
        this.bottone_struttura.setChecked(false);
        this.bottone_sentiero.setChecked(false);
        this.bottone_inserisci.setChecked(false);
        this.bottone_iniziativa.setChecked(false);
        this.bottone_tappa.setChecked(false);
        this.bottone_terreno.setChecked(false);
    }

    //Funzioni che vengono chiamate dai click di alcuni bottoni
    
    public void showdialog(){
        QDialog dialog = new QDialog(qMainWindow);
        dialog_errore_nodati.setupUi(dialog);
        dialog.show();
    }
    
    private void set_caratteristica(){
        bottoni_untoggle();
        this.bottone_terreno.setChecked(true);
        car_com = new Macro_widget_caratteristica();
        set_central_widget(car_com);
        car_com.select_car_specific();
    }
        
    private void set_struttura(){
        bottoni_untoggle();
        this.bottone_struttura.setChecked(true);
        strut_com = new Macro_widget_struttura();
        set_central_widget(strut_com);
        strut_com.select_struttura_specific();
    }
    
    private void set_iniziativa(){
        bottoni_untoggle();
        this.bottone_iniziativa.setChecked(true);
        ini_com = new Macro_widget_iniziativa();
        set_central_widget(ini_com);
    }
    
    private void set_tappa(){
        bottoni_untoggle();
        this.bottone_tappa.setChecked(true);
        set_central_widget(new Ui_widget_tappa());
    }
    
    private void set_sentiero(){
        bottoni_untoggle();
        this.bottone_sentiero.setChecked(true);
        set_central_widget(new Ui_widget_sentieri());
    }
    
    private void set_comune(){
        bottoni_untoggle();
        this.bottone_comune.setChecked(true);
        set_central_widget(new Ui_widget_comune());
    }
    
}

