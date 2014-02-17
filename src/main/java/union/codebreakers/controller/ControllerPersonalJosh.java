/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.controller;

import union.codebreakers.gui.MainFrame;
import union.codebreakers.helper.StateType;
import union.codebreakers.model.ModelState;
import union.codebreakers.view.drawable.DrawableState;
import union.codebreakers.view.drawer.stateDrawer.StateDrawerStarting;

/**
 *
 */
public class ControllerPersonalJosh extends ControllerPersonal{
    /**
     * Runs personalised code
     */
    @Override
    public void run() {
        DrawableState ds = new DrawableState();
        ModelState ms = new ModelState();
        ms.setType(StateType.eEnd);
        ms.setPos(100, 100);
        ds.setState(ms);
        
        StateDrawerStarting sd = new StateDrawerStarting();
        sd.draw(ds, this.getFrame().getGraphicsPainting());
    }    
}
