/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcodb.gui;

import com.trolltech.qt.gui.QWidget;

/**
 *
 * @author stengun
 */
public class Ui_widget_impianti_special extends Ui_widget_impianti{

    public Ui_widget_impianti_special() {
        super();
    }
    
    @Override
    public void setupUi(QWidget widget_impianti){
        super.setupUi(widget_impianti);
        this.comboBox_tipologia.addItem("Cabinovia");
        this.comboBox_tipologia.addItem("Funivia");
        this.comboBox_tipologia.addItem("Seggiovia");
        
    }
}
