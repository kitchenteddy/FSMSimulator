package union.codebreakers.controller.behaviorManager.mouseBehavior;

import union.codebreakers.controller.behaviorManager.MouseBehaviorManager;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import union.codebreakers.command.CommandCreateState;
import union.codebreakers.helper.enums.LabelType;
import union.codebreakers.helper.enums.MouseBehaviorType;
import union.codebreakers.model.ModelLabel;
import union.codebreakers.model.ModelPath;
import union.codebreakers.model.Path;
import union.codebreakers.model.State;

/**
 *  Initial mouse behavior is selected when nothing is selected
 */
public class MouseBehaviorInitial extends MouseBehaviorDummy {

    /**
     * Constructor
     * 
     * @param newMbm Instance of MouseBehaviorManager to which this mouse behavior belongs to
     */
    public MouseBehaviorInitial(MouseBehaviorManager newMbm) {
        super(newMbm);
    }

    /**
     * Handles mouse clicks on automaton
     * 
     * @param me Event that occurred
     * 
     * @return Whether the drawing area should be repainted
     */
    @Override
    public boolean mouseClicked(MouseEvent me){
        this.mbm.getContainer().getCollisionHandler().setHitElement(null);
        Rectangle mouse_rect = new Rectangle(me.getX() - 2, me.getY() - 2, 4, 4);
        boolean repaint = false;
       
        switch( me.getButton() ){
            case 1: // left click
                if( this.mbm.getContainer().getCollisionHandler().checkCollisionCollidables(mouse_rect) ){
                    // user clicked on something
                   if( this.mbm.getContainer().getCollisionHandler().getHitElement() instanceof State ){
                       this.mbm.getContainer().getCollisionHandler().setSelectedState((State)this.mbm.getContainer().getCollisionHandler().getHitElement());
                       this.mbm.setMouseBehavior(MouseBehaviorType.eSelected, false);
                       return true; // repaint canvas in case we highlight selected state somehow
                   }
                   
                   
                   //ADD TO THIS LATER WHEN WE CAN UNSELECT
//                   //TBK
//                   else if(this.mbm.getContainer().getCollisionHandler().getHitElement() instanceof Path)
//                   {
//                       System.out.println("path collision detected");
//                       
//                   }
                   
                   
                   
                } else {
                    // user clicked on nothing so try to create a new state
                    CommandCreateState createState = new CommandCreateState(
                                                                this.mbm.getContainer().getMainController().getAutomaton(), 
                                                                me.getPoint(),
                                                                this.mbm.getContainer().getDrawingArea());
                    createState.setUpdateSelected(this.mbm.getContainer().getCollisionHandler());
                    if( this.mbm.getContainer().getCommandCenter().execute(createState) ){
                        // we created the state so change mouse behavior and repaint
                        this.mbm.setMouseBehavior(MouseBehaviorType.eSelected, false);
                       return true; // repaint canvas in case we highlight selected state somehow
                    }
                }
                break;
       }
        /*
        switch( me.getButton() ){
            case 1: // left-click
            {
                
                
                System.out.println("left click");
                if( this.selected == null ) { // no state selected so you can add one
                    

                } else {
                    
                    Collidable interaction = this.checkCollisionCollidables(me.getPoint());
                    if( interaction != null ){
                        if( interaction instanceof State ) {
                            if( this.operation == OperationType.eSelecting ) {
                              this.selected.addPath((State)interaction);
                              this.mainFrame.getDrawingPlace().repaint();
                            } else {
                                this.operation = OperationType.eNone;
                                this.selected = (State)interaction;
                            }
                        }
                    } else {
                        this.createState(me.getPoint());
                    }
                    
                }
                break;
            }
            case 3: // right-click
            {
                
                
                
                
                Collidable interaction = this.checkCollisionCollidables(me.getPoint());
                if( interaction == null )
                {
                    //Create a label add it to model
                    this.createLabel(me.getPoint(), "whats goood foooools");
                    
                }
                
                
                
                //this.mainFrame.runPersonal();
                
                System.out.println("right click");
                break;
            }
        }
  */  
        return false;
    }
   
    /**
     * incomplete needs to be modified.  we need to figure out a way of handling free Labels
     */
    private void createLabel(Point me, String myText)
    {
        ModelLabel freeLabel = new ModelLabel();
        freeLabel.setName(myText);
        freeLabel.setType(LabelType.eFree);
        this.mbm.getContainer().getMainController().getAutomaton().addCollidable(freeLabel);
    }
}
