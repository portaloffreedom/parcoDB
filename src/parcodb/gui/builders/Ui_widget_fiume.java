/********************************************************************************
 ** Form generated from reading ui file 'widget_fiume.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui.builders;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_widget_fiume implements com.trolltech.qt.QUiForm<QWidget>
{
    public QVBoxLayout verticalLayout;
    public QWidget widget;
    public QHBoxLayout horizontalLayout;
    public QLabel label_lunghezza;
    public QLineEdit lineEdit_lunghezza;
    public QCheckBox checkBox_navigabile;
    public QSpacerItem verticalSpacer;

    public Ui_widget_fiume() { super(); }

    public void setupUi(QWidget widget_fiume)
    {
        widget_fiume.setObjectName("widget_fiume");
        widget_fiume.resize(new QSize(260, 293).expandedTo(widget_fiume.minimumSizeHint()));
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy.setHorizontalStretch((byte)0);
        sizePolicy.setVerticalStretch((byte)0);
        sizePolicy.setHeightForWidth(widget_fiume.sizePolicy().hasHeightForWidth());
        widget_fiume.setSizePolicy(sizePolicy);
        verticalLayout = new QVBoxLayout(widget_fiume);
        verticalLayout.setMargin(0);
        verticalLayout.setObjectName("verticalLayout");
        widget = new QWidget(widget_fiume);
        widget.setObjectName("widget");
        horizontalLayout = new QHBoxLayout(widget);
        horizontalLayout.setMargin(0);
        horizontalLayout.setObjectName("horizontalLayout");
        label_lunghezza = new QLabel(widget);
        label_lunghezza.setObjectName("label_lunghezza");
        QSizePolicy sizePolicy1 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy1.setHorizontalStretch((byte)0);
        sizePolicy1.setVerticalStretch((byte)0);
        sizePolicy1.setHeightForWidth(label_lunghezza.sizePolicy().hasHeightForWidth());
        label_lunghezza.setSizePolicy(sizePolicy1);

        horizontalLayout.addWidget(label_lunghezza);

        lineEdit_lunghezza = new QLineEdit(widget);
        lineEdit_lunghezza.setObjectName("lineEdit_lunghezza");
        QSizePolicy sizePolicy2 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy2.setHorizontalStretch((byte)0);
        sizePolicy2.setVerticalStretch((byte)0);
        sizePolicy2.setHeightForWidth(lineEdit_lunghezza.sizePolicy().hasHeightForWidth());
        lineEdit_lunghezza.setSizePolicy(sizePolicy2);
        lineEdit_lunghezza.setLayoutDirection(com.trolltech.qt.core.Qt.LayoutDirection.RightToLeft);
        lineEdit_lunghezza.setInputMethodHints(com.trolltech.qt.core.Qt.InputMethodHint.createQFlags(com.trolltech.qt.core.Qt.InputMethodHint.ImhDigitsOnly,com.trolltech.qt.core.Qt.InputMethodHint.ImhFormattedNumbersOnly));

        horizontalLayout.addWidget(lineEdit_lunghezza);


        verticalLayout.addWidget(widget);

        checkBox_navigabile = new QCheckBox(widget_fiume);
        checkBox_navigabile.setObjectName("checkBox_navigabile");
        checkBox_navigabile.setEnabled(true);
        checkBox_navigabile.setLayoutDirection(com.trolltech.qt.core.Qt.LayoutDirection.LeftToRight);
        checkBox_navigabile.setCheckable(true);
        checkBox_navigabile.setTristate(false);

        verticalLayout.addWidget(checkBox_navigabile);

        verticalSpacer = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        verticalLayout.addItem(verticalSpacer);

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
