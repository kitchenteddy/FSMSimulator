package union.codebreakers.view.drawer.stateDrawer;

import java.awt.Graphics;
import union.codebreakers.view.drawable.Drawable;

/**
 * Tool to draw representation of starting state (text representation)
 */
public class StateDrawerStartingText extends StateDrawerStarting{

    /**
     * Draws two concentric circles representing normal state
     * @param el State to draw
     * @param g Canvas to be drawn on
     */
    @Override
    public void draw(Drawable el, Graphics g) {
        System.out.println("StateDrawerStartingText");
    }
}
