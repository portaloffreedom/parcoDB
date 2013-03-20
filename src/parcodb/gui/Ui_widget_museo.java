/********************************************************************************
 ** Form generated from reading ui file 'widget_museo.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_widget_museo implements com.trolltech.qt.QUiForm<QWidget>
{
    public QVBoxLayout verticalLayout;
    public QWidget widget;
    public QVBoxLayout verticalLayout_2;
    public QLabel label;
    public QLineEdit lineEdit_telefono;
    public QLabel label_descrizione;
    public QPlainTextEdit plainTextEdit_descrizione;

    public Ui_widget_museo() { super(); }

    public void setupUi(QWidget widget_museo)
    {
        widget_museo.setObjectName("widget_museo");
        widget_museo.resize(new QSize(605, 342).expandedTo(widget_museo.minimumSizeHint()));
        verticalLayout = new QVBoxLayout(widget_museo);
        verticalLayout.setObjectName("verticalLayout");
        widget = new QWidget(widget_museo);
        widget.setObjectName("widget");
        verticalLayout_2 = new QVBoxLayout(widget);
        verticalLayout_2.setMargin(0);
        verticalLayout_2.setObjectName("verticalLayout_2");
        label = new QLabel(widget);
        label.setObjectName("label");

        verticalLayout_2.addWidget(label);

        lineEdit_telefono = new QLineEdit(widget);
        lineEdit_telefono.setObjectName("lineEdit_telefono");
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy.setHorizontalStretch((byte)0);
        sizePolicy.setVerticalStretch((byte)0);
        sizePolicy.setHeightForWidth(lineEdit_telefono.sizePolicy().hasHeightForWidth());
        lineEdit_telefono.setSizePolicy(sizePolicy);

        verticalLayout_2.addWidget(lineEdit_telefono);


        verticalLayout.addWidget(widget);

        label_descrizione = new QLabel(widget_museo);
        label_descrizione.setObjectName("label_descrizione");

        verticalLayout.addWidget(label_descrizione);

        plainTextEdit_descrizione = new QPlainTextEdit(widget_museo);
        plainTextEdit_descrizione.setObjectName("plainTextEdit_descrizione");

        verticalLayout.addWidget(plainTextEdit_descrizione);

        retranslateUi(widget_museo);

        widget_museo.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget widget_museo)
    {
        widget_museo.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("widget_museo", "Form", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_museo", "Numero di Telefono", null));
        label_descrizione.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_museo", "Descrizione museo", null));
    } // retranslateUi

}

