/********************************************************************************
 ** Form generated from reading ui file 'dialog_errore_nodati.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui.builders;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_Dialog_errore_nodati implements com.trolltech.qt.QUiForm<QDialog>
{
    public QVBoxLayout verticalLayout_2;
    public QWidget widget;
    public QVBoxLayout verticalLayout;
    public QLabel label_errore;
    public QPushButton pushButton;

    public Ui_Dialog_errore_nodati() { super(); }

    public void setupUi(QDialog Dialog_errore_nodati)
    {
        Dialog_errore_nodati.setObjectName("Dialog_errore_nodati");
        Dialog_errore_nodati.resize(new QSize(519, 223).expandedTo(Dialog_errore_nodati.minimumSizeHint()));
        verticalLayout_2 = new QVBoxLayout(Dialog_errore_nodati);
        verticalLayout_2.setObjectName("verticalLayout_2");
        widget = new QWidget(Dialog_errore_nodati);
        widget.setObjectName("widget");
        verticalLayout = new QVBoxLayout(widget);
        verticalLayout.setObjectName("verticalLayout");
        label_errore = new QLabel(widget);
        label_errore.setObjectName("label_errore");
        label_errore.setLayoutDirection(com.trolltech.qt.core.Qt.LayoutDirection.LeftToRight);

        verticalLayout.addWidget(label_errore);


        verticalLayout_2.addWidget(widget);

        pushButton = new QPushButton(Dialog_errore_nodati);
        pushButton.setObjectName("pushButton");
        pushButton.setMaximumSize(new QSize(90, 16777215));
        pushButton.setLayoutDirection(com.trolltech.qt.core.Qt.LayoutDirection.RightToLeft);

        verticalLayout_2.addWidget(pushButton);

        retranslateUi(Dialog_errore_nodati);
        pushButton.clicked.connect(Dialog_errore_nodati, "disposeLater()");
        pushButton.clicked.connect(Dialog_errore_nodati, "close()");

        Dialog_errore_nodati.connectSlotsByName();
    } // setupUi

    void retranslateUi(QDialog Dialog_errore_nodati)
    {
        Dialog_errore_nodati.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Dialog_errore_nodati", "Errore", null));
        label_errore.setText("");
        pushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog_errore_nodati", "OK", null));
    } // retranslateUi

}

