package union.codebreakers.model;

import union.codebreakers.helper.LabelType;
import java.awt.Point;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class ModelLabel implements Movable, Label, Collidable
{
    
    
        private String name;
        private LabelType type;
	public Point position;
	
        
        
        
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ModelLabel(){
		super();
	}

	
        
        
        
        
        
        @Override
        public void setName(String newName)
        {
            this.name = newName;
        }
        
        
        
        @Override
        public LabelType getType(){
            return this.type;
        }
	
        public void setType(LabelType NewType){
            this.type = NewType;
        }

        @Override
	public boolean isCollision(Point Pnt) {
		// TODO : to implement
		return false;	
	}
	
}

