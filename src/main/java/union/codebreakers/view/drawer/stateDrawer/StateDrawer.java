package union.codebreakers.view.drawer.stateDrawer;

import java.awt.Graphics;
import union.codebreakers.exception.ExceptionUnexpectedInput;
import union.codebreakers.view.drawable.Drawable;
import union.codebreakers.view.drawable.DrawableState;
import union.codebreakers.view.drawer.DrawerGeneric;

/**
 * This class determines which tool should be used to draw supplied state
 */
public class StateDrawer implements DrawerGeneric
{
    /**
     * Tool to draw an end state
     */
    static protected StateDrawerEnd sde = null;

    /**
     * Tool to draw a normal state
     */
    static protected StateDrawerNormal sdn = null;

    /**
     * Tool to draw a starting state
     */
    static protected StateDrawerStarting sds = null;

    /**
     * Setter for tool to draw an end state
     */
    protected void setStateDrawerEnd() {
        StateDrawer.sde = new StateDrawerEnd();
    }

    /**
     * Setter for tool to draw a normal state
     */
    protected void setStateDrawerNormal() {
        StateDrawer.sdn = new StateDrawerNormal();
    }

    /**
     * Setter for tool to draw a starting state
     */
    protected void setStateDrawerStarting() {
        StateDrawer.sds = new StateDrawerStarting();
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

        if( el instanceof DrawableState ) {
            DrawableState element = (DrawableState)el;
            switch( element.getState().getType() ) {
                case eStart :
                    if( StateDrawer.sds == null ) {
                        this.setStateDrawerStarting();
                    }
                    StateDrawer.sds.draw(el, g);
                    break;
                case eEnd:
                    if( StateDrawer.sde == null ) {
                        this.setStateDrawerEnd();
                    }
                    StateDrawer.sde.draw(el, g);
                    break;
                case eNormal:
                    if( StateDrawer.sdn == null ) {
                        this.setStateDrawerNormal();
                    }
                    StateDrawer.sdn.draw(el, g);
                    break;
            }
        } else {
            throw new ExceptionUnexpectedInput( "Unsupported input" );                
        }
    }
}

