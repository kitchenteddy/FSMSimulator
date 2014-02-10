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
            
            DrawableState s;
            ModelState ms;
            s = new DrawableState();
            ms = new ModelState();
            s.setState( ms );
            ms.setType(StateType.eStart);
            DrawerStock drawerStock = new DrawerStock();
            s.setupDrawing(drawerStock, null);
	}
        
}
