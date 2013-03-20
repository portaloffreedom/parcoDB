/********************************************************************************
 ** Form generated from reading ui file 'widget_paese.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_widget_paese implements com.trolltech.qt.QUiForm<QWidget>
{
    public QGridLayout gridLayout;
    public QWidget widget;
    public QHBoxLayout horizontalLayout_2;
    public QLabel label_abitanti;
    public QSpinBox spinBox_abitanti;
    public QWidget widget_2;
    public QHBoxLayout horizontalLayout;
    public QLabel label;
    public QLineEdit lineEdit;
    public QSpacerItem verticalSpacer;
    public QSpacerItem horizontalSpacer;

    public Ui_widget_paese() { super(); }

    public void setupUi(QWidget widget_paese)
    {
        widget_paese.setObjectName("widget_paese");
        widget_paese.resize(new QSize(692, 426).expandedTo(widget_paese.minimumSizeHint()));
        gridLayout = new QGridLayout(widget_paese);
        gridLayout.setObjectName("gridLayout");
        widget = new QWidget(widget_paese);
        widget.setObjectName("widget");
        horizontalLayout_2 = new QHBoxLayout(widget);
        horizontalLayout_2.setObjectName("horizontalLayout_2");
        label_abitanti = new QLabel(widget);
        label_abitanti.setObjectName("label_abitanti");

        horizontalLayout_2.addWidget(label_abitanti);

        spinBox_abitanti = new QSpinBox(widget);
        spinBox_abitanti.setObjectName("spinBox_abitanti");

        horizontalLayout_2.addWidget(spinBox_abitanti);


        gridLayout.addWidget(widget, 0, 0, 1, 1);

        widget_2 = new QWidget(widget_paese);
        widget_2.setObjectName("widget_2");
        horizontalLayout = new QHBoxLayout(widget_2);
        horizontalLayout.setObjectName("horizontalLayout");
        label = new QLabel(widget_2);
        label.setObjectName("label");

        horizontalLayout.addWidget(label);

        lineEdit = new QLineEdit(widget_2);
        lineEdit.setObjectName("lineEdit");
        lineEdit.setInputMethodHints(com.trolltech.qt.core.Qt.InputMethodHint.createQFlags(com.trolltech.qt.core.Qt.InputMethodHint.ImhDigitsOnly,com.trolltech.qt.core.Qt.InputMethodHint.ImhFormattedNumbersOnly));

        horizontalLayout.addWidget(lineEdit);


        gridLayout.addWidget(widget_2, 0, 1, 1, 1);

        verticalSpacer = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout.addItem(verticalSpacer, 1, 0, 1, 1);

        horizontalSpacer = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer, 0, 2, 1, 1);

        retranslateUi(widget_paese);

        widget_paese.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget widget_paese)
    {
        widget_paese.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("widget_paese", "Form", null));
        label_abitanti.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_paese", "Numero di abitanti:", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_paese", "CAP", null));
    } // retranslateUi

}

