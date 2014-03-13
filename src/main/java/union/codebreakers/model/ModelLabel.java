package union.codebreakers.model;

import union.codebreakers.helper.enums.LabelType;
import java.awt.Point;
import java.awt.Shape;
import java.io.Serializable;
import java.util.Observable;

public class ModelLabel extends Observable implements Movable, Label, Collidable, Serializable, IsAttached
{
    private String name;
    private LabelType type;
    public Point position;
    private AutomatonPart parent;

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
        this.setChanged();
        this.notifyObservers(true);
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
        this.setChanged();
        this.notifyObservers(true);
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

    /**
     * Returns parents it is attached to
     * @return instance of the parent
     */
    @Override
    public AutomatonPart getParent(){
        return this.parent;
    }

    /**
     * Sets parents it is attached to
     * @param newParent Instane of the parent
     */
    @Override
    public void setParent( AutomatonPart newParent ){
        this.parent = newParent;
    }    
}
