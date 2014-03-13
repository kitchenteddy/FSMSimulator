/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.view.drawer;

import java.awt.Graphics;
import union.codebreakers.helper.Container;
import union.codebreakers.view.drawable.DrawableState;

/**
 *
 * @author teddykitchen
 */
public class DrawerStockSimulator extends DrawerStock{
    private Container container;
    
    public DrawerStockSimulator(Container c){
        this.container = c;
        
    }
    
    
    @Override
    public void setDrawer(DrawableState el, Graphics g){
        super.setDrawer(el, g);
        
        if (this.container.getSimulatorManager() != null){
            
            this.container.getSimulatorManager().draw(g);
            
            
        }
        
        
    }
    
}
