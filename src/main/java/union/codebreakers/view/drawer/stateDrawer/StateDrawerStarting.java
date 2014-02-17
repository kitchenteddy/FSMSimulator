package union.codebreakers.view.drawer.stateDrawer;

import java.awt.Color;
import java.awt.Graphics;
import union.codebreakers.view.drawable.Drawable;
import union.codebreakers.view.drawable.DrawableState;
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
         
        int x = ((DrawableState)state).getState().getPos().x;
        int y = ((DrawableState)state).getState().getPos().y;
        int radius = ((DrawableState)state).getState().getRadius();
        
        // add another variable to get the radius of the model state
        
        int width = 60;
        int height = 60;
         
        g.setColor(Color.GREEN.darker()); 
        
        g.drawLine(y-50, x+radius, x, y+radius); // stem
        g.drawLine(x, y+radius, y-10, x+20); // left v /
        g.drawLine(x, y+radius, y-10, x+40); // right v \
        
        g.drawOval(x, y, width, height);
         
     }
}

