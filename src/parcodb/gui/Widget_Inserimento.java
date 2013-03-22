package parcodb.gui;

import com.trolltech.qt.QUiForm;
import com.trolltech.qt.gui.*;
import parcodb.gui.builders.*;

public class Widget_Inserimento extends parcodb.gui.builders.Ui_widget_inserimento
{
    private Ui_struttura_common strut_com;
    private Ui_caratteristica_common car_com;
    private Ui_iniziativa_common ini_com;
    private Ui_Dialog_errore_nodati dialog_errore_nodati;
    private QMainWindow qMainWindow;
    public Widget_Inserimento(QMainWindow qMainWindow)
    {
        super();
        this.qMainWindow = qMainWindow;
        strut_com = new Ui_struttura_common();
        ini_com = new Ui_iniziativa_common();
        car_com = new Ui_caratteristica_common();
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
    private void set_car_widget(QUiForm _special){
        car_com.widget_special = new QWidget(car_com.widget_tipologia);
        car_com.layout_special.insertWidget(3,car_com.widget_special);
        _special.setupUi(car_com.widget_special);
        car_com.widget_special.show();
    }
    
    private void set_central_widget(QUiForm _special){
        if(this.widget_common != null ) this.widget_common.dispose();
        this.widget_common = new QWidget(this.widget_selection);
        this.layout_special.insertWidget(0,this.widget_common);
        _special.setupUi(this.widget_common);
        this.widget_common.show();
    }
    
    private void set_strut_widget(QUiForm _special){
        strut_com.widget_special = new QWidget(strut_com.widget_3);
        strut_com.layout_special.addWidget(strut_com.widget_special);
        _special.setupUi(strut_com.widget_special);
        strut_com.widget_special.show();
    }
    
    //impostatori di segnali
    private void bottoni_untoggle(){
        this.bottone_comune.setChecked(false);
        this.bottone_struttura.setChecked(false);
        this.bottone_sentiero.setChecked(false);
        this.bottone_inserisci.setChecked(false);
        this.bottone_iniziativa.setChecked(false);
        this.bottone_tappa.setChecked(false);
        this.bottone_terreno.setChecked(false);
    }
    
    //impostatori di form diversi nell'interfaccia da usare negli eventi
    private void set_caratteristica(){
        bottoni_untoggle();
        this.bottone_terreno.setChecked(true);
        set_central_widget(car_com);
        setup_caratteristica_common();
        select_car_specific();
    }
        // costruttori personalizzati per alcuni widget
    private void setup_struttura_common(){
        
        strut_com.combo_tipo.addItem("Albergo");
        strut_com.combo_tipo.addItem("Museo");
        strut_com.combo_tipo.addItem("Monumento");
        strut_com.combo_tipo.addItem("Infopoint");
        strut_com.combo_tipo.addItem("Impianto di risalita");
        strut_com.combo_tipo.currentIndexChanged.connect(this, "select_struttura_specific()");
        strut_com.combo_tipo.setCurrentIndex(0);
    }
    
    private void setup_caratteristica_common(){
        car_com.combo_tipo.addItem("Monte");
        car_com.combo_tipo.addItem("Fiume");
        car_com.combo_tipo.addItem("Lago");
        car_com.combo_tipo.addItem("Paese");
        car_com.combo_tipo.currentIndexChanged.connect(this, "select_car_specific()");
        car_com.combo_tipo.setCurrentIndex(0);
    }

    private void setup_iniziativa_common(){
        ini_com.combo_iniziativa.addItem("Gastronomica");
        ini_com.combo_iniziativa.addItem("Culturale");
        ini_com.combo_iniziativa.addItem("Naturalistica");
        ini_com.combo_iniziativa.setCurrentIndex(0);
        // nella combo del paese vanno messi solo quelli già presenti nel db
    }
//azioni specifiche per eventi di tipo grafico
    private void select_struttura_specific(){
        if(strut_com.widget_special != null) strut_com.widget_special.dispose();
        switch(strut_com.combo_tipo.currentIndex()){
            case 0:
                set_strut_widget(new Ui_widget_albergo());
                break;
            case 1:
                set_strut_widget(new Ui_widget_museo());
                break;
            case 2:
                set_strut_widget(new Ui_widget_monumento());
                break;
            case 3:
                set_strut_widget(new Ui_widget_infopoint());
                break;
            case 4:
                set_strut_widget(new Micro_widget_impianti());
            default:
                break;
        }
        System.out.println(strut_com.combo_tipo.currentIndex());
    }
    
    private void select_car_specific(){        
        if(car_com.widget_special != null) car_com.widget_special.dispose();
        
        switch(car_com.combo_tipo.currentIndex()){
            case 0:
                set_car_widget(new Ui_widget_monte());
                break;
            case 1:
                set_car_widget(new Ui_widget_fiume());
                break;
            case 2:
                set_car_widget(new Ui_widget_lago());
                break;
            case 3:
                set_car_widget(new Ui_widget_paese());
            default:
                break;
            
        }
    }

//Funzioni che vengono chiamate dai click di alcuni bottoni
    public void showdialog(){
        QDialog dialog = new QDialog(qMainWindow);
        dialog_errore_nodati.setupUi(dialog);
        dialog.show();
    }
        
    private void set_struttura(){
        bottoni_untoggle();
        this.bottone_struttura.setChecked(true);
        set_central_widget(strut_com);
        setup_struttura_common();
        select_struttura_specific();
    }
    
    private void set_iniziativa(){
        bottoni_untoggle();
        this.bottone_iniziativa.setChecked(true);
        set_central_widget(ini_com);
        setup_iniziativa_common();
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

