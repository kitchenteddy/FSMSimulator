package union.codebreakers.model;
import java.util.ArrayList;
import java.awt.Point;
import union.codebreakers.helper.StateType;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class ModelState implements State, Movable, Collidable
{
    public StateType type;

    public Point position;

    public Iterable<Path> outgoingPaths;

    public Label stateLabel;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     */
    public ModelState(){
            super();
    }

    @Override
    public StateType getType(){
        return this.type;
    }

    @Override
    public void setType(StateType newType){
        this.type = newType;
    }

    /*
    * gets the number of outgoing paths that this state has
    * @return number of outgoing paths
    */
    @Override
    public int getPathNum()
    {
        return 0;  //IMPLEMENT
    }
        
    /*
    * gets a point representing the position of a state
    * @return point for position of state
    */
    @Override
    public Point getPos()
    {
        return new Point();
    }
    
    /*
    *
    * sets the position of the state
    *
    * @param desired position point
    */
    @Override
    public void setPos(Point position)
    {
        //IMPLEMENT
    }
    
    /*
    *
    * sets the position of the state
    *
    * @param desired x postion
    * @param desired y position
    */
    @Override
    public void setPos(int x, int y)
    {
        //IMPLEMENT
    }
    
    /*
    *
    * gets the label of the state
    *
    * @return Label for the state
    */

    public Label getLabel()

    {
        return null; //IMPLEMENT
    }
    
    /*
    *
    * sets the label of the state
    *
    * @param newLabel
    */

    public void setLabel(Label newLabel)
    {
        
    }

    /*
    * sets the state's type
    @param StateType of the state
    */
    public void setType()
    {
        
    }
    
    @Override
    public Iterable getPaths()
    {
        //implement
        return new ArrayList();
    }
	
    @Override
    public boolean isCollision(Point pnt) {
        // TODO : to implement
        return false;	
    }

    /**
     * Returns radius of state
     * @return radius of state
     */
    @Override
    public int getRadius(){
        return 10;
    }

}

