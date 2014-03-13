    package union.codebreakers.controller.behaviorManager.keyboardBehavior;

import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.VK_SHIFT;
import union.codebreakers.controller.behaviorManager.KeyboardBehaviorManager;
import union.codebreakers.helper.enums.KeyboardBehaviorType;
import union.codebreakers.helper.enums.MouseBehaviorType;

/**
 * Keyboard mode for adding paths to a selected state
 */
public class KeyboardBehaviorAddPath extends KeyboardBehaviorDummy{

    /**
     * Constructor
     * 
     * @param newKbm Instance of KeyboardBehaviorManager to which this keyboard behavior belongs to
     */
    public KeyboardBehaviorAddPath(KeyboardBehaviorManager newKbm) {
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
            case VK_SHIFT:
                if( this.kbm.getContainer().getMouseBehaviorManager().getCurrentType() == MouseBehaviorType.eSelected ) {
                    this.kbm.setKeyboardBehavior(KeyboardBehaviorType.eInitial, false);
                }
                break;
        }
        return false;
    }
}
