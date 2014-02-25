package union.codebreakers.controller.behavior;

import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.*;
import union.codebreakers.helper.enums.OperationType;
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
/*                
                if( this.selected != null ) {
                    this.operation = OperationType.eSelecting;
                }
*/                
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        switch(ke.getKeyCode()){
            case VK_1 :
/*
                if( this.selected != null ) {
                    this.selected.setType(StateType.eStart);
                    this.mainFrame.getDrawingPlace().repaint();
                }
*/        
                break;
            case VK_2 :
/*
                if( this.selected != null ) {
                    this.selected.setType(StateType.eNormal);
                    this.mainFrame.getDrawingPlace().repaint();
                }
*/        
                break;
            case VK_3 :
/*
                if( this.selected != null ) {
                    this.selected.setType(StateType.eEnd);
                    this.mainFrame.getDrawingPlace().repaint();
                }
*/        
                break;
            case VK_SHIFT:
/*
                this.operation = OperationType.eNone;
*/        
                break;
            case VK_DELETE:
/*
                // delete selected element
                if( this.selected != null ){
                    this.mainFrame.getMainController().getAutomaton().removeState(selected);
                    this.mainFrame.getDrawingPlace().repaint();
                }
*/        
                break;
        }
    }
    
}
