package parcodb.gui;

import com.trolltech.qt.gui.QListWidgetItem;
import java.util.ArrayList;
import java.util.List;
import parcodb.database.objects.Caratteristica;
import parcodb.database.objects.Interesse;
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
    public List<RemoteDBobject> getInsertor() {
        ArrayList<RemoteDBobject> listaritorno = new ArrayList<>();
        Tappa tappa = new Tappa((Zona)comboBox_inizio.itemData(comboBox_inizio.currentIndex()),
                (Zona)comboBox_fine.itemData(comboBox_fine.currentIndex()), 
                Float.parseFloat(lineEdit_lunghezza.text()));
        List<QListWidgetItem> selezionati = list_interesse.selectedItems();
        listaritorno.add(0,tappa);
        for(QListWidgetItem oggetto:selezionati){
            listaritorno.add(new Interesse((Caratteristica)oggetto.data(0),tappa));
        }
        
        return listaritorno;
    }
    
}
