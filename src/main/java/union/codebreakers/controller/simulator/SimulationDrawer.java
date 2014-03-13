/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.controller.simulator;

import java.awt.Graphics;
import union.codebreakers.view.drawer.featureDrawer.FeatureDrawer;
import union.codebreakers.view.drawer.featureDrawer.SimulatedStateDrawer;
import union.codebreakers.view.drawer.featureDrawer.SimulatorInfoDrawer;

/**
 *
 * @author teddykitchen
 */
public class SimulationDrawer {
    
    SimulatorManager manager;
    FeatureDrawer simulatedInfoDrawer, simulatedStateDrawer;
    
    public SimulationDrawer(SimulatorManager myManager){
        this.manager = myManager;
        this.simulatedInfoDrawer = new SimulatorInfoDrawer();
        this.simulatedStateDrawer = new SimulatedStateDrawer();
        
    }
    
    public void draw(Graphics g){
        this.simulatedInfoDrawer.drawFeature(this.manager.getInfoDrawingPosition(), g);
        this.simulatedStateDrawer.drawFeature(this.manager.getSimulatedStatePosition(), g);
    }
    
    
    
    
    
}
