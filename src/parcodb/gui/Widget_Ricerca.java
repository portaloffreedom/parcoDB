package parcodb.gui;

import com.trolltech.qt.QUiForm;
import com.trolltech.qt.gui.QWidget;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import parcodb.database.objects.Albergo;
import parcodb.database.objects.Caratteristica;
import parcodb.database.objects.Fiume;
import parcodb.database.objects.ImpiantiRisalita;
import parcodb.database.objects.Iniziativa;
import parcodb.database.objects.Lago;
import parcodb.database.objects.Monte;
import parcodb.database.objects.Monumento;
import parcodb.database.objects.Museo;
import parcodb.database.objects.Paese;
import parcodb.database.objects.Struttura;
import parcodb.database.objects.UfficioInformazioni;
import parcodb.database.objects.Zona;
import parcodb.gui.builders.Ui_widget_ricerca_common;

/**
 *
 * @author stengun
 */
public class Widget_Ricerca extends Widget_Centrale{

    Ui_widget_ricerca_common ric_com;
    Macro_widget_struttura strut_com;
    Macro_widget_caratteristica car_com;
    Macro_widget_comune comune_com;
    Macro_widget_iniziativa ini_com;
    Macro_widget_sentieri sent_com;
    Macro_widget_tappa tappa_com;
    Zona tipo;
    
    
    public Widget_Ricerca(MainGUI mainui) {
        super(mainui);
        ric_com = new Ui_widget_ricerca_common();
        strut_com = new Macro_widget_struttura();
        ini_com = new Macro_widget_iniziativa();
        car_com = new Macro_widget_caratteristica();
        sent_com = new Macro_widget_sentieri();
        tappa_com = new Macro_widget_tappa();
        comune_com = new Macro_widget_comune();
    }
    
    @Override
    public void setupUi(QWidget widget_ricerca){
        super.setupUi(widget_ricerca);
        ric_com.setupUi(this.widget_common);
        ric_com.widget_3.hide();
    }
    
    @Override
    protected void set_caratteristica() {
        String messaggio = "Ricerca terminata.";
        toggle_button(bottone_terreno);
        ric_com.listWidget_trovati.clear();
        ric_com.widget_common.dispose();
        ric_com.listWidget_trovati.itemClicked.disconnect();
        ric_com.listWidget_trovati.itemClicked.connect(this, "setupCar()");
        car_com.combo_tipo.setEnabled(false);
        try {
            maiunui.popolaListaCaratt(ric_com.listWidget_trovati);
        } catch (SQLException ex) {
            Logger.getLogger(Widget_Ricerca.class.getName()).log(Level.SEVERE, null, ex);
            messaggio = "Errore nella ricezione dei terreni dal Database";
        } finally {
            MainGUI.statusMessage(messaggio);
        }        
    }

    @Override
    protected void set_struttura() {
        String messaggio = "Ricerca terminata.";
        toggle_button(bottone_struttura);
        ric_com.listWidget_trovati.clear();
        ric_com.widget_common.dispose();
        ric_com.listWidget_trovati.itemClicked.disconnect();
        ric_com.listWidget_trovati.itemClicked.connect(this, "setupStrut()");
        strut_com.combo_tipo.setEnabled(false);        
        try {
            maiunui.popolaListaStrutture(ric_com.listWidget_trovati);
        } catch (SQLException ex) {
            Logger.getLogger(Widget_Ricerca.class.getName()).log(Level.SEVERE, null, ex);
            messaggio = "Errore nella ricezione delle strutture dal Database";
        } finally {
            MainGUI.statusMessage(messaggio);
        }
    }

    @Override
    protected void set_iniziativa() {
        String messaggio = "Ricerca terminata.";
        toggle_button(bottone_iniziativa);
        ric_com.listWidget_trovati.clear();
        ric_com.widget_common.dispose();
        ric_com.listWidget_trovati.itemClicked.disconnect();
        ric_com.listWidget_trovati.itemClicked.connect(this, "setupIniz()");
        try {
            maiunui.popolaListaIniziative(ric_com.listWidget_trovati);
        } catch (SQLException ex) {
            Logger.getLogger(Widget_Ricerca.class.getName()).log(Level.SEVERE, null, ex);
            messaggio = "Errore nella ricezione delle iniziative dal Database";
        } finally {
            MainGUI.statusMessage(messaggio);
        }
    }

