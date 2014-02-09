package union.codebreakers.view.drawable;

import java.awt.Graphics;
import union.codebreakers.view.drawer.DrawerStockGeneric;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public  interface Drawable 
{
    /**
     * This method should redirect drawing process to the correct set of drawing tools
     * @param ActStock List of currently available drawers
     * @param Where Where the drawing will occur
     */
    public void setupDrawing(DrawerStockGeneric ActStock, Graphics Where);
}

