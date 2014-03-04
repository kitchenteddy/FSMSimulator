/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.controller;

import java.awt.Point;
import union.codebreakers.gui.MainFrame;
import union.codebreakers.helper.enums.FormatterType;
import union.codebreakers.helper.enums.StateType;
import union.codebreakers.model.Automaton;
import union.codebreakers.model.ModelAutomaton;
import union.codebreakers.model.ModelState;
import union.codebreakers.model.ModelLabel;
import union.codebreakers.view.drawable.DrawableState;
import union.codebreakers.view.drawer.stateDrawer.StateDrawerStarting;
import union.codebreakers.view.formatter.FormattableAutomaton;
import union.codebreakers.view.formatter.ModelFormatterVisitor;

/**
 *
 */
public class ControllerPersonalJosh extends ControllerPersonal{
    /**
     * Runs personalised code
     */
    @Override
    public void run() {
        /*
        DrawableState ds = new DrawableState();
        ModelState ms = new ModelState();
        ms.setType(StateType.eEnd);
        ms.setPos(100, 100);
        ds.setState(ms);
        
        StateDrawerStarting sd = new StateDrawerStarting();
        sd.draw(ds, this.getFrame().getGraphicsPainting());
        */
        
        Automaton fsm = new ModelAutomaton();
        
        ModelFormatterVisitor formatter = new ModelFormatterVisitor();
        
        ModelState firstState = new ModelState(StateType.eStart, new Point(0,0), new ModelLabel(), fsm);
        
        fsm.addState(firstState);
        
        FormattableAutomaton myFormattable = new FormattableAutomaton(fsm);
        
        String myPrintOut = formatter.visitElement(myFormattable, FormatterType.eReadable);
        System.out.println(myPrintOut);
               
    }    
}
