/********************************************************************************
 ** Form generated from reading ui file 'main.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui.builders;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_MainWindow implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QAction actionEsci;
    public QAction actionInformazioni_su;
    public QAction actionModalit_avanzata;
    public QAction actionCollega_a_database;
    public QWidget centralwidget;
    public QVBoxLayout verticalLayout_7;
    public QMenuBar menubar;
    public QMenu menuFile;
    public QMenu menuHelp;
    public QMenu menuModalit;
    public QStatusBar statusbar;

    public Ui_MainWindow() { super(); }

    public void setupUi(QMainWindow MainWindow)
    {
        MainWindow.setObjectName("MainWindow");
        MainWindow.resize(new QSize(951, 798).expandedTo(MainWindow.minimumSizeHint()));
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Maximum);
        sizePolicy.setHorizontalStretch((byte)0);
        sizePolicy.setVerticalStretch((byte)0);
        sizePolicy.setHeightForWidth(MainWindow.sizePolicy().hasHeightForWidth());
        MainWindow.setSizePolicy(sizePolicy);
        MainWindow.setUnifiedTitleAndToolBarOnMac(false);
        actionEsci = new QAction(MainWindow);
        actionEsci.setObjectName("actionEsci");
        actionInformazioni_su = new QAction(MainWindow);
        actionInformazioni_su.setObjectName("actionInformazioni_su");
        actionModalit_avanzata = new QAction(MainWindow);
        actionModalit_avanzata.setObjectName("actionModalit_avanzata");
        actionModalit_avanzata.setCheckable(true);
        actionCollega_a_database = new QAction(MainWindow);
        actionCollega_a_database.setObjectName("actionCollega_a_database");
        centralwidget = new QWidget(MainWindow);
        centralwidget.setObjectName("centralwidget");
        QSizePolicy sizePolicy1 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy1.setHorizontalStretch((byte)0);
        sizePolicy1.setVerticalStretch((byte)0);
        sizePolicy1.setHeightForWidth(centralwidget.sizePolicy().hasHeightForWidth());
        centralwidget.setSizePolicy(sizePolicy1);
        verticalLayout_7 = new QVBoxLayout(centralwidget);
        verticalLayout_7.setObjectName("verticalLayout_7");
        MainWindow.setCentralWidget(centralwidget);
        menubar = new QMenuBar(MainWindow);
        menubar.setObjectName("menubar");
        menubar.setGeometry(new QRect(0, 0, 951, 20));
        menuFile = new QMenu(menubar);
        menuFile.setObjectName("menuFile");
        menuHelp = new QMenu(menubar);
        menuHelp.setObjectName("menuHelp");
        menuModalit = new QMenu(menubar);
        menuModalit.setObjectName("menuModalit");
        MainWindow.setMenuBar(menubar);
        statusbar = new QStatusBar(MainWindow);
        statusbar.setObjectName("statusbar");
        MainWindow.setStatusBar(statusbar);

        menubar.addAction(menuFile.menuAction());
        menubar.addAction(menuModalit.menuAction());
        menubar.addAction(menuHelp.menuAction());
        menuFile.addAction(actionCollega_a_database);
        menuFile.addAction(actionEsci);
        menuHelp.addAction(actionInformazioni_su);
        menuModalit.addAction(actionModalit_avanzata);
        retranslateUi(MainWindow);
        actionEsci.triggered.connect(MainWindow, "close()");

        MainWindow.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow MainWindow)
    {
        MainWindow.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Informaparchi", null));
        actionEsci.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Esci", null));
        actionInformazioni_su.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Informazioni su", null));
        actionModalit_avanzata.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Modalit\u00e0 inserimento", null));
        actionCollega_a_database.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Collega a database", null));
        menuFile.setTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "File", null));
        menuHelp.setTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Aiuto", null));
        menuModalit.setTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Modalit\u00e0", null));
    } // retranslateUi

}

