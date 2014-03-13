package union.codebreakers.view.formatter;

import java.awt.Point;
import union.codebreakers.model.ModelLabel;
import union.codebreakers.model.ModelPath;
import union.codebreakers.model.ModelState;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 */
public class LatexLabelFormatter implements FormatterTool{
    
    @Override
    public String format(Formattable toFormat) 
    {
        FormattableLabel fl = (FormattableLabel)toFormat;
        Point pos = this.getPos((ModelLabel)(fl.getLabel()));
        
        return "\\draw (" + pos.x + "," + pos.y + ") node {$" + fl.getLabel().getName() + "$};\n";
    }
    
    private Point getPos(ModelLabel label){
        switch( label.getType() ){
            case eState:
                {
                    return ((ModelState)(label.getParent())).getPos();
                }
            case ePath:
                {
                    ModelPath path = ((ModelPath)(label.getParent()));
                    Point p1 = path.getStartPoint().getPos();
                    Point p2 = path.getEndPoint().getPos();

                    int labelX = (p1.x + p2.x)/2;
                    int labelY = (p1.y + p2.y)/2;
                    return new Point(labelX, labelY);
            
                }
        }
        return new Point();
    }
}
