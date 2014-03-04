package union.codebreakers.view.drawer.labelDrawer;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.JLabel;
import union.codebreakers.view.drawable.Drawable;
import union.codebreakers.view.drawable.DrawableLabel;
import union.codebreakers.view.drawer.DrawerSpecific;

/**
 * Tool to draw representation of label for path
 */
public class LabelDrawerPath implements DrawerSpecific
{
    /**
     * Draws label for path
     * @param el State to draw
     * @param g Canvas to be drawn on
     */
    @Override
    public void draw(Drawable el, Graphics g) {
        DrawableLabel dl = (DrawableLabel)el;
        
        g.setColor(Color.orange);
        
        //JLabel myLabel = new JLabel(dl.getLabel().getName());
        
       //JLabel myLabel = new JLabel("TESTING LABEL");
        //myLabel.setOpaque(true);
        //Image toDraw = (Image)myLabel.getIcon();
        //Icon myIcon = myLabel.getIcon();
        //Component myComponent = new JLabel("here is a label");
        //myIcon.paintIcon(myComponent, g, 100, 100);
        //CHANGE THIS
        //System.out.println("running code for path label drawing");
        //g.drawImage(toDraw, 100, 100, Color.white, myLabel);
        System.out.println("label name under here");
        System.out.println("OOO" + dl.getLabel().getName() + "OOO");
        
        g.drawString(dl.getLabel().getName(), dl.getLabel().getPos().x, dl.getLabel().getPos().y);
        //g.drawImage(toDraw, dl.getLabel().getPos().x, dl.getLabel().getPos().y, Color.yellow, myLabel);
        
        //Integer myInteger =  (Integer)dl.getLabel().getPos().x;
        //String myString = myInteger.toString();
        //System.out.println("BELOW HERE");
        //System.out.println(myString);
        //System.out.println("above HERE");
        
        //g.drawRect(100, 100, 100, 100);
    }
}
