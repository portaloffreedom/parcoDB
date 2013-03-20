/********************************************************************************
 ** Form generated from reading ui file 'widget_lago.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_widget_lago implements com.trolltech.qt.QUiForm<QWidget>
{
    public QGridLayout gridLayout;
    public QWidget widget;
    public QHBoxLayout horizontalLayout;
    public QLabel label;
    public QLineEdit lineEdit;
    public QSpacerItem verticalSpacer;
    public QSpacerItem horizontalSpacer;

    public Ui_widget_lago() { super(); }

    public void setupUi(QWidget widget_lago)
    {
        widget_lago.setObjectName("widget_lago");
        widget_lago.resize(new QSize(400, 300).expandedTo(widget_lago.minimumSizeHint()));
        gridLayout = new QGridLayout(widget_lago);
        gridLayout.setObjectName("gridLayout");
        widget = new QWidget(widget_lago);
        widget.setObjectName("widget");
        horizontalLayout = new QHBoxLayout(widget);
        horizontalLayout.setMargin(0);
        horizontalLayout.setObjectName("horizontalLayout");
        label = new QLabel(widget);
        label.setObjectName("label");

        horizontalLayout.addWidget(label);

        lineEdit = new QLineEdit(widget);
        lineEdit.setObjectName("lineEdit");

        horizontalLayout.addWidget(lineEdit);


        gridLayout.addWidget(widget, 0, 0, 1, 1);

        verticalSpacer = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout.addItem(verticalSpacer, 1, 0, 1, 1);

        horizontalSpacer = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer, 0, 1, 1, 1);

        retranslateUi(widget_lago);

        widget_lago.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget widget_lago)
    {
        widget_lago.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("widget_lago", "Form", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_lago", "Estensione", null));
    } // retranslateUi

}

