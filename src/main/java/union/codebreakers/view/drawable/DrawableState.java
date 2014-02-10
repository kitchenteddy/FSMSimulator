package union.codebreakers.view.drawable;

import java.awt.Graphics;
import union.codebreakers.model.State;
import union.codebreakers.view.drawer.DrawerStockGeneric;


/**
 * View class which handles drawing one state on canvas
 */
public class DrawableState implements Drawable
{
    private State actState;

    /**
     * Constructor
     */
    public DrawableState(){
            this.actState = null;
    }

    /**
     * This method should access saved state model
     * @return  model class of state for this drawable instance
     */
    public State getState() {
        return this.actState;
    }

    /**
     * This method should save model for state which is being drawn
     * @param newState New model for state
     */
    public void setState(State newState ) {
        this.actState = newState;
    }

    /**
     * This method should redirect drawing process to the correct set of drawing tools
     * @param actStock List of currently available drawer tools
     * @param g Where the drawing will occur
     */
    @Override
    public void setupDrawing(DrawerStockGeneric actStock, Graphics g) {
        actStock.setDrawer(this, g);
    }
}

