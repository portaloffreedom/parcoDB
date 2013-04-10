/********************************************************************************
 ** Form generated from reading ui file 'widget_ricerca_common.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui.builders;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_widget_ricerca_common implements com.trolltech.qt.QUiForm<QWidget>
{
    public QHBoxLayout horizontalLayout;
    public QWidget widget_4;
    public QVBoxLayout verticalLayout;
    public QLabel label;
    public QListWidget listWidget_trovati;
    public QWidget widget;
    public QVBoxLayout layout_special;
    public QWidget widget_common;
    public QSpacerItem verticalSpacer;
    public QWidget widget_2;
    public QHBoxLayout layout_special_2;
    public QWidget widget_special;
    public QWidget widget_3;
    public QVBoxLayout verticalLayout_2;
    public QLabel label_special_2;
    public QListWidget listWidget_special_2;

    public Ui_widget_ricerca_common() { super(); }

    public void setupUi(QWidget widget_ricerca_common)
    {
        widget_ricerca_common.setObjectName("widget_ricerca_common");
        widget_ricerca_common.resize(new QSize(1096, 786).expandedTo(widget_ricerca_common.minimumSizeHint()));
        horizontalLayout = new QHBoxLayout(widget_ricerca_common);
        horizontalLayout.setObjectName("horizontalLayout");
        widget_4 = new QWidget(widget_ricerca_common);
        widget_4.setObjectName("widget_4");
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy.setHorizontalStretch((byte)0);
        sizePolicy.setVerticalStretch((byte)0);
        sizePolicy.setHeightForWidth(widget_4.sizePolicy().hasHeightForWidth());
        widget_4.setSizePolicy(sizePolicy);
        verticalLayout = new QVBoxLayout(widget_4);
        verticalLayout.setMargin(0);
        verticalLayout.setObjectName("verticalLayout");
        label = new QLabel(widget_4);
        label.setObjectName("label");

        verticalLayout.addWidget(label);

        listWidget_trovati = new QListWidget(widget_4);
        listWidget_trovati.setObjectName("listWidget_trovati");
        QSizePolicy sizePolicy1 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);
        sizePolicy1.setHorizontalStretch((byte)0);
        sizePolicy1.setVerticalStretch((byte)0);
        sizePolicy1.setHeightForWidth(listWidget_trovati.sizePolicy().hasHeightForWidth());
        listWidget_trovati.setSizePolicy(sizePolicy1);

        verticalLayout.addWidget(listWidget_trovati);


        horizontalLayout.addWidget(widget_4);

        widget = new QWidget(widget_ricerca_common);
        widget.setObjectName("widget");
        layout_special = new QVBoxLayout(widget);
        layout_special.setSpacing(6);
        layout_special.setMargin(0);
        layout_special.setObjectName("layout_special");
        widget_common = new QWidget(widget);
        widget_common.setObjectName("widget_common");

        layout_special.addWidget(widget_common);

        verticalSpacer = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        layout_special.addItem(verticalSpacer);

        widget_2 = new QWidget(widget);
        widget_2.setObjectName("widget_2");
        layout_special_2 = new QHBoxLayout(widget_2);
        layout_special_2.setSpacing(0);
        layout_special_2.setMargin(0);
        layout_special_2.setObjectName("layout_special_2");
        widget_special = new QWidget(widget_2);
        widget_special.setObjectName("widget_special");

        layout_special_2.addWidget(widget_special);

        widget_3 = new QWidget(widget_2);
        widget_3.setObjectName("widget_3");
        verticalLayout_2 = new QVBoxLayout(widget_3);
        verticalLayout_2.setObjectName("verticalLayout_2");
        label_special_2 = new QLabel(widget_3);
        label_special_2.setObjectName("label_special_2");
        QSizePolicy sizePolicy2 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Preferred, com.trolltech.qt.gui.QSizePolicy.Policy.Maximum);
        sizePolicy2.setHorizontalStretch((byte)0);
        sizePolicy2.setVerticalStretch((byte)0);
        sizePolicy2.setHeightForWidth(label_special_2.sizePolicy().hasHeightForWidth());
        label_special_2.setSizePolicy(sizePolicy2);

        verticalLayout_2.addWidget(label_special_2);

        listWidget_special_2 = new QListWidget(widget_3);
        listWidget_special_2.setObjectName("listWidget_special_2");
        QSizePolicy sizePolicy3 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Preferred, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy3.setHorizontalStretch((byte)0);
        sizePolicy3.setVerticalStretch((byte)0);
        sizePolicy3.setHeightForWidth(listWidget_special_2.sizePolicy().hasHeightForWidth());
        listWidget_special_2.setSizePolicy(sizePolicy3);

        verticalLayout_2.addWidget(listWidget_special_2);


        layout_special_2.addWidget(widget_3);


        layout_special.addWidget(widget_2);


        horizontalLayout.addWidget(widget);

        retranslateUi(widget_ricerca_common);

        widget_ricerca_common.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget widget_ricerca_common)
    {
        widget_ricerca_common.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("widget_ricerca_common", "Form", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_ricerca_common", "Risultati", null));
        label_special_2.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_ricerca_common", "Iniziative", null));
    } // retranslateUi

}

