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

    ArrayList<QLineEdit>[] listawidget;
    
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
