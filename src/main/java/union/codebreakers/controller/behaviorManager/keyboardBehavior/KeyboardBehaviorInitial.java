package union.codebreakers.controller.behaviorManager.keyboardBehavior;

import union.codebreakers.controller.behaviorManager.keyboardBehavior.KeyboardBehaviorDummy;
import java.awt.event.KeyEvent;
import union.codebreakers.controller.behaviorManager.KeyboardBehaviorManager;
import static java.awt.event.KeyEvent.*;
import union.codebreakers.helper.enums.MouseBehaviorType;
import union.codebreakers.helper.enums.StateType;

/**
 *  Initial keyboard behavior is selected when we are not in simulation mode
 */
public class KeyboardBehaviorInitial extends KeyboardBehaviorDummy{

    /**
     * Constructor
     * 
     * @param newKbm Instance of KeyboardBehaviorManager to which this keyboard behavior belongs to
     */
    public KeyboardBehaviorInitial(KeyboardBehaviorManager newKbm) {
        super(newKbm);
    }

    /**
     * Key was pressed
     * 
     * @param ke Information about event
     * 
     * @return Whether the drawing area should be repainted
     */
    @Override
    public boolean keyPressed(KeyEvent ke) {
        switch(ke.getKeyCode()){
            case VK_SHIFT:
                if( this.kbm.getContainer().getMouseBehaviorManager().getCurrentType() == MouseBehaviorType.eInitial ) {
                    this.kbm.getContainer().getMouseBehaviorManager().setMouseBehavior(MouseBehaviorType.eSelected, false);
                }
                break;
        }
        return false;
    }

    /**
     * Key was released
     * 
     * @param ke Information about event
     * 
     * @return Whether the drawing area should be repainted
     */
    @Override
    public boolean keyReleased(KeyEvent ke) {
        switch(ke.getKeyCode()){
            case VK_1 :
                if( this.kbm.getContainer().getMouseBehaviorManager().getCurrentType() == MouseBehaviorType.eSelected ) {
                    this.kbm.getContainer().getCollisionHandler().getSelectedState().setType(StateType.eStart);
                    return true;
                }
                break;
            case VK_2 :
                if( this.kbm.getContainer().getMouseBehaviorManager().getCurrentType() == MouseBehaviorType.eSelected ) {
                    this.kbm.getContainer().getCollisionHandler().getSelectedState().setType(StateType.eNormal);
                    return true;
                }
                break;
            case VK_3 :
                if( this.kbm.getContainer().getMouseBehaviorManager().getCurrentType() == MouseBehaviorType.eSelected ) {
                    this.kbm.getContainer().getCollisionHandler().getSelectedState().setType(StateType.eEnd);
                    return true;
                }
                break;
            case VK_SHIFT:
                if( this.kbm.getContainer().getMouseBehaviorManager().getCurrentType() == MouseBehaviorType.eSelected ) {
                    this.kbm.getContainer().getMouseBehaviorManager().setMouseBehavior(MouseBehaviorType.eInitial, false);
                    return true;
                }
                break;
            case VK_DELETE:
                // delete selected element
                if( this.kbm.getContainer().getMouseBehaviorManager().getCurrentType() == MouseBehaviorType.eSelected ) {
                    this.kbm.getContainer().getMainController().getAutomaton().removeState(this.kbm.getContainer().getCollisionHandler().getSelectedState());
                    return true;
                }
                break;
        }
        return false;
    }
    
}
