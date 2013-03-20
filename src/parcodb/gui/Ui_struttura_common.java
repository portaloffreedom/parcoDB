/********************************************************************************
 ** Form generated from reading ui file 'widget_struttura_comune.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_struttura_common implements com.trolltech.qt.QUiForm<QWidget>
{
    public QGridLayout gridLayout_2;
    public QWidget widget_tipo;
    public QHBoxLayout horizontalLayout;
    public QLabel label_tipo;
    public QComboBox combo_tipo;
    public QWidget widget_nome;
    public QHBoxLayout horizontalLayout_2;
    public QLabel label_nome;
    public QLineEdit lineEdit_nome;
    public QWidget widget_indirizzo;
    public QHBoxLayout horizontalLayout_3;
    public QLabel label_indirizzo;
    public QLineEdit lineEdit_indirizzo;
    public QWidget widget_orario;
    public QHBoxLayout horizontalLayout_4;
    public QWidget widget_2;
    public QVBoxLayout verticalLayout;
    public QLabel label_ora1;
    public QLabel label_ora2;
    public QWidget widget;
    public QVBoxLayout verticalLayout_2;
    public QLineEdit lineEdit_ora1;
    public QLineEdit lineEdit_ora2;
    public QSpacerItem horizontalSpacer_2;
    public QWidget widget_situato;
    public QHBoxLayout horizontalLayout_5;
    public QLabel label_situato;
    public QComboBox combo_situato;

    public Ui_struttura_common() { super(); }

    public void setupUi(QWidget struttura_common)
    {
        struttura_common.setObjectName("struttura_common");
        struttura_common.resize(new QSize(857, 289).expandedTo(struttura_common.minimumSizeHint()));
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Preferred, com.trolltech.qt.gui.QSizePolicy.Policy.Maximum);
        sizePolicy.setHorizontalStretch((byte)0);
        sizePolicy.setVerticalStretch((byte)0);
        sizePolicy.setHeightForWidth(struttura_common.sizePolicy().hasHeightForWidth());
        struttura_common.setSizePolicy(sizePolicy);
        gridLayout_2 = new QGridLayout(struttura_common);
        gridLayout_2.setMargin(0);
        gridLayout_2.setObjectName("gridLayout_2");
        gridLayout_2.setHorizontalSpacing(0);
        widget_tipo = new QWidget(struttura_common);
        widget_tipo.setObjectName("widget_tipo");
        horizontalLayout = new QHBoxLayout(widget_tipo);
        horizontalLayout.setObjectName("horizontalLayout");
        label_tipo = new QLabel(widget_tipo);
        label_tipo.setObjectName("label_tipo");

        horizontalLayout.addWidget(label_tipo);

        combo_tipo = new QComboBox(widget_tipo);
        combo_tipo.setObjectName("combo_tipo");

        horizontalLayout.addWidget(combo_tipo);


        gridLayout_2.addWidget(widget_tipo, 0, 0, 1, 1);

        widget_nome = new QWidget(struttura_common);
        widget_nome.setObjectName("widget_nome");
        horizontalLayout_2 = new QHBoxLayout(widget_nome);
        horizontalLayout_2.setObjectName("horizontalLayout_2");
        label_nome = new QLabel(widget_nome);
        label_nome.setObjectName("label_nome");

        horizontalLayout_2.addWidget(label_nome);

        lineEdit_nome = new QLineEdit(widget_nome);
        lineEdit_nome.setObjectName("lineEdit_nome");

        horizontalLayout_2.addWidget(lineEdit_nome);


        gridLayout_2.addWidget(widget_nome, 0, 1, 1, 1);

        widget_indirizzo = new QWidget(struttura_common);
        widget_indirizzo.setObjectName("widget_indirizzo");
        horizontalLayout_3 = new QHBoxLayout(widget_indirizzo);
        horizontalLayout_3.setObjectName("horizontalLayout_3");
        label_indirizzo = new QLabel(widget_indirizzo);
        label_indirizzo.setObjectName("label_indirizzo");

        horizontalLayout_3.addWidget(label_indirizzo);

        lineEdit_indirizzo = new QLineEdit(widget_indirizzo);
        lineEdit_indirizzo.setObjectName("lineEdit_indirizzo");

        horizontalLayout_3.addWidget(lineEdit_indirizzo);


        gridLayout_2.addWidget(widget_indirizzo, 1, 0, 1, 1);

        widget_orario = new QWidget(struttura_common);
        widget_orario.setObjectName("widget_orario");
        horizontalLayout_4 = new QHBoxLayout(widget_orario);
        horizontalLayout_4.setSpacing(3);
        horizontalLayout_4.setMargin(0);
        horizontalLayout_4.setObjectName("horizontalLayout_4");
        widget_2 = new QWidget(widget_orario);
        widget_2.setObjectName("widget_2");
        verticalLayout = new QVBoxLayout(widget_2);
        verticalLayout.setObjectName("verticalLayout");
        label_ora1 = new QLabel(widget_2);
        label_ora1.setObjectName("label_ora1");

        verticalLayout.addWidget(label_ora1);

        label_ora2 = new QLabel(widget_2);
        label_ora2.setObjectName("label_ora2");

        verticalLayout.addWidget(label_ora2);


        horizontalLayout_4.addWidget(widget_2);

        widget = new QWidget(widget_orario);
        widget.setObjectName("widget");
        verticalLayout_2 = new QVBoxLayout(widget);
        verticalLayout_2.setObjectName("verticalLayout_2");
        lineEdit_ora1 = new QLineEdit(widget);
        lineEdit_ora1.setObjectName("lineEdit_ora1");

        verticalLayout_2.addWidget(lineEdit_ora1);

        lineEdit_ora2 = new QLineEdit(widget);
        lineEdit_ora2.setObjectName("lineEdit_ora2");

        verticalLayout_2.addWidget(lineEdit_ora2);


        horizontalLayout_4.addWidget(widget);


        gridLayout_2.addWidget(widget_orario, 1, 1, 1, 1);

        horizontalSpacer_2 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_2.addItem(horizontalSpacer_2, 0, 2, 1, 1);

        widget_situato = new QWidget(struttura_common);
        widget_situato.setObjectName("widget_situato");
        horizontalLayout_5 = new QHBoxLayout(widget_situato);
        horizontalLayout_5.setObjectName("horizontalLayout_5");
        label_situato = new QLabel(widget_situato);
        label_situato.setObjectName("label_situato");

        horizontalLayout_5.addWidget(label_situato);

        combo_situato = new QComboBox(widget_situato);
        combo_situato.setObjectName("combo_situato");

        horizontalLayout_5.addWidget(combo_situato);


        gridLayout_2.addWidget(widget_situato, 2, 0, 1, 1);

        retranslateUi(struttura_common);

        struttura_common.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget struttura_common)
    {
        struttura_common.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("struttura_common", "Form", null));
        label_tipo.setText(com.trolltech.qt.core.QCoreApplication.translate("struttura_common", "Tipologia", null));
        label_nome.setText(com.trolltech.qt.core.QCoreApplication.translate("struttura_common", "Nome", null));
        label_indirizzo.setText(com.trolltech.qt.core.QCoreApplication.translate("struttura_common", "Indirizzo", null));
        label_ora1.setText(com.trolltech.qt.core.QCoreApplication.translate("struttura_common", "Data apertura", null));
        label_ora2.setText(com.trolltech.qt.core.QCoreApplication.translate("struttura_common", "Data chiusura", null));
        label_situato.setText(com.trolltech.qt.core.QCoreApplication.translate("struttura_common", "Situato in", null));
    } // retranslateUi

}

