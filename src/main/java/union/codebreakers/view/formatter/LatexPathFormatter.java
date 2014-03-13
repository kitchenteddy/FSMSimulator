package union.codebreakers.view.formatter;

/**
 *
 */
public class LatexPathFormatter implements FormatterTool{

    @Override
    public String format(Formattable toFormat) {
        FormattablePath fp = (FormattablePath)toFormat;
        
        // TODO: handle self-loops
        return "\\draw [black] (" + fp.getPath().getStartPoint().getPos().x + ", " + fp.getPath().getStartPoint().getPos().y +
                                ") -- " + fp.getPath().getEndPoint().getPos().x + ", " + fp.getPath().getEndPoint().getPos().y + ");\n";
    }
    
}
