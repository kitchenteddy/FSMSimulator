package union.codebreakers.controller.behaviorManager.mouseBehavior;

import union.codebreakers.controller.behaviorManager.MouseBehaviorManager;
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
     * 
     * @return Whether the drawing area should be repainted
     */
    public abstract boolean mousePressed(MouseEvent me);
    
    /**
     * Handles mouse release on automaton
     * 
     * @param me Event that occurred
     * @return Whether the drawing area should be repainted
     */
    public abstract boolean mouseReleased(MouseEvent me);

    /**
     * Handles mouse leaves automaton
     * 
     * @param me Event that occurred
     * @return Whether the drawing area should be repainted
     */
    public abstract boolean mouseExited(MouseEvent me);

    /**
     * Handles mouse enters automaton
     * 
     * @param me Event that occurred
     * 
     * @return Whether the drawing area should be repainted
     */
    public abstract boolean mouseEntered(MouseEvent me);

    /**
     * Event triggered when mouse is being dragged
     * 
     * @param me Data about event
     * 
     * @return Whether the drawing area should be repainted
     */
    public abstract boolean mouseDragged(MouseEvent me);

    /**
     * Event triggered when mouse is being moved
     * 
     * @param me Data about event
     * 
     * @return Whether the drawing area should be repainted
     */
    public abstract boolean mouseMoved(MouseEvent me);

    /**
     * Handles mouse clicks on automaton
     * 
     * @param me Event that occurred
     * 
     * @return Whether the drawing area should be repainted
     */
    public abstract boolean mouseClicked(MouseEvent me);
}
