package union.codebreakers.view.drawer;

import java.awt.Graphics;
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
    /**
     * StateDrawer instance for lazy loading
     */
    static protected StateDrawer sd = null;
    
    /**
     * LabelDrawer instance for lazy loading
     */
    static protected LabelDrawer ld = null;

    /**
     * PathDrawer instance for lazy loading
     */
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
     * @param el    Drawable element which should be drawn
     * @param g     Canvas on which the element should've been drawn
     */
    @Override
     public void setDrawer(DrawableState el, Graphics g) {
        if( DrawerStock.sd == null ) {
            this.setStateDrawer();
        }
        DrawerStock.sd.getTool(el, g);
    }   

    /**
     * Calls the proper drawing tool for supplied drawable element and draws it on the canvas
     * 
     * @param el   Drawable element which should be drawn
     * @param g    Canvas on which the element should've been drawn
     */
    @Override
     public void setDrawer(DrawableLabel el, Graphics g) {
        if( DrawerStock.ld == null ) {
            this.setLabelDrawer();
        }
        DrawerStock.ld.getTool(el, g);
    }

    /**
     * Calls the proper drawing tool for supplied drawable element and draws it on the canvas
     * 
     * @param el    Drawable element which should be drawn
     * @param g     Canvas on which the element should've been drawn
     */
    @Override
     public void setDrawer(DrawablePath el, Graphics g) {
        if( DrawerStock.pd == null ) {
            this.setPathDrawer();
        }
        DrawerStock.pd.getTool(el, g);
    }
}