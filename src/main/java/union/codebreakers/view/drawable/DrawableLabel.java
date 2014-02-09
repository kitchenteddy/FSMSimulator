package union.codebreakers.view.drawable;

import java.awt.Graphics;
import union.codebreakers.model.Label;
import union.codebreakers.view.drawer.DrawerStockGeneric;


/**
 * View class which handles drawing one label on canvas
 */
public class DrawableLabel implements Drawable
{
    private Label actLabel;

    /**
     * Constructor
     */
    public DrawableLabel(){
        this.actLabel = null;
    }

    /**
     * This method should access saved label model
     * @return  model class of label for this drawable instance
     */
    public Label getLabel() {
        return this.actLabel;
    }

    /**
     * This method should save model for label which is being drawn
     * @param NewLabel Model of label to be drawn
     */
    public void setLabel(Label NewLabel) {
        this.actLabel = NewLabel;
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

