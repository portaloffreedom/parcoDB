package parcodb.gui;
import com.trolltech.qt.QUiForm;
import com.trolltech.qt.gui.QWidget;
import parcodb.gui.builders.Ui_caratteristica_common;
import parcodb.gui.builders.Ui_widget_fiume;
import parcodb.gui.builders.Ui_widget_lago;
import parcodb.gui.builders.Ui_widget_monte;
import parcodb.gui.builders.Ui_widget_paese;
/**
 *
 * @author stengun
 */
public class Macro_widget_caratteristica extends Ui_caratteristica_common{
    
    public Macro_widget_caratteristica(){
        super();
    }
    
    @Override
    public void setupUi(QWidget caratteristica_common){
        super.setupUi(caratteristica_common);
        this.combo_tipo.addItem("Monte");
        this.combo_tipo.addItem("Fiume");
        this.combo_tipo.addItem("Lago");
        this.combo_tipo.addItem("Paese");
        this.combo_tipo.currentIndexChanged.connect(this, "select_car_specific()");
        this.combo_tipo.setCurrentIndex(0);
    }
    
    private void set_car_widget(QUiForm _special){
        widget_special = new QWidget(widget_tipologia);
        layout_special.insertWidget(3,widget_special);
        _special.setupUi(widget_special);
        widget_special.show();
    }
    
    public void select_car_specific(){        
        if(widget_special != null) widget_special.dispose();
        
        switch(combo_tipo.currentIndex()){
            case 0:
                set_car_widget(new Ui_widget_monte());
                break;
            case 1:
                set_car_widget(new Ui_widget_fiume());
                break;
            case 2:
                set_car_widget(new Ui_widget_lago());
                break;
            case 3:
                set_car_widget(new Ui_widget_paese());
            default:
                break;
            
        }
    }
}
