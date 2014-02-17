package union.codebreakers.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import union.codebreakers.gui.MainFrame;

/**
 * Controller handling manipulation with menu
 */
public class MenuController implements ActionListener{
    
    private MainFrame mainFrame = null;

    /**
     * Sets pointer to main frame
     * 
     * @param frame 
     */
    public void setMainFrame(MainFrame frame){
        this.mainFrame = frame;
    }

    /**
     * Handles events which occur in menu
     * 
     * @param e Event that occurred
     */
    @Override
    public void actionPerformed(ActionEvent e){
        if( e.getSource() instanceof JMenuItem ) {
//            if(e.get)
            JMenuItem item = (JMenuItem)e.getSource();
            if( item.getName().equals("menuitemNew") ){
                this.doNew();
            } else if(item.getName().equals("menuitemOpen") ){
                this.doOpen();
            } else if(item.getName().equals("menuitemSave")){
                this.doSave();
            } else if(item.getName().equals("menuitemSaveAs")){
                this.doSaveAs();
            } else if(item.getName().equals("menuitemQuit")){
                this.doQuit();
            }
        }
    }

    private void doNew(){
        
    }

    private void doOpen(){
        
    }
    private void doSave(){
        
    }

    private void doSaveAs(){
        
    }
    
    private void doQuit(){
        System.exit(0);
    }
}
