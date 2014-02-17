package union.codebreakers.view.drawer.stateDrawer;

import java.awt.Color;
import java.awt.Graphics;
import union.codebreakers.view.drawable.Drawable;
import union.codebreakers.view.drawer.DrawerSpecific;

/**
 * Tool to draw representation of starting state
 */
public class StateDrawerStarting  implements DrawerSpecific
{

    /**
     * Draws two concentric circles representing starting state
     * @param state State to draw
     * @param g Canvas to be drawn on
     */
    @Override
     public void draw(Drawable state, Graphics g) {
         
        
          
        int width = 60;
        int height = 60;
	int x = 200;
        int y = 200; 
         
        g.setColor(Color.BLUE);        
        g.drawLine(0, 480, x, y);
        
        g.drawOval(x, y, width, height);
         
     }
}

