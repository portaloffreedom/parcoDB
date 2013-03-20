/********************************************************************************
 ** Form generated from reading ui file 'widget_monumento.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_widget_monumento implements com.trolltech.qt.QUiForm<QWidget>
{
    public QVBoxLayout verticalLayout;
    public QLabel label_monumento;
    public QPlainTextEdit plainTextEdit_monumento;

    public Ui_widget_monumento() { super(); }

    public void setupUi(QWidget widget_monumento)
    {
        widget_monumento.setObjectName("widget_monumento");
        widget_monumento.resize(new QSize(485, 371).expandedTo(widget_monumento.minimumSizeHint()));
        verticalLayout = new QVBoxLayout(widget_monumento);
        verticalLayout.setObjectName("verticalLayout");
        label_monumento = new QLabel(widget_monumento);
        label_monumento.setObjectName("label_monumento");

        verticalLayout.addWidget(label_monumento);

        plainTextEdit_monumento = new QPlainTextEdit(widget_monumento);
        plainTextEdit_monumento.setObjectName("plainTextEdit_monumento");

        verticalLayout.addWidget(plainTextEdit_monumento);

        retranslateUi(widget_monumento);

        widget_monumento.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget widget_monumento)
    {
        widget_monumento.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("widget_monumento", "Form", null));
        label_monumento.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_monumento", "Descrizione storica", null));
    } // retranslateUi

}

