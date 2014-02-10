package union.codebreakers.model;


import java.awt.Point;
import union.codebreakers.helper.LabelType;


public interface Label 
{
    @Override
    public String toString();
        
    public void setName(String newName);
       
    public LabelType getType();
    
    
    
    
    
    /**
     * Returns collidable version of state
     * @return Collidable state
     */
    public Collidable getCollidable();
}

