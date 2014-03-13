/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.controller.simulator;

import java.awt.Point;
import union.codebreakers.helper.Container;

/**
 * Class for Managing simulation of FSM
 * @author teddykitchen
 */
public class SimulatorManager {
    
    private Container container;
    private Simulation mySimulation;
    private TextReader myReader;
    private String myInputString;
    private SimulationDrawer drawer;
    
    
    
    public SimulatorManager(Container c)
    {
        this.container = c;
        this.mySimulation = new FSMSimulation();
        this.myReader = new TextReader();
        this.drawer = new SimulationDrawer(this);
        
    }
    
    public void setInputString(String input){
        this.myInputString = input;
    }
    
    
    
    public Point getSimulatedStatePosition(){
        
        return this.mySimulation.getSelectedPosition();
        
    }
    
    
    
    
    public void Simulate(){
        
    }
    
    public Container getContainer(){
        return this.container;
    }
    
}
