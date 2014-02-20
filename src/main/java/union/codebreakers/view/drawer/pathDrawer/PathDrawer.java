package union.codebreakers.view.drawer.pathDrawer;

import java.awt.Graphics;
import union.codebreakers.exception.ExceptionUnexpectedInput;
import union.codebreakers.view.drawable.Drawable;
import union.codebreakers.view.drawable.DrawablePath;
import union.codebreakers.view.drawer.DrawerGeneric;


/**
 * This class determines which tool should be used to draw supplied path
 */
public class PathDrawer implements DrawerGeneric
{
    /**
     * Tool to draw a normal path
     */
    static protected PathDrawerNormal pdn = null;

    /**
     * Setter for tool to draw a normal path
     */
    protected void setPathDrawerNormal() {
        PathDrawer.pdn = new PathDrawerNormal();
    }

    /**
     * Calls the proper drawing tool for supplied drawable element and draws it on the canvas
     * 
     * @param el    Drawable element which should be drawn
     * @param g Canvas on which the element should've been drawn
     */
    @Override
    public void getTool(Drawable el, Graphics g) {
        if(el == null ) {
            throw new ExceptionUnexpectedInput( "Unsupported input" );
        }

        if( el instanceof DrawablePath ) {
            if( PathDrawer.pdn == null ) {
                this.setPathDrawerNormal();
            }
            PathDrawer.pdn.draw(el, g);
        } else {
            throw new ExceptionUnexpectedInput( "Unsupported input" );                
        }
    }
}

