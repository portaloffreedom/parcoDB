/********************************************************************************
 ** Form generated from reading ui file 'widget_lago.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui.builders;

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

    public Ui_widget_lago() { super(); }

    public void setupUi(QWidget widget_lago)
    {
        widget_lago.setObjectName("widget_lago");
        widget_lago.resize(new QSize(400, 300).expandedTo(widget_lago.minimumSizeHint()));
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy.setHorizontalStretch((byte)0);
        sizePolicy.setVerticalStretch((byte)0);
        sizePolicy.setHeightForWidth(widget_lago.sizePolicy().hasHeightForWidth());
        widget_lago.setSizePolicy(sizePolicy);
        gridLayout = new QGridLayout(widget_lago);
        gridLayout.setMargin(0);
        gridLayout.setObjectName("gridLayout");
        widget = new QWidget(widget_lago);
        widget.setObjectName("widget");
        horizontalLayout = new QHBoxLayout(widget);
        horizontalLayout.setMargin(0);
        horizontalLayout.setObjectName("horizontalLayout");
        label = new QLabel(widget);
        label.setObjectName("label");
        QSizePolicy sizePolicy1 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy1.setHorizontalStretch((byte)0);
        sizePolicy1.setVerticalStretch((byte)0);
        sizePolicy1.setHeightForWidth(label.sizePolicy().hasHeightForWidth());
        label.setSizePolicy(sizePolicy1);

        horizontalLayout.addWidget(label);

        lineEdit = new QLineEdit(widget);
        lineEdit.setObjectName("lineEdit");
        QSizePolicy sizePolicy2 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy2.setHorizontalStretch((byte)0);
        sizePolicy2.setVerticalStretch((byte)0);
        sizePolicy2.setHeightForWidth(lineEdit.sizePolicy().hasHeightForWidth());
        lineEdit.setSizePolicy(sizePolicy2);
        lineEdit.setLayoutDirection(com.trolltech.qt.core.Qt.LayoutDirection.RightToLeft);

        horizontalLayout.addWidget(lineEdit);


        gridLayout.addWidget(widget, 0, 0, 1, 1);

        verticalSpacer = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout.addItem(verticalSpacer, 1, 0, 1, 1);

        retranslateUi(widget_lago);

        widget_lago.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget widget_lago)
    {
        widget_lago.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("widget_lago", "Form", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_lago", "Estensione (km\u00b2)", null));
    } // retranslateUi

}

