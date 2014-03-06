package union.codebreakers.helper;

import union.codebreakers.model.Collidable;
import java.awt.Rectangle;
import java.util.List;
import union.codebreakers.model.State;

/**
 * Collision handler
 */
public class CollisionHandler
{
    private Container  container = null;
    private State selected = null; // state we're currently editing
    private Collidable hit = null; // we intercepted collision with this element
  
    /**
     * Constructor
     * 
     * @param c Container for this collision handler
     */
    public CollisionHandler(Container c){
        this.container = c;
    }
    
    /**
     * Sets intercepted collision
     * 
     * @param newHit Collision element
     */
    public void setHitElement(Collidable newHit){
        this.hit = newHit;
    }
    
    /**
     * Gets intercepted collision
     * 
     * @return  Collision element
     */
    public Collidable getHitElement(){
        return this.hit;
    }

    /**
     * Sets selected state
     * 
     * @param newSelect Selected state
     */
    public void setSelectedState(State newSelect){
        this.selected = newSelect;
    }

    /**
     * Gets selected state
     * 
     * @return Selected state
     */
    public State getSelectedState(){
        return this.selected;
    }
    
    /**
     * Checks, if user clicked on any element in FSM
     * 
     * @param mouse_rect Rectangle around mouse cursor
     * @return Whether the collision occurred
     */
    public boolean checkCollisionCollidables(Rectangle mouse_rect){
        List<Collidable> elements = this.container.getMainController().getAutomaton().getCollectionCollidables();
        if( elements.size() > 0 ) { // checks interaction with other states
            // first check, if there isnt anything beneath the cursor

            for(Collidable c : elements){
                if( c != null){ // just to be sure
                    if(  c.getShape() != null ) {
                        if( mouse_rect.getBounds2D().intersects(c.getShape().getBounds2D())){
                            this.hit = c;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}

