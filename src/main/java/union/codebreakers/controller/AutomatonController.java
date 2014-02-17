package union.codebreakers.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import union.codebreakers.gui.MainFrame;
import union.codebreakers.helper.StateType;
import union.codebreakers.model.ModelState;

/**
 * Controller handling manipulation with automaton
 */
public class AutomatonController  implements ActionListener, MouseListener{
    
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

    /**
     * Handles mouse clicks on automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mouseClicked(MouseEvent me) {
        int i = me.getButton();
        switch( me.getButton() ){
            case 1: // left-click
            {
                ModelState ms = new ModelState();
                ms.setType(StateType.eStart);
                ms.setPos(me.getPoint());
                
                this.mainFrame.getMainController().getAutomaton().addState(ms);
                break;
            }
            case 3: // right-click
            {
                this.mainFrame.runPersonal();
                break;
            }
        }
    }

    /**
     * Handles mouse press on automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mousePressed(MouseEvent me) {
    }

    /**
     * Handles mouse release on automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mouseReleased(MouseEvent me) {
    }

    /**
     * Handles mouse enters on automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mouseEntered(MouseEvent me) {
    }

    /**
     * Handles mouse leaves on automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mouseExited(MouseEvent me) {
    }
}
