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
     * @param NewState New model for state
     */
    public void setState(State NewState ) {
        this.actState = NewState;
    }

    /**
     * This method should redirect drawing process to the correct set of drawing tools
     * @param ActStock List of currently available drawer tools
     * @param Where Where the drawing will occur
     */
    @Override
    public void setupDrawing(DrawerStockGeneric ActStock, Graphics Where) {
        ActStock.setDrawer(this, Where);
    }
}

