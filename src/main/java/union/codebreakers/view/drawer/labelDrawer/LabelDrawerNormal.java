package union.codebreakers.view.drawer.labelDrawer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import union.codebreakers.model.ModelLabel;
import union.codebreakers.model.ModelPath;
import union.codebreakers.model.ModelState;
import union.codebreakers.view.drawable.Drawable;
import union.codebreakers.view.drawable.DrawableLabel;
import union.codebreakers.view.drawer.DrawerSpecific;

/**
 *
 * @author 3lf
 */
public class LabelDrawerNormal implements DrawerSpecific{
    /**
     * Draws label for path
     * @param el State to draw
     * @param g Canvas to be drawn on
     */
    @Override
    public void draw(Drawable el, Graphics g) {
        DrawableLabel dl = (DrawableLabel)el;
        
        g.setColor(Color.orange);
        Point pos = this.getPos( (ModelLabel)dl.getLabel() );
        g.drawString(dl.getLabel().getName(), pos.x, pos.y);
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