    @Override
    protected void set_tappa() {
        String messaggio = "Ricerca terminata.";
        toggle_button(bottone_tappa);
        ric_com.listWidget_trovati.clear();
        ric_com.widget_common.dispose();
        ric_com.listWidget_trovati.itemClicked.disconnect();
        ric_com.listWidget_trovati.itemClicked.connect(this, "setupTappa()");
        try {
            maiunui.popolaListaTappe(ric_com.listWidget_trovati);
        } catch (SQLException ex) {
            Logger.getLogger(Widget_Ricerca.class.getName()).log(Level.SEVERE, null, ex);
            messaggio = "Errore nella ricezione delle tappe dal Database";
        } finally {
            MainGUI.statusMessage(messaggio);
        }
    }

    @Override
    protected void set_sentiero() {
        String messaggio = "Ricerca terminata.";
        toggle_button(bottone_sentiero);
        ric_com.listWidget_trovati.clear();
        ric_com.widget_common.dispose();
        ric_com.listWidget_trovati.itemClicked.disconnect();
        ric_com.listWidget_trovati.itemClicked.connect(this, "setupSent()");
        try {
            maiunui.popolaListaSentieri(ric_com.listWidget_trovati);
        } catch (SQLException ex) {
            Logger.getLogger(Widget_Ricerca.class.getName()).log(Level.SEVERE, null, ex);
            messaggio = "Errore nella ricezione dei sentieri dal Database";
        } finally {
            MainGUI.statusMessage(messaggio);
        }
    }

    @Override
    protected void set_comune() {
        String messaggio = "Ricerca terminata.";
        toggle_button(bottone_comune);
        ric_com.listWidget_trovati.clear();
        ric_com.widget_common.dispose();
        ric_com.listWidget_trovati.itemClicked.disconnect();
        ric_com.listWidget_trovati.itemClicked.connect(this, "setupCom()");
        try {
            maiunui.popolaListaComune(ric_com.listWidget_trovati);
        } catch (SQLException ex) {
            Logger.getLogger(Widget_Ricerca.class.getName()).log(Level.SEVERE, null, ex);
            messaggio = "Errore nella ricezione dei comuni dal Database";
        } finally {
            MainGUI.statusMessage(messaggio);
        }
    }

    @Override
    protected void showdialog() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void inserisci() {
        modifica();
    }
    
    private void modifica(){
        
    }
    
    private void setup_common(QUiForm _form){
        QWidget widg_strut  = new QWidget(ric_com.widget);
        _form.setupUi(widg_strut);
        ric_com.widget_common.dispose();
        ric_com.widget_common = widg_strut;
        ric_com.layout_special.insertWidget(0,ric_com.widget_common);
    }
    
    private void setupStrut(){
        setup_common(strut_com);
        Struttura selezionato = (Struttura)ric_com.listWidget_trovati.currentItem().data(0);
        strut_com.lineEdit_nome.setText(selezionato.getNome());
        strut_com.lineEdit_indirizzo.setText(selezionato.getIndirizzo());        
        strut_com.lineEdit_orario.setText(selezionato.getOrario_apertura());        
        strut_com.dateEdit_apertura.setDate(selezionato.getQPeriodo_inizio());       
        strut_com.dateEdit_chiusura.setDate(selezionato.getQPeriodo_fine());
        try {
            maiunui.popolaComboPaesi(strut_com.combo_situato);
        } catch (SQLException ex) {
            Logger.getLogger(Widget_Ricerca.class.getName()).log(Level.SEVERE, null, ex);
        }
        Paese paese = (Paese)selezionato.getPaese();
        int index = strut_com.combo_situato.findText(paese.getNome());
        strut_com.combo_situato.setCurrentIndex(index);
        enable_common(false,0);
        selectStruttura(selezionato);
   }
    
    private void setupCar(){
        setup_common(car_com);
        Caratteristica selezionato = (Caratteristica)ric_com.listWidget_trovati.currentItem().data(0);
        car_com.lineEdit_nome.setText(selezionato.getNome());
        selectCaratteristica(selezionato);
        enable_common(false, 2);
    }
    
