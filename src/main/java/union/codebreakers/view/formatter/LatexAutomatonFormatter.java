/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.view.formatter;

/**
 *
 */
public class LatexAutomatonFormatter implements FormatterTool{
    
    public String format(Formattable toFormat) 
    {
        String start = "\\documentclass[12pt]{article}\n" +
        "\\usepackage{tikz}\n" +
        "\n" +
        "\\begin{document}\n" +
        "\n" +
        "\\begin{center}\n" +
        "\\begin{tikzpicture}[scale=0.2]\n" +
        "\\tikzstyle{every node}+=[inner sep=0pt]\n";
        
        ///Get Middle string here
        String middle = "";         
        
                
        String end = "\\end{tikzpicture}\n" +
        "\\end{center}\n" +
        "\n" +
        "\\end{document}";
        
        return start + middle + end;
    }
}
