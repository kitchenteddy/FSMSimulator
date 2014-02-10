package union.codebreakers.view.drawable;

import java.awt.Graphics;
import union.codebreakers.view.drawer.DrawerStockGeneric;


/**
 * Interface for all drawable elements
 */
public  interface Drawable 
{
    /**
     * This method should redirect drawing process to the correct set of drawing tools
     * @param actStock List of currently available drawers
     * @param g  Where the drawing will occur
     */
    public void setupDrawing(DrawerStockGeneric actStock, Graphics g);
}

