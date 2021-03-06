package union.codebreakers.view.drawer;

import java.awt.Graphics;
import union.codebreakers.view.drawable.Drawable;

/**
 * Interface for a specific drawing tool
 */
public interface DrawerSpecific {

    /**
     * Draws this element on th selected canvas
     * @param el Element that should be drawn
     * @param g Canvas when the element should be drawn
     */

    public void draw(Drawable el, Graphics g);
}
