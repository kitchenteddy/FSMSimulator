package union.codebreakers.view.formatter;

import union.codebreakers.model.Label;

/**
 *
 */
public class ReadableLabelFormatter implements FormatterTool{

    @Override
    public String format(Formattable toFormat) {
        
        String toReturn = "";
        FormattableLabel myFormattableLabel = (FormattableLabel)toFormat;
        Label myLabel = myFormattableLabel.getLabel();
        toReturn += myLabel.getName();
        
        
        return toReturn;
    }
    
}
