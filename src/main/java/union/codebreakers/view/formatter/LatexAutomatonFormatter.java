/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.view.formatter;

import java.util.List;
import union.codebreakers.helper.enums.FormatterType;
import union.codebreakers.model.Automaton;
import union.codebreakers.model.Path;
import union.codebreakers.model.State;

/**
 *
 */
public class LatexAutomatonFormatter implements FormatterTool{
    
    private String  formatHeader(){
        return "\\documentclass[12pt]{article}\n" +
        "\\usepackage{tikz}\n" +
        "\n" +
        "\\begin{document}\n" +
        "\n" +
        "\\begin{center}\n" +
        "\\begin{tikzpicture}[scale=0.2]\n" +
        "\\tikzstyle{every node}+=[inner sep=0pt]\n";
    }
    
    private String formatFooter(){
        return "\\end{tikzpicture}\n" +
        "\\end{center}\n" +
        "\n" +
        "\\end{document}";
    }
    
    @Override
    public String format(Formattable toFormat) 
    {
        String output = "";
        FormattableAutomaton fa = (FormattableAutomaton)toFormat;
        Automaton fsm = (Automaton)fa.getAutomaton();
        List<State> states = fsm.getCollectionStates();
        
        FormatterVisitor fv = new ModelFormatterVisitor();
        FormattableState fs = new FormattableState();
        FormattableLabel fl = new FormattableLabel();
        FormattablePath fp = new FormattablePath();
        for( State state : states ){
            fs.setState(state);
            output += fs.visitFormatter(fv, FormatterType.eLatex);
            fl.setLabel(state.getLabel());
            output += fl.visitFormatter(fv, FormatterType.eLatex);
            
            for( Path path : state.getPaths() ){
                fp.setPath(path);
                output += fp.visitFormatter(fv, FormatterType.eLatex);
                if( path.getLabel() != null ){
                    fl.setLabel(path.getLabel());
                    output += fl.visitFormatter(fv, FormatterType.eLatex);                    
                }
            }
        }
        
        return this.formatHeader() + output + this.formatFooter();
    }
}
