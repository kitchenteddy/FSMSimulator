package union.codebreakers.view.drawer;

import java.awt.Graphics;
import union.codebreakers.view.drawable.DrawableLabel;
import union.codebreakers.view.drawable.DrawablePath;
import union.codebreakers.view.drawable.DrawableState;

/**
 * Generic interface to implement visitor pattern for drawing elements
 */
public interface DrawerStockGeneric {
 
    /**
     * Calls the proper drawing tool for supplied drawable element and draws it on the canvas
     * 
     * @param el    Drawable element which should be drawn
     * @param g     Canvas on which the element should've been drawn
     */
    public void setDrawer(DrawableState el, Graphics g);

    /**
     * Calls the proper drawing tool for supplied drawable element and draws it on the canvas
     * 
     * @param el    Drawable element which should be drawn
     * @param g     Canvas on which the element should've been drawn
     */
    public void setDrawer(DrawableLabel el, Graphics g);

    /**
     * Calls the proper drawing tool for supplied drawable element and draws it on the canvas
     * 
     * @param el    Drawable element which should be drawn
     * @param g     Canvas on which the element should've been drawn
     */
    public void setDrawer(DrawablePath el, Graphics g);
}
