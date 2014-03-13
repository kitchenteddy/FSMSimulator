
package union.codebreakers.view.formatter;
import union.codebreakers.helper.enums.FormatterType;
import union.codebreakers.model.*;

/**
 *
 */
public class FormattablePath implements Formattable{
    
    private Path myPath;
    
    /**
     * accept method for things that are visitable by the formatter
     * @param myVisitor
     * @return 
     */
    public String visitFormatter(FormatterVisitor fv, FormatterType myType)
    {
        return fv.acceptFormattable(this, myType);
    }
    
    /**
     * returns the path in the model representing this Formattable
     * @return 
     */
    public Path getPath()
    {
        return myPath;
    }
    
    /**
     * returns the path in the model representing this Formattable
     * 
     * @param newPath   New path
     */
    public void setPath(Path newPath)
    {
        this.myPath = newPath;
    }    
}
