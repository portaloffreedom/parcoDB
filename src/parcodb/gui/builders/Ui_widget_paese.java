/********************************************************************************
 ** Form generated from reading ui file 'widget_paese.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui.builders;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_widget_paese implements com.trolltech.qt.QUiForm<QWidget>
{
    public QVBoxLayout verticalLayout;
    public QWidget widget;
    public QHBoxLayout horizontalLayout_2;
    public QLabel label_abitanti;
    public QSpinBox spinBox_abitanti;
    public QWidget widget_2;
    public QHBoxLayout horizontalLayout;
    public QLabel label;
    public QLineEdit lineEdit_cap;
    public QSpacerItem verticalSpacer;

    public Ui_widget_paese() { super(); }

    public void setupUi(QWidget widget_paese)
    {
        widget_paese.setObjectName("widget_paese");
        widget_paese.resize(new QSize(692, 426).expandedTo(widget_paese.minimumSizeHint()));
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy.setHorizontalStretch((byte)0);
        sizePolicy.setVerticalStretch((byte)0);
        sizePolicy.setHeightForWidth(widget_paese.sizePolicy().hasHeightForWidth());
        widget_paese.setSizePolicy(sizePolicy);
        verticalLayout = new QVBoxLayout(widget_paese);
        verticalLayout.setMargin(0);
        verticalLayout.setObjectName("verticalLayout");
        widget = new QWidget(widget_paese);
        widget.setObjectName("widget");
        horizontalLayout_2 = new QHBoxLayout(widget);
        horizontalLayout_2.setMargin(0);
        horizontalLayout_2.setObjectName("horizontalLayout_2");
        label_abitanti = new QLabel(widget);
        label_abitanti.setObjectName("label_abitanti");
        QSizePolicy sizePolicy1 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy1.setHorizontalStretch((byte)0);
        sizePolicy1.setVerticalStretch((byte)0);
        sizePolicy1.setHeightForWidth(label_abitanti.sizePolicy().hasHeightForWidth());
        label_abitanti.setSizePolicy(sizePolicy1);

        horizontalLayout_2.addWidget(label_abitanti);

        spinBox_abitanti = new QSpinBox(widget);
        spinBox_abitanti.setObjectName("spinBox_abitanti");
        spinBox_abitanti.setLayoutDirection(com.trolltech.qt.core.Qt.LayoutDirection.LeftToRight);

        horizontalLayout_2.addWidget(spinBox_abitanti);


        verticalLayout.addWidget(widget);

        widget_2 = new QWidget(widget_paese);
        widget_2.setObjectName("widget_2");
        horizontalLayout = new QHBoxLayout(widget_2);
        horizontalLayout.setMargin(0);
        horizontalLayout.setObjectName("horizontalLayout");
        label = new QLabel(widget_2);
        label.setObjectName("label");
        QSizePolicy sizePolicy2 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy2.setHorizontalStretch((byte)0);
        sizePolicy2.setVerticalStretch((byte)0);
        sizePolicy2.setHeightForWidth(label.sizePolicy().hasHeightForWidth());
        label.setSizePolicy(sizePolicy2);

        horizontalLayout.addWidget(label);

        lineEdit_cap = new QLineEdit(widget_2);
        lineEdit_cap.setObjectName("lineEdit_cap");
        QSizePolicy sizePolicy3 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy3.setHorizontalStretch((byte)0);
        sizePolicy3.setVerticalStretch((byte)0);
        sizePolicy3.setHeightForWidth(lineEdit_cap.sizePolicy().hasHeightForWidth());
        lineEdit_cap.setSizePolicy(sizePolicy3);
        lineEdit_cap.setLayoutDirection(com.trolltech.qt.core.Qt.LayoutDirection.RightToLeft);
        lineEdit_cap.setInputMethodHints(com.trolltech.qt.core.Qt.InputMethodHint.createQFlags(com.trolltech.qt.core.Qt.InputMethodHint.ImhDigitsOnly,com.trolltech.qt.core.Qt.InputMethodHint.ImhFormattedNumbersOnly));

        horizontalLayout.addWidget(lineEdit_cap);


        verticalLayout.addWidget(widget_2);

        verticalSpacer = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        verticalLayout.addItem(verticalSpacer);

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

