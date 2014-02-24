/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.view.drawer.labelDrawer;

import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JLabel;
import union.codebreakers.view.drawable.Drawable;
import union.codebreakers.view.drawable.DrawableLabel;
import union.codebreakers.view.drawer.DrawerSpecific;

/**
 *
 * @author joshualoew
 */
public class LabelDrawerFree implements DrawerSpecific{
    
   
    /**
     * Draws two concentric circles representing normal state
     * 
     * @param state State to draw
     * @param g Canvas to be drawn on
     */
    @Override
    public void draw(Drawable label, Graphics g) {

        DrawableLabel dl = ((DrawableLabel)label); 
        int x = dl.getLabel().getPos().x;
        int y = dl.getLabel().getPos().y;
        
        //try just getting a box to draw
        
        //
        JLabel myLabel = new JLabel("YOOOOO TESTING WHATS GOOOD");
        
        
        
        myLabel.paint(g);
        
        //myLabel.setGraphics(g);
        
        //Point dim = StateDrawer.getDimensions(ds.getState().getType());
        //g.setColor(Color.YELLOW);
        
        //g.drawOval(x - dim.x/2, y - dim.y/2, dim.x, dim.y);

    }
}
