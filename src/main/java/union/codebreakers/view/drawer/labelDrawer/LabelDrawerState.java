package union.codebreakers.view.drawer.labelDrawer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JLabel;
import union.codebreakers.view.drawable.Drawable;
import union.codebreakers.view.drawable.DrawableLabel;
import union.codebreakers.view.drawable.DrawablePath;
import union.codebreakers.view.drawer.DrawerSpecific;

/**
 * Tool to draw representation of label for state
 */
public class LabelDrawerState implements DrawerSpecific
{
    /**
     * Draws label for state
     * @param el State to draw
     * @param g Canvas to be drawn on
     */
    @Override
    public void draw(Drawable el, Graphics g) {
        
        DrawableLabel dl = (DrawableLabel)el;
        
        //g.setColor(Color.orange);
        
        JLabel myLabel = new JLabel(dl.getLabel().getName());
        Image toDraw = (Image)myLabel.getIcon();
        //CHANGE THIS
        System.out.println("running code for label state drawing");
        g.drawImage(toDraw, 100, 100, Color.yellow, myLabel);
        
        
        
       
    }
}

