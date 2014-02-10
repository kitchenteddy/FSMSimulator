package union.codebreakers.model;

import union.codebreakers.helper.LabelType;
import java.awt.Point;

/**
 * Model for labels (both path label and state label)
 */
public class ModelLabel implements Movable, Label, Collidable
{
    private String name;
    private LabelType type;
    public Point position;

    /**
     * Constructor
     */
    public ModelLabel(){
            super();
    }

    /**
     * Sets text for this label
     * @param newName New text for this label
     */
    @Override
    public void setName(String newName)
    {
        this.name = newName;
    }

    /**
     * Gets type of this label
     * @return Type of this label
     */
    @Override
    public LabelType getType(){
        return this.type;
    }

    /**
     * Sets type of this label
     * @param newType New type of this label
     */
    public void setType(LabelType newType){
        this.type = newType;
    }

    /**
     * Checks, if this element collides with the point
     * @param pnt POint to check collision with
     * 
     * @return Whether the collision occurred
     */
    @Override
    public boolean isCollision(Point pnt) {
            // TODO : to implement
            return false;	
    }
}