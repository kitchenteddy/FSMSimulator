package union.codebreakers.view.drawer.pathDrawer;

import java.awt.Color;
import java.awt.Graphics;
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
            g.setColor(Color.orange);
            g.drawLine(dp.getPath().getStartPoint().getPos().x, dp.getPath().getStartPoint().getPos().y, dp.getPath().getEndPoint().getPos().x, dp.getPath().getEndPoint().getPos().y);
        }
    }
}

