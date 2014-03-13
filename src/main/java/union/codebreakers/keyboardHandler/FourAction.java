/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.keyboardHandler;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import union.codebreakers.command.Command;
import union.codebreakers.command.CommandDeleteState;
import union.codebreakers.helper.Container;

/**
 *
 * @author teddykitchen
 */
public class FourAction extends AbstractAction{
    private Container container;
    
    
    public FourAction(Container container) {
        this.container = container;
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Command delete = new CommandDeleteState(this.container, this.container.getCollisionHandler().getSelectedState());
        this.container.getCommandCenter().execute(delete);
        this.container.getDrawingArea().repaint();
    
    }
    
}
