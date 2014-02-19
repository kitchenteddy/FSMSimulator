package union.codebreakers.view.drawer.stateDrawer;

import java.awt.Color;
import java.awt.Graphics;
import union.codebreakers.view.drawable.Drawable;
import union.codebreakers.view.drawable.DrawableState;
import union.codebreakers.view.drawer.DrawerSpecific;

/**
 * Tool to draw representation of normal state
 */
public class StateDrawerNormal  implements DrawerSpecific
{

    /**
     * Draws two concentric circles representing normal state
     * 
     * @param state State to draw
     * @param g Canvas to be drawn on
     */
    @Override
    public void draw(Drawable state, Graphics g) {

        DrawableState ds = ((DrawableState)state);
        int x = ds.getState().getPos().x;
        int y = ds.getState().getPos().y;
        int r = ds.getState().getRadius();
        g.setColor(Color.BLUE);
        
        g.drawOval(x - r, y - r, 2*r, 2*r);

    }
}

