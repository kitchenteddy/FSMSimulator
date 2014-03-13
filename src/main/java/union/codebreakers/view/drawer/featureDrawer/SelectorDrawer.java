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
public class SelectorDrawer implements FeatureDrawer {
    
    
    private int width = 60;
    private int height = 60;
    
    
    
    /**
     * draws a specified feature to the screen
     */
    public void drawFeature(Point destination, Graphics g)
    {
        System.out.println("calling drawFeature in selectorDrawer");
        g.setColor(Color.red);
        g.drawRect(destination.x - this.width/2, destination.y - this.height/2, this.width, this.height);
        
    }
    
    
    
}
