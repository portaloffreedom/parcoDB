/********************************************************************************
 ** Form generated from reading ui file 'widget_monte.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui.builders;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_widget_monte implements com.trolltech.qt.QUiForm<QWidget>
{
    public QGridLayout gridLayout;
    public QWidget widget;
    public QHBoxLayout horizontalLayout_2;
    public QLabel label_altitudine;
    public QDoubleSpinBox spinBox_altitudine;
    public QSpacerItem verticalSpacer;

    public Ui_widget_monte() { super(); }

    public void setupUi(QWidget widget_monte)
    {
        widget_monte.setObjectName("widget_monte");
        widget_monte.resize(new QSize(308, 96).expandedTo(widget_monte.minimumSizeHint()));
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy.setHorizontalStretch((byte)0);
        sizePolicy.setVerticalStretch((byte)0);
        sizePolicy.setHeightForWidth(widget_monte.sizePolicy().hasHeightForWidth());
        widget_monte.setSizePolicy(sizePolicy);
        gridLayout = new QGridLayout(widget_monte);
        gridLayout.setMargin(0);
        gridLayout.setObjectName("gridLayout");
        widget = new QWidget(widget_monte);
        widget.setObjectName("widget");
        horizontalLayout_2 = new QHBoxLayout(widget);
        horizontalLayout_2.setMargin(0);
        horizontalLayout_2.setObjectName("horizontalLayout_2");
        label_altitudine = new QLabel(widget);
        label_altitudine.setObjectName("label_altitudine");
        QSizePolicy sizePolicy1 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy1.setHorizontalStretch((byte)0);
        sizePolicy1.setVerticalStretch((byte)0);
        sizePolicy1.setHeightForWidth(label_altitudine.sizePolicy().hasHeightForWidth());
        label_altitudine.setSizePolicy(sizePolicy1);

        horizontalLayout_2.addWidget(label_altitudine);

        spinBox_altitudine = new QDoubleSpinBox(widget);
        spinBox_altitudine.setObjectName("spinBox_altitudine");
        spinBox_altitudine.setMinimum(1);
        spinBox_altitudine.setMaximum(9999.99);

        horizontalLayout_2.addWidget(spinBox_altitudine);


        gridLayout.addWidget(widget, 0, 0, 1, 1);

        verticalSpacer = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout.addItem(verticalSpacer, 1, 0, 1, 1);

        retranslateUi(widget_monte);

        widget_monte.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget widget_monte)
    {
        widget_monte.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("widget_monte", "Form", null));
        label_altitudine.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_monte", "Altitudine (m)", null));
    } // retranslateUi

}

