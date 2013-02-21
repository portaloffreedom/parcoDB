/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.gui;

import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QMainWindow;

/**
 *
 * @author matteo
 */
public class MainGUI {

    public MainGUI(String[] args) {
        QApplication.initialize(args);
        
        MainWindowWidget mainWidget = new MainWindowWidget();
        QMainWindow qMainWindow = new QMainWindow();
        qMainWindow.setCentralWidget(mainWidget);
        qMainWindow.show();
    }
    
    public void exec() {
        QApplication.exec();
    }
    
}