    private void setupIniz(){
        setup_common(ini_com);
        Iniziativa selezionato = (Iniziativa)ric_com.listWidget_trovati.currentItem().data(0);
        int index = ini_com.combo_iniziativa.findText(selezionato.getTipo());
        ini_com.combo_iniziativa.setCurrentIndex(index);
        ini_com.lineEdit_nome.setText(selezionato.getNome());
        ini_com.plainText_descrizione.setPlainText(selezionato.getDettagli());
        index = ini_com.combo_paese.findText(selezionato.getPaese().getNome());
        ini_com.combo_paese.setCurrentIndex(index);
        enable_common(false, 1);
    }

    private void setupTappa(){
        setup_common(tappa_com);
        enable_common(false, 3);
    }
    
    private void setupSent(){
        setup_common(sent_com);
        enable_common(false, 4);
    }
    
    private void setupCom(){
        setup_common(comune_com);
        enable_common(false, 5);
    }
    
    private void selectStruttura(Struttura selezione){

        if(selezione.getClass() == UfficioInformazioni.class){
            UfficioInformazioni infop = (UfficioInformazioni)selezione;
            strut_com.combo_tipo.setCurrentIndex(3);
            strut_com.infopoint.lineEdit_telefono.setText(infop.getTelefono());
            strut_com.infopoint.lineEdit.setText(Integer.toString(infop.getNumero()));
            enable_strut_specific(false,3);
            return;
        }
        if(selezione.getClass() == Albergo.class){
            Albergo alb = (Albergo)selezione;
            strut_com.combo_tipo.setCurrentIndex(0);
            strut_com.albergo.lineEdit_posti.setText(Integer.toString(alb.getNumero_posti()));
            strut_com.albergo.lineEdit_telefono.setText(alb.getTelefono());
            strut_com.albergo.spinBox_stelle.setValue(alb.getCategoria());
            enable_strut_specific(false,0);
            return;
        }
        if(selezione.getClass() == Museo.class){
            Museo mus = (Museo)selezione;
            strut_com.museo.lineEdit_telefono.setText(mus.getTelefono());
            strut_com.museo.plainTextEdit_descrizione.setPlainText(mus.getDescrizione());
            enable_strut_specific(false, 1);
            return;
        }
        if(selezione.getClass() == Monumento.class){
            Monumento mon = (Monumento)selezione;
            strut_com.monumento.lineEdit_anno.setText(Integer.toString(mon.getAnno()));
            strut_com.monumento.plainTextEdit.setPlainText(mon.getDescrizione());
            enable_strut_specific(false, 2);
            return;
        }
        if(selezione.getClass() == ImpiantiRisalita.class){
            ImpiantiRisalita impi = (ImpiantiRisalita)selezione;
            strut_com.impianti.spinBox_capacita.setValue(impi.getCapacita());
            int index = strut_com.impianti.comboBox_tipologia.findText(impi.getTipologia());
            strut_com.impianti.comboBox_tipologia.setCurrentIndex(index);
            enable_strut_specific(false, 4);
            
        }
    }
    
    private void selectCaratteristica(Caratteristica selezione){
        if(selezione.getClass() == Monte.class){
            Monte monte = (Monte)selezione;
            car_com.combo_tipo.setCurrentIndex(0);
            car_com.combo_tipo.currentIndexChanged.emit(car_com.combo_tipo.currentIndex());
            car_com.monte_wdg.spinBox_altitudine.setValue(monte.getAltitudine());
            enable_car_specific(false, 0);
            return;
        }
        if(selezione.getClass() == Fiume.class){
            Fiume fiume = (Fiume)selezione;
            car_com.combo_tipo.setCurrentIndex(1);
            car_com.fiume_wdg.checkBox_navigabile.setChecked(fiume.getNavigabile());
            car_com.fiume_wdg.lineEdit_lunghezza.setText(Float.toString(fiume.getLunghezza()));
            enable_car_specific(false, 1);
            return;
        }
        if(selezione.getClass() == Lago.class){
            Lago lago = (Lago)selezione;
            car_com.combo_tipo.setCurrentIndex(2);
            car_com.lago_wdg.lineEdit.setText(Float.toString(lago.getEstensione()));
            enable_car_specific(false, 2);
            return;
        }
        if(selezione.getClass() == Paese.class){
            Paese paese = (Paese)selezione;
            car_com.combo_tipo.setCurrentIndex(3);
            car_com.paese_wdg.lineEdit_cap.setText(Integer.toString(paese.getCAP()));
            car_com.paese_wdg.spinBox_abitanti.setValue(paese.getAbitanti());
            enable_car_specific(false, 3);
        }
    }
    
