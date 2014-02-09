package union.codebreakers.view.drawer;

import union.codebreakers.helper.Canvas;
import union.codebreakers.view.drawable.DrawableLabel;
import union.codebreakers.view.drawable.DrawablePath;
import union.codebreakers.view.drawable.DrawableState;
import union.codebreakers.view.drawer.labelDrawer.LabelDrawer;
import union.codebreakers.view.drawer.pathDrawer.PathDrawer;
import union.codebreakers.view.drawer.stateDrawer.StateDrawer;


/**
 * Dispatching class to get the right drawing tool for the specific drawable element
 */
public class DrawerStock implements DrawerStockGeneric
{
    static protected StateDrawer sd = null;
    static protected LabelDrawer ld = null;
    static protected PathDrawer pd = null;

    /**
     * Sets StateDrawer instance for the dispatching class
     */
    protected void setStateDrawer(){
        DrawerStock.sd = new StateDrawer();
    }

    /**
     * Sets LabelDrawer instance for the dispatching class
     */
    protected void setLabelDrawer(){
        DrawerStock.ld = new LabelDrawer();
    }

    /**
     * Sets PathDrawer instance for the dispatching class
     */
    protected void setPathDrawer(){
        DrawerStock.pd = new PathDrawer();
    }
    
    /**
     * Calls the proper drawing tool for supplied drawable element and draws it on the canvas
     * 
     * @param El    Drawable element which should be drawn
     * @param Where Canvas on which the element should've been drawn
     */
    @Override
    public void setDrawer(DrawableState El, Canvas Where) {
        if( DrawerStock.sd == null ) {
            this.setStateDrawer();
        }
        DrawerStock.sd.getTool(El, Where);
    }   

    /**
     * Calls the proper drawing tool for supplied drawable element and draws it on the canvas
     * 
     * @param El    Drawable element which should be drawn
     * @param Where Canvas on which the element should've been drawn
     */
    @Override
    public void setDrawer(DrawableLabel El, Canvas Where) {
        if( DrawerStock.ld == null ) {
            this.setLabelDrawer();
        }
        DrawerStock.ld.getTool(El, Where);
    }

    /**
     * Calls the proper drawing tool for supplied drawable element and draws it on the canvas
     * 
     * @param El    Drawable element which should be drawn
     * @param Where Canvas on which the element should've been drawn
     */
    @Override
    public void setDrawer(DrawablePath El, Canvas Where) {
        if( DrawerStock.pd == null ) {
            this.setPathDrawer();
        }
        DrawerStock.pd.getTool(El, Where);
    }
}