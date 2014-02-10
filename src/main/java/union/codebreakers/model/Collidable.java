package union.codebreakers.model;

import java.awt.Point;

/**
 * Interface for collidable elements
 */
public interface Collidable 
{
    /**
     * Checks, if this element collides with the point
     * @param pnt POint to check collision with
     * 
     * @return Whether the collision occurred
     */
    public boolean isCollision(Point pnt);
}

