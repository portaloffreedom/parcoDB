/********************************************************************************
 ** Form generated from reading ui file 'dialog_connetti.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.6.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package parcodb.gui.builders;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_Dialog_connetti implements com.trolltech.qt.QUiForm<QDialog>
{
    public QVBoxLayout verticalLayout;
    public QWidget widget;
    public QHBoxLayout horizontalLayout_3;
    public QLabel label;
    public QLineEdit lineEdit_indirizzo;
    public QLabel label_2;
    public QLineEdit lineEdit_porta;
    public QWidget widget_3;
    public QHBoxLayout horizontalLayout;
    public QLabel label_username;
    public QLineEdit lineEdit_username;
    public QLabel label_password;
    public QLineEdit lineEdit_password;
    public QWidget widget_4;
    public QHBoxLayout horizontalLayout_4;
    public QLabel label_3;
    public QLineEdit lineEdit_nomeDB;
    public QSpacerItem verticalSpacer;
    public QWidget widget_2;
    public QHBoxLayout horizontalLayout_2;
    public QSpacerItem horizontalSpacer_2;
    public QPushButton bottone_connetti;
    public QPushButton bottone_annulla;

    public Ui_Dialog_connetti() { super(); }

    public void setupUi(QDialog Dialog_connetti)
    {
        Dialog_connetti.setObjectName("Dialog_connetti");
        Dialog_connetti.resize(new QSize(594, 244).expandedTo(Dialog_connetti.minimumSizeHint()));
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Maximum);
        sizePolicy.setHorizontalStretch((byte)0);
        sizePolicy.setVerticalStretch((byte)0);
        sizePolicy.setHeightForWidth(Dialog_connetti.sizePolicy().hasHeightForWidth());
        Dialog_connetti.setSizePolicy(sizePolicy);
        verticalLayout = new QVBoxLayout(Dialog_connetti);
        verticalLayout.setMargin(0);
        verticalLayout.setObjectName("verticalLayout");
        widget = new QWidget(Dialog_connetti);
        widget.setObjectName("widget");
        horizontalLayout_3 = new QHBoxLayout(widget);
        horizontalLayout_3.setObjectName("horizontalLayout_3");
        label = new QLabel(widget);
        label.setObjectName("label");
        QSizePolicy sizePolicy1 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy1.setHorizontalStretch((byte)0);
        sizePolicy1.setVerticalStretch((byte)0);
        sizePolicy1.setHeightForWidth(label.sizePolicy().hasHeightForWidth());
        label.setSizePolicy(sizePolicy1);

        horizontalLayout_3.addWidget(label);

        lineEdit_indirizzo = new QLineEdit(widget);
        lineEdit_indirizzo.setObjectName("lineEdit_indirizzo");
        QSizePolicy sizePolicy2 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy2.setHorizontalStretch((byte)0);
        sizePolicy2.setVerticalStretch((byte)0);
        sizePolicy2.setHeightForWidth(lineEdit_indirizzo.sizePolicy().hasHeightForWidth());
        lineEdit_indirizzo.setSizePolicy(sizePolicy2);

        horizontalLayout_3.addWidget(lineEdit_indirizzo);

        label_2 = new QLabel(widget);
        label_2.setObjectName("label_2");
        QSizePolicy sizePolicy3 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy3.setHorizontalStretch((byte)0);
        sizePolicy3.setVerticalStretch((byte)0);
        sizePolicy3.setHeightForWidth(label_2.sizePolicy().hasHeightForWidth());
        label_2.setSizePolicy(sizePolicy3);

        horizontalLayout_3.addWidget(label_2);

        lineEdit_porta = new QLineEdit(widget);
        lineEdit_porta.setObjectName("lineEdit_porta");
        QSizePolicy sizePolicy4 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy4.setHorizontalStretch((byte)0);
        sizePolicy4.setVerticalStretch((byte)0);
        sizePolicy4.setHeightForWidth(lineEdit_porta.sizePolicy().hasHeightForWidth());
        lineEdit_porta.setSizePolicy(sizePolicy4);
        lineEdit_porta.setInputMethodHints(com.trolltech.qt.core.Qt.InputMethodHint.createQFlags(com.trolltech.qt.core.Qt.InputMethodHint.ImhDigitsOnly,com.trolltech.qt.core.Qt.InputMethodHint.ImhFormattedNumbersOnly));

        horizontalLayout_3.addWidget(lineEdit_porta);


        verticalLayout.addWidget(widget);

        widget_3 = new QWidget(Dialog_connetti);
        widget_3.setObjectName("widget_3");
        horizontalLayout = new QHBoxLayout(widget_3);
        horizontalLayout.setObjectName("horizontalLayout");
        label_username = new QLabel(widget_3);
        label_username.setObjectName("label_username");
        QSizePolicy sizePolicy5 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy5.setHorizontalStretch((byte)0);
        sizePolicy5.setVerticalStretch((byte)0);
        sizePolicy5.setHeightForWidth(label_username.sizePolicy().hasHeightForWidth());
        label_username.setSizePolicy(sizePolicy5);

        horizontalLayout.addWidget(label_username);

        lineEdit_username = new QLineEdit(widget_3);
        lineEdit_username.setObjectName("lineEdit_username");
        QSizePolicy sizePolicy6 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy6.setHorizontalStretch((byte)0);
        sizePolicy6.setVerticalStretch((byte)0);
        sizePolicy6.setHeightForWidth(lineEdit_username.sizePolicy().hasHeightForWidth());
        lineEdit_username.setSizePolicy(sizePolicy6);

        horizontalLayout.addWidget(lineEdit_username);

        label_password = new QLabel(widget_3);
        label_password.setObjectName("label_password");
        QSizePolicy sizePolicy7 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy7.setHorizontalStretch((byte)0);
        sizePolicy7.setVerticalStretch((byte)0);
        sizePolicy7.setHeightForWidth(label_password.sizePolicy().hasHeightForWidth());
        label_password.setSizePolicy(sizePolicy7);

        horizontalLayout.addWidget(label_password);

        lineEdit_password = new QLineEdit(widget_3);
        lineEdit_password.setObjectName("lineEdit_password");
        QSizePolicy sizePolicy8 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy8.setHorizontalStretch((byte)0);
        sizePolicy8.setVerticalStretch((byte)0);
        sizePolicy8.setHeightForWidth(lineEdit_password.sizePolicy().hasHeightForWidth());
        lineEdit_password.setSizePolicy(sizePolicy8);
        lineEdit_password.setInputMethodHints(com.trolltech.qt.core.Qt.InputMethodHint.createQFlags(com.trolltech.qt.core.Qt.InputMethodHint.ImhHiddenText));
        lineEdit_password.setEchoMode(com.trolltech.qt.gui.QLineEdit.EchoMode.Password);

        horizontalLayout.addWidget(lineEdit_password);


        verticalLayout.addWidget(widget_3);

        widget_4 = new QWidget(Dialog_connetti);
        widget_4.setObjectName("widget_4");
        widget_4.setLayoutDirection(com.trolltech.qt.core.Qt.LayoutDirection.LeftToRight);
        horizontalLayout_4 = new QHBoxLayout(widget_4);
        horizontalLayout_4.setObjectName("horizontalLayout_4");
        label_3 = new QLabel(widget_4);
        label_3.setObjectName("label_3");
        QSizePolicy sizePolicy9 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy9.setHorizontalStretch((byte)0);
        sizePolicy9.setVerticalStretch((byte)0);
        sizePolicy9.setHeightForWidth(label_3.sizePolicy().hasHeightForWidth());
        label_3.setSizePolicy(sizePolicy9);
        label_3.setLayoutDirection(com.trolltech.qt.core.Qt.LayoutDirection.RightToLeft);

        horizontalLayout_4.addWidget(label_3);

        lineEdit_nomeDB = new QLineEdit(widget_4);
        lineEdit_nomeDB.setObjectName("lineEdit_nomeDB");
        QSizePolicy sizePolicy10 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Maximum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy10.setHorizontalStretch((byte)0);
        sizePolicy10.setVerticalStretch((byte)0);
        sizePolicy10.setHeightForWidth(lineEdit_nomeDB.sizePolicy().hasHeightForWidth());
        lineEdit_nomeDB.setSizePolicy(sizePolicy10);
        lineEdit_nomeDB.setInputMethodHints(com.trolltech.qt.core.Qt.InputMethodHint.createQFlags(com.trolltech.qt.core.Qt.InputMethodHint.ImhNone));
        lineEdit_nomeDB.setEchoMode(com.trolltech.qt.gui.QLineEdit.EchoMode.Normal);

        horizontalLayout_4.addWidget(lineEdit_nomeDB);


        verticalLayout.addWidget(widget_4);

        verticalSpacer = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        verticalLayout.addItem(verticalSpacer);

        widget_2 = new QWidget(Dialog_connetti);
        widget_2.setObjectName("widget_2");
        horizontalLayout_2 = new QHBoxLayout(widget_2);
        horizontalLayout_2.setObjectName("horizontalLayout_2");
        horizontalSpacer_2 = new QSpacerItem(240, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        horizontalLayout_2.addItem(horizontalSpacer_2);

        bottone_connetti = new QPushButton(widget_2);
        bottone_connetti.setObjectName("bottone_connetti");

        horizontalLayout_2.addWidget(bottone_connetti);

        bottone_annulla = new QPushButton(widget_2);
        bottone_annulla.setObjectName("bottone_annulla");

        horizontalLayout_2.addWidget(bottone_annulla);


        verticalLayout.addWidget(widget_2);

        retranslateUi(Dialog_connetti);

        Dialog_connetti.connectSlotsByName();
    } // setupUi

    void retranslateUi(QDialog Dialog_connetti)
    {
        Dialog_connetti.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Dialog_connetti", "Dialog", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog_connetti", "Indirizzo", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog_connetti", "Porta", null));
        label_username.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog_connetti", "Username", null));
        label_password.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog_connetti", "Password", null));
        label_3.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog_connetti", "Nome Database", null));
        lineEdit_nomeDB.setToolTip("");
        lineEdit_nomeDB.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog_connetti", "bdati", null));
        bottone_connetti.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog_connetti", "Connetti", null));
        bottone_annulla.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog_connetti", "Annulla", null));
    } // retranslateUi

}

