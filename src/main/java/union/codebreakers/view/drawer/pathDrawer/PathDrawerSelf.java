/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.view.drawer.pathDrawer;

import java.awt.Color;
import java.awt.Graphics;
import union.codebreakers.view.drawable.Drawable;
import union.codebreakers.view.drawer.DrawerSpecific;

/**
 *
 * @author joshualoew
 */
public class PathDrawerSelf implements DrawerSpecific {

    @Override
    public void draw(Drawable el, Graphics g) {
        
        g.setColor(Color.red); 
        g.fillOval(50,50,100,100); 
        g.setColor(Color.white); 
        g.fillArc(50, 50, 100, 100, 0, 180); 
        g.setColor(Color.black); 
        g.drawLine(50, 100, 150, 100);
        
    }
    
}
