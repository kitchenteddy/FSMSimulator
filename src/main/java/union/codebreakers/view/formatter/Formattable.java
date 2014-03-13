package union.codebreakers.view.formatter;

import union.codebreakers.helper.enums.FormatterType;

/**
 *
 */
public interface Formattable {

    /**
     * accept method for things that are visitable by the formatter
     * @param myVisitor     Formatter visitor
     * @param myType       Type of file format
     * @return 
     */
    public String acceptFormatter(FormatterVisitor myVisitor, FormatterType myType);
}
