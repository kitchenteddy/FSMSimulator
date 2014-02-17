package union.codebreakers.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import union.codebreakers.gui.MainFrame;

/**
 * Controller handling manipulation with automaton
 */
public class AutomatonController  implements ActionListener{
    
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
        
    }
}
