/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.gui;

import com.trolltech.qt.core.Qt;
import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QLCDNumber;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QSlider;
import com.trolltech.qt.gui.QVBoxLayout;
import com.trolltech.qt.gui.QWidget;


/**
 *
 * @author matteo
 */
public class MainWindowWidget extends QWidget {

    public MainWindowWidget() {
        QPushButton quit = new QPushButton(tr("Quit"));

        QLCDNumber lcd = new QLCDNumber(2);
        lcd.setSegmentStyle(QLCDNumber.SegmentStyle.Filled);


        QSlider slider = new QSlider(Qt.Orientation.Horizontal);
        slider.setRange(0, 100);
        slider.setValue(0);


        quit.clicked.connect(QApplication.instance(), "quit()");

        slider.valueChanged.connect(lcd, "display(int)");

        QVBoxLayout layout = new QVBoxLayout();

        layout.addWidget(quit);
        layout.addWidget(lcd);
        layout.addWidget(slider);
        setLayout(layout);

        setWindowTitle(tr("Building Blocks"));
    }
}
