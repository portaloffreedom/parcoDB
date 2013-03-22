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
    public QGridLayout gridLayout;
    public QWidget widget;
    public QHBoxLayout horizontalLayout_2;
    public QLabel label;
    public QSpinBox spinBox;
    public QSpacerItem horizontalSpacer;
    public QSpacerItem verticalSpacer;
    public QWidget widget_2;
    public QHBoxLayout horizontalLayout;
    public QLabel label_2;
    public QComboBox comboBox_tipologia;

    public Ui_widget_impianti() { super(); }

    public void setupUi(QWidget widget_impianti)
    {
        widget_impianti.setObjectName("widget_impianti");
        widget_impianti.resize(new QSize(489, 351).expandedTo(widget_impianti.minimumSizeHint()));
        gridLayout = new QGridLayout(widget_impianti);
        gridLayout.setObjectName("gridLayout");
        widget = new QWidget(widget_impianti);
        widget.setObjectName("widget");
        horizontalLayout_2 = new QHBoxLayout(widget);
        horizontalLayout_2.setMargin(0);
        horizontalLayout_2.setObjectName("horizontalLayout_2");
        label = new QLabel(widget);
        label.setObjectName("label");

        horizontalLayout_2.addWidget(label);

        spinBox = new QSpinBox(widget);
        spinBox.setObjectName("spinBox");

        horizontalLayout_2.addWidget(spinBox);


        gridLayout.addWidget(widget, 0, 0, 1, 1);

        horizontalSpacer = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer, 0, 1, 1, 1);

        verticalSpacer = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout.addItem(verticalSpacer, 2, 0, 1, 1);

        widget_2 = new QWidget(widget_impianti);
        widget_2.setObjectName("widget_2");
        horizontalLayout = new QHBoxLayout(widget_2);
        horizontalLayout.setMargin(0);
        horizontalLayout.setObjectName("horizontalLayout");
        label_2 = new QLabel(widget_2);
        label_2.setObjectName("label_2");

        horizontalLayout.addWidget(label_2);

        comboBox_tipologia = new QComboBox(widget_2);
        comboBox_tipologia.setObjectName("comboBox_tipologia");

        horizontalLayout.addWidget(comboBox_tipologia);


        gridLayout.addWidget(widget_2, 1, 0, 1, 1);

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

