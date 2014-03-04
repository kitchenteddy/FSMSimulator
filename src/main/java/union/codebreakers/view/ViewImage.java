package union.codebreakers.view;

import java.awt.Graphics;
import java.util.List;
import union.codebreakers.model.Automaton;
import union.codebreakers.model.Path;
import union.codebreakers.model.State;
import union.codebreakers.view.drawable.DrawableLabel;
import union.codebreakers.view.drawable.DrawablePath;
import union.codebreakers.view.drawable.DrawableState;
import union.codebreakers.view.drawer.DrawerStockGeneric;

/**
 * Graphical representation of automata
 */
public class ViewImage implements View
{
    private Automaton fsm;
    private Graphics canvas = null;
    private DrawerStockGeneric drawingTools = null;
    
    /**
     * Sets output graphic canvas for this view
     * 
     * @param g Output graphics canvas
     */
    public void setOutput(Graphics g){
       this.canvas = g; 
    }
    
    /**
     * Sets currently handled automaton
     * 
     * @param newFsm Instance of automaton
     */
    public void setAutomaton(Automaton newFsm){
        this.fsm = newFsm;
    }
    
    /**
     * Gets drawing tools object
     * 
     * @return Instance of drawing tools
     */
    public DrawerStockGeneric getDrawerStocck(){
        return this.drawingTools;
    }
    
    /**
     * Sets drawing tools object
     * 
     * @param newDrawer Instance of drawing tools
     */
    public void setDrawerStocck(DrawerStockGeneric newDrawer){
        this.drawingTools = newDrawer;
    }

    /**
     * Draws whole automata
     */
    public void  drawOutput() {
        if( this.fsm != null ){
            DrawableState ds = new DrawableState();
            DrawablePath dp = new DrawablePath();
            DrawableLabel dl = new DrawableLabel();

            List<Path> paths;
            for(State s : this.fsm.getCollectionStates()){
                // draw state
                ds.setState(s);
                ds.setupDrawing(this.drawingTools, this.canvas);

                // draw label
                dl.setLabel(s.getLabel());
                dl.setupDrawing(this.drawingTools, this.canvas);                
                
                paths = s.getPaths();
                for(Path p : paths ) {
                    dp.setPath(p);
                    dp.setupDrawing(this.drawingTools, this.canvas);                    
                    // draw label
                    dl.setLabel(p.getLabel());
                    dl.setupDrawing(this.drawingTools, this.canvas);                
                }
            }
        }
    }
}

