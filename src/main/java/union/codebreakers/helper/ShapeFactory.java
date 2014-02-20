package union.codebreakers.helper;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

/**
 * Shapes factory which provides instances of Shapes for purposes of testing collisions (interaction with UI)
 * 
 * NOTE: Suited only to use when testing interaction mouse vs shape
 */
public class ShapeFactory {
    
    private static Rectangle rect = null;
    private static Ellipse2D ellipse = null;
    private static Line2D line = null;
    
    /**
     * Gets instance of rectangle to test intersection against
     * 
     * @param x1 X-coordinates upper-left corner
     * @param y1 Y-coordinates upper-left corner
     * @param x2 X-coordinates bottom-right corner
     * @param y2 Y-coordinates bottom-right corner
     * @return Returns instance of Rectangle element with appropriate coordinates
     */
    public static Rectangle getRect(int x1, int y1, int x2, int y2){
        if( ShapeFactory.rect == null ) {
            ShapeFactory.rect = new Rectangle();
        }
        ShapeFactory.rect.setBounds(x1, y1, x2, y2);
        
        return ShapeFactory.rect;
    }
    
    /**
     * Gets instance of rectangle to test intersection against
     * 
     * @param pos upper-left of ellipse
     * @param w width of ellipse
     * @param h height of ellipse
     * 
     * @return Returns instance of Rectangle element with appropriate coordinates
     */
    public static Ellipse2D getEllipse(Point pos, float w, float h){
        if( ShapeFactory.ellipse == null ) {
            ShapeFactory.ellipse = new Ellipse2D.Float();
        }
        ShapeFactory.ellipse.setFrame(pos.x, pos.y, w, h);
        
        return ShapeFactory.ellipse;
    }
    
    /**
     * Gets instance of rectangle to test intersection against
     * 
     * @param p1 starting point
     * @param p2 ending point
     * @return Returns instance of Rectangle element with appropriate coordinates
     */
    public static Line2D getLine(Point p1, Point p2){
        if( ShapeFactory.line == null ) {
            ShapeFactory.line = new Line2D.Float();
        }
        ShapeFactory.line.setLine(p1, p2);
        
        return ShapeFactory.line;
    }
}
