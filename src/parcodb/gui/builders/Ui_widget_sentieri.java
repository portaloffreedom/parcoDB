/********************************************************************************
 ** Form generated from reading ui file 'widget_sentieri.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui.builders;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_widget_sentieri implements com.trolltech.qt.QUiForm<QWidget>
{
    public QHBoxLayout horizontalLayout;
    public QWidget widget_3;
    public QVBoxLayout verticalLayout_2;
    public QWidget widget;
    public QHBoxLayout horizontalLayout_2;
    public QLabel label;
    public QSpinBox spinBox;
    public QSpacerItem verticalSpacer;
    public QFrame line;
    public QWidget widget_2;
    public QVBoxLayout verticalLayout;
    public QLabel label_2;
    public QListWidget listWidget;

    public Ui_widget_sentieri() { super(); }

    public void setupUi(QWidget widget_sentieri)
    {
        widget_sentieri.setObjectName("widget_sentieri");
        widget_sentieri.resize(new QSize(759, 517).expandedTo(widget_sentieri.minimumSizeHint()));
        horizontalLayout = new QHBoxLayout(widget_sentieri);
        horizontalLayout.setObjectName("horizontalLayout");
        widget_3 = new QWidget(widget_sentieri);
        widget_3.setObjectName("widget_3");
        verticalLayout_2 = new QVBoxLayout(widget_3);
        verticalLayout_2.setMargin(0);
        verticalLayout_2.setObjectName("verticalLayout_2");
        widget = new QWidget(widget_3);
        widget.setObjectName("widget");
        horizontalLayout_2 = new QHBoxLayout(widget);
        horizontalLayout_2.setMargin(0);
        horizontalLayout_2.setObjectName("horizontalLayout_2");
        label = new QLabel(widget);
        label.setObjectName("label");

        horizontalLayout_2.addWidget(label);

        spinBox = new QSpinBox(widget);
        spinBox.setObjectName("spinBox");
        spinBox.setMaximum(999999);

        horizontalLayout_2.addWidget(spinBox);


        verticalLayout_2.addWidget(widget);

        verticalSpacer = new QSpacerItem(20, 450, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        verticalLayout_2.addItem(verticalSpacer);


        horizontalLayout.addWidget(widget_3);

        line = new QFrame(widget_sentieri);
        line.setObjectName("line");
        line.setFrameShape(QFrame.Shape.HLine);

        horizontalLayout.addWidget(line);

        widget_2 = new QWidget(widget_sentieri);
        widget_2.setObjectName("widget_2");
        verticalLayout = new QVBoxLayout(widget_2);
        verticalLayout.setMargin(0);
        verticalLayout.setObjectName("verticalLayout");
        label_2 = new QLabel(widget_2);
        label_2.setObjectName("label_2");

        verticalLayout.addWidget(label_2);

        listWidget = new QListWidget(widget_2);
        listWidget.setObjectName("listWidget");

        verticalLayout.addWidget(listWidget);


        horizontalLayout.addWidget(widget_2);

        retranslateUi(widget_sentieri);

        widget_sentieri.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget widget_sentieri)
    {
        widget_sentieri.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("widget_sentieri", "Form", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_sentieri", "Numero Sentiero", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("widget_sentieri", "Seleziona tappe (almeno 4)", null));
    } // retranslateUi

}

