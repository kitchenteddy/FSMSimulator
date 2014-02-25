package union.codebreakers.controller;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.*;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.List;
import union.codebreakers.gui.MainFrame;
import union.codebreakers.helper.Container;
import union.codebreakers.helper.enums.KeyboardBehaviorType;
import union.codebreakers.helper.enums.LabelType;
import union.codebreakers.helper.enums.MouseBehaviorType;
import union.codebreakers.helper.enums.OperationType;
import union.codebreakers.helper.enums.StateType;
import union.codebreakers.model.Collidable;
import union.codebreakers.model.Label;
import union.codebreakers.model.ModelLabel;
import union.codebreakers.model.ModelState;
import union.codebreakers.model.State;
import union.codebreakers.view.drawer.stateDrawer.StateDrawer;

/**
 * Controller handling manipulation with automaton
 */
public class AutomatonController  implements KeyListener, MouseListener, MouseMotionListener{
    
    private MainFrame mainFrame = null;
    private static int offset = 5;
    private State selected = null;
    private Collidable hit = null;
    private OperationType operation = OperationType.eNone;
    private Container container;
    
    /**
     * Sets pointer to main frame
     * 
     * @param frame 
     */
    public void setMainFrame(MainFrame frame){
        this.mainFrame = frame;
    }
    
    /**
     * Sets container for this controller
     * 
     * @param c Instance of container
     */
    public void setContainer(Container c){
        this.container = c;
    }

    /**
     * Handles mouse clicks on automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mouseClicked(MouseEvent me) {
        if( this.mainFrame.getContainer().getMouseBehaviorManager().getCurrentType() != MouseBehaviorType.eUnspecified ){
            this.mainFrame.getContainer().getMouseBehaviorManager().getCurrentBehavior().mouseClicked(me);
        }
    }

    /**
     * Handles mouse press on automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mousePressed(MouseEvent me) {
        if( this.mainFrame.getContainer().getMouseBehaviorManager().getCurrentType() != MouseBehaviorType.eUnspecified ){
            this.mainFrame.getContainer().getMouseBehaviorManager().getCurrentBehavior().mousePressed(me);
        }
    }

    /**
     * Handles mouse release on automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mouseReleased(MouseEvent me) {
        if( this.mainFrame.getContainer().getMouseBehaviorManager().getCurrentType() != MouseBehaviorType.eUnspecified ){
            this.mainFrame.getContainer().getMouseBehaviorManager().getCurrentBehavior().mouseReleased(me);
        }
    }

    /**
     * Handles mouse enters on automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mouseEntered(MouseEvent me) {
        if( this.mainFrame.getContainer().getMouseBehaviorManager().getCurrentType() != MouseBehaviorType.eUnspecified ){
            this.mainFrame.getContainer().getMouseBehaviorManager().getCurrentBehavior().mouseEntered(me);
        }
    }

    /**
     * Handles mouse leaves on automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mouseExited(MouseEvent me) {
        if( this.mainFrame.getContainer().getMouseBehaviorManager().getCurrentType() != MouseBehaviorType.eUnspecified ){
            this.mainFrame.getContainer().getMouseBehaviorManager().getCurrentBehavior().mouseExited(me);
        }
    }

    /**
     * Key was typed
     * 
     * @param ke Information about event
     */
    @Override
    public void keyTyped(KeyEvent ke) {
        if( this.mainFrame.getContainer().getKeyboardBehaviorManager().getCurrentType() != KeyboardBehaviorType.eUnspecified ){
            this.mainFrame.getContainer().getKeyboardBehaviorManager().getCurrentBehavior().keyTyped(ke);
        }
    }

    /**
     * Key was pressed
     * 
     * @param ke Information about event
     */
    @Override
    public void keyPressed(KeyEvent ke) {
        if( this.mainFrame.getContainer().getKeyboardBehaviorManager().getCurrentType() != KeyboardBehaviorType.eUnspecified ){
            this.mainFrame.getContainer().getKeyboardBehaviorManager().getCurrentBehavior().keyPressed(ke);
        }
    }

    /**
     * Key was released
     * 
     * @param ke Information about event
     */
    @Override
    public void keyReleased(KeyEvent ke) {
        if( this.mainFrame.getContainer().getKeyboardBehaviorManager().getCurrentType() != KeyboardBehaviorType.eUnspecified ){
            this.mainFrame.getContainer().getKeyboardBehaviorManager().getCurrentBehavior().keyReleased(ke);
        }
    }

    /**
     * Event triggered when mouse is being dragged
     * 
     * @param me Data about event
     */
    @Override
    public void mouseDragged(MouseEvent me) {
        if( this.mainFrame.getContainer().getMouseBehaviorManager().getCurrentType() != MouseBehaviorType.eUnspecified ){
            this.mainFrame.getContainer().getMouseBehaviorManager().getCurrentBehavior().mouseDragged(me);
        }
/*        
        if(this.selected != null) {
            this.selected.setPos(me.getPoint());
            this.mainFrame.getDrawingPlace().repaint();
        }
*/        
    }

    /**
     * Event triggered when mouse is being moved
     * 
     * @param me Data about event
     */
    @Override
    public void mouseMoved(MouseEvent me) {
        if( this.mainFrame.getContainer().getMouseBehaviorManager().getCurrentType() != MouseBehaviorType.eUnspecified ){
            this.mainFrame.getContainer().getMouseBehaviorManager().getCurrentBehavior().mouseMoved(me);
        }
    }
}
