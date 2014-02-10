package union.codebreakers.helper;

import union.codebreakers.model.Collidable;
import union.codebreakers.model.ModelState;
import java.awt.Point;

/**
 * Collision handler
 */
public class CollisionHandler implements CollisionHandlerGeneric
{
    /**
     * Checks collision with the provided point across all collidable elements 
     * 
     * @param pnt Point to check for collision
     * @return Element with which the collision has occurred
     */
    @Override
    public Collidable checkCollision(Point pnt) {
        // TODO : to implement
        return null;
    }
	
    /**
     * Checks, if the selected states collides with another collidable states
     * 
     * @param el Instance of selected state
     * @param pnt Point where the state should be
     * 
     * @return Whether the collision occurred
     */
        @Override
    public boolean checkCollisionStates(ModelState el, Point pnt) {
        // TODO : to implement
        return false;	
    }	
}

