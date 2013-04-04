/********************************************************************************
 ** Form generated from reading ui file 'widget_struttura_comune.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui.builders;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_struttura_common implements com.trolltech.qt.QUiForm<QWidget>
{
    public QVBoxLayout layout_special;
    public QWidget widget_3;
    public QGridLayout gridLayout;
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
    public QDateEdit dateEdit_apertura;
    public QDateEdit dateEdit_chiusura;
    public QWidget widget_situato;
    public QHBoxLayout horizontalLayout_5;
    public QLabel label_situato;
    public QComboBox combo_situato;
    public QWidget widget_4;
    public QHBoxLayout horizontalLayout_6;
    public QLabel label;
    public QLineEdit lineEdit_orario;
    public QWidget widget_special;

    public Ui_struttura_common() { super(); }

    public void setupUi(QWidget struttura_common)
    {
        struttura_common.setObjectName("struttura_common");
        struttura_common.resize(new QSize(817, 421).expandedTo(struttura_common.minimumSizeHint()));
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Preferred, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy.setHorizontalStretch((byte)0);
        sizePolicy.setVerticalStretch((byte)0);
        sizePolicy.setHeightForWidth(struttura_common.sizePolicy().hasHeightForWidth());
        struttura_common.setSizePolicy(sizePolicy);
        layout_special = new QVBoxLayout(struttura_common);
        layout_special.setMargin(0);
        layout_special.setObjectName("layout_special");
        widget_3 = new QWidget(struttura_common);
        widget_3.setObjectName("widget_3");
        QSizePolicy sizePolicy1 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Preferred, com.trolltech.qt.gui.QSizePolicy.Policy.Maximum);
        sizePolicy1.setHorizontalStretch((byte)0);
        sizePolicy1.setVerticalStretch((byte)0);
        sizePolicy1.setHeightForWidth(widget_3.sizePolicy().hasHeightForWidth());
        widget_3.setSizePolicy(sizePolicy1);
        gridLayout = new QGridLayout(widget_3);
        gridLayout.setMargin(0);
        gridLayout.setObjectName("gridLayout");
        widget_tipo = new QWidget(widget_3);
        widget_tipo.setObjectName("widget_tipo");
        horizontalLayout = new QHBoxLayout(widget_tipo);
        horizontalLayout.setObjectName("horizontalLayout");
        label_tipo = new QLabel(widget_tipo);
        label_tipo.setObjectName("label_tipo");
        QSizePolicy sizePolicy2 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy2.setHorizontalStretch((byte)0);
        sizePolicy2.setVerticalStretch((byte)0);
        sizePolicy2.setHeightForWidth(label_tipo.sizePolicy().hasHeightForWidth());
        label_tipo.setSizePolicy(sizePolicy2);

        horizontalLayout.addWidget(label_tipo);

        combo_tipo = new QComboBox(widget_tipo);
        combo_tipo.setObjectName("combo_tipo");
        QSizePolicy sizePolicy3 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy3.setHorizontalStretch((byte)0);
        sizePolicy3.setVerticalStretch((byte)0);
        sizePolicy3.setHeightForWidth(combo_tipo.sizePolicy().hasHeightForWidth());
        combo_tipo.setSizePolicy(sizePolicy3);

        horizontalLayout.addWidget(combo_tipo);


        gridLayout.addWidget(widget_tipo, 0, 0, 1, 1);

        widget_nome = new QWidget(widget_3);
        widget_nome.setObjectName("widget_nome");
        horizontalLayout_2 = new QHBoxLayout(widget_nome);
        horizontalLayout_2.setObjectName("horizontalLayout_2");
        label_nome = new QLabel(widget_nome);
        label_nome.setObjectName("label_nome");
        QSizePolicy sizePolicy4 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy4.setHorizontalStretch((byte)0);
        sizePolicy4.setVerticalStretch((byte)0);
        sizePolicy4.setHeightForWidth(label_nome.sizePolicy().hasHeightForWidth());
        label_nome.setSizePolicy(sizePolicy4);

        horizontalLayout_2.addWidget(label_nome);

        lineEdit_nome = new QLineEdit(widget_nome);
        lineEdit_nome.setObjectName("lineEdit_nome");
        QSizePolicy sizePolicy5 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy5.setHorizontalStretch((byte)0);
        sizePolicy5.setVerticalStretch((byte)0);
        sizePolicy5.setHeightForWidth(lineEdit_nome.sizePolicy().hasHeightForWidth());
        lineEdit_nome.setSizePolicy(sizePolicy5);

        horizontalLayout_2.addWidget(lineEdit_nome);


        gridLayout.addWidget(widget_nome, 0, 1, 1, 1);

        widget_indirizzo = new QWidget(widget_3);
        widget_indirizzo.setObjectName("widget_indirizzo");
        horizontalLayout_3 = new QHBoxLayout(widget_indirizzo);
        horizontalLayout_3.setObjectName("horizontalLayout_3");
        label_indirizzo = new QLabel(widget_indirizzo);
        label_indirizzo.setObjectName("label_indirizzo");
        QSizePolicy sizePolicy6 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy6.setHorizontalStretch((byte)0);
        sizePolicy6.setVerticalStretch((byte)0);
        sizePolicy6.setHeightForWidth(label_indirizzo.sizePolicy().hasHeightForWidth());
        label_indirizzo.setSizePolicy(sizePolicy6);

        horizontalLayout_3.addWidget(label_indirizzo);

        lineEdit_indirizzo = new QLineEdit(widget_indirizzo);
        lineEdit_indirizzo.setObjectName("lineEdit_indirizzo");
        QSizePolicy sizePolicy7 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy7.setHorizontalStretch((byte)0);
        sizePolicy7.setVerticalStretch((byte)0);
        sizePolicy7.setHeightForWidth(lineEdit_indirizzo.sizePolicy().hasHeightForWidth());
        lineEdit_indirizzo.setSizePolicy(sizePolicy7);

        horizontalLayout_3.addWidget(lineEdit_indirizzo);


        gridLayout.addWidget(widget_indirizzo, 1, 0, 1, 1);

        widget_orario = new QWidget(widget_3);
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
        QSizePolicy sizePolicy8 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy8.setHorizontalStretch((byte)0);
        sizePolicy8.setVerticalStretch((byte)0);
        sizePolicy8.setHeightForWidth(label_ora1.sizePolicy().hasHeightForWidth());
        label_ora1.setSizePolicy(sizePolicy8);

        verticalLayout.addWidget(label_ora1);

        label_ora2 = new QLabel(widget_2);
        label_ora2.setObjectName("label_ora2");
        QSizePolicy sizePolicy9 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy9.setHorizontalStretch((byte)0);
        sizePolicy9.setVerticalStretch((byte)0);
        sizePolicy9.setHeightForWidth(label_ora2.sizePolicy().hasHeightForWidth());
        label_ora2.setSizePolicy(sizePolicy9);

        verticalLayout.addWidget(label_ora2);


        horizontalLayout_4.addWidget(widget_2);

        widget = new QWidget(widget_orario);
        widget.setObjectName("widget");
        verticalLayout_2 = new QVBoxLayout(widget);
        verticalLayout_2.setObjectName("verticalLayout_2");
        dateEdit_apertura = new QDateEdit(widget);
        dateEdit_apertura.setObjectName("dateEdit_apertura");
        QSizePolicy sizePolicy10 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy10.setHorizontalStretch((byte)0);
        sizePolicy10.setVerticalStretch((byte)0);
        sizePolicy10.setHeightForWidth(dateEdit_apertura.sizePolicy().hasHeightForWidth());
        dateEdit_apertura.setSizePolicy(sizePolicy10);

        verticalLayout_2.addWidget(dateEdit_apertura);

        dateEdit_chiusura = new QDateEdit(widget);
        dateEdit_chiusura.setObjectName("dateEdit_chiusura");
        QSizePolicy sizePolicy11 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy11.setHorizontalStretch((byte)0);
        sizePolicy11.setVerticalStretch((byte)0);
        sizePolicy11.setHeightForWidth(dateEdit_chiusura.sizePolicy().hasHeightForWidth());
        dateEdit_chiusura.setSizePolicy(sizePolicy11);

        verticalLayout_2.addWidget(dateEdit_chiusura);


        horizontalLayout_4.addWidget(widget);


        gridLayout.addWidget(widget_orario, 1, 1, 1, 1);

        widget_situato = new QWidget(widget_3);
        widget_situato.setObjectName("widget_situato");
        horizontalLayout_5 = new QHBoxLayout(widget_situato);
        horizontalLayout_5.setObjectName("horizontalLayout_5");
        label_situato = new QLabel(widget_situato);
        label_situato.setObjectName("label_situato");
        QSizePolicy sizePolicy12 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy12.setHorizontalStretch((byte)0);
        sizePolicy12.setVerticalStretch((byte)0);
        sizePolicy12.setHeightForWidth(label_situato.sizePolicy().hasHeightForWidth());
        label_situato.setSizePolicy(sizePolicy12);

        horizontalLayout_5.addWidget(label_situato);

        combo_situato = new QComboBox(widget_situato);
        combo_situato.setObjectName("combo_situato");
        QSizePolicy sizePolicy13 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy13.setHorizontalStretch((byte)0);
        sizePolicy13.setVerticalStretch((byte)0);
        sizePolicy13.setHeightForWidth(combo_situato.sizePolicy().hasHeightForWidth());
        combo_situato.setSizePolicy(sizePolicy13);

        horizontalLayout_5.addWidget(combo_situato);


        gridLayout.addWidget(widget_situato, 2, 0, 1, 1);

        widget_4 = new QWidget(widget_3);
        widget_4.setObjectName("widget_4");
        horizontalLayout_6 = new QHBoxLayout(widget_4);
        horizontalLayout_6.setObjectName("horizontalLayout_6");
        label = new QLabel(widget_4);
        label.setObjectName("label");
        QSizePolicy sizePolicy14 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy14.setHorizontalStretch((byte)0);
        sizePolicy14.setVerticalStretch((byte)0);
        sizePolicy14.setHeightForWidth(label.sizePolicy().hasHeightForWidth());
        label.setSizePolicy(sizePolicy14);

        horizontalLayout_6.addWidget(label);

        lineEdit_orario = new QLineEdit(widget_4);
        lineEdit_orario.setObjectName("lineEdit_orario");
        QSizePolicy sizePolicy15 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy15.setHorizontalStretch((byte)0);
        sizePolicy15.setVerticalStretch((byte)0);
        sizePolicy15.setHeightForWidth(lineEdit_orario.sizePolicy().hasHeightForWidth());
        lineEdit_orario.setSizePolicy(sizePolicy15);
        lineEdit_orario.setInputMethodHints(com.trolltech.qt.core.Qt.InputMethodHint.createQFlags(com.trolltech.qt.core.Qt.InputMethodHint.ImhDigitsOnly,com.trolltech.qt.core.Qt.InputMethodHint.ImhFormattedNumbersOnly));

        horizontalLayout_6.addWidget(lineEdit_orario);


        gridLayout.addWidget(widget_4, 2, 1, 1, 1);


        layout_special.addWidget(widget_3);

        widget_special = new QWidget(struttura_common);
        widget_special.setObjectName("widget_special");

        layout_special.addWidget(widget_special);

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
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("struttura_common", "Orario di apertura", null));
    } // retranslateUi

}

