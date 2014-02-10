package union.codebreakers.view.formatter;

import union.codebreakers.helper.FormatterType;

/**
 * Factory to get an instance of wanted formatter
 */
public class FormatterFactory {
    
    /**
     * FormatterFile Instance for lazy loading
     */
    protected static FormatterFile ff = null;
    
    /**
     * Setter for FormatterFile Instance
     */
    protected void initFormatterFile()
    {
        FormatterFactory.ff = new FormatterFile();
    }
    
    /**
     * FormatterFile Instance for lazy loading
     * @param type Type of formatter
     * @return Instance of wanted formatter
     */
    public Formatter makeFormatter(FormatterType type )
    {
        if (FormatterFactory.ff == null)
        {
           initFormatterFile();
        }
        return FormatterFactory.ff;
    }
    
}
