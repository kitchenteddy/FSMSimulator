package union.codebreakers.tests;

import java.util.ArrayList;
import java.awt.Point;
import java.awt.Shape;
import java.io.Serializable;
import java.util.List;
import union.codebreakers.helper.enums.StateType;
import union.codebreakers.model.Automaton;
import union.codebreakers.model.AutomatonPart;
import union.codebreakers.model.Collidable;
import union.codebreakers.model.Label;
import union.codebreakers.model.ModelLabel;
import union.codebreakers.model.ModelPath;
import union.codebreakers.model.Movable;
import union.codebreakers.model.Path;
import union.codebreakers.model.State;

/**
 * A dummy implementation of the state class for testing purposes
 * 
 * @author joshualoew
 */
public class DummyState  implements State, Movable, Collidable, Serializable, AutomatonPart {
    
    private Automaton fsm;
    private StateType type;
    private Point position;
    private ArrayList<Path> outgoingPaths;
    private Label stateLabel;
    private Point dummyPoint = new Point(0, 0);
    
    public DummyState(Label msLabel, Automaton fsm) {
        this.fsm = fsm;
        this.type = StateType.eStart;
        this.position = new Point(0,0);
        this.stateLabel = msLabel;
        this.outgoingPaths = new ArrayList<Path>();
    }

    @Override
    public void removePath(Path toRemove) {
        this.outgoingPaths.remove(toRemove);
    }

    @Override
    public void addPath(Path path) {
        this.outgoingPaths.add(path);
    }

    @Override
    public StateType getType() {
        return this.type;
    }

    @Override
    public void setType(StateType newType) {
        this.type = StateType.eNormal;
    }

    @Override
    public Point getPos() {
        return this.position;
    }

    @Override
    public void setPos(Point position) {
        Point newDummyPoint = new Point(1, 1);
        dummyPoint = newDummyPoint;
    }

    @Override
    public Label getLabel() {
        return this.stateLabel;
    }

    @Override
    public void setLabel(Label newLabel) {
        Label newStateLabel = new ModelLabel();
        this.stateLabel = newStateLabel;
    }

    @Override
    public List<Path> getPaths() {
        return outgoingPaths;
    }

    @Override
    public Path getPathTo(State destination) {
        DummyState newDummyState = new DummyState(stateLabel, fsm);
        Path myPath = new ModelPath(this, newDummyState, fsm);
        return myPath;
    }

    @Override
    public Shape getShape(){
        return null;
    }

    @Override
    public Automaton getAutomaton() {
        return this.fsm;
    }
}