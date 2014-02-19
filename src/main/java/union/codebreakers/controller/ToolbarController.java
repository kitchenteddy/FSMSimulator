package union.codebreakers.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import union.codebreakers.gui.MainFrame;

/**
 * Controller handling manipulation with menu
 */
public class ToolbarController implements ActionListener{
    
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
        if( e.getSource() instanceof JButton ) {
            JButton item = (JButton)e.getSource();
            if( item.getName().equals("buttonNew") ){
                this.doNew();
            } else if(item.getName().equals("buttonOpen") ){
                this.doOpen();
            } else if(item.getName().equals("buttonSave")){
                this.doSave();
            } else if(item.getName().equals("buttonSaveAs")){
                this.doSaveAs();
            } else if(item.getName().equals("buttonQuit")){
                this.doQuit();
            }
        }
        this.mainFrame.getDrawingPlace().repaint();
    }

    private void doNew(){
        this.mainFrame.update(this.mainFrame.getGraphicsPainting());
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
