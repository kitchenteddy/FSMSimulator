package union.codebreakers.view.drawer.labelDrawer;

import java.awt.Graphics;
import union.codebreakers.exception.ExceptionUnexpectedInput;
import union.codebreakers.view.drawable.Drawable;
import union.codebreakers.view.drawable.DrawableLabel;
import union.codebreakers.view.drawer.DrawerGeneric;

/**
 * This class determines which tool should be used to draw supplied label
 */
public class LabelDrawer implements DrawerGeneric
{
    static protected LabelDrawerNormal ldn = null;

    /**
     * Setter for tool to draw a normal label
     */
    protected void setLabelDrawerNormal() {
        LabelDrawer.ldn = new LabelDrawerNormal();
    }

    /**
     * Calls the proper drawing tool for supplied drawable element and draws it on the canvas
     * 
     * @param el    Drawable element which should be drawn
     * @param g     Canvas on which the element should've been drawn
     */
    @Override
    public void getTool(Drawable el, Graphics g) {
        if(el == null ) {
            throw new ExceptionUnexpectedInput( "Unsupported input" );
        }
//        System.out.println("running LabelDrawer.getTool");
        if( el instanceof DrawableLabel ) {
            DrawableLabel element = (DrawableLabel)el;
            switch( element.getLabel().getType() ) {
                case eState:
                case ePath :
                    if( LabelDrawer.ldn == null ) {
                        this.setLabelDrawerNormal();
                    }
                    LabelDrawer.ldn.draw(el, g);
                    break;
            }
        } else {
            throw new ExceptionUnexpectedInput( "Unsupported input" );                
        }
    }	
}

