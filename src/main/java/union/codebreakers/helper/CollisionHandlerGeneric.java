package union.codebreakers.helper;

import java.awt.Point;
import union.codebreakers.model.Collidable;
import union.codebreakers.model.ModelState;

/**
 * Interface for collision handler
 */
public  interface CollisionHandlerGeneric 
{
    /**
     * Checks collision with the provided point across all collidable elements 
     * 
     * @param pnt Point to check for collision
     * @return Element with which the collision has occurred
     */
    public Collidable checkCollision(Point pnt);

    /**
     * Checks, if the selected states collides with another collidable states
     * 
     * @param el Instance of selected state
     * @param pnt Point where the state should be
     * 
     * @return Whether the collision occurred
     */
    public boolean checkCollisionStates(ModelState el, Point pnt);	
}

