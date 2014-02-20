/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.view.formatter;
import union.codebreakers.helper.enums.FormatterType;
import union.codebreakers.model.*;
/**
 *
 * @author teddykitchen
 */
public class FormattablePath implements Formattable{
    
    
    
    
    
    
    private Path myPath;
    
    
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
                myFormatter = new ReadablePathFormatter();
                break;
            case eLoadable:
                myFormatter = new LoadablePathFormatter();
                break;
            default:
                myFormatter = new ReadablePathFormatter();
                break;
        }
        
        return myFormatter.format(this);
    }
    
    
    
    
    
    /**
     * returns the path in the model representing this Formattable
     * @return 
     */
    public Path getPath()
    {
        return myPath;
    }
    
}
