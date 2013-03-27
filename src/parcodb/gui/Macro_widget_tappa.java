package parcodb.gui;

import parcodb.database.objects.RemoteDBobject;
import parcodb.database.objects.Tappa;
import parcodb.database.objects.Zona;
import parcodb.gui.builders.Ui_widget_tappa;

/**
 *
 * @author stengun
 */
public class Macro_widget_tappa extends Ui_widget_tappa implements Insertor{

    @Override
    public RemoteDBobject getInsertor() {
        return new Tappa((Zona)comboBox_inizio.itemData(comboBox_inizio.currentIndex()),
                (Zona)comboBox_fine.itemData(comboBox_fine.currentIndex()), 
                Float.parseFloat(lineEdit_lunghezza.text()));
    }
    
}
