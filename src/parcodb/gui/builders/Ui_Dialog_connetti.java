/********************************************************************************
 ** Form generated from reading ui file 'dialog_connetti.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui.builders;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_Dialog_connetti implements com.trolltech.qt.QUiForm<QDialog>
{
    public QVBoxLayout verticalLayout;
    public QWidget widget;
    public QHBoxLayout horizontalLayout;
    public QLabel label;
    public QLineEdit lineEdit_indirizzo;
    public QSpacerItem horizontalSpacer;
    public QLabel label_2;
    public QLineEdit lineEdit_porta;
    public QSpacerItem verticalSpacer;
    public QWidget widget_2;
    public QHBoxLayout horizontalLayout_2;
    public QSpacerItem horizontalSpacer_2;
    public QPushButton bottone_connetti;
    public QPushButton bottone_annulla;

    public Ui_Dialog_connetti() { super(); }

    public void setupUi(QDialog Dialog_connetti)
    {
        Dialog_connetti.setObjectName("Dialog_connetti");
        Dialog_connetti.resize(new QSize(427, 177).expandedTo(Dialog_connetti.minimumSizeHint()));
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Maximum);
        sizePolicy.setHorizontalStretch((byte)0);
        sizePolicy.setVerticalStretch((byte)0);
        sizePolicy.setHeightForWidth(Dialog_connetti.sizePolicy().hasHeightForWidth());
        Dialog_connetti.setSizePolicy(sizePolicy);
        verticalLayout = new QVBoxLayout(Dialog_connetti);
        verticalLayout.setMargin(0);
        verticalLayout.setObjectName("verticalLayout");
        widget = new QWidget(Dialog_connetti);
        widget.setObjectName("widget");
        horizontalLayout = new QHBoxLayout(widget);
        horizontalLayout.setObjectName("horizontalLayout");
        label = new QLabel(widget);
        label.setObjectName("label");

        horizontalLayout.addWidget(label);

        lineEdit_indirizzo = new QLineEdit(widget);
        lineEdit_indirizzo.setObjectName("lineEdit_indirizzo");

        horizontalLayout.addWidget(lineEdit_indirizzo);

        horizontalSpacer = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        horizontalLayout.addItem(horizontalSpacer);

        label_2 = new QLabel(widget);
        label_2.setObjectName("label_2");
        QSizePolicy sizePolicy1 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy1.setHorizontalStretch((byte)0);
        sizePolicy1.setVerticalStretch((byte)0);
        sizePolicy1.setHeightForWidth(label_2.sizePolicy().hasHeightForWidth());
        label_2.setSizePolicy(sizePolicy1);

        horizontalLayout.addWidget(label_2);

        lineEdit_porta = new QLineEdit(widget);
        lineEdit_porta.setObjectName("lineEdit_porta");
        lineEdit_porta.setInputMethodHints(com.trolltech.qt.core.Qt.InputMethodHint.createQFlags(com.trolltech.qt.core.Qt.InputMethodHint.ImhDigitsOnly,com.trolltech.qt.core.Qt.InputMethodHint.ImhFormattedNumbersOnly));

        horizontalLayout.addWidget(lineEdit_porta);


        verticalLayout.addWidget(widget);

        verticalSpacer = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        verticalLayout.addItem(verticalSpacer);

        widget_2 = new QWidget(Dialog_connetti);
        widget_2.setObjectName("widget_2");
        horizontalLayout_2 = new QHBoxLayout(widget_2);
        horizontalLayout_2.setObjectName("horizontalLayout_2");
        horizontalSpacer_2 = new QSpacerItem(240, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        horizontalLayout_2.addItem(horizontalSpacer_2);

        bottone_connetti = new QPushButton(widget_2);
        bottone_connetti.setObjectName("bottone_connetti");

        horizontalLayout_2.addWidget(bottone_connetti);

        bottone_annulla = new QPushButton(widget_2);
        bottone_annulla.setObjectName("bottone_annulla");

        horizontalLayout_2.addWidget(bottone_annulla);


        verticalLayout.addWidget(widget_2);

        retranslateUi(Dialog_connetti);

        Dialog_connetti.connectSlotsByName();
    } // setupUi

    void retranslateUi(QDialog Dialog_connetti)
    {
        Dialog_connetti.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Dialog_connetti", "Dialog", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog_connetti", "Indirizzo", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog_connetti", "Porta", null));
        bottone_connetti.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog_connetti", "Connetti", null));
        bottone_annulla.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog_connetti", "Annulla", null));
    } // retranslateUi

}

