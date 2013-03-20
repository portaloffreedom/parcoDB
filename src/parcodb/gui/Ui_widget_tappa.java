/********************************************************************************
 ** Form generated from reading ui file 'widget_tappa.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_widget_tappa implements com.trolltech.qt.QUiForm<QWidget>
{
    public QHBoxLayout horizontalLayout_4;
    public QWidget widget_5;
    public QVBoxLayout verticalLayout_2;
    public QWidget widget;
    public QHBoxLayout horizontalLayout;
    public QLabel label_lunghezza;
    public QLineEdit lineEdit_lunghezza;
    public QWidget widget_4;
    public QVBoxLayout verticalLayout;
    public QWidget widget_2;
    public QHBoxLayout horizontalLayout_2;
    public QLabel label_inizio;
    public QComboBox comboBox_inizio;
    public QWidget widget_3;
    public QHBoxLayout horizontalLayout_3;
    public QLabel label_fine;
    public QComboBox comboBox_fine;
    public QSpacerItem verticalSpacer;
    public QWidget widget_6;
    public QVBoxLayout verticalLayout_3;
    public QLabel label_interesse;
    public QListWidget list_interesse;

    public Ui_widget_tappa() { super(); }

    public void setupUi(QWidget widget_tappa)
    {
        widget_tappa.setObjectName("widget_tappa");
        widget_tappa.resize(new QSize(935, 461).expandedTo(widget_tappa.minimumSizeHint()));
        horizontalLayout_4 = new QHBoxLayout(widget_tappa);
        horizontalLayout_4.setObjectName("horizontalLayout_4");
        widget_5 = new QWidget(widget_tappa);
        widget_5.setObjectName("widget_5");
        verticalLayout_2 = new QVBoxLayout(widget_5);
        verticalLayout_2.setObjectName("verticalLayout_2");
        widget = new QWidget(widget_5);
        widget.setObjectName("widget");
        horizontalLayout = new QHBoxLayout(widget);
        horizontalLayout.setMargin(0);
        horizontalLayout.setObjectName("horizontalLayout");
        label_lunghezza = new QLabel(widget);
        label_lunghezza.setObjectName("label_lunghezza");

        horizontalLayout.addWidget(label_lunghezza);

        lineEdit_lunghezza = new QLineEdit(widget);
        lineEdit_lunghezza.setObjectName("lineEdit_lunghezza");

        horizontalLayout.addWidget(lineEdit_lunghezza);


        verticalLayout_2.addWidget(widget);

        widget_4 = new QWidget(widget_5);
        widget_4.setObjectName("widget_4");
        verticalLayout = new QVBoxLayout(widget_4);
        verticalLayout.setMargin(0);
        verticalLayout.setObjectName("verticalLayout");
        widget_2 = new QWidget(widget_4);
        widget_2.setObjectName("widget_2");
        horizontalLayout_2 = new QHBoxLayout(widget_2);
        horizontalLayout_2.setMargin(0);
        horizontalLayout_2.setObjectName("horizontalLayout_2");
        label_inizio = new QLabel(widget_2);
        label_inizio.setObjectName("label_inizio");

        horizontalLayout_2.addWidget(label_inizio);

        comboBox_inizio = new QComboBox(widget_2);
        comboBox_inizio.setObjectName("comboBox_inizio");

        horizontalLayout_2.addWidget(comboBox_inizio);


        verticalLayout.addWidget(widget_2);

        widget_3 = new QWidget(widget_4);
        widget_3.setObjectName("widget_3");
        horizontalLayout_3 = new QHBoxLayout(widget_3);
        horizontalLayout_3.setMargin(0);
        horizontalLayout_3.setObjectName("horizontalLayout_3");
        label_fine = new QLabel(widget_3);
        label_fine.setObjectName("label_fine");

        horizontalLayout_3.addWidget(label_fine);

        comboBox_fine = new QComboBox(widget_3);
        comboBox_fine.setObjectName("comboBox_fine");

        horizontalLayout_3.addWidget(comboBox_fine);


        verticalLayout.addWidget(widget_3);


        verticalLayout_2.addWidget(widget_4);

        verticalSpacer = new QSpacerItem(20, 340, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        verticalLayout_2.addItem(verticalSpacer);


        horizontalLayout_4.addWidget(widget_5);

        widget_6 = new QWidget(widget_tappa);
        widget_6.setObjectName("widget_6");
        verticalLayout_3 = new QVBoxLayout(widget_6);
        verticalLayout_3.setMargin(0);
        verticalLayout_3.setObjectName("verticalLayout_3");
        label_interesse = new QLabel(widget_6);
        label_interesse.setObjectName("label_interesse");

        verticalLayout_3.addWidget(label_interesse);

        list_interesse = new QListWidget(widget_6);
        list_interesse.setObjectName("list_interesse");
        list_interesse.setSelectionMode(com.trolltech.qt.gui.QAbstractItemView.SelectionMode.MultiSelection);

        verticalLayout_3.addWidget(list_interesse);


        horizontalLayout_4.addWidget(widget_6);

        retranslateUi(widget_tappa);

        widget_tappa.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget widget_tappa)
    {
        widget_tappa.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("widget_tappa", "Form", null));
        label_lunghezza.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_tappa", "Lunghezza tappa", null));
        label_inizio.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_tappa", "Inizio", null));
        label_fine.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_tappa", "Fine", null));
        label_interesse.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_tappa", "Aree interessate", null));
    } // retranslateUi

}

