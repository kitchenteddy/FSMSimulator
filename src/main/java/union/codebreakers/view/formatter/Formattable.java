package union.codebreakers.view.formatter;

import union.codebreakers.helper.enums.FormatterType;

/**
 *
 */
public interface Formattable {
    
    
    /**
     * accept method for things that are visitable by the formatter
     * @param myVisitor
     * @param myType
     * @return 
     */
    public String acceptFormatter(FormatterVisitor myVisitor, FormatterType myType);
}
