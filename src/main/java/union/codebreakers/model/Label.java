package union.codebreakers.model;


import java.awt.Point;
import union.codebreakers.helper.LabelType;




/**
 * Label interface for various objects
 */

public interface Label 
{
    /**
     * Formats label into string
     * @return String representation of this label
     */
    @Override
    public String toString();
        
    /**
     * Sets text for this label
     * @param newName New text for this label
     */
    public void setName(String newName);
       
    /**
     * Gets type of this label
     * @return Type of this label
     */
    public LabelType getType();
    
    
    
    
    
    /**
     * Returns collidable version of state
     * @return Collidable state
     */
    public Collidable getCollidable();
}

