package union.codebreakers.controller;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.*;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.List;
import union.codebreakers.gui.MainFrame;
import union.codebreakers.helper.enums.LabelType;
import union.codebreakers.helper.enums.OperationType;
import union.codebreakers.helper.enums.StateType;
import union.codebreakers.model.Collidable;
import union.codebreakers.model.Label;
import union.codebreakers.model.ModelLabel;
import union.codebreakers.model.ModelState;
import union.codebreakers.model.State;
import union.codebreakers.view.drawer.stateDrawer.StateDrawer;

/**
 * Controller handling manipulation with automaton
 */
public class AutomatonController  implements KeyListener, MouseListener, MouseMotionListener{
    
    private MainFrame mainFrame = null;
    private static int offset = 5;
    private State selected = null;
    private Collidable hit = null;
    private OperationType operation = OperationType.eNone;
    
    /**
     * Sets pointer to main frame
     * 
     * @param frame 
     */
    public void setMainFrame(MainFrame frame){
        this.mainFrame = frame;
    }

    /**
     * Handles mouse clicks on automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mouseClicked(MouseEvent me) {
        int i = me.getButton();
        this.hit = null;
        this.mainFrame.requestFocusInWindow(); 
        switch( me.getButton() ){
            case 1: // left-click
            {
                
                
                System.out.println("left click");
                if( this.selected == null ) { // no state selected so you can add one
                    
                    Collidable interaction = this.checkCollisionCollidables(me.getPoint());
                    if( interaction != null ){
                        if( interaction instanceof State ) {
                            this.selected = (State)interaction;
                            break;
                        }
                    } else {
                        this.createState(me.getPoint());
                    }

                } else {
                    
                    Collidable interaction = this.checkCollisionCollidables(me.getPoint());
                    if( interaction != null ){
                        if( interaction instanceof State ) {
                            if( this.operation == OperationType.eSelecting ) {
                              this.selected.addPath((State)interaction);
                              this.mainFrame.getDrawingPlace().repaint();
                            } else {
                                this.operation = OperationType.eNone;
                                this.selected = (State)interaction;
                            }
                        }
                    } else {
                        this.createState(me.getPoint());
                    }
                    
                }
                break;
            }
            case 3: // right-click
            {
                
                
                
                
                Collidable interaction = this.checkCollisionCollidables(me.getPoint());
                if( interaction == null )
                {
                    //Create a label add it to model
                    this.createLabel(me.getPoint(), "whats goood foooools");
                    
                }
                
                
                
                //this.mainFrame.runPersonal();
                
                System.out.println("FUCK YEAH BITCHES");
                break;
            }
        }
    }
    
    private Collidable checkCollisionCollidables(Point me){
        List<Collidable> elements = this.mainFrame.getMainController().getAutomaton().getCollectionCollidables();
        if( elements.size() > 0 ) { // checks interaction with other states
            // first check, if there isnt anything beneath the cursor
            Rectangle mouse_rect = new Rectangle(me.x - 2, me.y - 2, 4, 4);

            for(Collidable c : elements){
                if( c != null){ // just to be sure
                    // TODO: change this to visitor, if there's time => this is too unflexible
                    if(  c.getShape() != null ) {
                        if( mouse_rect.getBounds2D().intersects(c.getShape().getBounds2D())){
                            return c;
                        }
                    }
                }
            }
        }
        return null;
    }
    
    
    
    
    
    
    /**
     * 
     */
    private void createLabel(Point me, String myText)
    {
        
        ModelLabel freeLabel = new ModelLabel();
        freeLabel.setName(myText);
        freeLabel.setType(LabelType.eFree);
        this.mainFrame.getMainController().getAutomaton().addCollidable(freeLabel);
    }
    
    /**
     * 
     * 
     * @param me
     * @return 
     */
    private boolean createState(Point me){
        boolean res = false;
        int size = this.mainFrame.getMainController().getAutomaton().getCollectionStates().size();
        ModelLabel ml = new ModelLabel();
        ml.setName(Integer.toString(size+1));
        ml.setType(LabelType.eState);
        StateType type = size == 0 ? StateType.eStart : StateType.eNormal;                

        if( this.checkWithinBoundaries(me, type)){
            ModelState ms = new ModelState(type, me, ml, this.mainFrame.getMainController().getAutomaton());
            this.mainFrame.getMainController().getAutomaton().addState(ms);
            this.selected = ms;
            this.mainFrame.getDrawingPlace().repaint();
            res = true;
        }
        return res;
    }
    
    /**
     * Checks, if the state can be drawn at that position
     * 
     * @param where
     * @param type
     * @return 
     */
    private boolean checkWithinBoundaries(Point where, StateType type){
        boolean result = true;
        Point dim = StateDrawer.getDimensions(type);
        
        if( 
            ( where.x - dim.x/2 < 0 ) ||
            ( where.x + dim.x/2 > this.mainFrame.getDrawingPlace().getWidth() ) ||
            ( where.y - dim.y/2 < 0 ) ||
            ( where.y - dim.y/2 > this.mainFrame.getDrawingPlace().getHeight() )
          ){
            result = false;
        }
        return result;
    }

    /**
     * Handles mouse press on automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mousePressed(MouseEvent me) {
    }

    /**
     * Handles mouse release on automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mouseReleased(MouseEvent me) {
    }

    /**
     * Handles mouse enters on automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mouseEntered(MouseEvent me) {
    }

    /**
     * Handles mouse leaves on automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mouseExited(MouseEvent me) {
    }

    /**
     * Key was typed
     * 
     * @param ke Information about event
     */
    @Override
    public void keyTyped(KeyEvent ke) {
    }

    /**
     * Key was pressed
     * 
     * @param ke Information about event
     */
    @Override
    public void keyPressed(KeyEvent ke) {
        switch(ke.getKeyCode()){
            case VK_SHIFT:
                if( this.selected != null ) {
                    this.operation = OperationType.eSelecting;
                }
                break;
        }
    }

    /**
     * Key was released
     * 
     * @param ke Information about event
     */
    @Override
    public void keyReleased(KeyEvent ke) {
        switch(ke.getKeyCode()){
            case VK_1 :
                if( this.selected != null ) {
                    this.selected.setType(StateType.eStart);
                    this.mainFrame.getDrawingPlace().repaint();
                }
                break;
            case VK_2 :
                if( this.selected != null ) {
                    this.selected.setType(StateType.eNormal);
                    this.mainFrame.getDrawingPlace().repaint();
                }
                break;
            case VK_3 :
                if( this.selected != null ) {
                    this.selected.setType(StateType.eEnd);
                    this.mainFrame.getDrawingPlace().repaint();
                }
                break;
            case VK_SHIFT:
                this.operation = OperationType.eNone;
                break;
            case VK_DELETE:
                // delete selected element
                if( this.selected != null ){
                    this.mainFrame.getMainController().getAutomaton().removeState(selected);
                    this.mainFrame.getDrawingPlace().repaint();
                }
                break;
        }
    }

    /**
     * Event triggered when mouse is being dragged
     * 
     * @param me Data about event
     */
    @Override
    public void mouseDragged(MouseEvent me) {
        if(this.selected != null) {
            this.selected.setPos(me.getPoint());
            this.mainFrame.getDrawingPlace().repaint();
        }
    }

    /**
     * Event triggered when mouse is being moved
     * 
     * @param me Data about event
     */
    @Override
    public void mouseMoved(MouseEvent me) {
    }
}
