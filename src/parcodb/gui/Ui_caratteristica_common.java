/********************************************************************************
 ** Form generated from reading ui file 'widget_caratteristica.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_caratteristica_common implements com.trolltech.qt.QUiForm<QWidget>
{
    public QHBoxLayout horizontalLayout_4;
    public QWidget widget_tipologia;
    public QVBoxLayout layout_special;
    public QWidget widget;
    public QHBoxLayout horizontalLayout_3;
    public QWidget widget_tipo;
    public QHBoxLayout horizontalLayout;
    public QLabel label_tipo;
    public QComboBox combo_tipo;
    public QWidget widget_nome;
    public QHBoxLayout horizontalLayout_2;
    public QLabel label_nome;
    public QLineEdit lineEdit_nome;
    public QWidget widget_2;
    public QHBoxLayout horizontalLayout_5;
    public QLabel label;
    public QComboBox comboBox_comune;
    public QWidget widget_special;
    public QSpacerItem verticalSpacer;
    public QWidget widget_vicinanza;
    public QVBoxLayout verticalLayout_2;
    public QLabel label_2;
    public QListWidget listWidget_tappe;
    public QLabel label_vicinanza;
    public QListWidget lista_vicinanza;

    public Ui_caratteristica_common() { super(); }

    public void setupUi(QWidget caratteristica_common)
    {
        caratteristica_common.setObjectName("caratteristica_common");
        caratteristica_common.resize(new QSize(876, 333).expandedTo(caratteristica_common.minimumSizeHint()));
        horizontalLayout_4 = new QHBoxLayout(caratteristica_common);
        horizontalLayout_4.setMargin(9);
        horizontalLayout_4.setObjectName("horizontalLayout_4");
        widget_tipologia = new QWidget(caratteristica_common);
        widget_tipologia.setObjectName("widget_tipologia");
        layout_special = new QVBoxLayout(widget_tipologia);
        layout_special.setMargin(0);
        layout_special.setObjectName("layout_special");
        widget = new QWidget(widget_tipologia);
        widget.setObjectName("widget");
        horizontalLayout_3 = new QHBoxLayout(widget);
        horizontalLayout_3.setMargin(0);
        horizontalLayout_3.setObjectName("horizontalLayout_3");
        widget_tipo = new QWidget(widget);
        widget_tipo.setObjectName("widget_tipo");
        horizontalLayout = new QHBoxLayout(widget_tipo);
        horizontalLayout.setMargin(0);
        horizontalLayout.setObjectName("horizontalLayout");
        label_tipo = new QLabel(widget_tipo);
        label_tipo.setObjectName("label_tipo");

        horizontalLayout.addWidget(label_tipo);

        combo_tipo = new QComboBox(widget_tipo);
        combo_tipo.setObjectName("combo_tipo");

        horizontalLayout.addWidget(combo_tipo);


        horizontalLayout_3.addWidget(widget_tipo);

        widget_nome = new QWidget(widget);
        widget_nome.setObjectName("widget_nome");
        horizontalLayout_2 = new QHBoxLayout(widget_nome);
        horizontalLayout_2.setMargin(0);
        horizontalLayout_2.setObjectName("horizontalLayout_2");
        label_nome = new QLabel(widget_nome);
        label_nome.setObjectName("label_nome");

        horizontalLayout_2.addWidget(label_nome);

        lineEdit_nome = new QLineEdit(widget_nome);
        lineEdit_nome.setObjectName("lineEdit_nome");

        horizontalLayout_2.addWidget(lineEdit_nome);


        horizontalLayout_3.addWidget(widget_nome);


        layout_special.addWidget(widget);

        widget_2 = new QWidget(widget_tipologia);
        widget_2.setObjectName("widget_2");
        horizontalLayout_5 = new QHBoxLayout(widget_2);
        horizontalLayout_5.setMargin(0);
        horizontalLayout_5.setObjectName("horizontalLayout_5");
        label = new QLabel(widget_2);
        label.setObjectName("label");

        horizontalLayout_5.addWidget(label);

        comboBox_comune = new QComboBox(widget_2);
        comboBox_comune.setObjectName("comboBox_comune");

        horizontalLayout_5.addWidget(comboBox_comune);


        layout_special.addWidget(widget_2);

        widget_special = new QWidget(widget_tipologia);
        widget_special.setObjectName("widget_special");

        layout_special.addWidget(widget_special);

        verticalSpacer = new QSpacerItem(20, 284, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        layout_special.addItem(verticalSpacer);


        horizontalLayout_4.addWidget(widget_tipologia);

        widget_vicinanza = new QWidget(caratteristica_common);
        widget_vicinanza.setObjectName("widget_vicinanza");
        verticalLayout_2 = new QVBoxLayout(widget_vicinanza);
        verticalLayout_2.setMargin(0);
        verticalLayout_2.setObjectName("verticalLayout_2");
        label_2 = new QLabel(widget_vicinanza);
        label_2.setObjectName("label_2");
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Maximum);
        sizePolicy.setHorizontalStretch((byte)0);
        sizePolicy.setVerticalStretch((byte)0);
        sizePolicy.setHeightForWidth(label_2.sizePolicy().hasHeightForWidth());
        label_2.setSizePolicy(sizePolicy);

        verticalLayout_2.addWidget(label_2);

        listWidget_tappe = new QListWidget(widget_vicinanza);
        listWidget_tappe.setObjectName("listWidget_tappe");
        QSizePolicy sizePolicy1 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);
        sizePolicy1.setHorizontalStretch((byte)0);
        sizePolicy1.setVerticalStretch((byte)0);
        sizePolicy1.setHeightForWidth(listWidget_tappe.sizePolicy().hasHeightForWidth());
        listWidget_tappe.setSizePolicy(sizePolicy1);
        listWidget_tappe.setSelectionMode(com.trolltech.qt.gui.QAbstractItemView.SelectionMode.MultiSelection);

        verticalLayout_2.addWidget(listWidget_tappe);

        label_vicinanza = new QLabel(widget_vicinanza);
        label_vicinanza.setObjectName("label_vicinanza");
        QSizePolicy sizePolicy2 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Maximum);
        sizePolicy2.setHorizontalStretch((byte)0);
        sizePolicy2.setVerticalStretch((byte)0);
        sizePolicy2.setHeightForWidth(label_vicinanza.sizePolicy().hasHeightForWidth());
        label_vicinanza.setSizePolicy(sizePolicy2);

        verticalLayout_2.addWidget(label_vicinanza);

        lista_vicinanza = new QListWidget(widget_vicinanza);
        lista_vicinanza.setObjectName("lista_vicinanza");
        QSizePolicy sizePolicy3 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);
        sizePolicy3.setHorizontalStretch((byte)0);
        sizePolicy3.setVerticalStretch((byte)0);
        sizePolicy3.setHeightForWidth(lista_vicinanza.sizePolicy().hasHeightForWidth());
        lista_vicinanza.setSizePolicy(sizePolicy3);
        lista_vicinanza.setAlternatingRowColors(true);
        lista_vicinanza.setSelectionMode(com.trolltech.qt.gui.QAbstractItemView.SelectionMode.MultiSelection);
        lista_vicinanza.setSortingEnabled(true);

        verticalLayout_2.addWidget(lista_vicinanza);


        horizontalLayout_4.addWidget(widget_vicinanza);

        retranslateUi(caratteristica_common);

        caratteristica_common.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget caratteristica_common)
    {
        caratteristica_common.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("caratteristica_common", "Form", null));
        label_tipo.setText(com.trolltech.qt.core.QCoreApplication.translate("caratteristica_common", "Tipologia", null));
        label_nome.setText(com.trolltech.qt.core.QCoreApplication.translate("caratteristica_common", "Nome", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("caratteristica_common", "Comune", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("caratteristica_common", "Interessata da tappe:", null));
        label_vicinanza.setText(com.trolltech.qt.core.QCoreApplication.translate("caratteristica_common", "Vicino a:", null));
    } // retranslateUi

}

