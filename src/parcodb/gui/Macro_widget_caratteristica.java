package parcodb.gui;
import com.trolltech.qt.QUiForm;
import com.trolltech.qt.gui.QListWidgetItem;
import com.trolltech.qt.gui.QWidget;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import parcodb.database.objects.Caratteristica;
import parcodb.database.objects.Comune;
import parcodb.database.objects.Fiume;
import parcodb.database.objects.Interesse;
import parcodb.database.objects.Lago;
import parcodb.database.objects.Monte;
import parcodb.database.objects.Paese;
import parcodb.database.objects.RemoteDBobject;
import parcodb.database.objects.Tappa;
import parcodb.database.objects.Vicino;
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
    
    public Ui_widget_paese paese_wdg;
    public Ui_widget_fiume fiume_wdg;
    public Ui_widget_monte monte_wdg;
    public Ui_widget_lago lago_wdg;
    
    
    
    public Macro_widget_caratteristica(){
        super();
        paese_wdg = new Ui_widget_paese();
        fiume_wdg = new Ui_widget_fiume();
        lago_wdg = new Ui_widget_lago();
        monte_wdg = new Ui_widget_monte();
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
    
    @Override
    public List<RemoteDBobject> getInsertor(){
        ArrayList<RemoteDBobject> lista = new ArrayList<>();
        Caratteristica questo = null;
        switch(combo_tipo.currentIndex()){
            case 0:
                questo = constructMonte();
                break;
            case 1:
                questo = constructFiume();
                break;
            case 2:
                questo = constructLago();
                break;
            case 3:
                questo = constructPaese();
            default:
                break;
        }
        lista.add(questo);
        //Tutte le caratteristiche vicine
        List<QListWidgetItem> items = lista_vicinanza.selectedItems();                
        for(QListWidgetItem item:items){
            lista.add(new Vicino(questo,(Caratteristica)item.data(0)));
        }
        //Tutte le tappe interessate
        items = listWidget_tappe.selectedItems();
        for(QListWidgetItem item:items){
            lista.add(new Interesse(questo,(Tappa)item.data(0)));
        }
        
        return lista;
    }
    
    private Caratteristica constructLago(){
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
    
    private Caratteristica constructMonte(){
        Monte monte = null;
        try {
            monte = new Monte(lineEdit_nome.text(),
                    (float) monte_wdg.spinBox_altitudine.value(),
                    getComuni());
        } catch (Exception ex) {
            Logger.getLogger(Macro_widget_caratteristica.class.getName()).log(Level.SEVERE, null, ex);
        }
        return monte;
    }
    
    private Caratteristica constructFiume(){
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
    
    private Caratteristica constructPaese(){
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
