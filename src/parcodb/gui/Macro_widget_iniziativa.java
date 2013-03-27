package parcodb.gui;

import com.trolltech.qt.gui.QWidget;
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
    public RemoteDBobject getInsertor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
