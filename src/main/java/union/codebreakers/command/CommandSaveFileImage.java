package union.codebreakers.command;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import union.codebreakers.gui.FsmPanel;
import union.codebreakers.model.Automaton;
import union.codebreakers.view.ViewImage;
import union.codebreakers.view.drawer.DrawerStock;

/**
 * This command will save automaton into PNG file
 */
public class CommandSaveFileImage implements Command{

    private FsmPanel drawingArea;
    private String path;
    private Automaton fsm;
    
    
    public CommandSaveFileImage(FsmPanel g, String destination, Automaton newFsm ){
        this.drawingArea = g;
        this.path = destination;
        this.fsm = newFsm;
    }
    
    @Override
    public boolean execute() {
        boolean res = true;
        BufferedImage bImg = new BufferedImage(this.drawingArea.getWidth(), this.drawingArea.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D cg = bImg.createGraphics();
        ViewImage view = new ViewImage();
        view.setAutomaton( this.fsm );
        view.setDrawerStock( new DrawerStock() );
        view.setOutput( cg );
        view.drawOutput();

        try {
            if (!ImageIO.write(bImg, "png", new File(this.path)))
            {
                res = false;
            } 
        } catch (IOException e) {
            //TODO catch this exception
            res = false;
        }

        return res;
    }
    
}
