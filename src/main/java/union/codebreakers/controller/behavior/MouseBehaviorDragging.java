package union.codebreakers.controller.behavior;

import java.awt.event.MouseEvent;
import union.codebreakers.helper.enums.MouseBehaviorType;

/**
 * Mouse behavior for dragging states aroudn
 */
public class MouseBehaviorDragging extends MouseBehavior{

    /**
     * Constructor
     * 
     * @param newMbm Instance of MouseBehaviorManager to which this mouse behavior belongs to
     */
    public MouseBehaviorDragging(MouseBehaviorManager newMbm) {
        super(newMbm);
    }

    /**
     * Handles mouse press on automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mousePressed(MouseEvent me){
    }
    
    /**
     * Handles mouse release on automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mouseReleased(MouseEvent me){
        switch( me.getButton() ){
            case 1: // left button
                 this.mbm.setMouseBehavior(MouseBehaviorType.eSelected, false);
                 break;
        }        
    }

    /**
     * Handles mouse leaves automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mouseExited(MouseEvent me){
    }

    /**
     * Handles mouse enters automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mouseEntered(MouseEvent me){
    }

    /**
     * Event triggered when mouse is being dragged
     * 
     * @param me Data about event
     */
    @Override
    public void mouseDragged(MouseEvent me){
        switch( me.getButton() ){
            case 0: // left button
                if(this.mbm.getContainer().getCollisionHandler().getSelectedState() != null) {
                    this.mbm.getContainer().getCollisionHandler().getSelectedState().setPos(me.getPoint());
                    this.mbm.getContainer().getDrawingArea().repaint();
                }
        }
    }

    /**
     * Event triggered when mouse is being moved
     * 
     * @param me Data about event
     */
    @Override
    public void mouseMoved(MouseEvent me){
    }

    /**
     * Handles mouse clicks on automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mouseClicked(MouseEvent me){
    }
}
