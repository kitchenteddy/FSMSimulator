package union.codebreakers.view.drawer.stateDrawer;

import java.awt.Color;
import java.awt.Graphics;
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
        
//        DrawableState d = (DrawableState)state;
//        d.getState().getPos();
        
        g.setColor(Color.RED);
        g.drawOval(200, 200, 60, 60);
        
        int width = 60;
        int height = 60;
	int x = 200;
        int y = 200;
						
	for (int i = 0; i < 2; i ++) {
            g.drawOval(x+(5*i), y+(5*i), width-(10*i), height-(10*i));
        }
        
    }
}

