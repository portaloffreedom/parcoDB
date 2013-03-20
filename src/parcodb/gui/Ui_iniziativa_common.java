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
    public QComboBox combo_tipo;
    public QWidget widget_nome;
    public QHBoxLayout horizontalLayout_2;
    public QLabel label_nome;
    public QLineEdit lineEdit_nome;
    public QWidget widget;
    public QHBoxLayout horizontalLayout_3;
    public QLabel label_iniziat;
    public QComboBox combo_iniziativa;
    public QSpacerItem horizontalSpacer;

    public Ui_iniziativa_common() { super(); }

    public void setupUi(QWidget iniziativa_common)
    {
        iniziativa_common.setObjectName("iniziativa_common");
        iniziativa_common.resize(new QSize(880, 332).expandedTo(iniziativa_common.minimumSizeHint()));
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Preferred, com.trolltech.qt.gui.QSizePolicy.Policy.Maximum);
        sizePolicy.setHorizontalStretch((byte)0);
        sizePolicy.setVerticalStretch((byte)0);
        sizePolicy.setHeightForWidth(iniziativa_common.sizePolicy().hasHeightForWidth());
        iniziativa_common.setSizePolicy(sizePolicy);
        gridLayout = new QGridLayout(iniziativa_common);
        gridLayout.setMargin(0);
        gridLayout.setObjectName("gridLayout");
        gridLayout.setHorizontalSpacing(0);
        widget_tipo = new QWidget(iniziativa_common);
        widget_tipo.setObjectName("widget_tipo");
        horizontalLayout = new QHBoxLayout(widget_tipo);
        horizontalLayout.setObjectName("horizontalLayout");
        label_tipo = new QLabel(widget_tipo);
        label_tipo.setObjectName("label_tipo");

        horizontalLayout.addWidget(label_tipo);

        combo_tipo = new QComboBox(widget_tipo);
        combo_tipo.setObjectName("combo_tipo");

        horizontalLayout.addWidget(combo_tipo);


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

        combo_iniziativa = new QComboBox(widget);
        combo_iniziativa.setObjectName("combo_iniziativa");

        horizontalLayout_3.addWidget(combo_iniziativa);


        gridLayout.addWidget(widget, 1, 0, 1, 1);

        horizontalSpacer = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer, 0, 2, 1, 1);

        retranslateUi(iniziativa_common);

        iniziativa_common.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget iniziativa_common)
    {
        iniziativa_common.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("iniziativa_common", "Form", null));
        label_tipo.setText(com.trolltech.qt.core.QCoreApplication.translate("iniziativa_common", "Tipologia", null));
        label_nome.setText(com.trolltech.qt.core.QCoreApplication.translate("iniziativa_common", "Nome", null));
        label_iniziat.setText(com.trolltech.qt.core.QCoreApplication.translate("iniziativa_common", "Paese iniziativa", null));
    } // retranslateUi

}

