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
     * @param newLabel Model of label to be drawn
     */
    public void setLabel(Label newLabel) {
        this.actLabel = newLabel;
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

