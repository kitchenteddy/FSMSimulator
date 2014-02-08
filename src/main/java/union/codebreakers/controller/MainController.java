/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.controller;

import union.codebreakers.gui.MainFrame;
import union.codebreakers.helper.LabelType;
import union.codebreakers.model.ModelLabel;
import union.codebreakers.model.ModelPath;
import union.codebreakers.view.drawable.DrawableLabel;
import union.codebreakers.view.drawable.DrawablePath;
import union.codebreakers.view.drawer.labelDrawer.LabelDrawer;
import union.codebreakers.view.drawer.pathDrawer.PathDrawer;

/**
 *
 * @author 3lf
 */
public class MainController {

        public static void main(String [] args)
	{
//            MainFrame myFrame = new MainFrame();
//            myFrame.show();
            
            /*  Lukas testing drawers
                ******************************** LABEL test
                LabelDrawer drawer = new LabelDrawer();

                DrawableLabel label = new DrawableLabel();
                ModelLabel model = new ModelLabel();
                model.SetType( LabelType.ePath );

                label.SetLabel( model );
                drawer.Draw(label, null);

                model.SetType( LabelType.eState );
                drawer.Draw(label, null);
            
            
                ******************************** PATH test
                PathDrawer drawer = new PathDrawer();

                DrawablePath path = new DrawablePath();
                ModelPath model = new ModelPath();

                path.SetPath( model );
                drawer.Draw(path, null);
            */
	}
}
