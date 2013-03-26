package parcodb.gui;

/**
 *
 * @author stengun
 */
public class Widget_Ricerca extends Widget_Centrale{

    public Widget_Ricerca(MainGUI mainui) {
        super(mainui);
    }

    @Override
    protected void set_caratteristica() {
        toggle_button(bottone_terreno);
    }

    @Override
    protected void set_struttura() {
        toggle_button(bottone_struttura);
    }

    @Override
    protected void set_iniziativa() {
        toggle_button(bottone_iniziativa);
    }

    @Override
    protected void set_tappa() {
        toggle_button(bottone_tappa);
    }

    @Override
    protected void set_sentiero() {
        toggle_button(bottone_sentiero);
    }

    @Override
    protected void set_comune() {
        toggle_button(bottone_comune);
    }

    @Override
    protected void showdialog() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void inserisci() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
