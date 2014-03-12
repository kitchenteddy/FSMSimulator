/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.view.drawer.pathDrawer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import union.codebreakers.view.drawable.Drawable;
import union.codebreakers.view.drawable.DrawablePath;
import union.codebreakers.view.drawer.DrawerSpecific;

/**
 *
 * @author joshualoew
 */
public class PathDrawerSelf implements DrawerSpecific {

    @Override
    public void draw(Drawable el, Graphics g) {
        
        if( el == null ) {
            return;
        }
        if( el instanceof DrawablePath ){
            DrawablePath dp = (DrawablePath)el;
  
            int x1 = dp.getPath().getStartPoint().getPos().x;
            int y1 = dp.getPath().getStartPoint().getPos().y;
                    
            g.setColor(Color.orange);  
            g.fillArc(x1, y1, 20, 20, 0, 180);
            
        }    
        
    }
    
}
