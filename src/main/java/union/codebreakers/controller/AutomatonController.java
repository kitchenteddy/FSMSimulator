package union.codebreakers.controller;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import union.codebreakers.gui.MainFrame;
import union.codebreakers.helper.enums.LabelType;
import union.codebreakers.helper.enums.StateType;
import union.codebreakers.model.ModelLabel;
import union.codebreakers.model.ModelState;
import union.codebreakers.model.State;
import union.codebreakers.view.drawer.stateDrawer.StateDrawer;

/**
 * Controller handling manipulation with automaton
 */
public class AutomatonController  implements KeyListener, MouseListener{
    
    private MainFrame mainFrame = null;
    private static int offset = 5;
    private State selected = null;
    
    /**
     * Sets pointer to main frame
     * 
     * @param frame 
     */
    public void setMainFrame(MainFrame frame){
        this.mainFrame = frame;
    }

    /**
     * Handles mouse clicks on automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mouseClicked(MouseEvent me) {
        int i = me.getButton();
        this.mainFrame.requestFocusInWindow(); 
        switch( me.getButton() ){
            case 1: // left-click
            {
                if( selected == null ) { // no state selected so you can add one
                    
                    int size = this.mainFrame.getMainController().getAutomaton().getCollectionStates().size();
                    ModelLabel ml = new ModelLabel();
                    ml.setName(Integer.toString(size+1));
                    ml.setType(LabelType.eState);
                    StateType type = size == 0 ? StateType.eStart : StateType.eNormal;                

                    if( this.checkWithinBoundaries(me.getPoint(), type)){
                        ModelState ms = new ModelState(type, me.getPoint(), ml, this.mainFrame.getMainController().getAutomaton());
                        this.mainFrame.getMainController().getAutomaton().addState(ms);
                        this.selected = ms;
                        this.mainFrame.getDrawingPlace().repaint();
                    }
                }
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
     * Checks, if the state can be drawn at that position
     * 
     * @param where
     * @param type
     * @return 
     */
    private boolean checkWithinBoundaries(Point where, StateType type){
        boolean result = true;
        Point dim = StateDrawer.getDimensions(type);
        
        if( 
            ( where.x - dim.x/2 < 0 ) ||
            ( where.x + dim.x/2 > this.mainFrame.getDrawingPlace().getWidth() ) ||
            ( where.y - dim.y/2 < 0 ) ||
            ( where.y - dim.y/2 > this.mainFrame.getDrawingPlace().getHeight() )
          ){
            result = false;
        }
        return result;
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

    /**
     * Key was typed
     * 
     * @param ke Information about event
     */
    @Override
    public void keyTyped(KeyEvent ke) {
    }

    /**
     * Key was pressed
     * 
     * @param ke Information about event
     */
    @Override
    public void keyPressed(KeyEvent ke) {
    }

    /**
     * Key was released
     * 
     * @param ke Information about event
     */
    @Override
    public void keyReleased(KeyEvent ke) {
        if( this.selected != null ) {
            switch(ke.getKeyChar()){
                case '1' :
                    this.selected.setType(StateType.eStart);
                    this.mainFrame.getDrawingPlace().repaint();
                    break;
                case '2' :
                    this.selected.setType(StateType.eNormal);
                    this.mainFrame.getDrawingPlace().repaint();
                    break;
                case '3' :
                    this.selected.setType(StateType.eEnd);
                    this.mainFrame.getDrawingPlace().repaint();
                    break;
            }
        }
        
    }
}
