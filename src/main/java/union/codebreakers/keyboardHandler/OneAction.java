/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.keyboardHandler;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import union.codebreakers.helper.Container;
import union.codebreakers.helper.enums.MouseBehaviorType;
import union.codebreakers.helper.enums.StateType;

/**
 *
 * @author joshualoew
 */
public class OneAction extends AbstractAction {
    
    private Container container;
    
    public OneAction(Container container) {
        this.container = container;
    }
    
    /**
     * performs the one key action
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(container.getMouseBehaviorManager().getCurrentType() == MouseBehaviorType.eSelected ) {
            container.getCollisionHandler().getSelectedState().setType(StateType.eStart);
            container.getDrawingArea().repaint();
        }
    }

    
}
