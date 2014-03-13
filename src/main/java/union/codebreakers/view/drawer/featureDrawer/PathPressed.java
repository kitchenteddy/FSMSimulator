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
 * @author joshualoew
 */
public class PathPressed implements FeatureDrawer {

    @Override
    public void drawFeature(Point destination, Graphics g) {
        
        g.setColor(Color.blue);
        g.drawLine(destination.x, destination.x, destination.y, destination.x);
        
    }
    
}
