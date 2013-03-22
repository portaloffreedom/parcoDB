package parcodb.gui;
import com.trolltech.qt.QUiForm;
import com.trolltech.qt.gui.QWidget;
import parcodb.gui.builders.Ui_struttura_common;
import parcodb.gui.builders.Ui_widget_albergo;
import parcodb.gui.builders.Ui_widget_infopoint;
import parcodb.gui.builders.Ui_widget_monumento;
import parcodb.gui.builders.Ui_widget_museo;
/**
 *
 * @author stengun
 */
public class Macro_widget_struttura extends Ui_struttura_common{
    
    public Macro_widget_struttura(){
        super();
    }
    
    @Override
    public void setupUi(QWidget struttura_common){
        super.setupUi(struttura_common);
        this.combo_tipo.addItem("Albergo");
        this.combo_tipo.addItem("Museo");
        this.combo_tipo.addItem("Monumento");
        this.combo_tipo.addItem("Infopoint");
        this.combo_tipo.addItem("Impianto di risalita");
        this.combo_tipo.currentIndexChanged.connect(this, "select_struttura_specific()");
        this.combo_tipo.setCurrentIndex(0);
    }
    
    private void set_strut_widget(QUiForm _special){
        widget_special = new QWidget(widget_3);
        layout_special.addWidget(widget_special);
        _special.setupUi(widget_special);
        widget_special.show();
    }
    
    public void select_struttura_specific(){
        if(widget_special != null) widget_special.dispose();
        switch(combo_tipo.currentIndex()){
            case 0:
                set_strut_widget(new Ui_widget_albergo());
                break;
            case 1:
                set_strut_widget(new Ui_widget_museo());
                break;
            case 2:
                set_strut_widget(new Ui_widget_monumento());
                break;
            case 3:
                set_strut_widget(new Ui_widget_infopoint());
                break;
            case 4:
                set_strut_widget(new Micro_widget_impianti());
            default:
                break;
        }
    }
    
}
