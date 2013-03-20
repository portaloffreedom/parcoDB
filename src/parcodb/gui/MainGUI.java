/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
    
    public void setup_struttura_common(){
        
        strut_com.combo_tipo.addItem("Albergo");
        strut_com.combo_tipo.addItem("Museo");
        strut_com.combo_tipo.addItem("Monumento");
        strut_com.combo_tipo.addItem("Infopoint");
        strut_com.combo_tipo.addItem("Impianto di risalita");
        strut_com.combo_tipo.setCurrentIndex(-1);
        strut_com.combo_tipo.currentIndexChanged.connect(this, "select_specific()");
    }

    private void select_specific(){
        if(inserimento.widget_specific != null) inserimento.widget_specific.dispose();
        switch(strut_com.combo_tipo.currentIndex()){
            case 0:
                set_special_widget(new Ui_widget_albergo());
                break;
            case 1:
                set_special_widget(new Ui_widget_museo());
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
            default:
                break;
        }
        System.out.println(strut_com.combo_tipo.currentIndex());
    }
//impostatori di segnali
    private void set_signals_inserimento(){
        inserimento.bottone_struttura.clicked.connect(this, "set_struttura()");
        inserimento.bottone_iniziativa.clicked.connect(this, "set_iniziativa()");
        inserimento.bottone_terreno.clicked.connect(this, "set_caratteristica()");
    }
    
//impostatori di form diversi nell'interfaccia da usare negli eventi
    private void set_caratteristica(){
        set_central_widget(car_com);
    }
    
    private void set_struttura(){
        set_central_widget(strut_com);
        setup_struttura_common();
    }
    
    private void set_iniziativa(){
        set_central_widget(ini_com);
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
