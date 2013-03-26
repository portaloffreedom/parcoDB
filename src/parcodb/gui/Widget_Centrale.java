package parcodb.gui;

import com.trolltech.qt.QUiForm;
import com.trolltech.qt.gui.*;
import parcodb.database.objects.RemoteDBobject;

public abstract class Widget_Centrale extends parcodb.gui.builders.Ui_widget_inserimento
{
    protected QMainWindow qMainWindow;
    protected MainGUI maiunui;
    protected RemoteDBobject insertor;
    public Widget_Centrale(MainGUI mainui)
    {
        super();
        this.maiunui = mainui;
        this.qMainWindow = mainui.qMainWindow;
    }
    
    @Override
    public void setupUi(QWidget widget_inserimento){
        super.setupUi(widget_inserimento);
        this.set_signals();
    }
    
    protected void set_signals(){
        this.bottone_struttura.clicked.connect(this, "set_struttura()");
        this.bottone_iniziativa.clicked.connect(this, "set_iniziativa()");
        this.bottone_terreno.clicked.connect(this, "set_caratteristica()");
        this.bottone_sentiero.clicked.connect(this, "set_sentiero()");
        this.bottone_tappa.clicked.connect(this, "set_tappa()");
        this.bottone_comune.clicked.connect(this, "set_comune()");
    }
 
    // widget changer   
    
    protected void set_central_widget(QUiForm _special){
        if(this.widget_common != null ) this.widget_common.dispose();
        this.widget_common = new QWidget(this.widget_selection);
        this.layout_special.insertWidget(0,this.widget_common);
        _special.setupUi(this.widget_common);
        this.widget_common.show();
    }
    
    private void bottoni_untoggle(){
        this.bottone_comune.setChecked(false);
        this.bottone_struttura.setChecked(false);
        this.bottone_sentiero.setChecked(false);
        this.bottone_inserisci.setChecked(false);
        this.bottone_iniziativa.setChecked(false);
        this.bottone_tappa.setChecked(false);
        this.bottone_terreno.setChecked(false);
    }
    
    protected void toggle_button(QPushButton bottone){
        bottoni_untoggle();
        bottone.setChecked(true);
    }
    
    /*
     * Funzioni che vengono chiamate dai click di alcuni bottoni
     * Tutti segnali astratti da fare implementare poi ai widget specifici
     */
    abstract void showdialog();
    
    abstract void set_caratteristica();
        
    abstract void set_struttura();
    
    abstract void set_iniziativa();
    
    abstract void set_tappa();
    
    abstract void set_sentiero();
    
    abstract void set_comune();
    
    abstract void inserisci();
}

