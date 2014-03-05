package union.codebreakers.controller.behaviorManager.mouseBehavior;

import union.codebreakers.controller.behaviorManager.MouseBehaviorManager;
import java.awt.event.MouseEvent;
/**
 *  Initial mouse behavior is selected when nothing is selected
 */
public class MouseBehaviorDummy extends MouseBehavior {

    private static int offset = 5;

    /**
     * Constructor
     * 
     * @param newMbm Instance of MouseBehaviorManager to which this mouse behavior belongs to
     */
    public MouseBehaviorDummy(MouseBehaviorManager newMbm) {
        super(newMbm);
    }

    /**
     * Handles mouse press on automaton
     * 
     * @param me Event that occurred
     * 
     * @return Whether the drawing area should be repainted
     */
    @Override
    public boolean mousePressed(MouseEvent me){
        return false;
    }
    
    /**
     * Handles mouse release on automaton
     * 
     * @param me Event that occurred
     * 
     * @return Whether the drawing area should be repainted
     */
    @Override
    public boolean mouseReleased(MouseEvent me){
        return false;
    }

    /**
     * Handles mouse leaves automaton
     * 
     * @param me Event that occurred
     * 
     * @return Whether the drawing area should be repainted
     */
    @Override
    public boolean mouseExited(MouseEvent me){
        return false;
    }

    /**
     * Handles mouse enters automaton
     * 
     * @param me Event that occurred
     * 
     * @return Whether the drawing area should be repainted
     */
    @Override
    public boolean mouseEntered(MouseEvent me){
        return false;
    }

    /**
     * Event triggered when mouse is being dragged
     * 
     * @param me Data about event
     * 
     * @return Whether the drawing area should be repainted
     */
    @Override
    public boolean mouseDragged(MouseEvent me){
        return false;
    }

    /**
     * Event triggered when mouse is being moved
     * 
     * @param me Data about event
     * 
     * @return Whether the drawing area should be repainted
     */
    @Override
    public boolean mouseMoved(MouseEvent me){
        return false;
    }

    /**
     * Handles mouse clicks on automaton
     * 
     * @param me Event that occurred
     * 
     * @return Whether the drawing area should be repainted
     */
    @Override
    public boolean mouseClicked(MouseEvent me){
        return false;
    }
}
