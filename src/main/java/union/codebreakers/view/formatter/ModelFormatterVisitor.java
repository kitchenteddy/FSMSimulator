package union.codebreakers.view.formatter;

import union.codebreakers.helper.enums.FormatterType;

/**
 *
 */
public class ModelFormatterVisitor implements FormatterVisitor {

    
    /**
     * visit method for ModelState
     * @param toFormat
     * @return 
     */
    @Override
   
    // Should this take a State or a formattable state?
    // Initially easier to do it this way but may need
    // to be changed in all these methods later.
    public String visitElement(FormattableState toFormat, FormatterType myType) {
        return toFormat.acceptFormatter(this, myType);
      
    }

    
    /**
     * visit method for Label
     * @param toFormat
     * @return 
     */
    @Override
    public String visitElement(FormattableLabel toFormat, FormatterType myType) {
        return toFormat.acceptFormatter(this, myType);
    }
    
    /**
     * visit method for Path
     * @param toFormat
     * @return 
     */
    @Override
    public String visitElement(FormattablePath toFormat, FormatterType myType) {

        return toFormat.acceptFormatter(this, myType);
        
        
    }
   
    
    
    
    /**
     * visit method for Automata
     * @param toFormat
     * @return 
     */
    public String visitElement(FormattableAutomaton toFormat, FormatterType myType)
    {
        return toFormat.acceptFormatter(this, myType);
    }
    
    
    
    
    
}
