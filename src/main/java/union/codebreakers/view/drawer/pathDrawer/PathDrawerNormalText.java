package union.codebreakers.view.drawer.pathDrawer;

import java.awt.Graphics;
import union.codebreakers.view.drawable.Drawable;

/**
 * Tool to draw representation of normal path (text representation)
 */
public class PathDrawerNormalText extends PathDrawerNormal{

    /**
     * Draws line with arrow between two states
     * @param el State to draw
     * @param g Canvas to be drawn on
     */
    @Override
    public void draw(Drawable el, Graphics g) {
        System.out.println("PathDrawerNormalText");
    }
}