    private void enable_car_specific(boolean _bool,int tipo){
        switch(tipo){
            case 0:
                car_com.monte_wdg.spinBox_altitudine.setEnabled(_bool);
                return;
            case 1:
                car_com.fiume_wdg.checkBox_navigabile.setEnabled(_bool);
                car_com.fiume_wdg.lineEdit_lunghezza.setEnabled(_bool);
                return;
            case 2:
                car_com.lago_wdg.lineEdit.setEnabled(_bool);
                return;
            case 3:
                car_com.paese_wdg.lineEdit_cap.setEnabled(_bool);
                car_com.paese_wdg.spinBox_abitanti.setEnabled(_bool);
            default:
                break;
        }
    }
    
    private void enable_strut_specific(boolean _bool,int tipo){
        switch(tipo){
            case 0:
                strut_com.albergo.lineEdit_posti.setEnabled(_bool);
                strut_com.albergo.lineEdit_telefono.setEnabled(_bool);
                strut_com.albergo.spinBox_stelle.setEnabled(_bool);
                return;
            case 1:
                strut_com.museo.lineEdit_telefono.setEnabled(_bool);
                strut_com.museo.plainTextEdit_descrizione.setEnabled(_bool);
                return;
            case 2:
                strut_com.monumento.lineEdit_anno.setEnabled(_bool);
                strut_com.monumento.plainTextEdit.setEnabled(_bool);
                return;
            case 3:
                strut_com.infopoint.lineEdit_telefono.setEnabled(_bool);
                strut_com.infopoint.lineEdit.setEnabled(_bool);
                return;
            case 4:
                strut_com.impianti.comboBox_tipologia.setEnabled(_bool);
                strut_com.impianti.spinBox_capacita.setEnabled(_bool);
            default:
                break;
        }
    }
    
    private void enable_common(boolean _bool,int tipo){
        switch(tipo){
            case 0:
                strut_com.lineEdit_nome.setEnabled(_bool);
                strut_com.lineEdit_indirizzo.setEnabled(_bool);
                strut_com.lineEdit_orario.setEnabled(_bool);
                strut_com.dateEdit_apertura.setEnabled(_bool);
                strut_com.dateEdit_chiusura.setEnabled(_bool);
                strut_com.combo_situato.setEnabled(_bool);
                return;
            case 1:
                ini_com.combo_iniziativa.setEnabled(_bool);
                ini_com.combo_paese.setEnabled(_bool);
                ini_com.lineEdit_nome.setEnabled(_bool);
                ini_com.plainText_descrizione.setEnabled(_bool);
                ini_com.spinBox.setEnabled(_bool);
                return;
            case 2:
                car_com.lineEdit_nome.setEnabled(_bool);
                car_com.listWidget_comune.setEnabled(_bool);
                car_com.listWidget_tappe.setEnabled(_bool);
                car_com.lista_vicinanza.setEnabled(_bool);
                return;
            case 3:
                tappa_com.comboBox_fine.setEnabled(_bool);
                tappa_com.comboBox_inizio.setEnabled(_bool);
                tappa_com.lineEdit_lunghezza.setEnabled(_bool);
                tappa_com.list_interesse.setEnabled(_bool);
                return;
            case 4:
                sent_com.listWidget.setEnabled(_bool);
                sent_com.spinBox.setEnabled(_bool);
                return;
            case 5:
                comune_com.scrollAreaWidgetContents.setEnabled(_bool);
                comune_com.lineEdit_nome.setEnabled(_bool);
                comune_com.lineEdit__provincia.setEnabled(_bool);
                comune_com.lineEdit_superficie.setEnabled(_bool);
            default:
                break;
        }
    }
    
}
