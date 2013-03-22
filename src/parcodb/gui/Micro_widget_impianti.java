package parcodb.gui;

import com.trolltech.qt.gui.QWidget;
import parcodb.gui.builders.Ui_widget_impianti;
/**
 * Classe per costruire il widget impianti.
 * @author stengun
 */
public class Micro_widget_impianti extends Ui_widget_impianti{

    public Micro_widget_impianti() {
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
