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
    public String acceptFormattable(FormattableState toFormat, FormatterType myType) {
        FormatterTool myFormatter;
        
        switch(myType)
        {
            case eReadable:
                myFormatter = new ReadableStateFormatter();
                break;
            case eLatex:
                myFormatter = new LatexStateFormatter();
                break;
            default:
                myFormatter = new ReadableStateFormatter();
                break;
        }
        
        return myFormatter.format(toFormat);
    }

    
    /**
     * visit method for Label
     * @param toFormat
     * @param myType
     * @return 
     */
    @Override
    public String acceptFormattable(FormattableLabel toFormat, FormatterType myType) {
        FormatterTool myFormatter;
        
        switch(myType)
        {
            case eReadable:
                myFormatter = new ReadableLabelFormatter();
                break;
            case eLatex:
                myFormatter = new LatexLabelFormatter();
                break;
            default:
                myFormatter = new ReadableLabelFormatter();
                break;
        }
        
        return myFormatter.format(toFormat);
    }
    
    /**
     * visit method for Path
     * @param toFormat
     * @param myType
     * @return 
     */
    @Override
    public String acceptFormattable(FormattablePath toFormat, FormatterType myType) {
        FormatterTool myFormatter;
        
        switch(myType)
        {
            case eReadable:
                myFormatter = new ReadablePathFormatter();
                break;
            case eLatex:
                myFormatter = new LatexPathFormatter();
                break;
            default:
                myFormatter = new ReadablePathFormatter();
                break;
        }
        
        return myFormatter.format(toFormat);
    }
    
    /**
     * visit method for Automata
     * @param toFormat
     * @param myType
     * @return 
     */
    @Override
    public String acceptFormattable(FormattableAutomaton toFormat, FormatterType myType)
    {
        FormatterTool myFormatter;
        
        switch(myType)
        {
            case eReadable:
                myFormatter = new ReadableAutomatonFormatter();
                break;
            case eLatex:
                myFormatter = new LatexAutomatonFormatter();
                break;
            default:
                myFormatter = new ReadableAutomatonFormatter();
                break;
        }
        
        return myFormatter.format(toFormat);
    }
}
