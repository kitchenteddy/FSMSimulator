package union.codebreakers.view.drawer;

import union.codebreakers.helper.Canvas;
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
     * @param El    Drawable element which should be drawn
     * @param Where Canvas on which the element should've been drawn
     */
    public void setDrawer(DrawableState El, Canvas Where);

    /**
     * Calls the proper drawing tool for supplied drawable element and draws it on the canvas
     * 
     * @param El    Drawable element which should be drawn
     * @param Where Canvas on which the element should've been drawn
     */
    public void setDrawer(DrawableLabel El, Canvas Where);

    /**
     * Calls the proper drawing tool for supplied drawable element and draws it on the canvas
     * 
     * @param El    Drawable element which should be drawn
     * @param Where Canvas on which the element should've been drawn
     */
    public void setDrawer(DrawablePath El, Canvas Where);
}
