/********************************************************************************
 ** Form generated from reading ui file 'widget_central.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_widget_inserimento implements com.trolltech.qt.QUiForm<QWidget>
{
    public QHBoxLayout horizontalLayout_3;
    public QWidget widget_selection;
    public QVBoxLayout verticalLayout;
    public QWidget widget_common;
    public QWidget widget_2;
    public QHBoxLayout layout_inferiore;
    public QWidget widget_specific;
    public QWidget widget_1;
    public QVBoxLayout verticalLayout_2;
    public QPushButton bottone_struttura;
    public QPushButton bottone_iniziativa;
    public QPushButton bottone_terreno;
    public QPushButton bottone_itinerario;
    public QSpacerItem verticalSpacer;
    public QPushButton bottone_salva;

    public Ui_widget_inserimento() { super(); }

    public void setupUi(QWidget widget_inserimento)
    {
        widget_inserimento.setObjectName("widget_inserimento");
        widget_inserimento.resize(new QSize(942, 589).expandedTo(widget_inserimento.minimumSizeHint()));
        horizontalLayout_3 = new QHBoxLayout(widget_inserimento);
        horizontalLayout_3.setSpacing(3);
        horizontalLayout_3.setMargin(0);
        horizontalLayout_3.setObjectName("horizontalLayout_3");
        widget_selection = new QWidget(widget_inserimento);
        widget_selection.setObjectName("widget_selection");
        verticalLayout = new QVBoxLayout(widget_selection);
        verticalLayout.setSpacing(3);
        verticalLayout.setMargin(0);
        verticalLayout.setObjectName("verticalLayout");
        widget_common = new QWidget(widget_selection);
        widget_common.setObjectName("widget_common");

        verticalLayout.addWidget(widget_common);

        widget_2 = new QWidget(widget_selection);
        widget_2.setObjectName("widget_2");
        layout_inferiore = new QHBoxLayout(widget_2);
        layout_inferiore.setMargin(0);
        layout_inferiore.setObjectName("layout_inferiore");
        widget_specific = new QWidget(widget_2);
        widget_specific.setObjectName("widget_specific");

        layout_inferiore.addWidget(widget_specific);


        verticalLayout.addWidget(widget_2);


        horizontalLayout_3.addWidget(widget_selection);

        widget_1 = new QWidget(widget_inserimento);
        widget_1.setObjectName("widget_1");
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy.setHorizontalStretch((byte)0);
        sizePolicy.setVerticalStretch((byte)0);
        sizePolicy.setHeightForWidth(widget_1.sizePolicy().hasHeightForWidth());
        widget_1.setSizePolicy(sizePolicy);
        verticalLayout_2 = new QVBoxLayout(widget_1);
        verticalLayout_2.setMargin(0);
        verticalLayout_2.setObjectName("verticalLayout_2");
        bottone_struttura = new QPushButton(widget_1);
        bottone_struttura.setObjectName("bottone_struttura");

        verticalLayout_2.addWidget(bottone_struttura);

        bottone_iniziativa = new QPushButton(widget_1);
        bottone_iniziativa.setObjectName("bottone_iniziativa");

        verticalLayout_2.addWidget(bottone_iniziativa);

        bottone_terreno = new QPushButton(widget_1);
        bottone_terreno.setObjectName("bottone_terreno");

        verticalLayout_2.addWidget(bottone_terreno);

        bottone_itinerario = new QPushButton(widget_1);
        bottone_itinerario.setObjectName("bottone_itinerario");

        verticalLayout_2.addWidget(bottone_itinerario);

        verticalSpacer = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        verticalLayout_2.addItem(verticalSpacer);

        bottone_salva = new QPushButton(widget_1);
        bottone_salva.setObjectName("bottone_salva");
        bottone_salva.setEnabled(false);

        verticalLayout_2.addWidget(bottone_salva);


        horizontalLayout_3.addWidget(widget_1);

        retranslateUi(widget_inserimento);

        widget_inserimento.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget widget_inserimento)
    {
        widget_inserimento.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("widget_inserimento", "Form", null));
        bottone_struttura.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_inserimento", "Struttura", null));
        bottone_iniziativa.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_inserimento", "Iniziativa", null));
        bottone_terreno.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_inserimento", "Terreno", null));
        bottone_itinerario.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_inserimento", "Itinerario", null));
        bottone_salva.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_inserimento", "SALVA", null));
    } // retranslateUi

}

