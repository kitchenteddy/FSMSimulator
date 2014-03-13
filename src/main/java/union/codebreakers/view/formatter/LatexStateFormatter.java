package union.codebreakers.view.formatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 */
public class LatexStateFormatter implements FormatterTool{

    @Override
    public String format(Formattable toFormat) {
        FormattableState fs = (FormattableState)toFormat;
        
        String res = "";
        switch( fs.getState().getType() ){
            case eStart:
                // TODO: consider better way to represent this
                res = "\\draw [black] (" + fs.getState().getPos().x + "," + fs.getState().getPos().y + ") circle (2);\n";
                break;
            case eNormal:
                res = "\\draw [black] (" + fs.getState().getPos().x + "," + fs.getState().getPos().y + ") circle (3);\n";
                break;
            case eEnd:
                res = "\\draw [black] (" + fs.getState().getPos().x + "," + fs.getState().getPos().y + ") circle (3);\n";
                res+= "\\draw [black] (" + fs.getState().getPos().x + "," + fs.getState().getPos().y + ") circle (2.8);\n";
                break;
        }
        // TODO: handle self-loops
        
        
        return res;
    }    
}
