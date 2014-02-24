package union.codebreakers.model;

import union.codebreakers.helper.enums.LabelType;
import java.awt.Point;
import java.awt.Shape;
import java.io.Serializable;

public class ModelLabel implements Movable, Label, Collidable, Serializable
{
    private String name;
    private LabelType type;
    public Point position;

    /**
     * Constructor for ModelLabel
     */
    public ModelLabel() 
    {
        this.name = "";
        this.type = LabelType.ePath;
        this.position = new Point(0,0);
    }
    
    /**
     * Gets text for this label
     * @return String name of this label
     */
    @Override
    public String getName()
    {
        return this.name;
    }
        
    /**
     * Sets the name of this label
     * 
     * @param newName
     */
    @Override
    public void setName(String newName)
    {
        this.name = newName;
    }

    /**
     * Gets the type of this Label
     * 
     * @return Type of label
     */
    @Override
    public LabelType getType(){
        return this.type;
    }

    /**
     * Sets type of label
     * 
     * @param newType Type of label
     * 
     */
    @Override
    public void setType(LabelType newType){
        this.type = newType;
    }
    
    
    
    
    
    
    
     /**
     * gets the position of this label
     * @return Point
     */
    public Point getPos()
    {
        return this.position;
    }
    
    
    
    /**
     * sets the position of this label
     * @param newPos
     */
    public void setPos(Point newPos)
    {
        this.position = newPos;
    }
    
    
    
    
    

    /**
     * Gets shape of this element
     * 
     * @return Shape of the element
     */
    @Override
    public Shape getShape(){
        return null;
    }
}
