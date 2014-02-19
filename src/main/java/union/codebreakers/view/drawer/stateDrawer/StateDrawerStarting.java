package union.codebreakers.view.drawer.stateDrawer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
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

        DrawableState ds = ((DrawableState)state);
        int x = ds.getState().getPos().x;
        int y = ds.getState().getPos().y;
        Point dim = StateDrawer.getDimensions(ds.getState().getType());
        g.setColor(Color.GREEN.darker()); 
        
        int x_end = x - dim.y/2 - 5;
        int arrow_point_x = dim.x / 5;
        int arrow_point_y = dim.x / 6;
        
        g.drawLine( x - dim.x, y, x_end, y); // stem
        g.drawLine( x_end, y, x_end - arrow_point_x, y + arrow_point_y); // bottom /
        g.drawLine( x_end, y, x_end - arrow_point_x, y - arrow_point_y); // top \
        
        g.drawOval(x - dim.y/2, y - dim.y/2, dim.y, dim.y);
     }
}

