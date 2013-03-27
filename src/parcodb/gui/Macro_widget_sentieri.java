package parcodb.gui;

import com.trolltech.qt.gui.QListWidgetItem;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public RemoteDBobject getInsertor() {
        Sentiero sentiero = null;
        QListWidgetItem[] listatappe = (QListWidgetItem[])listWidget.selectedItems().toArray();
        List<Tappa> tappe = new ArrayList<>();
        for(QListWidgetItem item:listatappe){
            tappe.add((Tappa)item.data(0));
        }
        try {
            sentiero = new Sentiero(spinBox.value(),
                    (Tappa[])tappe.toArray());
        } catch (Exception ex) {
            Logger.getLogger(Macro_widget_sentieri.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sentiero;
    }
    
}
