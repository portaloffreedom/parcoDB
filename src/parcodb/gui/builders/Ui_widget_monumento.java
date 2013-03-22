/********************************************************************************
 ** Form generated from reading ui file 'widget_monumento.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui.builders;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_widget_monumento implements com.trolltech.qt.QUiForm<QWidget>
{
    public QVBoxLayout verticalLayout;
    public QLabel label;
    public QPlainTextEdit plainTextEdit;

    public Ui_widget_monumento() { super(); }

    public void setupUi(QWidget widget_monumento)
    {
        widget_monumento.setObjectName("widget_monumento");
        widget_monumento.resize(new QSize(961, 637).expandedTo(widget_monumento.minimumSizeHint()));
        verticalLayout = new QVBoxLayout(widget_monumento);
        verticalLayout.setObjectName("verticalLayout");
        label = new QLabel(widget_monumento);
        label.setObjectName("label");

        verticalLayout.addWidget(label);

        plainTextEdit = new QPlainTextEdit(widget_monumento);
        plainTextEdit.setObjectName("plainTextEdit");

        verticalLayout.addWidget(plainTextEdit);

        retranslateUi(widget_monumento);

        widget_monumento.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget widget_monumento)
    {
        widget_monumento.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("widget_monumento", "Form", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_monumento", "Descrizione storica", null));
    } // retranslateUi

}

