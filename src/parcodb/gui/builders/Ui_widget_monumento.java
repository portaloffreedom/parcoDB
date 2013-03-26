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
    public QLabel label_2;
    public QLineEdit lineEdit_anno;
    public QLabel label;
    public QPlainTextEdit plainTextEdit;

    public Ui_widget_monumento() { super(); }

    public void setupUi(QWidget widget_monumento)
    {
        widget_monumento.setObjectName("widget_monumento");
        widget_monumento.resize(new QSize(961, 637).expandedTo(widget_monumento.minimumSizeHint()));
        verticalLayout = new QVBoxLayout(widget_monumento);
        verticalLayout.setObjectName("verticalLayout");
        label_2 = new QLabel(widget_monumento);
        label_2.setObjectName("label_2");

        verticalLayout.addWidget(label_2);

        lineEdit_anno = new QLineEdit(widget_monumento);
        lineEdit_anno.setObjectName("lineEdit_anno");
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy.setHorizontalStretch((byte)0);
        sizePolicy.setVerticalStretch((byte)0);
        sizePolicy.setHeightForWidth(lineEdit_anno.sizePolicy().hasHeightForWidth());
        lineEdit_anno.setSizePolicy(sizePolicy);
        lineEdit_anno.setInputMethodHints(com.trolltech.qt.core.Qt.InputMethodHint.createQFlags(com.trolltech.qt.core.Qt.InputMethodHint.ImhDigitsOnly,com.trolltech.qt.core.Qt.InputMethodHint.ImhFormattedNumbersOnly));

        verticalLayout.addWidget(lineEdit_anno);

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
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_monumento", "Anno", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_monumento", "Descrizione storica", null));
    } // retranslateUi

}

