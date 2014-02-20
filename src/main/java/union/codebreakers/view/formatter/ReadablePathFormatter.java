package union.codebreakers.view.formatter;

import union.codebreakers.model.Path;

/**
 *
 */
public class ReadablePathFormatter implements FormatterTool{

    @Override
    public String format(Formattable toFormat) {
        String toReturn = "Path Label: ";
        
        FormattablePath myFormattablePath = (FormattablePath)toFormat;
        Path myPath = myFormattablePath.getPath();
        
        
        
        toReturn += myPath.getLabel().getName();
        
        toReturn += "\nPath Type: ";
        toReturn += myPath.getType().toString();
        
        toReturn += "\nEndPoint: ";
        toReturn += myPath.getEndPoint().getLabel().getName();
        
        toReturn += "\n";
        
        
        return toReturn;
        
        
    }
    
}
