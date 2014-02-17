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
     * @param state State to draw
     * @param g Canvas to be drawn on
     */
    @Override
    public void draw(Drawable state, Graphics g) {

        int x = ((DrawableState)state).getState().getPos().x;
        int y = ((DrawableState)state).getState().getPos().y;
        int width = 60;
        int height = 60;
        
        g.setColor(Color.BLUE);
        
        g.drawOval(x, y, width, height);

    }
}

