
package union.codebreakers.view.drawer.featureDrawer;

import java.awt.Point;
import java.awt.Graphics;
/**
 * Interface for FeatureDrawers.  That is drawers that draw extra features to the screen at a certain point
 * @author teddykitchen
 */
public interface FeatureDrawer {
    
    
    /**
     * draws a specified feature to the screen
     */
    public void drawFeature(Point destination, Graphics g);
    
    
    
    
}
