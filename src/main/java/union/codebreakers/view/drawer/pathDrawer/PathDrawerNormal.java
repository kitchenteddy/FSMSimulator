package union.codebreakers.view.drawer.pathDrawer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.AffineTransform;
import union.codebreakers.view.drawable.Drawable;
import union.codebreakers.view.drawable.DrawablePath;
import union.codebreakers.view.drawer.DrawerSpecific;

/**
 * Tool to draw representation of normal path
 */
public class PathDrawerNormal  implements DrawerSpecific
{
    /**
     * Draws line with arrow between two states
     * @param el State to draw
     * @param g Canvas to be drawn on
     */
    @Override
    public void draw(Drawable el, Graphics g) {
            // TODO : to implement
        if( el == null ) {
            return;
        }
        if( el instanceof DrawablePath ){
            DrawablePath dp = (DrawablePath)el;
            Graphics2D g2d = (Graphics2D)g.create();
            g2d.setColor(Color.orange);
            
            
           
            int x1 = dp.getPath().getStartPoint().getPos().x;
            int y1 = dp.getPath().getStartPoint().getPos().y;
            int x2 = dp.getPath().getEndPoint().getPos().x;
            int y2 = dp.getPath().getEndPoint().getPos().y;
            
            
            g2d.drawLine(x1, y1, x2, y2);
            
            if (x1 != x2 || y1 != y2)
            {
                AffineTransform tx = new AffineTransform();
                Polygon arrowHead = new Polygon();
                arrowHead.addPoint( 0,5);
                arrowHead.addPoint( -5, -5);
                arrowHead.addPoint( 5,-5);
            
                tx.setToIdentity();
                double angle = Math.atan2(y2-y1, x2-x1);
                tx.translate(x2, y2);
                tx.rotate((angle-Math.PI/2d));
            
                g2d.setTransform(tx);
                g2d.fill(arrowHead);
                g2d.dispose();

                g.drawPolygon(arrowHead);
            }
            
            
            
           
            
            
            
            //g.drawArc(x2, y2, 50, 50, 90, 180);


            //g.drawLine(dp.getPath().getStartPoint().getPos().x, dp.getPath().getStartPoint().getPos().y, dp.getPath().getEndPoint().getPos().x, dp.getPath().getEndPoint().getPos().y);
            
            //g.drawArc(x, y, width, height, startAngle, arcAngle);
            
            
            //g.drawPolygon(xPoints, yPoints, nPoints);
        }
    }
}

