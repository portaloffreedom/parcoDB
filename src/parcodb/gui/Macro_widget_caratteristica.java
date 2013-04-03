package parcodb.gui;
import com.trolltech.qt.QUiForm;
import com.trolltech.qt.gui.QListWidgetItem;
import com.trolltech.qt.gui.QWidget;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import parcodb.database.objects.Comune;
import parcodb.database.objects.Fiume;
import parcodb.database.objects.Lago;
import parcodb.database.objects.Monte;
import parcodb.database.objects.Paese;
import parcodb.database.objects.RemoteDBobject;
import parcodb.gui.builders.Ui_caratteristica_common;
import parcodb.gui.builders.Ui_widget_fiume;
import parcodb.gui.builders.Ui_widget_lago;
import parcodb.gui.builders.Ui_widget_monte;
import parcodb.gui.builders.Ui_widget_paese;
/**
 *
 * @author stengun
 */
public class Macro_widget_caratteristica extends Ui_caratteristica_common implements Insertor{
    
    private Ui_widget_paese paese_wdg;
    private Ui_widget_fiume fiume_wdg;
    private Ui_widget_monte monte_wdg;
    private Ui_widget_lago lago_wdg;
    
    
    
    public Macro_widget_caratteristica(){
        super();
    }
    
    @Override
    public void setupUi(QWidget caratteristica_common){
        super.setupUi(caratteristica_common);
        paese_wdg = new Ui_widget_paese();
        fiume_wdg = new Ui_widget_fiume();
        lago_wdg = new Ui_widget_lago();
        monte_wdg = new Ui_widget_monte();
        
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
    
    @Override
    public RemoteDBobject getInsertor(){
        switch(combo_tipo.currentIndex()){
            case 0:
                return constructMonte();
            case 1:
                return constructFiume();
            case 2:
                return constructLago();
            case 3:
                return constructPaese();
            default:
                break;
            
        }
        return null;
    }
    
    private RemoteDBobject constructLago(){
        Lago lago = null;
        try {
            lago = new Lago(lineEdit_nome.text(), 
                    Float.parseFloat(lago_wdg.lineEdit.text()),
                    getComuni());
        } catch (Exception ex) {
            Logger.getLogger(Macro_widget_caratteristica.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lago;
    }
    
    private RemoteDBobject constructMonte(){
        Monte monte = null;
        try {
            monte = new Monte(lineEdit_nome.text(),
                    monte_wdg.spinBox_altitudine.value(),
                    getComuni());
        } catch (Exception ex) {
            Logger.getLogger(Macro_widget_caratteristica.class.getName()).log(Level.SEVERE, null, ex);
        }
        return monte;
    }
    
    private RemoteDBobject constructFiume(){
        Fiume fiume = null;
        try {
            fiume = new Fiume(lineEdit_nome.text(), 
                    Float.parseFloat(fiume_wdg.lineEdit_lunghezza.text()),
                    fiume_wdg.checkBox_navigabile.isChecked(),
                    getComuni());
        } catch (Exception ex) {
            Logger.getLogger(Macro_widget_caratteristica.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fiume;
    }
    
    private RemoteDBobject constructPaese(){
        Paese paese = null;
        
        try {
            paese = new Paese(lineEdit_nome.text(), 
                    paese_wdg.spinBox_abitanti.value(), 
                    Integer.decode(paese_wdg.lineEdit_cap.text()),
                    getComuni());
        } catch (Exception ex) {
            Logger.getLogger(Macro_widget_caratteristica.class.getName()).log(Level.SEVERE, null, ex);
        }
        return paese;
    }
    
    private Comune[] getComuni(){
        List<QListWidgetItem> arritem = listWidget_comune.selectedItems();
        Comune[] comuni = new Comune[arritem.toArray().length];
        int i = 0;
        for(QListWidgetItem ogg : arritem){
            comuni[i++] = (Comune)ogg.data(0);
        }
        return comuni;
    }
    public void select_car_specific(){        
        if(widget_special != null) widget_special.dispose();
        
        switch(combo_tipo.currentIndex()){
            case 0:
                set_car_widget(monte_wdg);
                break;
            case 1:
                set_car_widget(fiume_wdg);
                break;
            case 2:
                set_car_widget(lago_wdg);
                break;
            case 3:
                set_car_widget(paese_wdg);
            default:
                break;
            
        }
    }
}
