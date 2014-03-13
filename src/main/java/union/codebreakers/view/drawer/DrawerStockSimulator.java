/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.view.drawer;

import java.awt.Graphics;
import union.codebreakers.controller.simulator.SimulationDrawer;
import union.codebreakers.helper.Container;
import union.codebreakers.view.drawable.DrawableState;
import union.codebreakers.view.drawer.featureDrawer.FeatureDrawer;
import union.codebreakers.view.drawer.featureDrawer.SelectorDrawer;
import union.codebreakers.view.drawer.featureDrawer.SimulatorInfoDrawer;

/**
 *
 * @author teddykitchen
 */
public class DrawerStockSimulator extends DrawerStock{
    private Container container;
    private SimulationDrawer simulationDrawer;
    
    public DrawerStockSimulator(Container c){
        this.container = c;
    }
    
    
    @Override
    public void setDrawer(DrawableState el, Graphics g){
        super.setDrawer(el, g);
        
        if (this.container.getSimulatorManager() != null){
            this.simulationDrawer = new SimulationDrawer(this.container.getSimulatorManager());
            this.simulationDrawer.draw(g);
        }
        if( this.container.getCollisionHandler() != null ){
            if( this.container.getCollisionHandler().getSelectedState().equals(el.getState())){
                FeatureDrawer myDrawer = new SelectorDrawer();
                myDrawer.drawFeature(this.container.getCollisionHandler().getSelectedState().getPos(), g);                
            }
        }
        
        
    }
    
}
