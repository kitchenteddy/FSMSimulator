/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.controller.simulator;

import java.util.ArrayList;

/**
 *
 * @author teddykitchen
 */
public class TextReader {
    
    
    /**
     * takes a string and breaks it up into an array list by where commas are
     * @param text
     * @return 
     */
    public ArrayList<String> interpretText(String text){
        ArrayList<String> myList = new ArrayList<String>();
        
        //get index of first comma indexOf()
        //save string upto comma to list substring(0,index of coma -1)
        //remove everything up to the comma by replacing self with substring(indexOfComma+1) 
        while(text != "" || text != null){
            
            if (!text.contains(",")){
                myList.add(text);
                text = "";
            }
            else{
                int commaIndex = text.indexOf(",");
                String toAdd = text.substring(0,commaIndex);
                myList.add(toAdd);
                text = text.substring(commaIndex+1);
                
                
            }
            
        }
         
        
        
        
        return myList;
    }
    
    
}
