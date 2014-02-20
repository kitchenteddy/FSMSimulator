package union.codebreakers.view;

import java.awt.Graphics;
import java.util.List;
import union.codebreakers.helper.ToolsFactory;
import union.codebreakers.model.Automaton;
import union.codebreakers.model.Path;
import union.codebreakers.model.State;
import union.codebreakers.view.drawable.DrawablePath;
import union.codebreakers.view.drawable.DrawableState;

/**
 * Graphical representation of automata
 */
public class ViewImage implements View
{
    private Automaton fsm;
    
    private Graphics canvas = null;

    /**
     * Constructor
     * 
     * @param a Instance of automaton connected to this view
     */
    public ViewImage(Automaton a){
        this.fsm = a;
    }
    
    /**
     * Sets output graphic canvas for this view
     * 
     * @param g Output graphics canvas
     */
    public void setOutput(Graphics g){
       this.canvas = g; 
    }

    /**
     * Draws whole automata
     */
    public void  drawOutput() {
        if( this.fsm != null ){
            DrawableState ds = new DrawableState();
            DrawablePath dp = new DrawablePath();
            List<Path> paths;
            for(State s : this.fsm.getCollectionStates()){
                ds.setState(s);
                ds.setupDrawing(ToolsFactory.getDrawerStock(), this.canvas);
                paths = s.getPaths();
                for(Path p : paths ) {
                    dp.setPath(p);
                    dp.setupDrawing(ToolsFactory.getDrawerStock(), this.canvas);                    
                }
            }
        }
    }
}

