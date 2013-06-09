/********************************************************************************
 ** Form generated from reading ui file 'widget_sentieri.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui.builders;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_widget_sentieri implements com.trolltech.qt.QUiForm<QWidget>
{
    public QHBoxLayout horizontalLayout;
    public QWidget widget_3;
    public QVBoxLayout verticalLayout_2;
    public QWidget widget;
    public QHBoxLayout horizontalLayout_2;
    public QLabel label;
    public QSpinBox spinbox_numero;
    public QWidget widget_2;
    public QHBoxLayout horizontalLayout_3;
    public QLabel label_12;
    public QSpinBox spindbox_difficolta;
    public QWidget widget_tempo;
    public QHBoxLayout horizontalLayout_4;
    public QLabel label_13;
    public QDoubleSpinBox doubleSpinBox;
    public QWidget widget_lunghezza;
    public QHBoxLayout horizontalLayout_5;
    public QLabel label_14;
    public QLineEdit lineEdit;
    public QLabel label_2;
    public QListWidget listWidget_tappa;
    public QWidget widget_tappa2;
    public QVBoxLayout verticalLayout;
    public QLabel label_3;
    public QListWidget listWidget_tappa2;
    public QWidget widget_tappa3;
    public QVBoxLayout verticalLayout_5;
    public QLabel label_4;
    public QListWidget listWidget_tappa3;
    public QWidget widget_tappa4;
    public QVBoxLayout verticalLayout_6;
    public QLabel label_5;
    public QListWidget listWidget_tappa4;
    public QWidget widget_tappa5;
    public QVBoxLayout verticalLayout_7;
    public QLabel label_6;
    public QListWidget listWidget_tappa5;
    public QWidget widget_tappa6;
    public QVBoxLayout verticalLayout_8;
    public QLabel label_7;
    public QListWidget listWidget_tappa6;
    public QWidget widget_tappa7;
    public QVBoxLayout verticalLayout_9;
    public QLabel label_8;
    public QListWidget listWidget_tappa7;
    public QWidget widget_tappa8;
    public QVBoxLayout verticalLayout_10;
    public QLabel label_9;
    public QListWidget listWidget_tappa8;
    public QWidget widget_tappa9;
    public QVBoxLayout verticalLayout_3;
    public QLabel label_10;
    public QListWidget listWidget_tappa9;
    public QWidget widget_tappa10;
    public QVBoxLayout verticalLayout_4;
    public QLabel label_11;
    public QListWidget listWidget_tappa10;

    public Ui_widget_sentieri() { super(); }

    public void setupUi(QWidget widget_sentieri)
    {
        widget_sentieri.setObjectName("widget_sentieri");
        widget_sentieri.resize(new QSize(970, 689).expandedTo(widget_sentieri.minimumSizeHint()));
        horizontalLayout = new QHBoxLayout(widget_sentieri);
        horizontalLayout.setObjectName("horizontalLayout");
        widget_3 = new QWidget(widget_sentieri);
        widget_3.setObjectName("widget_3");
        verticalLayout_2 = new QVBoxLayout(widget_3);
        verticalLayout_2.setMargin(0);
        verticalLayout_2.setObjectName("verticalLayout_2");
        widget = new QWidget(widget_3);
        widget.setObjectName("widget");
        horizontalLayout_2 = new QHBoxLayout(widget);
        horizontalLayout_2.setMargin(0);
        horizontalLayout_2.setObjectName("horizontalLayout_2");
        label = new QLabel(widget);
        label.setObjectName("label");

        horizontalLayout_2.addWidget(label);

        spinbox_numero = new QSpinBox(widget);
        spinbox_numero.setObjectName("spinbox_numero");
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy.setHorizontalStretch((byte)0);
        sizePolicy.setVerticalStretch((byte)0);
        sizePolicy.setHeightForWidth(spinbox_numero.sizePolicy().hasHeightForWidth());
        spinbox_numero.setSizePolicy(sizePolicy);
        spinbox_numero.setMinimum(1);
        spinbox_numero.setMaximum(999999);

        horizontalLayout_2.addWidget(spinbox_numero);


        verticalLayout_2.addWidget(widget);

        widget_2 = new QWidget(widget_3);
        widget_2.setObjectName("widget_2");
        horizontalLayout_3 = new QHBoxLayout(widget_2);
        horizontalLayout_3.setSpacing(0);
        horizontalLayout_3.setMargin(0);
        horizontalLayout_3.setObjectName("horizontalLayout_3");
        label_12 = new QLabel(widget_2);
        label_12.setObjectName("label_12");
        QSizePolicy sizePolicy1 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy1.setHorizontalStretch((byte)0);
        sizePolicy1.setVerticalStretch((byte)0);
        sizePolicy1.setHeightForWidth(label_12.sizePolicy().hasHeightForWidth());
        label_12.setSizePolicy(sizePolicy1);

        horizontalLayout_3.addWidget(label_12);

        spindbox_difficolta = new QSpinBox(widget_2);
        spindbox_difficolta.setObjectName("spindbox_difficolta");
        spindbox_difficolta.setMinimum(1);
        spindbox_difficolta.setMaximum(5);

        horizontalLayout_3.addWidget(spindbox_difficolta);


        verticalLayout_2.addWidget(widget_2);

        widget_tempo = new QWidget(widget_3);
        widget_tempo.setObjectName("widget_tempo");
        horizontalLayout_4 = new QHBoxLayout(widget_tempo);
        horizontalLayout_4.setMargin(0);
        horizontalLayout_4.setObjectName("horizontalLayout_4");
        label_13 = new QLabel(widget_tempo);
        label_13.setObjectName("label_13");
        QSizePolicy sizePolicy2 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy2.setHorizontalStretch((byte)0);
        sizePolicy2.setVerticalStretch((byte)0);
        sizePolicy2.setHeightForWidth(label_13.sizePolicy().hasHeightForWidth());
        label_13.setSizePolicy(sizePolicy2);

        horizontalLayout_4.addWidget(label_13);

        doubleSpinBox = new QDoubleSpinBox(widget_tempo);
        doubleSpinBox.setObjectName("doubleSpinBox");
        doubleSpinBox.setMaximum(99999);

        horizontalLayout_4.addWidget(doubleSpinBox);


        verticalLayout_2.addWidget(widget_tempo);

        widget_lunghezza = new QWidget(widget_3);
        widget_lunghezza.setObjectName("widget_lunghezza");
        horizontalLayout_5 = new QHBoxLayout(widget_lunghezza);
        horizontalLayout_5.setMargin(0);
        horizontalLayout_5.setObjectName("horizontalLayout_5");
        label_14 = new QLabel(widget_lunghezza);
        label_14.setObjectName("label_14");
        QSizePolicy sizePolicy3 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy3.setHorizontalStretch((byte)0);
        sizePolicy3.setVerticalStretch((byte)0);
        sizePolicy3.setHeightForWidth(label_14.sizePolicy().hasHeightForWidth());
        label_14.setSizePolicy(sizePolicy3);

        horizontalLayout_5.addWidget(label_14);

        lineEdit = new QLineEdit(widget_lunghezza);
        lineEdit.setObjectName("lineEdit");

        horizontalLayout_5.addWidget(lineEdit);


        verticalLayout_2.addWidget(widget_lunghezza);

        label_2 = new QLabel(widget_3);
        label_2.setObjectName("label_2");

        verticalLayout_2.addWidget(label_2);

        listWidget_tappa = new QListWidget(widget_3);
        listWidget_tappa.setObjectName("listWidget_tappa");
        QSizePolicy sizePolicy4 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Preferred, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);
        sizePolicy4.setHorizontalStretch((byte)0);
        sizePolicy4.setVerticalStretch((byte)0);
        sizePolicy4.setHeightForWidth(listWidget_tappa.sizePolicy().hasHeightForWidth());
        listWidget_tappa.setSizePolicy(sizePolicy4);
        listWidget_tappa.setSelectionMode(com.trolltech.qt.gui.QAbstractItemView.SelectionMode.SingleSelection);

        verticalLayout_2.addWidget(listWidget_tappa);


        horizontalLayout.addWidget(widget_3);

        widget_tappa2 = new QWidget(widget_sentieri);
        widget_tappa2.setObjectName("widget_tappa2");
        verticalLayout = new QVBoxLayout(widget_tappa2);
        verticalLayout.setMargin(0);
        verticalLayout.setObjectName("verticalLayout");
        label_3 = new QLabel(widget_tappa2);
        label_3.setObjectName("label_3");

        verticalLayout.addWidget(label_3);

        listWidget_tappa2 = new QListWidget(widget_tappa2);
        listWidget_tappa2.setObjectName("listWidget_tappa2");
        QSizePolicy sizePolicy5 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Preferred, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);
        sizePolicy5.setHorizontalStretch((byte)0);
        sizePolicy5.setVerticalStretch((byte)0);
        sizePolicy5.setHeightForWidth(listWidget_tappa2.sizePolicy().hasHeightForWidth());
        listWidget_tappa2.setSizePolicy(sizePolicy5);

        verticalLayout.addWidget(listWidget_tappa2);


        horizontalLayout.addWidget(widget_tappa2);

        widget_tappa3 = new QWidget(widget_sentieri);
        widget_tappa3.setObjectName("widget_tappa3");
        verticalLayout_5 = new QVBoxLayout(widget_tappa3);
        verticalLayout_5.setMargin(0);
        verticalLayout_5.setObjectName("verticalLayout_5");
        label_4 = new QLabel(widget_tappa3);
        label_4.setObjectName("label_4");

        verticalLayout_5.addWidget(label_4);

        listWidget_tappa3 = new QListWidget(widget_tappa3);
        listWidget_tappa3.setObjectName("listWidget_tappa3");
        QSizePolicy sizePolicy6 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Preferred, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);
        sizePolicy6.setHorizontalStretch((byte)0);
        sizePolicy6.setVerticalStretch((byte)0);
        sizePolicy6.setHeightForWidth(listWidget_tappa3.sizePolicy().hasHeightForWidth());
        listWidget_tappa3.setSizePolicy(sizePolicy6);

        verticalLayout_5.addWidget(listWidget_tappa3);


        horizontalLayout.addWidget(widget_tappa3);

        widget_tappa4 = new QWidget(widget_sentieri);
        widget_tappa4.setObjectName("widget_tappa4");
        verticalLayout_6 = new QVBoxLayout(widget_tappa4);
        verticalLayout_6.setMargin(0);
        verticalLayout_6.setObjectName("verticalLayout_6");
        label_5 = new QLabel(widget_tappa4);
        label_5.setObjectName("label_5");

        verticalLayout_6.addWidget(label_5);

        listWidget_tappa4 = new QListWidget(widget_tappa4);
        listWidget_tappa4.setObjectName("listWidget_tappa4");
        QSizePolicy sizePolicy7 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Preferred, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);
        sizePolicy7.setHorizontalStretch((byte)0);
        sizePolicy7.setVerticalStretch((byte)0);
        sizePolicy7.setHeightForWidth(listWidget_tappa4.sizePolicy().hasHeightForWidth());
        listWidget_tappa4.setSizePolicy(sizePolicy7);

        verticalLayout_6.addWidget(listWidget_tappa4);


        horizontalLayout.addWidget(widget_tappa4);

        widget_tappa5 = new QWidget(widget_sentieri);
        widget_tappa5.setObjectName("widget_tappa5");
        verticalLayout_7 = new QVBoxLayout(widget_tappa5);
        verticalLayout_7.setMargin(0);
        verticalLayout_7.setObjectName("verticalLayout_7");
        label_6 = new QLabel(widget_tappa5);
        label_6.setObjectName("label_6");

        verticalLayout_7.addWidget(label_6);

        listWidget_tappa5 = new QListWidget(widget_tappa5);
        listWidget_tappa5.setObjectName("listWidget_tappa5");
        QSizePolicy sizePolicy8 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Preferred, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);
        sizePolicy8.setHorizontalStretch((byte)0);
        sizePolicy8.setVerticalStretch((byte)0);
        sizePolicy8.setHeightForWidth(listWidget_tappa5.sizePolicy().hasHeightForWidth());
        listWidget_tappa5.setSizePolicy(sizePolicy8);

        verticalLayout_7.addWidget(listWidget_tappa5);


        horizontalLayout.addWidget(widget_tappa5);

        widget_tappa6 = new QWidget(widget_sentieri);
        widget_tappa6.setObjectName("widget_tappa6");
        verticalLayout_8 = new QVBoxLayout(widget_tappa6);
        verticalLayout_8.setMargin(0);
        verticalLayout_8.setObjectName("verticalLayout_8");
        label_7 = new QLabel(widget_tappa6);
        label_7.setObjectName("label_7");

        verticalLayout_8.addWidget(label_7);

        listWidget_tappa6 = new QListWidget(widget_tappa6);
        listWidget_tappa6.setObjectName("listWidget_tappa6");
        QSizePolicy sizePolicy9 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Preferred, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);
        sizePolicy9.setHorizontalStretch((byte)0);
        sizePolicy9.setVerticalStretch((byte)0);
        sizePolicy9.setHeightForWidth(listWidget_tappa6.sizePolicy().hasHeightForWidth());
        listWidget_tappa6.setSizePolicy(sizePolicy9);

        verticalLayout_8.addWidget(listWidget_tappa6);


        horizontalLayout.addWidget(widget_tappa6);

        widget_tappa7 = new QWidget(widget_sentieri);
        widget_tappa7.setObjectName("widget_tappa7");
        verticalLayout_9 = new QVBoxLayout(widget_tappa7);
        verticalLayout_9.setMargin(0);
        verticalLayout_9.setObjectName("verticalLayout_9");
        label_8 = new QLabel(widget_tappa7);
        label_8.setObjectName("label_8");

        verticalLayout_9.addWidget(label_8);

        listWidget_tappa7 = new QListWidget(widget_tappa7);
        listWidget_tappa7.setObjectName("listWidget_tappa7");
        QSizePolicy sizePolicy10 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Preferred, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);
        sizePolicy10.setHorizontalStretch((byte)0);
        sizePolicy10.setVerticalStretch((byte)0);
        sizePolicy10.setHeightForWidth(listWidget_tappa7.sizePolicy().hasHeightForWidth());
        listWidget_tappa7.setSizePolicy(sizePolicy10);

        verticalLayout_9.addWidget(listWidget_tappa7);


        horizontalLayout.addWidget(widget_tappa7);

        widget_tappa8 = new QWidget(widget_sentieri);
        widget_tappa8.setObjectName("widget_tappa8");
        verticalLayout_10 = new QVBoxLayout(widget_tappa8);
        verticalLayout_10.setMargin(0);
        verticalLayout_10.setObjectName("verticalLayout_10");
        label_9 = new QLabel(widget_tappa8);
        label_9.setObjectName("label_9");

        verticalLayout_10.addWidget(label_9);

        listWidget_tappa8 = new QListWidget(widget_tappa8);
        listWidget_tappa8.setObjectName("listWidget_tappa8");
        QSizePolicy sizePolicy11 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Preferred, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);
        sizePolicy11.setHorizontalStretch((byte)0);
        sizePolicy11.setVerticalStretch((byte)0);
        sizePolicy11.setHeightForWidth(listWidget_tappa8.sizePolicy().hasHeightForWidth());
        listWidget_tappa8.setSizePolicy(sizePolicy11);

        verticalLayout_10.addWidget(listWidget_tappa8);


        horizontalLayout.addWidget(widget_tappa8);

        widget_tappa9 = new QWidget(widget_sentieri);
        widget_tappa9.setObjectName("widget_tappa9");
        verticalLayout_3 = new QVBoxLayout(widget_tappa9);
        verticalLayout_3.setMargin(0);
        verticalLayout_3.setObjectName("verticalLayout_3");
        label_10 = new QLabel(widget_tappa9);
        label_10.setObjectName("label_10");

        verticalLayout_3.addWidget(label_10);

        listWidget_tappa9 = new QListWidget(widget_tappa9);
        listWidget_tappa9.setObjectName("listWidget_tappa9");
        QSizePolicy sizePolicy12 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Preferred, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);
        sizePolicy12.setHorizontalStretch((byte)0);
        sizePolicy12.setVerticalStretch((byte)0);
        sizePolicy12.setHeightForWidth(listWidget_tappa9.sizePolicy().hasHeightForWidth());
        listWidget_tappa9.setSizePolicy(sizePolicy12);

        verticalLayout_3.addWidget(listWidget_tappa9);


        horizontalLayout.addWidget(widget_tappa9);

        widget_tappa10 = new QWidget(widget_sentieri);
        widget_tappa10.setObjectName("widget_tappa10");
        verticalLayout_4 = new QVBoxLayout(widget_tappa10);
        verticalLayout_4.setMargin(0);
        verticalLayout_4.setObjectName("verticalLayout_4");
        label_11 = new QLabel(widget_tappa10);
        label_11.setObjectName("label_11");

        verticalLayout_4.addWidget(label_11);

        listWidget_tappa10 = new QListWidget(widget_tappa10);
        listWidget_tappa10.setObjectName("listWidget_tappa10");
        QSizePolicy sizePolicy13 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Preferred, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);
        sizePolicy13.setHorizontalStretch((byte)0);
        sizePolicy13.setVerticalStretch((byte)0);
        sizePolicy13.setHeightForWidth(listWidget_tappa10.sizePolicy().hasHeightForWidth());
        listWidget_tappa10.setSizePolicy(sizePolicy13);

        verticalLayout_4.addWidget(listWidget_tappa10);


        horizontalLayout.addWidget(widget_tappa10);

        retranslateUi(widget_sentieri);

        widget_sentieri.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget widget_sentieri)
    {
        widget_sentieri.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("widget_sentieri", "Form", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_sentieri", "Numero Sentiero", null));
        label_12.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_sentieri", "Difficolt\u00e0", null));
        label_13.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_sentieri", "Tempo (minuti)", null));
        label_14.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_sentieri", "Lunghezza (m)", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_sentieri", "Seleziona tappe (almeno 4)", null));
        label_3.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_sentieri", "Tappa 2", null));
        label_4.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_sentieri", "Tappa 3", null));
        label_5.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_sentieri", "Tappa 4", null));
        label_6.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_sentieri", "Tappa 5", null));
        label_7.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_sentieri", "Tappa 6", null));
        label_8.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_sentieri", "Tappa 7", null));
        label_9.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_sentieri", "Tappa 8", null));
        label_10.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_sentieri", "Tappa 9", null));
        label_11.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_sentieri", "Tappa 10", null));
    } // retranslateUi

}

