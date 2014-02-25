package union.codebreakers.controller.behavior;

import java.awt.event.MouseEvent;


/**
 * The simplest mouse behavior which accepts MouseBehaviorManager in its constructor.
 * Every mouse behavior have to extend this class
 */
public abstract class MouseBehavior {

    /**
     * Instance of MouseBehaviorManager
     */
    protected MouseBehaviorManager mbm;

    /**
     * Constructor
     * 
     * @param newMbm Instance of MouseBehaviorManager to which this mouse behavior belongs to
     */
    public MouseBehavior(MouseBehaviorManager newMbm) {
        this.mbm = newMbm;
    }

    /**
     * Handles mouse press on automaton
     * 
     * @param me Event that occurred
     */
    public abstract void mousePressed(MouseEvent me);
    
    /**
     * Handles mouse release on automaton
     * 
     * @param me Event that occurred
     */
    public abstract void mouseReleased(MouseEvent me);

    /**
     * Handles mouse leaves on automaton
     * 
     * @param me Event that occurred
     */
    public abstract void mouseExited(MouseEvent me);

    /**
     * Event triggered when mouse is being dragged
     * 
     * @param me Data about event
     */
    public abstract void mouseDragged(MouseEvent me);

    /**
     * Event triggered when mouse is being moved
     * 
     * @param me Data about event
     */
    public abstract void mouseMoved(MouseEvent me);

    /**
     * Handles mouse clicks on automaton
     * 
     * @param me Event that occurred
     */
    public abstract void mouseClicked(MouseEvent me);
}
