/********************************************************************************
 ** Form generated from reading ui file 'widget_fiume.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_widget_fiume implements com.trolltech.qt.QUiForm<QWidget>
{
    public QGridLayout gridLayout;
    public QWidget widget;
    public QHBoxLayout horizontalLayout;
    public QLabel label_lunghezza;
    public QLineEdit lineEdit_lunghezza;
    public QCheckBox checkBox_navigabile;
    public QSpacerItem verticalSpacer;
    public QSpacerItem horizontalSpacer;

    public Ui_widget_fiume() { super(); }

    public void setupUi(QWidget widget_fiume)
    {
        widget_fiume.setObjectName("widget_fiume");
        widget_fiume.resize(new QSize(592, 293).expandedTo(widget_fiume.minimumSizeHint()));
        gridLayout = new QGridLayout(widget_fiume);
        gridLayout.setObjectName("gridLayout");
        widget = new QWidget(widget_fiume);
        widget.setObjectName("widget");
        horizontalLayout = new QHBoxLayout(widget);
        horizontalLayout.setMargin(0);
        horizontalLayout.setObjectName("horizontalLayout");
        label_lunghezza = new QLabel(widget);
        label_lunghezza.setObjectName("label_lunghezza");

        horizontalLayout.addWidget(label_lunghezza);

        lineEdit_lunghezza = new QLineEdit(widget);
        lineEdit_lunghezza.setObjectName("lineEdit_lunghezza");
        lineEdit_lunghezza.setInputMethodHints(com.trolltech.qt.core.Qt.InputMethodHint.createQFlags(com.trolltech.qt.core.Qt.InputMethodHint.ImhDigitsOnly,com.trolltech.qt.core.Qt.InputMethodHint.ImhFormattedNumbersOnly));

        horizontalLayout.addWidget(lineEdit_lunghezza);


        gridLayout.addWidget(widget, 0, 0, 1, 1);

        checkBox_navigabile = new QCheckBox(widget_fiume);
        checkBox_navigabile.setObjectName("checkBox_navigabile");
        checkBox_navigabile.setEnabled(true);
        checkBox_navigabile.setLayoutDirection(com.trolltech.qt.core.Qt.LayoutDirection.LeftToRight);
        checkBox_navigabile.setCheckable(true);
        checkBox_navigabile.setTristate(false);

        gridLayout.addWidget(checkBox_navigabile, 0, 1, 1, 1);

        verticalSpacer = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout.addItem(verticalSpacer, 1, 0, 1, 1);

        horizontalSpacer = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer, 0, 2, 1, 1);

        retranslateUi(widget_fiume);

        widget_fiume.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget widget_fiume)
    {
        widget_fiume.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("widget_fiume", "Form", null));
        label_lunghezza.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_fiume", "Lunghezza", null));
        checkBox_navigabile.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_fiume", "Navigabile", null));
    } // retranslateUi

}

