/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.controller.behavior;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import union.codebreakers.helper.enums.MouseBehaviorType;
import union.codebreakers.model.State;

/**
 * Mouse behavior for working with selected states
 */
public class MouseBehaviorSelected extends MouseBehavior{

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
     */
    @Override
    public void mousePressed(MouseEvent me){
/*
        this.mbm.getContainer().getCollisionHandler().setHitElement(null);
        Rectangle mouse_rect = new Rectangle(me.getX() - 2, me.getY() - 2, 4, 4);
        boolean repaint = false;
        
        switch( me.getButton() ){
            case 1: // left button
                if( this.mbm.getContainer().getCollisionHandler().checkCollisionCollidables(mouse_rect) ){
                    // user clicked on something
                   if( this.mbm.getContainer().getCollisionHandler().getHitElement() instanceof State ){
                       this.mbm.getContainer().getCollisionHandler().setSelectedState((State)this.mbm.getContainer().getCollisionHandler().getHitElement());
                       this.mbm.setMouseBehavior(MouseBehaviorType.eSelected, false);
                       repaint = true; // repaint canvas in case we highlight selected state somehow
                   }
                } else {
                    // user clicked on nothing so try to create a new state
                    if( this.createState(me.getPoint()) ){
                        // we created the state so change mouse behavior and repaint
                        this.mbm.setMouseBehavior(MouseBehaviorType.eSelected, false);
                        repaint = true;
                    }
                }
                
                break;
           
        }
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
 */
    }
    
    /**
     * Handles mouse release on automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mouseReleased(MouseEvent me){
    }

    /**
     * Handles mouse leaves automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mouseExited(MouseEvent me){
    }

    /**
     * Handles mouse enters automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mouseEntered(MouseEvent me){
    }

    /**
     * Event triggered when mouse is being dragged
     * 
     * @param me Data about event
     */
    @Override
    public void mouseDragged(MouseEvent me){
    }

    /**
     * Event triggered when mouse is being moved
     * 
     * @param me Data about event
     */
    @Override
    public void mouseMoved(MouseEvent me){
    }

    /**
     * Handles mouse clicks on automaton
     * 
     * @param me Event that occurred
     */
    @Override
    public void mouseClicked(MouseEvent me){
    }
}
