package parcodb.gui;

import com.trolltech.qt.gui.QListWidgetItem;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import parcodb.database.objects.Comune;
import parcodb.database.objects.RemoteDBobject;
import parcodb.database.objects.Sentiero;
import parcodb.database.objects.Tappa;
import parcodb.gui.builders.Ui_widget_sentieri;

/**
 *
 * @author stengun
 */
public class Macro_widget_sentieri extends Ui_widget_sentieri implements Insertor{

    @Override
    public List<RemoteDBobject> getInsertor() {
        Sentiero sentiero = null;
        try {
            sentiero = new Sentiero(spinBox.value(),
                    getTappe());
        } catch (Exception ex) {
            Logger.getLogger(Macro_widget_sentieri.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<RemoteDBobject> lista = new ArrayList<>();
        lista.add(sentiero);
        return lista;
    }
    
    private Tappa[] getTappe(){
        List<QListWidgetItem> arritem = listWidget.selectedItems();
        Tappa[] tappe = new Tappa[arritem.size()];
        int i = 0;
        for(QListWidgetItem ogg : arritem){
            tappe[i++] = (Tappa)ogg.data(0);
        }
        return tappe;
    }
    
}
