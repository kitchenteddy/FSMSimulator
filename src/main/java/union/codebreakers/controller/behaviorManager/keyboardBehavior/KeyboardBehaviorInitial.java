package union.codebreakers.controller.behaviorManager.keyboardBehavior;

import java.awt.event.KeyEvent;
import union.codebreakers.controller.behaviorManager.KeyboardBehaviorManager;
import static java.awt.event.KeyEvent.*;
import union.codebreakers.command.CommandDeleteState;
import union.codebreakers.helper.enums.KeyboardBehaviorType;
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
            case VK_DELETE:
                // delete selected element
                if( this.kbm.getContainer().getMouseBehaviorManager().getCurrentType() == MouseBehaviorType.eSelected ) {
                    // user clicked on nothing so try to create a new state
                    CommandDeleteState deleteState = new CommandDeleteState(
                                                                this.kbm.getContainer(),
                                                                this.kbm.getContainer().getCollisionHandler().getSelectedState());
                    if( this.kbm.getContainer().getCommandCenter().execute(deleteState) ){
                        // we created the state so change mouse behavior and repaint
                        this.kbm.getContainer().getMouseBehaviorManager().setMouseBehavior(MouseBehaviorType.eInitial, false);
                       return true; // repaint canvas in case we highlight selected state somehow
                    }
                    return true;
                }
                break;
        }
        return false;
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
                if( this.kbm.getContainer().getMouseBehaviorManager().getCurrentType() == MouseBehaviorType.eSelected ) {
                    this.kbm.setKeyboardBehavior(KeyboardBehaviorType.eAddPath, false);
                }
                break;
        }
        return false;
    }

}
