package union.codebreakers.controller.behavior;

import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.*;
import union.codebreakers.helper.enums.MouseBehaviorType;
import union.codebreakers.helper.enums.StateType;

/**
 *  Initial keyboard behavior is selected when we are not in simulation mode
 */
public class KeyboardBehaviorInitial extends KeyboardBehavior{

    /**
     * Constructor
     * 
     * @param newKbm Instance of KeyboardBehaviorManager to which this keyboard behavior belongs to
     */
    public KeyboardBehaviorInitial(KeyboardBehaviorManager newKbm) {
        super(newKbm);
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        switch(ke.getKeyCode()){
            case VK_SHIFT:
                if( this.kbm.getContainer().getMouseBehaviorManager().getCurrentType() == MouseBehaviorType.eInitial ) {
                    this.kbm.getContainer().getMouseBehaviorManager().setMouseBehavior(MouseBehaviorType.eSelected, false);
                }
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        switch(ke.getKeyCode()){
            case VK_1 :
                if( this.kbm.getContainer().getMouseBehaviorManager().getCurrentType() == MouseBehaviorType.eSelected ) {
                    this.kbm.getContainer().getCollisionHandler().getSelectedState().setType(StateType.eStart);
                    this.kbm.getContainer().getDrawingArea().repaint();
                }
                break;
            case VK_2 :
                if( this.kbm.getContainer().getMouseBehaviorManager().getCurrentType() == MouseBehaviorType.eSelected ) {
                    this.kbm.getContainer().getCollisionHandler().getSelectedState().setType(StateType.eNormal);
                    this.kbm.getContainer().getDrawingArea().repaint();
                }
                break;
            case VK_3 :
                if( this.kbm.getContainer().getMouseBehaviorManager().getCurrentType() == MouseBehaviorType.eSelected ) {
                    this.kbm.getContainer().getCollisionHandler().getSelectedState().setType(StateType.eEnd);
                    this.kbm.getContainer().getDrawingArea().repaint();
                }
                break;
            case VK_SHIFT:
                if( this.kbm.getContainer().getMouseBehaviorManager().getCurrentType() == MouseBehaviorType.eSelected ) {
                    this.kbm.getContainer().getMouseBehaviorManager().setMouseBehavior(MouseBehaviorType.eInitial, false);
                }
                break;
            case VK_DELETE:
                // delete selected element
                if( this.kbm.getContainer().getMouseBehaviorManager().getCurrentType() == MouseBehaviorType.eSelected ) {
                    this.kbm.getContainer().getMainController().getAutomaton().removeState(this.kbm.getContainer().getCollisionHandler().getSelectedState());
                    this.kbm.getContainer().getDrawingArea().repaint();
                }
                break;
        }
    }
    
}
