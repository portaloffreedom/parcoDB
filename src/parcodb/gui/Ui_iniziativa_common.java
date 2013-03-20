/********************************************************************************
 ** Form generated from reading ui file 'widget_iniziativa.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_iniziativa_common implements com.trolltech.qt.QUiForm<QWidget>
{
    public QGridLayout gridLayout;
    public QWidget widget_tipo;
    public QHBoxLayout horizontalLayout;
    public QLabel label_tipo;
    public QComboBox combo_iniziativa;
    public QWidget widget_nome;
    public QHBoxLayout horizontalLayout_2;
    public QLabel label_nome;
    public QLineEdit lineEdit_nome;
    public QWidget widget;
    public QHBoxLayout horizontalLayout_3;
    public QLabel label_iniziat;
    public QComboBox combo_paese;
    public QSpacerItem horizontalSpacer;
    public QWidget widget_2;
    public QHBoxLayout horizontalLayout_4;
    public QLabel label_settimana;
    public QDateEdit dateEdit_settimana;
    public QWidget widget_3;
    public QVBoxLayout verticalLayout;
    public QLabel label_descrizione;
    public QPlainTextEdit plainText_descrizione;

    public Ui_iniziativa_common() { super(); }

    public void setupUi(QWidget iniziativa_common)
    {
        iniziativa_common.setObjectName("iniziativa_common");
        iniziativa_common.resize(new QSize(821, 332).expandedTo(iniziativa_common.minimumSizeHint()));
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Preferred, com.trolltech.qt.gui.QSizePolicy.Policy.Maximum);
        sizePolicy.setHorizontalStretch((byte)0);
        sizePolicy.setVerticalStretch((byte)0);
        sizePolicy.setHeightForWidth(iniziativa_common.sizePolicy().hasHeightForWidth());
        iniziativa_common.setSizePolicy(sizePolicy);
        gridLayout = new QGridLayout(iniziativa_common);
        gridLayout.setObjectName("gridLayout");
        gridLayout.setHorizontalSpacing(0);
        gridLayout.setContentsMargins(0, 0, 0, 9);
        widget_tipo = new QWidget(iniziativa_common);
        widget_tipo.setObjectName("widget_tipo");
        horizontalLayout = new QHBoxLayout(widget_tipo);
        horizontalLayout.setObjectName("horizontalLayout");
        label_tipo = new QLabel(widget_tipo);
        label_tipo.setObjectName("label_tipo");

        horizontalLayout.addWidget(label_tipo);

        combo_iniziativa = new QComboBox(widget_tipo);
        combo_iniziativa.setObjectName("combo_iniziativa");

        horizontalLayout.addWidget(combo_iniziativa);


        gridLayout.addWidget(widget_tipo, 0, 0, 1, 1);

        widget_nome = new QWidget(iniziativa_common);
        widget_nome.setObjectName("widget_nome");
        horizontalLayout_2 = new QHBoxLayout(widget_nome);
        horizontalLayout_2.setObjectName("horizontalLayout_2");
        label_nome = new QLabel(widget_nome);
        label_nome.setObjectName("label_nome");

        horizontalLayout_2.addWidget(label_nome);

        lineEdit_nome = new QLineEdit(widget_nome);
        lineEdit_nome.setObjectName("lineEdit_nome");

        horizontalLayout_2.addWidget(lineEdit_nome);


        gridLayout.addWidget(widget_nome, 0, 1, 1, 1);

        widget = new QWidget(iniziativa_common);
        widget.setObjectName("widget");
        horizontalLayout_3 = new QHBoxLayout(widget);
        horizontalLayout_3.setObjectName("horizontalLayout_3");
        label_iniziat = new QLabel(widget);
        label_iniziat.setObjectName("label_iniziat");

        horizontalLayout_3.addWidget(label_iniziat);

        combo_paese = new QComboBox(widget);
        combo_paese.setObjectName("combo_paese");

        horizontalLayout_3.addWidget(combo_paese);


        gridLayout.addWidget(widget, 1, 0, 1, 1);

        horizontalSpacer = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer, 0, 2, 1, 1);

        widget_2 = new QWidget(iniziativa_common);
        widget_2.setObjectName("widget_2");
        horizontalLayout_4 = new QHBoxLayout(widget_2);
        horizontalLayout_4.setObjectName("horizontalLayout_4");
        label_settimana = new QLabel(widget_2);
        label_settimana.setObjectName("label_settimana");

        horizontalLayout_4.addWidget(label_settimana);

        dateEdit_settimana = new QDateEdit(widget_2);
        dateEdit_settimana.setObjectName("dateEdit_settimana");

        horizontalLayout_4.addWidget(dateEdit_settimana);


        gridLayout.addWidget(widget_2, 1, 1, 1, 1);

        widget_3 = new QWidget(iniziativa_common);
        widget_3.setObjectName("widget_3");
        verticalLayout = new QVBoxLayout(widget_3);
        verticalLayout.setObjectName("verticalLayout");
        label_descrizione = new QLabel(widget_3);
        label_descrizione.setObjectName("label_descrizione");

        verticalLayout.addWidget(label_descrizione);

        plainText_descrizione = new QPlainTextEdit(widget_3);
        plainText_descrizione.setObjectName("plainText_descrizione");

        verticalLayout.addWidget(plainText_descrizione);


        gridLayout.addWidget(widget_3, 2, 0, 1, 2);

        retranslateUi(iniziativa_common);

        iniziativa_common.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget iniziativa_common)
    {
        iniziativa_common.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("iniziativa_common", "Form", null));
        label_tipo.setText(com.trolltech.qt.core.QCoreApplication.translate("iniziativa_common", "Tipologia", null));
        label_nome.setText(com.trolltech.qt.core.QCoreApplication.translate("iniziativa_common", "Nome", null));
        label_iniziat.setText(com.trolltech.qt.core.QCoreApplication.translate("iniziativa_common", "Paese iniziativa", null));
        label_settimana.setText(com.trolltech.qt.core.QCoreApplication.translate("iniziativa_common", "Settimana", null));
        label_descrizione.setText(com.trolltech.qt.core.QCoreApplication.translate("iniziativa_common", "Descrizione iniziativa", null));
    } // retranslateUi

}

