package union.codebreakers.view.formatter;

import union.codebreakers.helper.enums.FormatterType;

/**
 *
 */
public class ModelFormatterVisitor implements FormatterVisitor {

    /**
     * visit method for ModelState
     * @param toFormat
     * @param myType
     * @return 
     */
    @Override
    public String visitElement(FormattableState toFormat, FormatterType myType) {
        return toFormat.acceptFormatter(this, myType);
      
    }

    
    /**
     * visit method for Label
     * @param toFormat
     * @param myType
     * @return 
     */
    @Override
    public String visitElement(FormattableLabel toFormat, FormatterType myType) {
        return toFormat.acceptFormatter(this, myType);
    }
    
    /**
     * visit method for Path
     * @param toFormat
     * @param myType
     * @return 
     */
    @Override
    public String visitElement(FormattablePath toFormat, FormatterType myType) {

        return toFormat.acceptFormatter(this, myType);
    }
    
    /**
     * visit method for Automata
     * @param toFormat
     * @param myType
     * @return 
     */
    public String visitElement(FormattableAutomaton toFormat, FormatterType myType)
    {
        return toFormat.acceptFormatter(this, myType);
    }
}
