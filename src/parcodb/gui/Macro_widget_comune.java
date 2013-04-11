package parcodb.gui;

import com.trolltech.qt.gui.QLineEdit;
import com.trolltech.qt.gui.QWidget;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import parcodb.database.objects.Clima;
import parcodb.database.objects.Comune;
import parcodb.database.objects.RemoteDBobject;
import parcodb.gui.builders.Ui_widget_comune;

/**
 *
 * @author stengun
 */
public class Macro_widget_comune extends Ui_widget_comune implements Insertor{

    public ArrayList<QLineEdit>[] listawidget;
    private String[] listamesi = {
        "Gennaio",
        "Febbraio",
        "Marzo",
        "Aprile",
        "Maggio",
        "Giugno",
        "Luglio",
        "Agosto",
        "Settembre",
        "Ottobre",
        "Novembre",
        "Dicembre"};
    
    @Override
    public void setupUi(QWidget widget_comune){
        super.setupUi(widget_comune);
        listawidget = new ArrayList[12];
        for(int i=0;i<12;i++) listawidget[i] = new ArrayList<>();
        listawidget[0].add(lineEdit__tempGEN);
        listawidget[0].add(lineEdit_umiGEN);
        listawidget[0].add(lineEdit_pioGEN);
        listawidget[1].add(lineEdit_tempFEB);
        listawidget[1].add(lineEdit_umiFEB);
        listawidget[1].add(lineEdit_pioFEB);
        listawidget[2].add(lineEdit_tempMAR);
        listawidget[2].add(lineEdit_umiMAR);
        listawidget[2].add(lineEdit_pioMAR);
        listawidget[3].add(lineEdit_tempAPR);
        listawidget[3].add(lineEdit_umiAPR);
        listawidget[3].add(lineEdit_pioAPR);
        listawidget[4].add(lineEdit_tempMAG);
        listawidget[4].add(lineEdit_umiMAG);
        listawidget[4].add(lineEdit_pioMAG);
        listawidget[5].add(lineEdit_tempGIU);
        listawidget[5].add(lineEdit_umiGIU);
        listawidget[5].add(lineEdit_pioGIU);
        listawidget[6].add(lineEdit_tempLUG);
        listawidget[6].add(lineEdit_umiLUG);
        listawidget[6].add(lineEdit_pioLUG);
        listawidget[7].add(lineEdit_tempAGO);
        listawidget[7].add(lineEdit_umiAGO);
        listawidget[7].add(lineEdit_pioAGO);
        listawidget[8].add(lineEdit_tempSET);
        listawidget[8].add(lineEdit_umiSET);
        listawidget[8].add(lineEdit_pioSET);
        listawidget[9].add(lineEdit_tempOTT);
        listawidget[9].add(lineEdit_umiOTT);
        listawidget[9].add(lineEdit_pioOTT);
        listawidget[10].add(lineEdit_tempNOV);
        listawidget[10].add(lineEdit_umiNOV);
        listawidget[10].add(lineEdit_pioNOV);
        listawidget[11].add(lineEdit_tempDIC);
        listawidget[11].add(lineEdit_umiDIC);
        listawidget[11].add(lineEdit_pioDIC);
        for(String mese:listamesi){
            comboBox_mesi.addItem(mese);
        }
        comboBox_mesi.hide();
    }
    
    @Override
    public List<RemoteDBobject> getInsertor() {
        Comune comune = null;
        try {
            comune = new Comune(lineEdit_nome.text(), 
                    lineEdit__provincia.text(), 
                    Float.parseFloat(lineEdit_superficie.text()),
                    creaClimi());
        } catch (Exception ex) {
            Logger.getLogger(Macro_widget_comune.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<RemoteDBobject> lista = new ArrayList<>();
        lista.add(comune);
        return lista;
    }
    
    public void collegaSegnali(boolean _bool)
    {
        if(_bool)
        {
            comboBox_mesi.currentIndexChanged.connect(this, "cambiaWidget()");
        }
        else
        {
            comboBox_mesi.currentIndexChanged.disconnect();
        }
    }
    
    private void cambiaWidget(){
        
        widget_special.hide();
        switch(comboBox_mesi.currentIndex()){
            case 0:
                widget_special = widget_GEN;
                layout_mesi.insertWidget(1, widget_special);
                break;
            case 1:
                widget_special = widget_FEB;
                layout_mesi.insertWidget(1, widget_special);
                break;
            case 2:
                widget_special = widget_MAR;
                layout_mesi.insertWidget(1, widget_special);
                break;
            case 3:
                widget_special = widget_APR;
                layout_mesi.insertWidget(1, widget_special);
                break;
            case 4:
                widget_special = widget_MAG;
                layout_mesi.insertWidget(1, widget_special);
                break;
            case 5:
                widget_special = widget_GIU;
                layout_mesi.insertWidget(1, widget_special);
                break;
            case 6:
                widget_special = widget_LUG;
                layout_mesi.insertWidget(1, widget_special);
                break;
            case 7:
                widget_special = widget_AGO;
                layout_mesi.insertWidget(1, widget_special);
                break;
            case 8:
                widget_special = widget_SET;
                layout_mesi.insertWidget(1, widget_special);
                break;
            case 9:
                widget_special = widget_OTT;
                layout_mesi.insertWidget(1, widget_special);
                break;
            case 10:
                widget_special = widget_NOV;
                layout_mesi.insertWidget(1, widget_special);
                break;
            case 11:
                widget_special = widget_DIC;
                layout_mesi.insertWidget(1, widget_special);
                break;
            default:
                break;
        }
        widget_special.setEnabled(false);
        widget_special.show();
    }
    private Clima[] creaClimi() throws Exception {
        Clima[] climi = new Clima[12];
        for(int i = 0;i<12;i++){
        climi[i] = new Clima(i+1,
                Float.parseFloat(((QLineEdit)listawidget[i].get(0)).text()), 
                Float.parseFloat(((QLineEdit)listawidget[i].get(1)).text()), 
                Float.parseFloat(((QLineEdit)listawidget[i].get(2)).text()));
        }
        return climi;
    }
    
}
