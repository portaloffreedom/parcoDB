package parcodb.gui;

import com.trolltech.qt.QUiForm;
import com.trolltech.qt.gui.QWidget;
import parcodb.database.objects.RemoteDBobject;

/**
 *
 * @author stengun
 */
public interface Insertor{
    
    abstract RemoteDBobject getInsertor();
}
