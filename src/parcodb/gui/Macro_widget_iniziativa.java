package parcodb.gui;

import com.trolltech.qt.gui.QWidget;
import java.util.ArrayList;
import java.util.List;
import parcodb.database.objects.Iniziativa;
import parcodb.database.objects.Paese;
import parcodb.database.objects.RemoteDBobject;
import parcodb.gui.builders.Ui_iniziativa_common;
/**
 *
 * @author stengun
 */
public class Macro_widget_iniziativa extends Ui_iniziativa_common implements Insertor{
    
    public Macro_widget_iniziativa(){
        super();
    }
    
    @Override
    public void setupUi(QWidget iniziativa_common){
        super.setupUi(iniziativa_common);
        this.combo_iniziativa.addItem("Gastronomica");
        this.combo_iniziativa.addItem("Culturale");
        this.combo_iniziativa.addItem("Naturalistica");
        this.combo_iniziativa.setCurrentIndex(0);
    }

    @Override
    public List<RemoteDBobject> getInsertor() {
        ArrayList<RemoteDBobject> lista = new ArrayList<>();
        lista.add(new Iniziativa((Paese)combo_paese.itemData(combo_paese.currentIndex()),
                spinBox.value(),
                combo_iniziativa.currentText(),
                lineEdit_nome.text(),
                plainText_descrizione.toPlainText()));
        return lista;
    }
}
