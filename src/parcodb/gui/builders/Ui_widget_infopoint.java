/********************************************************************************
 ** Form generated from reading ui file 'widget_infopoint.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui.builders;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_widget_infopoint implements com.trolltech.qt.QUiForm<QWidget>
{
    public QVBoxLayout verticalLayout;
    public QWidget widget;
    public QVBoxLayout verticalLayout_2;
    public QLabel label;
    public QLineEdit lineEdit;
    public QWidget widget_2;
    public QVBoxLayout verticalLayout_3;
    public QLabel label_2;
    public QLineEdit lineEdit_telefono;
    public QSpacerItem verticalSpacer;

    public Ui_widget_infopoint() { super(); }

    public void setupUi(QWidget widget_infopoint)
    {
        widget_infopoint.setObjectName("widget_infopoint");
        widget_infopoint.resize(new QSize(526, 217).expandedTo(widget_infopoint.minimumSizeHint()));
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Preferred, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy.setHorizontalStretch((byte)0);
        sizePolicy.setVerticalStretch((byte)0);
        sizePolicy.setHeightForWidth(widget_infopoint.sizePolicy().hasHeightForWidth());
        widget_infopoint.setSizePolicy(sizePolicy);
        verticalLayout = new QVBoxLayout(widget_infopoint);
        verticalLayout.setMargin(9);
        verticalLayout.setObjectName("verticalLayout");
        widget = new QWidget(widget_infopoint);
        widget.setObjectName("widget");
        verticalLayout_2 = new QVBoxLayout(widget);
        verticalLayout_2.setMargin(0);
        verticalLayout_2.setObjectName("verticalLayout_2");
        label = new QLabel(widget);
        label.setObjectName("label");
        QSizePolicy sizePolicy1 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy1.setHorizontalStretch((byte)0);
        sizePolicy1.setVerticalStretch((byte)0);
        sizePolicy1.setHeightForWidth(label.sizePolicy().hasHeightForWidth());
        label.setSizePolicy(sizePolicy1);

        verticalLayout_2.addWidget(label);

        lineEdit = new QLineEdit(widget);
        lineEdit.setObjectName("lineEdit");
        QSizePolicy sizePolicy2 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy2.setHorizontalStretch((byte)0);
        sizePolicy2.setVerticalStretch((byte)0);
        sizePolicy2.setHeightForWidth(lineEdit.sizePolicy().hasHeightForWidth());
        lineEdit.setSizePolicy(sizePolicy2);
        lineEdit.setInputMethodHints(com.trolltech.qt.core.Qt.InputMethodHint.createQFlags(com.trolltech.qt.core.Qt.InputMethodHint.ImhDigitsOnly,com.trolltech.qt.core.Qt.InputMethodHint.ImhFormattedNumbersOnly));

        verticalLayout_2.addWidget(lineEdit);


        verticalLayout.addWidget(widget);

        widget_2 = new QWidget(widget_infopoint);
        widget_2.setObjectName("widget_2");
        verticalLayout_3 = new QVBoxLayout(widget_2);
        verticalLayout_3.setMargin(0);
        verticalLayout_3.setObjectName("verticalLayout_3");
        label_2 = new QLabel(widget_2);
        label_2.setObjectName("label_2");
        QSizePolicy sizePolicy3 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy3.setHorizontalStretch((byte)0);
        sizePolicy3.setVerticalStretch((byte)0);
        sizePolicy3.setHeightForWidth(label_2.sizePolicy().hasHeightForWidth());
        label_2.setSizePolicy(sizePolicy3);

        verticalLayout_3.addWidget(label_2);

        lineEdit_telefono = new QLineEdit(widget_2);
        lineEdit_telefono.setObjectName("lineEdit_telefono");
        QSizePolicy sizePolicy4 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy4.setHorizontalStretch((byte)0);
        sizePolicy4.setVerticalStretch((byte)0);
        sizePolicy4.setHeightForWidth(lineEdit_telefono.sizePolicy().hasHeightForWidth());
        lineEdit_telefono.setSizePolicy(sizePolicy4);

        verticalLayout_3.addWidget(lineEdit_telefono);


        verticalLayout.addWidget(widget_2);

        verticalSpacer = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        verticalLayout.addItem(verticalSpacer);

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

