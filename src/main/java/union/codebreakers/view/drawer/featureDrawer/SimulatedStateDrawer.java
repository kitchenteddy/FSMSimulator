/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.view.drawer.featureDrawer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author teddykitchen
 */
public class SimulatedStateDrawer implements FeatureDrawer {
    
    private int width = 30;
    private int height = 30;
    
    
    @Override
    public void drawFeature(Point destination, Graphics g) {
        
        g.setColor(Color.blue);
        g.drawRect(destination.x - this.width/2, destination.y - this.height/2, this.width, this.height);    }
    
}
