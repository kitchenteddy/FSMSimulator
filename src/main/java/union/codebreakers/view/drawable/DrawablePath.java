package union.codebreakers.view.drawable;

import java.awt.Graphics;
import union.codebreakers.model.Path;
import union.codebreakers.view.drawer.DrawerStockGeneric;


/**
 * View class which handles drawing one label on canvas
 */
public class DrawablePath implements Drawable
{
    private Path actPath;

    /**
     * Constructor
     */
    public DrawablePath(){
        this.actPath = null;
    }

    /**
     * This method should access saved path model
     * @return  model class of path for this drawable instance
     */
    public Path getPath() {
        return this.actPath;
    }

    /**
     * This method should save model for path which is being drawn
     * @param NewPath Model of label to be drawn
     */
    public void setPath(Path NewPath ) {
        this.actPath = NewPath;
    }

    /**
     * This method should redirect drawing process to the correct set of drawing tools
     * @param ActStock List of currently available drawer tools
     * @param Where Where the drawing will occur
     */
    @Override
    public void setupDrawing(DrawerStockGeneric ActStock, Graphics Where) {
    }
}

