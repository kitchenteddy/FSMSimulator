package union.codebreakers.controller.behaviorManager.mouseBehavior;

import union.codebreakers.controller.behaviorManager.MouseBehaviorManager;
import java.awt.event.MouseEvent;
import union.codebreakers.helper.enums.MouseBehaviorType;

/**
 * Mouse behavior for dragging states around
 */
public class MouseBehaviorDragging extends MouseBehaviorDummy{

    /**
     * Constructor
     * 
     * @param newMbm Instance of MouseBehaviorManager to which this mouse behavior belongs to
     */
    public MouseBehaviorDragging(MouseBehaviorManager newMbm) {
        super(newMbm);
    }
    /**
     * Handles mouse release on automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public boolean mouseReleased(MouseEvent me){
        switch( me.getButton() ){
            case 1: // left button
                 this.mbm.setMouseBehavior(MouseBehaviorType.eSelected, false);
                 break;
        }        
        return false;
    }

    /**
     * Event triggered when mouse is being dragged
     * 
     * @param me Data about event
     */
    @Override
    public boolean mouseDragged(MouseEvent me){
        switch( me.getButton() ){
            case 0: // left button
                if(this.mbm.getContainer().getCollisionHandler().getSelectedState() != null) {
                    this.mbm.getContainer().getCollisionHandler().getSelectedState().setPos(me.getPoint());
                    return true;
                }
        }
        return false;
    }
}
