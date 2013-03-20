/*
 * 
 */
package parcodb.gui;

import com.trolltech.qt.QUiForm;
import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QMainWindow;
import com.trolltech.qt.gui.QWidget;

/**
 *
 * @author matteo
 */
public class MainGUI {
    private Ui_MainWindow mainui;
    private Ui_struttura_common strut_com;
    private Ui_widget_inserimento inserimento;
    private Ui_caratteristica_common car_com;
    private Ui_iniziativa_common ini_com;
    private QWidget wid_central;
    private QMainWindow qMainWindow;
    
    public MainGUI(String[] args) {
        
        QApplication.initialize(args);
        
        //MainWindowWidget mainWidget = new MainWindowWidget();
        //inizilizzazione grafica dei widget personalizzati.
        mainui = new Ui_MainWindow();
        strut_com = new Ui_struttura_common();
        inserimento = new Ui_widget_inserimento();
        car_com = new Ui_caratteristica_common();
        ini_com = new Ui_iniziativa_common();

        wid_central = new QWidget();
        qMainWindow = new QMainWindow();
    }
    
    public void SetupUi(){
        inserimento.setupUi(wid_central);
        set_signals_inserimento();
        mainui.setupUi(qMainWindow);
        qMainWindow.setCentralWidget(wid_central);
        qMainWindow.show();
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
        if(inserimento.widget_specific != null) inserimento.widget_specific.dispose();
        switch(strut_com.combo_tipo.currentIndex()){
            case 0:
                set_special_widget(new Ui_widget_albergo());
                break;
            case 1:
                set_special_widget(new Ui_widget_museo());
                break;
            case 2:
                set_special_widget(new Ui_widget_monumento());
                break;
            case 3:
                set_special_widget(new Ui_widget_infopoint());
                break;
            case 4:
                set_special_widget(new Ui_widget_impianti());
            default:
                break;
        }
        System.out.println(strut_com.combo_tipo.currentIndex());
    }
    
    private void select_car_specific(){
        if(inserimento.widget_specific != null) inserimento.widget_specific.dispose();
        switch(car_com.combo_tipo.currentIndex()){
            case 0:
                set_special_widget(new Ui_widget_monte());
                break;
            case 1:
                set_special_widget(new Ui_widget_fiume());
                break;
            case 2:
                set_special_widget(new Ui_widget_lago());
                break;
            case 3:
                set_special_widget(new Ui_widget_paese());
            default:
                break;
            
        }
    }
//impostatori di segnali
    private void bottoni_untoggle(){
        inserimento.bottone_comune.setChecked(false);
        inserimento.bottone_struttura.setChecked(false);
        inserimento.bottone_sentiero.setChecked(false);
        inserimento.bottone_inserisci.setChecked(false);
        inserimento.bottone_iniziativa.setChecked(false);
        inserimento.bottone_tappa.setChecked(false);
        inserimento.bottone_terreno.setChecked(false);
    }
    
    private void set_signals_inserimento(){
        inserimento.bottone_struttura.clicked.connect(this, "set_struttura()");
        inserimento.bottone_iniziativa.clicked.connect(this, "set_iniziativa()");
        inserimento.bottone_terreno.clicked.connect(this, "set_caratteristica()");
        inserimento.bottone_sentiero.clicked.connect(this, "set_sentiero()");
        inserimento.bottone_tappa.clicked.connect(this, "set_tappa()");
        inserimento.bottone_comune.clicked.connect(this, "set_comune()");
    }
    
//impostatori di form diversi nell'interfaccia da usare negli eventi
    private void set_caratteristica(){
        bottoni_untoggle();
        inserimento.bottone_terreno.setChecked(true);
        set_central_widget(car_com);
        setup_caratteristica_common();
        select_car_specific();
    }
    
    private void set_struttura(){
        bottoni_untoggle();
        inserimento.bottone_struttura.setChecked(true);
        set_central_widget(strut_com);
        setup_struttura_common();
        select_struttura_specific();
    }
    
    private void set_iniziativa(){
        bottoni_untoggle();
        inserimento.bottone_iniziativa.setChecked(true);
        set_central_widget(ini_com);
        setup_iniziativa_common();
    }
    
    private void set_tappa(){
        bottoni_untoggle();
        inserimento.bottone_tappa.setChecked(true);
        set_central_widget(new Ui_widget_tappa());
    }
    
    private void set_sentiero(){
        bottoni_untoggle();
        inserimento.bottone_sentiero.setChecked(true);
        set_central_widget(new Ui_widget_sentieri());
    }
    
    private void set_comune(){
        bottoni_untoggle();
        inserimento.bottone_comune.setChecked(true);
        set_central_widget(new Ui_widget_comune());
    }
    
    private void set_central_widget(QUiForm form){
        if(inserimento.widget_specific != null) inserimento.widget_specific.dispose();
        if(inserimento.widget_common != null ) inserimento.widget_common.dispose();
        inserimento.widget_common = new QWidget(inserimento.widget_selection);
        inserimento.verticalLayout.insertWidget(0,inserimento.widget_common);
        form.setupUi(inserimento.widget_common);
        inserimento.widget_common.show();
    }
    
    private void set_special_widget(QUiForm form){
        inserimento.widget_specific = new QWidget(inserimento.widget_2);
        inserimento.layout_inferiore.insertWidget(0,inserimento.widget_specific);
        form.setupUi(inserimento.widget_specific);
        inserimento.widget_specific.show();
    }
    
    public void exec() {
        QApplication.exec();
    }
    
}
