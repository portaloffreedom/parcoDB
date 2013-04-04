/********************************************************************************
 ** Form generated from reading ui file 'widget_caratteristica.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui.builders;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_caratteristica_common implements com.trolltech.qt.QUiForm<QWidget>
{
    public QHBoxLayout horizontalLayout_4;
    public QWidget widget_tipologia;
    public QVBoxLayout layout_special;
    public QWidget widget_tipo;
    public QHBoxLayout horizontalLayout;
    public QLabel label_tipo;
    public QComboBox combo_tipo;
    public QWidget widget_nome;
    public QHBoxLayout horizontalLayout_2;
    public QLabel label_nome;
    public QLineEdit lineEdit_nome;
    public QWidget widget_2;
    public QVBoxLayout verticalLayout;
    public QLabel label;
    public QListWidget listWidget_comune;
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
        caratteristica_common.resize(new QSize(876, 539).expandedTo(caratteristica_common.minimumSizeHint()));
        horizontalLayout_4 = new QHBoxLayout(caratteristica_common);
        horizontalLayout_4.setMargin(9);
        horizontalLayout_4.setObjectName("horizontalLayout_4");
        widget_tipologia = new QWidget(caratteristica_common);
        widget_tipologia.setObjectName("widget_tipologia");
        layout_special = new QVBoxLayout(widget_tipologia);
        layout_special.setMargin(0);
        layout_special.setObjectName("layout_special");
        widget_tipo = new QWidget(widget_tipologia);
        widget_tipo.setObjectName("widget_tipo");
        horizontalLayout = new QHBoxLayout(widget_tipo);
        horizontalLayout.setMargin(0);
        horizontalLayout.setObjectName("horizontalLayout");
        label_tipo = new QLabel(widget_tipo);
        label_tipo.setObjectName("label_tipo");
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy.setHorizontalStretch((byte)0);
        sizePolicy.setVerticalStretch((byte)0);
        sizePolicy.setHeightForWidth(label_tipo.sizePolicy().hasHeightForWidth());
        label_tipo.setSizePolicy(sizePolicy);

        horizontalLayout.addWidget(label_tipo);

        combo_tipo = new QComboBox(widget_tipo);
        combo_tipo.setObjectName("combo_tipo");
        QSizePolicy sizePolicy1 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy1.setHorizontalStretch((byte)0);
        sizePolicy1.setVerticalStretch((byte)0);
        sizePolicy1.setHeightForWidth(combo_tipo.sizePolicy().hasHeightForWidth());
        combo_tipo.setSizePolicy(sizePolicy1);

        horizontalLayout.addWidget(combo_tipo);


        layout_special.addWidget(widget_tipo);

        widget_nome = new QWidget(widget_tipologia);
        widget_nome.setObjectName("widget_nome");
        horizontalLayout_2 = new QHBoxLayout(widget_nome);
        horizontalLayout_2.setMargin(0);
        horizontalLayout_2.setObjectName("horizontalLayout_2");
        label_nome = new QLabel(widget_nome);
        label_nome.setObjectName("label_nome");
        QSizePolicy sizePolicy2 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy2.setHorizontalStretch((byte)0);
        sizePolicy2.setVerticalStretch((byte)0);
        sizePolicy2.setHeightForWidth(label_nome.sizePolicy().hasHeightForWidth());
        label_nome.setSizePolicy(sizePolicy2);

        horizontalLayout_2.addWidget(label_nome);

        lineEdit_nome = new QLineEdit(widget_nome);
        lineEdit_nome.setObjectName("lineEdit_nome");
        QSizePolicy sizePolicy3 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy3.setHorizontalStretch((byte)0);
        sizePolicy3.setVerticalStretch((byte)0);
        sizePolicy3.setHeightForWidth(lineEdit_nome.sizePolicy().hasHeightForWidth());
        lineEdit_nome.setSizePolicy(sizePolicy3);
        lineEdit_nome.setLayoutDirection(com.trolltech.qt.core.Qt.LayoutDirection.RightToLeft);

        horizontalLayout_2.addWidget(lineEdit_nome);


        layout_special.addWidget(widget_nome);

        widget_2 = new QWidget(widget_tipologia);
        widget_2.setObjectName("widget_2");
        verticalLayout = new QVBoxLayout(widget_2);
        verticalLayout.setMargin(0);
        verticalLayout.setObjectName("verticalLayout");
        label = new QLabel(widget_2);
        label.setObjectName("label");
        QSizePolicy sizePolicy4 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy4.setHorizontalStretch((byte)0);
        sizePolicy4.setVerticalStretch((byte)0);
        sizePolicy4.setHeightForWidth(label.sizePolicy().hasHeightForWidth());
        label.setSizePolicy(sizePolicy4);

        verticalLayout.addWidget(label);

        listWidget_comune = new QListWidget(widget_2);
        listWidget_comune.setObjectName("listWidget_comune");
        QSizePolicy sizePolicy5 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);
        sizePolicy5.setHorizontalStretch((byte)0);
        sizePolicy5.setVerticalStretch((byte)0);
        sizePolicy5.setHeightForWidth(listWidget_comune.sizePolicy().hasHeightForWidth());
        listWidget_comune.setSizePolicy(sizePolicy5);
        listWidget_comune.setSelectionMode(com.trolltech.qt.gui.QAbstractItemView.SelectionMode.MultiSelection);

        verticalLayout.addWidget(listWidget_comune);


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
        QSizePolicy sizePolicy6 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Maximum);
        sizePolicy6.setHorizontalStretch((byte)0);
        sizePolicy6.setVerticalStretch((byte)0);
        sizePolicy6.setHeightForWidth(label_2.sizePolicy().hasHeightForWidth());
        label_2.setSizePolicy(sizePolicy6);

        verticalLayout_2.addWidget(label_2);

        listWidget_tappe = new QListWidget(widget_vicinanza);
        listWidget_tappe.setObjectName("listWidget_tappe");
        QSizePolicy sizePolicy7 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);
        sizePolicy7.setHorizontalStretch((byte)0);
        sizePolicy7.setVerticalStretch((byte)0);
        sizePolicy7.setHeightForWidth(listWidget_tappe.sizePolicy().hasHeightForWidth());
        listWidget_tappe.setSizePolicy(sizePolicy7);
        listWidget_tappe.setSelectionMode(com.trolltech.qt.gui.QAbstractItemView.SelectionMode.MultiSelection);

        verticalLayout_2.addWidget(listWidget_tappe);

        label_vicinanza = new QLabel(widget_vicinanza);
        label_vicinanza.setObjectName("label_vicinanza");
        QSizePolicy sizePolicy8 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Maximum);
        sizePolicy8.setHorizontalStretch((byte)0);
        sizePolicy8.setVerticalStretch((byte)0);
        sizePolicy8.setHeightForWidth(label_vicinanza.sizePolicy().hasHeightForWidth());
        label_vicinanza.setSizePolicy(sizePolicy8);

        verticalLayout_2.addWidget(label_vicinanza);

        lista_vicinanza = new QListWidget(widget_vicinanza);
        lista_vicinanza.setObjectName("lista_vicinanza");
        QSizePolicy sizePolicy9 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);
        sizePolicy9.setHorizontalStretch((byte)0);
        sizePolicy9.setVerticalStretch((byte)0);
        sizePolicy9.setHeightForWidth(lista_vicinanza.sizePolicy().hasHeightForWidth());
        lista_vicinanza.setSizePolicy(sizePolicy9);
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

