package parcodb.gui;
import com.trolltech.qt.QUiForm;
import com.trolltech.qt.gui.QWidget;
import parcodb.database.objects.Albergo;
import parcodb.database.objects.ImpiantiRisalita;
import parcodb.database.objects.Monumento;
import parcodb.database.objects.Museo;
import parcodb.database.objects.Paese;
import parcodb.database.objects.RemoteDBobject;
import parcodb.database.objects.UfficioInformazioni;
import parcodb.gui.builders.Ui_struttura_common;
import parcodb.gui.builders.Ui_widget_albergo;
import parcodb.gui.builders.Ui_widget_impianti;
import parcodb.gui.builders.Ui_widget_infopoint;
import parcodb.gui.builders.Ui_widget_monumento;
import parcodb.gui.builders.Ui_widget_museo;
/**
 *
 * @author stengun
 */
public class Macro_widget_struttura extends Ui_struttura_common implements Insertor{
    private Ui_widget_albergo albergo;
    private Ui_widget_museo museo;
    private Ui_widget_monumento monumento;
    private Ui_widget_infopoint infopoint;
    private Ui_widget_impianti impianti;
    
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
        
        albergo = new Ui_widget_albergo();
        museo = new Ui_widget_museo();
        monumento = new Ui_widget_monumento();
        infopoint = new Ui_widget_infopoint();
        impianti = new Micro_widget_impianti();
    }
    
    private void set_strut_widget(QUiForm _special){
        widget_special = new QWidget(widget_3);
        layout_special.addWidget(widget_special);
        _special.setupUi(widget_special);
        widget_special.show();
    }
    
    @Override
    public RemoteDBobject getInsertor(){
        switch(combo_tipo.currentIndex()){
            case 0:
                return constructAlbergo();
            case 1:
                return constructMuseo();
            case 2:
                return constructMonumento();
            case 3:
                return constructInfopoint();
            case 4:
                return constructImpianti();
            default:
                return null;
        }
    }
    
    public void select_struttura_specific(){
        if(widget_special != null) widget_special.dispose();
        switch(combo_tipo.currentIndex()){
            case 0:
                set_strut_widget(albergo); 
                break;
            case 1:
                set_strut_widget(museo);
                break;
            case 2:
                set_strut_widget(monumento);
                break;
            case 3:
                set_strut_widget(infopoint);
                break;
            case 4:
                set_strut_widget(impianti);
            default:
                break;
        }
    }
    
    private RemoteDBobject constructMuseo(){
        return new Museo(lineEdit_nome.text(), 
                museo.plainTextEdit_descrizione.toPlainText(),
                museo.lineEdit_telefono.text(), 
                lineEdit_indirizzo.text(),
                lineEdit_orario.text(), 
                dateEdit_apertura.date(), 
                dateEdit_chiusura.date(),
                (Paese)combo_situato.itemData(combo_situato.currentIndex()));
    }
    
    private RemoteDBobject constructMonumento(){
        return new Monumento(lineEdit_nome.text(),
                Integer.decode(monumento.lineEdit_anno.text()),
                monumento.plainTextEdit.toPlainText(),
                lineEdit_indirizzo.text(),
                lineEdit_orario.text(), 
                dateEdit_apertura.date(), 
                dateEdit_chiusura.date(),
                (Paese)combo_situato.itemData(combo_situato.currentIndex()));
    }
    
    private RemoteDBobject constructImpianti(){
        return new ImpiantiRisalita(lineEdit_nome.text(),
                impianti.comboBox_tipologia.currentText(),
                impianti.spinBox_capacita.value(),
                lineEdit_indirizzo.text(),
                lineEdit_orario.text(), 
                dateEdit_apertura.date(), 
                dateEdit_chiusura.date(),
                (Paese)combo_situato.itemData(combo_situato.currentIndex()));
    }
    
    private RemoteDBobject constructInfopoint(){
        return new UfficioInformazioni(lineEdit_nome.text(),
                Integer.decode(infopoint.lineEdit.text()),
                infopoint.lineEdit_telefono.text(),
                lineEdit_indirizzo.text(),
                lineEdit_orario.text(), 
                dateEdit_apertura.date(), 
                dateEdit_chiusura.date(),
                (Paese)combo_situato.itemData(combo_situato.currentIndex()));
    }
    
    private RemoteDBobject constructAlbergo(){
        return new Albergo(lineEdit_nome.text(),
                        Integer.toString(albergo.spinBox_stelle.value()),
                        Integer.decode(albergo.lineEdit_posti.text()),
                        albergo.lineEdit_telefono.text(),
                        lineEdit_indirizzo.text(),
                        lineEdit_orario.text(), 
                        dateEdit_apertura.date(), 
                        dateEdit_chiusura.date(),
                        (Paese)combo_situato.itemData(combo_situato.currentIndex()));
    }

}
