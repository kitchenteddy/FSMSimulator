package union.codebreakers.model;

import union.codebreakers.helper.LabelType;
import java.awt.Point;
import union.codebreakers.view.formatter.FormatterVisitor;

public class ModelLabel implements Movable, Label, Collidable, FormatterVisitable
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
    }

    
    
    
    
    
    /**
     * Gets text for this label
     * @return String name of this label
     */
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
    public void setType(LabelType newType){
        this.type = newType;
    }

    /**
     * Returns collidable version of label
     * @return Collidable label
     */
        @Override
    public Collidable getCollidable()
    {
        return this;
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

    /**
     * accept method to format ModelLabel
     * @param myVisitor
     * @return 
     */
    @Override
    public String acceptFormatter(FormatterVisitor myVisitor) {
        return myVisitor.visitElement(this);
    }
}
