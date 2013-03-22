/*
 * 
 */
package parcodb.gui;

import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QMainWindow;
import com.trolltech.qt.gui.QWidget;
import parcodb.gui.builders.Ui_MainWindow;

/**
 * Costruttore dell'interfaccia principale.
 * @author stengun
 */
public class MainGUI {
    private Ui_MainWindow mainui;
    private Widget_Inserimento widget_inserimento;
    private QWidget wid_central;
    private QMainWindow qMainWindow;
    
    public MainGUI(String[] args) {
        QApplication.initialize(args);
        
        //MainWindowWidget mainWidget = new MainWindowWidget();
        //inizilizzazione grafica dei widget personalizzati.
        mainui = new Ui_MainWindow();
        wid_central = new QWidget();
        qMainWindow = new QMainWindow();
        widget_inserimento = new Widget_Inserimento(qMainWindow);
    }
    
    public void SetupUi(){
        widget_inserimento.setupUi(wid_central);
        mainui.setupUi(qMainWindow);
        qMainWindow.setCentralWidget(wid_central);
        qMainWindow.show();
    }

    public void exec() {
        QApplication.exec();
    }
    
}
