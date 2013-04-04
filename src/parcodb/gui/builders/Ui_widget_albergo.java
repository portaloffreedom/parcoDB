/********************************************************************************
 ** Form generated from reading ui file 'widget_albergo.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui.builders;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_widget_albergo implements com.trolltech.qt.QUiForm<QWidget>
{
    public QVBoxLayout verticalLayout_3;
    public QWidget widget;
    public QVBoxLayout verticalLayout_5;
    public QWidget widget_2;
    public QVBoxLayout verticalLayout_4;
    public QLabel label;
    public QLineEdit lineEdit_telefono;
    public QWidget widget_posti;
    public QVBoxLayout verticalLayout_2;
    public QLabel label_posti;
    public QLineEdit lineEdit_posti;
    public QWidget widget_stelle;
    public QVBoxLayout verticalLayout;
    public QLabel label_stelle;
    public QSpinBox spinBox_stelle;
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
        verticalLayout_5 = new QVBoxLayout(widget);
        verticalLayout_5.setObjectName("verticalLayout_5");
        widget_2 = new QWidget(widget);
        widget_2.setObjectName("widget_2");
        verticalLayout_4 = new QVBoxLayout(widget_2);
        verticalLayout_4.setMargin(0);
        verticalLayout_4.setObjectName("verticalLayout_4");
        label = new QLabel(widget_2);
        label.setObjectName("label");
        QSizePolicy sizePolicy1 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy1.setHorizontalStretch((byte)0);
        sizePolicy1.setVerticalStretch((byte)0);
        sizePolicy1.setHeightForWidth(label.sizePolicy().hasHeightForWidth());
        label.setSizePolicy(sizePolicy1);

        verticalLayout_4.addWidget(label);

        lineEdit_telefono = new QLineEdit(widget_2);
        lineEdit_telefono.setObjectName("lineEdit_telefono");
        QSizePolicy sizePolicy2 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy2.setHorizontalStretch((byte)0);
        sizePolicy2.setVerticalStretch((byte)0);
        sizePolicy2.setHeightForWidth(lineEdit_telefono.sizePolicy().hasHeightForWidth());
        lineEdit_telefono.setSizePolicy(sizePolicy2);

        verticalLayout_4.addWidget(lineEdit_telefono);


        verticalLayout_5.addWidget(widget_2);

        widget_posti = new QWidget(widget);
        widget_posti.setObjectName("widget_posti");
        verticalLayout_2 = new QVBoxLayout(widget_posti);
        verticalLayout_2.setMargin(0);
        verticalLayout_2.setObjectName("verticalLayout_2");
        label_posti = new QLabel(widget_posti);
        label_posti.setObjectName("label_posti");
        QSizePolicy sizePolicy3 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy3.setHorizontalStretch((byte)0);
        sizePolicy3.setVerticalStretch((byte)0);
        sizePolicy3.setHeightForWidth(label_posti.sizePolicy().hasHeightForWidth());
        label_posti.setSizePolicy(sizePolicy3);

        verticalLayout_2.addWidget(label_posti);

        lineEdit_posti = new QLineEdit(widget_posti);
        lineEdit_posti.setObjectName("lineEdit_posti");
        QSizePolicy sizePolicy4 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy4.setHorizontalStretch((byte)0);
        sizePolicy4.setVerticalStretch((byte)0);
        sizePolicy4.setHeightForWidth(lineEdit_posti.sizePolicy().hasHeightForWidth());
        lineEdit_posti.setSizePolicy(sizePolicy4);

        verticalLayout_2.addWidget(lineEdit_posti);


        verticalLayout_5.addWidget(widget_posti);

        widget_stelle = new QWidget(widget);
        widget_stelle.setObjectName("widget_stelle");
        verticalLayout = new QVBoxLayout(widget_stelle);
        verticalLayout.setSpacing(6);
        verticalLayout.setMargin(0);
        verticalLayout.setObjectName("verticalLayout");
        label_stelle = new QLabel(widget_stelle);
        label_stelle.setObjectName("label_stelle");
        QSizePolicy sizePolicy5 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy5.setHorizontalStretch((byte)0);
        sizePolicy5.setVerticalStretch((byte)0);
        sizePolicy5.setHeightForWidth(label_stelle.sizePolicy().hasHeightForWidth());
        label_stelle.setSizePolicy(sizePolicy5);

        verticalLayout.addWidget(label_stelle);

        spinBox_stelle = new QSpinBox(widget_stelle);
        spinBox_stelle.setObjectName("spinBox_stelle");
        QSizePolicy sizePolicy6 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy6.setHorizontalStretch((byte)0);
        sizePolicy6.setVerticalStretch((byte)0);
        sizePolicy6.setHeightForWidth(spinBox_stelle.sizePolicy().hasHeightForWidth());
        spinBox_stelle.setSizePolicy(sizePolicy6);
        spinBox_stelle.setMinimum(1);
        spinBox_stelle.setMaximum(5);

        verticalLayout.addWidget(spinBox_stelle);


        verticalLayout_5.addWidget(widget_stelle);


        verticalLayout_3.addWidget(widget);

        verticalSpacer = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        verticalLayout_3.addItem(verticalSpacer);

        retranslateUi(widget_albergo);

        widget_albergo.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget widget_albergo)
    {
        widget_albergo.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("widget_albergo", "Form", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_albergo", "Numero di Telefono", null));
        label_posti.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_albergo", "Posti", null));
        label_stelle.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_albergo", "Stelle", null));
    } // retranslateUi

}

