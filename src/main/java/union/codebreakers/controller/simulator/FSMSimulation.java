/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.controller.simulator;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import union.codebreakers.model.Path;
import union.codebreakers.model.State;

/**
 *
 * @author teddykitchen
 */
public class FSMSimulation implements Simulation{
    
    private State currentState;
    private ArrayList<String>  possibleMoves;
    
    
    public FSMSimulation(State myCurrent){
        this.currentState = myCurrent;
        this.possibleMoves = new ArrayList<String>();
        
        for (Path currentPath : this.currentState.getPaths()){
            this.possibleMoves.add(currentPath.getLabel().getName());
        }
            
    }
    
    /**
     * processes an input string
     * @param input
     * @return false iff input string is not accepted
     */
    @Override
    public boolean processIput(String input) {
        
        System.out.println(this.currentState.getLabel().getName() + "current state in FSMSImulation");
        
        if (!possibleMoves.isEmpty())
        {
            System.out.println("possible moces is not empty in FSMSimulation");
            for (String possibleMove : possibleMoves){
                System.out.println(possibleMove);
                System.out.println("input: "+ input);
            }
            for (String possibleMove: possibleMoves){
                if (input.equals(possibleMove)){
                    
                    
                    
                    HashMap<String, State> myMap = this.getMap(possibleMoves);
                    
                    System.out.println("here is the hashmap in FSMSimulation");
                    System.out.println(myMap.toString());
                    
                    currentState = myMap.get(input);
                    this.updatePossibleMoves();
                    return true;
                }
            }
        }
        
        return false;
        
    }

    @Override
    public Point getSelectedPosition() {
        return currentState.getPos();
    }
    
    
    
    
    
    

    
    /**
     * private method that maps string path names to the correct ending state
     * @return 
     */
    private HashMap<String, State> getMap(ArrayList<String> moveList){
        
        HashMap<String, State> myMap = new HashMap<String, State>();
        for (String myString : moveList){
            
            for (Path transition: this.currentState.getPaths()){
                
                if (myString.equals(transition.getLabel().getName())){
                    System.out.println("pathName equals transition in FSMSImulator");
                    myMap.put(myString, transition.getEndPoint());
                }
                
            }
            
            
            
        }
        
        
        return myMap;
    }
    
    /**
     * private method to update the possible moves
     */
    private void updatePossibleMoves(){
        this.possibleMoves.clear();
        for (Path currentPath: this.currentState.getPaths()){
            this.possibleMoves.add(currentPath.getLabel().getName());
        }
    }
    
    
}
