/********************************************************************************
 ** Form generated from reading ui file 'widget_impianti.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui.builders;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_widget_impianti implements com.trolltech.qt.QUiForm<QWidget>
{
    public QVBoxLayout verticalLayout_3;
    public QWidget widget;
    public QVBoxLayout verticalLayout;
    public QLabel label;
    public QSpinBox spinBox_capacita;
    public QWidget widget_2;
    public QVBoxLayout verticalLayout_2;
    public QLabel label_2;
    public QComboBox comboBox_tipologia;
    public QSpacerItem verticalSpacer;

    public Ui_widget_impianti() { super(); }

    public void setupUi(QWidget widget_impianti)
    {
        widget_impianti.setObjectName("widget_impianti");
        widget_impianti.resize(new QSize(489, 351).expandedTo(widget_impianti.minimumSizeHint()));
        verticalLayout_3 = new QVBoxLayout(widget_impianti);
        verticalLayout_3.setObjectName("verticalLayout_3");
        widget = new QWidget(widget_impianti);
        widget.setObjectName("widget");
        verticalLayout = new QVBoxLayout(widget);
        verticalLayout.setMargin(0);
        verticalLayout.setObjectName("verticalLayout");
        label = new QLabel(widget);
        label.setObjectName("label");
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy.setHorizontalStretch((byte)0);
        sizePolicy.setVerticalStretch((byte)0);
        sizePolicy.setHeightForWidth(label.sizePolicy().hasHeightForWidth());
        label.setSizePolicy(sizePolicy);

        verticalLayout.addWidget(label);

        spinBox_capacita = new QSpinBox(widget);
        spinBox_capacita.setObjectName("spinBox_capacita");
        QSizePolicy sizePolicy1 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy1.setHorizontalStretch((byte)0);
        sizePolicy1.setVerticalStretch((byte)0);
        sizePolicy1.setHeightForWidth(spinBox_capacita.sizePolicy().hasHeightForWidth());
        spinBox_capacita.setSizePolicy(sizePolicy1);
        spinBox_capacita.setMaximum(9999999);

        verticalLayout.addWidget(spinBox_capacita);


        verticalLayout_3.addWidget(widget);

        widget_2 = new QWidget(widget_impianti);
        widget_2.setObjectName("widget_2");
        verticalLayout_2 = new QVBoxLayout(widget_2);
        verticalLayout_2.setMargin(0);
        verticalLayout_2.setObjectName("verticalLayout_2");
        label_2 = new QLabel(widget_2);
        label_2.setObjectName("label_2");
        QSizePolicy sizePolicy2 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy2.setHorizontalStretch((byte)0);
        sizePolicy2.setVerticalStretch((byte)0);
        sizePolicy2.setHeightForWidth(label_2.sizePolicy().hasHeightForWidth());
        label_2.setSizePolicy(sizePolicy2);

        verticalLayout_2.addWidget(label_2);

        comboBox_tipologia = new QComboBox(widget_2);
        comboBox_tipologia.setObjectName("comboBox_tipologia");
        QSizePolicy sizePolicy3 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy3.setHorizontalStretch((byte)0);
        sizePolicy3.setVerticalStretch((byte)0);
        sizePolicy3.setHeightForWidth(comboBox_tipologia.sizePolicy().hasHeightForWidth());
        comboBox_tipologia.setSizePolicy(sizePolicy3);

        verticalLayout_2.addWidget(comboBox_tipologia);


        verticalLayout_3.addWidget(widget_2);

        verticalSpacer = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        verticalLayout_3.addItem(verticalSpacer);

        retranslateUi(widget_impianti);

        widget_impianti.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget widget_impianti)
    {
        widget_impianti.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("widget_impianti", "Form", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_impianti", "Capacit\u00e0", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_impianti", "Tipologia", null));
    } // retranslateUi

}

