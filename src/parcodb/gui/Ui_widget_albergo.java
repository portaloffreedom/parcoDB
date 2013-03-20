/********************************************************************************
 ** Form generated from reading ui file 'widget_albergo.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_widget_albergo implements com.trolltech.qt.QUiForm<QWidget>
{
    public QVBoxLayout verticalLayout_3;
    public QWidget widget;
    public QHBoxLayout horizontalLayout_2;
    public QWidget widget_stelle;
    public QVBoxLayout verticalLayout;
    public QLabel label_stelle;
    public QSpinBox spinBox_stelle;
    public QWidget widget_posti;
    public QVBoxLayout verticalLayout_2;
    public QLabel label_posti;
    public QLineEdit lineEdit_posti;
    public QWidget widget_2;
    public QVBoxLayout verticalLayout_4;
    public QLabel label;
    public QLineEdit lineEdit_telefono;
    public QSpacerItem horizontalSpacer;
    public QSpacerItem verticalSpacer;

    public Ui_widget_albergo() { super(); }

    public void setupUi(QWidget widget_albergo)
    {
        widget_albergo.setObjectName("widget_albergo");
        widget_albergo.resize(new QSize(543, 185).expandedTo(widget_albergo.minimumSizeHint()));
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy.setHorizontalStretch((byte)0);
        sizePolicy.setVerticalStretch((byte)0);
        sizePolicy.setHeightForWidth(widget_albergo.sizePolicy().hasHeightForWidth());
        widget_albergo.setSizePolicy(sizePolicy);
        verticalLayout_3 = new QVBoxLayout(widget_albergo);
        verticalLayout_3.setMargin(0);
        verticalLayout_3.setObjectName("verticalLayout_3");
        widget = new QWidget(widget_albergo);
        widget.setObjectName("widget");
        horizontalLayout_2 = new QHBoxLayout(widget);
        horizontalLayout_2.setObjectName("horizontalLayout_2");
        widget_stelle = new QWidget(widget);
        widget_stelle.setObjectName("widget_stelle");
        verticalLayout = new QVBoxLayout(widget_stelle);
        verticalLayout.setSpacing(6);
        verticalLayout.setMargin(0);
        verticalLayout.setObjectName("verticalLayout");
        label_stelle = new QLabel(widget_stelle);
        label_stelle.setObjectName("label_stelle");

        verticalLayout.addWidget(label_stelle);

        spinBox_stelle = new QSpinBox(widget_stelle);
        spinBox_stelle.setObjectName("spinBox_stelle");
        spinBox_stelle.setMinimum(1);
        spinBox_stelle.setMaximum(5);

        verticalLayout.addWidget(spinBox_stelle);


        horizontalLayout_2.addWidget(widget_stelle);

        widget_posti = new QWidget(widget);
        widget_posti.setObjectName("widget_posti");
        verticalLayout_2 = new QVBoxLayout(widget_posti);
        verticalLayout_2.setMargin(0);
        verticalLayout_2.setObjectName("verticalLayout_2");
        label_posti = new QLabel(widget_posti);
        label_posti.setObjectName("label_posti");

        verticalLayout_2.addWidget(label_posti);

        lineEdit_posti = new QLineEdit(widget_posti);
        lineEdit_posti.setObjectName("lineEdit_posti");
        QSizePolicy sizePolicy1 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy1.setHorizontalStretch((byte)0);
        sizePolicy1.setVerticalStretch((byte)0);
        sizePolicy1.setHeightForWidth(lineEdit_posti.sizePolicy().hasHeightForWidth());
        lineEdit_posti.setSizePolicy(sizePolicy1);

        verticalLayout_2.addWidget(lineEdit_posti);


        horizontalLayout_2.addWidget(widget_posti);

        widget_2 = new QWidget(widget);
        widget_2.setObjectName("widget_2");
        verticalLayout_4 = new QVBoxLayout(widget_2);
        verticalLayout_4.setMargin(0);
        verticalLayout_4.setObjectName("verticalLayout_4");
        label = new QLabel(widget_2);
        label.setObjectName("label");

        verticalLayout_4.addWidget(label);

        lineEdit_telefono = new QLineEdit(widget_2);
        lineEdit_telefono.setObjectName("lineEdit_telefono");

        verticalLayout_4.addWidget(lineEdit_telefono);


        horizontalLayout_2.addWidget(widget_2);

        horizontalSpacer = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        horizontalLayout_2.addItem(horizontalSpacer);


        verticalLayout_3.addWidget(widget);

        verticalSpacer = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        verticalLayout_3.addItem(verticalSpacer);

        retranslateUi(widget_albergo);

        widget_albergo.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget widget_albergo)
    {
        widget_albergo.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("widget_albergo", "Form", null));
        label_stelle.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_albergo", "Stelle", null));
        label_posti.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_albergo", "Posti", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_albergo", "Numero di Telefono", null));
    } // retranslateUi

}

