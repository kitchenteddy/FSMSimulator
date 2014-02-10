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
import union.codebreakers.model.ModelState;
import union.codebreakers.view.drawable.Drawable;
import union.codebreakers.view.drawable.DrawableState;
import union.codebreakers.view.drawer.DrawerStock;

/**
 *
 */
public class ControllerPersonalLukas extends ControllerPersonal{

    /**
     * Constructor
     * @param f Actual frame
     */
    public ControllerPersonalLukas(MainFrame f) {
        super(f);
    }

    /**
     * Runs personalised code
     */
    @Override
    public void run() {
            LinkedList<Drawable> list = new LinkedList<Drawable>();
            DrawableState s;
            ModelState ms;
            for( int i = 0; i < 3; i++ ) {
                s = new DrawableState();
                ms = new ModelState();
                ms.position = new Point( 50, i * 30 + 30);
                s.setState( ms );
                ms.setType(StateType.eStart);
                list.add(s);
            }
            
            DrawerStock drawerStock = new DrawerStock();
            for(Drawable d : list ) {
//                d.setupDrawing(drawerStock, );
            }
            System.out.print("lukas");
    }
}
