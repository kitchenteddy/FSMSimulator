/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.controller.behaviorManager.mouseBehavior;

import union.codebreakers.controller.behaviorManager.MouseBehaviorManager;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import union.codebreakers.command.CommandCreatePath;
import union.codebreakers.command.CommandCreatePathLabel;
import union.codebreakers.command.CommandCreateState;
import union.codebreakers.helper.enums.KeyboardBehaviorType;
import union.codebreakers.helper.enums.MouseBehaviorType;
import union.codebreakers.model.Path;
import union.codebreakers.model.State;

/**
 * Mouse behavior for working with selected states
 */
public class MouseBehaviorSelected extends MouseBehaviorDummy{

    /**
     * Constructor
     * 
     * @param newMbm Instance of MouseBehaviorManager to which this mouse behavior belongs to
     */
    public MouseBehaviorSelected(MouseBehaviorManager newMbm) {
        super(newMbm);
    }
    

    /**
     * Handles mouse press on automaton
     * 
     * @param me Event that occurred
     * 
     * @return Whether the drawing area should be repainted
     */
    @Override
    public boolean mousePressed(MouseEvent me){
        this.mbm.getContainer().getCollisionHandler().setHitElement(null);
        Rectangle mouse_rect = new Rectangle(me.getX() - 2, me.getY() - 2, 4, 4);
        
        switch( me.getButton() ){
            case 1: // left button
                if( this.mbm.getContainer().getCollisionHandler().checkCollisionCollidables(mouse_rect) ){
                    // user clicked on something
                   if( this.mbm.getContainer().getCollisionHandler().getHitElement() instanceof State ){
                       
                       if( this.mbm.getContainer().getKeyboardBehaviorManager().getCurrentType() == KeyboardBehaviorType.eAddPath ){
                           
                           
                           
                           // THis seems to be adding paths not states
                           
                            CommandCreatePath createPath = new CommandCreatePath(
                                        this.mbm.getContainer().getCollisionHandler().getSelectedState(),
                                        (State)this.mbm.getContainer().getCollisionHandler().getHitElement(),
                                        this.mbm.getContainer()
                                                                        );

                            if( this.mbm.getContainer().getCommandCenter().execute(createPath) ){
                                return true;
                            }
                       } else {
                            // initialize dragging
                            this.mbm.getContainer().getCollisionHandler().setSelectedState((State)this.mbm.getContainer().getCollisionHandler().getHitElement());
                            this.mbm.setMouseBehavior(MouseBehaviorType.eDragging, false);                           
                       }
                       return true; // repaint canvas in case we highlight selected state somehow
                   }
                   
                   
                   //TBK
                   else if(this.mbm.getContainer().getCollisionHandler().getHitElement() instanceof Path)
                   {
                       
                       CommandCreatePathLabel createPathLabel = new CommandCreatePathLabel((Path)this.mbm.getContainer().getCollisionHandler().getHitElement(), this.mbm.getContainer());
                       if (this.mbm.getContainer().getCommandCenter().execute(createPathLabel))
                       {
                           return true;
                       }
                       
                       
                       
                       
                   }
                } else {
                    // user clicked on nothing so try to create a new state
                    CommandCreateState createState = new CommandCreateState(
                                                                me.getPoint(),
                                                                this.mbm.getContainer());
                    createState.setUpdateSelected(this.mbm.getContainer().getCollisionHandler());                    
                    if( this.mbm.getContainer().getCommandCenter().execute(createState) ){
                        // we created the state so change mouse behavior and repaint
                        this.mbm.setMouseBehavior(MouseBehaviorType.eSelected, false);
                        return true;
                    }
                }
                break;
           
        }
        return false;
    }
}
