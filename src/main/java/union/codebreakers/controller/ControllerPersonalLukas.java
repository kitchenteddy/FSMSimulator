/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.controller;

import java.awt.Point;
import java.util.LinkedList;
import union.codebreakers.gui.MainFrame;
import union.codebreakers.helper.StateType;
import union.codebreakers.helper.ToolsFactory;
import union.codebreakers.model.ModelPath;
import union.codebreakers.model.ModelState;
import union.codebreakers.view.drawable.Drawable;
import union.codebreakers.view.drawable.DrawablePath;
import union.codebreakers.view.drawable.DrawableState;
import union.codebreakers.view.drawer.DrawerStock;

/**
 *
 */
public class ControllerPersonalLukas extends ControllerPersonal{

    /**
     * Runs personalised code
     */
    @Override
    public void run() {

        DrawableState s = new DrawableState();
        ModelState ms = new ModelState();
//        ModelState ms1 = new ModelState();
//        ModelState ms2 = new ModelState();
        ms.setPos(new Point( 30, 30) );
//        ms2.setPos(new Point( 130, 40) );
        s.setState(ms);
        ms.setType(StateType.eEnd);
        s.setupDrawing(ToolsFactory.getDrawerStock(), this.getFrame().getGraphicsPainting());
    }
}
