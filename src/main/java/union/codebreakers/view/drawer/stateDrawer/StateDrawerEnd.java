package union.codebreakers.view.drawer.stateDrawer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import union.codebreakers.view.drawable.Drawable;
import union.codebreakers.view.drawable.DrawableState;
import union.codebreakers.view.drawer.DrawerSpecific;


/**
 * Tool to draw representation of end state
 */
public class StateDrawerEnd  implements DrawerSpecific
{

    /**
     * Draws two concentric circles representing end state
     * @param state State to draw
     * @param g Canvas to be drawn on
     */
    @Override
    public void draw(Drawable state, Graphics g) {
        
        DrawableState ds = ((DrawableState)state);
        int x = ds.getState().getPos().x;
        int y = ds.getState().getPos().y;
        Point dim = StateDrawer.getDimensions(ds.getState().getType());
        g.setColor(Color.RED); 
        Point concentric = new Point(dim.x / 5, dim.y / 5);
        
        g.drawOval(x - dim.x/2, y - dim.y/2, dim.x, dim.y);
        g.drawOval(x - dim.x/2 + concentric.x / 2, y - dim.y/2 + concentric.y / 2,
                    dim.x - concentric.x, dim.y - concentric.y);
        
    }
}

