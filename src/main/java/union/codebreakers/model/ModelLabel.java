package union.codebreakers.model;

import union.codebreakers.helper.LabelType;
import java.awt.Point;



public class ModelLabel implements Movable, Label, Collidable
{
    
    
        private String name;
        private LabelType type;
	public Point position;
	
        
        
        
	/**
	 * constructor for ModelLabel
	 * 
	 */
	public ModelLabel() 
        {
            this.name = "";
	}
        
        

	
        
        
        
        
        
        /**
	 * 
	 * sets the name of this label
         * 
         * @param newName
	 */
        public void setName(String newName)
        {
            this.name = newName;
        }
        
        
        
        /**
	 * 
	 * gets the type of this Label
         * 
	 */
        public LabelType getType(){
            return this.type;
        }
	
        
        
        /**
	 * 
	 * 
	 */
        public void setType(LabelType NewType){
            this.type = NewType;
        }

        
        
        
        /**
	 * 
	 * 
	 */
	public boolean isCollision(Point Pnt) {
		// TODO : to implement
		return false;	
	}
	
}

