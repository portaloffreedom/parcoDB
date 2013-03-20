/********************************************************************************
 ** Form generated from reading ui file 'widget_infopoint.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_widget_infopoint implements com.trolltech.qt.QUiForm<QWidget>
{
    public QGridLayout gridLayout;
    public QWidget widget;
    public QHBoxLayout horizontalLayout;
    public QLabel label;
    public QLineEdit lineEdit;
    public QSpacerItem horizontalSpacer;
    public QSpacerItem verticalSpacer;
    public QWidget widget_2;
    public QHBoxLayout horizontalLayout_2;
    public QLabel label_2;
    public QLineEdit lineEdit_telefono;

    public Ui_widget_infopoint() { super(); }

    public void setupUi(QWidget widget_infopoint)
    {
        widget_infopoint.setObjectName("widget_infopoint");
        widget_infopoint.resize(new QSize(958, 92).expandedTo(widget_infopoint.minimumSizeHint()));
        gridLayout = new QGridLayout(widget_infopoint);
        gridLayout.setObjectName("gridLayout");
        widget = new QWidget(widget_infopoint);
        widget.setObjectName("widget");
        horizontalLayout = new QHBoxLayout(widget);
        horizontalLayout.setMargin(0);
        horizontalLayout.setObjectName("horizontalLayout");
        label = new QLabel(widget);
        label.setObjectName("label");

        horizontalLayout.addWidget(label);

        lineEdit = new QLineEdit(widget);
        lineEdit.setObjectName("lineEdit");
        lineEdit.setInputMethodHints(com.trolltech.qt.core.Qt.InputMethodHint.createQFlags(com.trolltech.qt.core.Qt.InputMethodHint.ImhDigitsOnly,com.trolltech.qt.core.Qt.InputMethodHint.ImhFormattedNumbersOnly));

        horizontalLayout.addWidget(lineEdit);


        gridLayout.addWidget(widget, 0, 0, 1, 2);

        horizontalSpacer = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer, 0, 2, 1, 1);

        verticalSpacer = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout.addItem(verticalSpacer, 2, 0, 1, 1);

        widget_2 = new QWidget(widget_infopoint);
        widget_2.setObjectName("widget_2");
        horizontalLayout_2 = new QHBoxLayout(widget_2);
        horizontalLayout_2.setMargin(0);
        horizontalLayout_2.setObjectName("horizontalLayout_2");
        label_2 = new QLabel(widget_2);
        label_2.setObjectName("label_2");

        horizontalLayout_2.addWidget(label_2);

        lineEdit_telefono = new QLineEdit(widget_2);
        lineEdit_telefono.setObjectName("lineEdit_telefono");

        horizontalLayout_2.addWidget(lineEdit_telefono);


        gridLayout.addWidget(widget_2, 1, 0, 1, 1);

        retranslateUi(widget_infopoint);

        widget_infopoint.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget widget_infopoint)
    {
        widget_infopoint.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("widget_infopoint", "Form", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_infopoint", "ID infopoint", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_infopoint", "Numero di Telefono", null));
    } // retranslateUi

}

