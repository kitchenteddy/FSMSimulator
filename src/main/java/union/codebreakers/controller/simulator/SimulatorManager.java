/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.controller.simulator;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Observable;
import union.codebreakers.helper.Container;
import union.codebreakers.model.State;

/**
 * Class for Managing simulation of FSM
 * @author teddykitchen
 */
public class SimulatorManager extends Observable{
    
    private Container container;
    private Simulation mySimulation;
    private TextReader myReader;
    private String myInputString;
    
    
    private Point infoPosition;
    
    
    private ArrayList<String> instructions;
    private int currentInstruction;
    
    
    
    public SimulatorManager(Container c)
    {
        this.infoPosition = new Point(100,100);
        this.container = c;
        State startState = this.container.getMainController().getAutomaton().getStartingState();
        if (startState != null){
            this.mySimulation = new FSMSimulation(startState);
        }
        
        this.myReader = new TextReader();
        this.currentInstruction = 0;
        
    }
    
    public void setInputString(String input){
        this.myInputString = input;
        this.instructions = this.myReader.interpretText(this.myInputString);
        for (String s : instructions){
            System.out.println(s);
        }
        
    }
    public Point getSimulatedStatePosition(){
        
        return this.mySimulation.getSelectedPosition();
        
    }
    
    public Point getInfoDrawingPosition(){
        return this.infoPosition;
    }
    
    /**
     * processes one input command and draws the result to screen
     */
    public void Simulate(){
        
        if (this.currentInstruction < this.instructions.size()){
            this.mySimulation.processIput(this.instructions.get(this.currentInstruction));
            this.currentInstruction ++;

            this.setChanged();
            this.notifyObservers(true);
        }
        
        
    }
    
    public Container getContainer(){
        return this.container;
    }
    
}
