package parcodb;

import parcodb.gui.MainGUI;

/**
 *
 * @author matteo
 */
public class ParcoDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        MainGUI gui = new MainGUI(args);
        gui.SetupUi();
        gui.exec();
    }

}
