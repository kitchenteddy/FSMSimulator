package union.codebreakers.view.drawer;

import union.codebreakers.helper.Canvas;
import union.codebreakers.view.drawable.Drawable;

/**
 * Generic interface to implement visitor pattern for drawing elements
 */
public interface DrawerGeneric {
 
    /**
     * Calls the proper drawing tool for supplied drawable element and draws it on the canvas
     * 
     * @param El    Drawable element which should be drawn
     * @param Where Canvas on which the element should've been drawn
     */
    public void getTool(Drawable El, Canvas Where);    
}
