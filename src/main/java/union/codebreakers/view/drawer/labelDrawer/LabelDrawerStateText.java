package union.codebreakers.view.drawer.labelDrawer;

import java.awt.Graphics;
import union.codebreakers.view.drawable.Drawable;

/**
 * Tool to draw representation of label for state (text representation)
 */
public class LabelDrawerStateText extends LabelDrawerState{

    /**
     * Draws label for path
     * @param el State to draw
     * @param g Canvas to be drawn on
     */
    @Override
    public void draw(Drawable el, Graphics g) {
        System.out.print("LabelDrawerState");
    }
}
