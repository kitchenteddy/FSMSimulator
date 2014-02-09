/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.controller;

import java.util.LinkedList;
import union.codebreakers.helper.LabelType;
import union.codebreakers.helper.StateType;
import union.codebreakers.model.ModelLabel;
import union.codebreakers.model.ModelState;
import union.codebreakers.view.drawable.Drawable;
import union.codebreakers.view.drawable.DrawableLabel;
import union.codebreakers.view.drawable.DrawableState;
import union.codebreakers.view.drawer.DrawerStock;

/**
 *
 * @author 3lf
 */
public class MainController {
    
        public static void main(String [] args)
	{
//            MainFrame myFrame = new MainFrame();
//            myFrame.show();
            
            LinkedList<Drawable> list = new LinkedList<Drawable>();
            DrawableState s;
            ModelState ms;
            for( int i = 0; i < 3; i++ ) {
                s = new DrawableState();
                ms = new ModelState();
                s.setState( ms );
                ms.setType(StateType.eStart);
                list.add(s);
            }
            DrawableLabel l;
            ModelLabel ml;
            for( int i = 0; i < 3; i++ ) {
                l = new DrawableLabel();
                ml = new ModelLabel();
                l.setLabel( ml );
                ml.setType(LabelType.ePath);
                list.add(l);
            }
            
            DrawerStock drawerStock = new DrawerStock();
            for(Drawable d : list ) {
                d.setupDrawing(drawerStock, null);
            }
	}
        
}
