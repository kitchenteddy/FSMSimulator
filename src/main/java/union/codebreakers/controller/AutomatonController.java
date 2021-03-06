package union.codebreakers.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import union.codebreakers.gui.MainFrame;
import union.codebreakers.helper.Container;
import union.codebreakers.helper.enums.KeyboardBehaviorType;
import union.codebreakers.helper.enums.MouseBehaviorType;

/**
 * Controller handling manipulation with automaton
 */
public class AutomatonController  implements KeyListener, MouseListener, MouseMotionListener {
    
    private MainFrame mainFrame = null;
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
        if( this.container.getMouseBehaviorManager().getCurrentType() != MouseBehaviorType.eUnspecified ){
            boolean repaint = this.container.getMouseBehaviorManager().getCurrentBehavior().mouseClicked(me);
        }
        
        if( me.getButton() == 3 ){
            this.mainFrame.runPersonal();
        }
    }

    /**
     * Handles mouse press on automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mousePressed(MouseEvent me) {
        //System.out.println(this.container.getKeyboardBehaviorManager().getCurrentBehavior().toString());
        //System.out.println(this.container.getKeyboardBehaviorManager().getCurrentType().name());
        if( this.container.getMouseBehaviorManager().getCurrentType() != MouseBehaviorType.eUnspecified ){
            boolean repaint = this.container.getMouseBehaviorManager().getCurrentBehavior().mousePressed(me);
        }
    }

    /**
     * Handles mouse release on automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mouseReleased(MouseEvent me) {
        if( this.container.getMouseBehaviorManager().getCurrentType() != MouseBehaviorType.eUnspecified ){
            boolean repaint = this.container.getMouseBehaviorManager().getCurrentBehavior().mouseReleased(me);
        }
    }

    /**
     * Handles mouse enters on automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mouseEntered(MouseEvent me) {
        if( this.container.getMouseBehaviorManager().getCurrentType() != MouseBehaviorType.eUnspecified ){
            boolean repaint = this.container.getMouseBehaviorManager().getCurrentBehavior().mouseEntered(me);
        }
    }

    /**
     * Handles mouse leaves on automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mouseExited(MouseEvent me) {
        if( this.container.getMouseBehaviorManager().getCurrentType() != MouseBehaviorType.eUnspecified ){
            boolean repaint = this.container.getMouseBehaviorManager().getCurrentBehavior().mouseExited(me);
        }
    }
    /**
     * Key was pressed
     * 
     * @param ke Information about event
     */
    @Override
    public void keyTyped(KeyEvent ke) {
        
        if( this.container.getKeyboardBehaviorManager().getCurrentType() != KeyboardBehaviorType.eUnspecified ){
            boolean repaint = this.container.getKeyboardBehaviorManager().getCurrentBehavior().keyTyped(ke);
        }
    }

    /**
     * Key was pressed
     * 
     * @param ke Information about event
     */
    @Override
    public void keyPressed(KeyEvent ke) {
        //System.out.println(this.container.getKeyboardBehaviorManager().getCurrentType().name());
        if( this.container.getKeyboardBehaviorManager().getCurrentType() != KeyboardBehaviorType.eUnspecified ){
            boolean repaint = this.container.getKeyboardBehaviorManager().getCurrentBehavior().keyPressed(ke);
        }
    }

    /**
     * Key was released
     * 
     * @param ke Information about event
     */
    @Override
    public void keyReleased(KeyEvent ke) {
        if( this.container.getKeyboardBehaviorManager().getCurrentType() != KeyboardBehaviorType.eUnspecified ){
            boolean repaint = this.container.getKeyboardBehaviorManager().getCurrentBehavior().keyReleased(ke);
        }
    }

    /**
     * Event triggered when mouse is being dragged
     * 
     * @param me Data about event
     */
    @Override
    public void mouseDragged(MouseEvent me) {
        if( this.container.getMouseBehaviorManager().getCurrentType() != MouseBehaviorType.eUnspecified ){
            boolean repaint = this.container.getMouseBehaviorManager().getCurrentBehavior().mouseDragged(me);
        }
    }

    /**
     * Event triggered when mouse is being moved
     * 
     * @param me Data about event
     */
    @Override
    public void mouseMoved(MouseEvent me) {
        if( this.container.getMouseBehaviorManager().getCurrentType() != MouseBehaviorType.eUnspecified ){
            boolean repaint = this.container.getMouseBehaviorManager().getCurrentBehavior().mouseMoved(me);
        }
    }
    
}
