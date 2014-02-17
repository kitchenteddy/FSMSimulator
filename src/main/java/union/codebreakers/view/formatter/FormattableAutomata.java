/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.view.formatter;
import union.codebreakers.helper.FormatterType;
import union.codebreakers.model.*;
/**
 *
 * @author teddykitchen
 */
public class FormattableAutomata implements Formattable{
    
    private Automata myAutomata;
    
    
    
    
    
    
    public FormattableAutomata(Automata myModel)
    {
        this.myAutomata = myModel;
    }
    
    /**
     * accept method for things that are visitable by the formatter
     * @param myVisitor
     * @return 
     */
    public String acceptFormatter(FormatterVisitor myVisitor, FormatterType myType)
    {
        
        FormatterTool myFormatter;
        
        switch(myType)
        {
            case eReadable:
                myFormatter = new ReadableAutomataFormatter();
            case eLoadable:
                myFormatter = new LoadableAutomataFormatter();
            default:
                myFormatter = new ReadableAutomataFormatter();
        }
        
        return myFormatter.format(this);
        
    }
    
    
    /**
     * returns the state in the model representing this Formattable
     * @return 
     */
    public Automata getAutomata()
    {
        return myAutomata;
    }
    
    
    
    
}
