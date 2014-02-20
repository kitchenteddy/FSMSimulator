package union.codebreakers.tests;

import java.awt.Point;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import union.codebreakers.helper.enums.StateType;
import union.codebreakers.model.Automaton;
import union.codebreakers.model.Label;
import union.codebreakers.model.ModelAutomaton;
import union.codebreakers.model.ModelLabel;
import union.codebreakers.model.ModelState;
import union.codebreakers.model.State;



@RunWith(JUnit4.class)
public class StateTests
{
    private Automaton myAutomaton;
    
    private State s1;
    private State s2;
    
    private Point s1Pos;    
    private Label s1L;
    
    private Point s2Pos;  
    private Label s2L;
    
    ArrayList myList;
    
    @Before
    public void setUp()
    {
        myAutomaton = new ModelAutomaton();
        
        s1Pos = new Point(0,0);
        s1L = new ModelLabel();
        s1L.setName("State1");
        
        s2Pos = new Point(0,0);
        s2L = new ModelLabel();
        s2L.setName("State2");
        
        s1 = new ModelState(StateType.eNormal, s1Pos, s1L, myAutomaton);
        s2 = new ModelState(StateType.eNormal, s2Pos, s2L, myAutomaton);
        
        
        myAutomaton.addState(s1);
        myAutomaton.addState(s2);
        myList = new ArrayList<State>();
    }

    @After
    public void tearDown()
    {
        s1Pos = null;
        s1L = null;
        
        
        s2Pos = null;
        s2L = null;
        
        
        s1 = null;
        s2 = null;
        
        myList = null;
    }
    
    @Test
    public void construct()
    {
	assertEquals(myList, s1.getPaths());
        assertEquals(s1Pos, s1.getPos());
        assertEquals(s1L, s1.getLabel());
        assertEquals(StateType.eNormal, s1.getType());

    }
    
    @Test
    public void addPath()
    {
        s1.addPath(s2);
        assertEquals(s1.getPathTo(s2).getEndPoint(),s2);
        assertEquals(s1.getPathTo(s2).getStartPoint(),s1);
    }
    
    @Test
    public void setType()
    {
        s1.setType(StateType.eStart);
        assertEquals(s1.getType(),StateType.eStart);
    }
    
    
    
    @Test
    public void setPos()
    {
        Point newPos = new Point(50,50);
        s1.setPos(newPos);
        assertEquals(newPos, s1.getPos());
    }

    @Test
    public void getPaths()
    {
        s1.addPath(s2);
        s1.addPath(s1);
        myList.add(s1.getPathTo(s2));
        myList.add(s1.getPathTo(s1));
        
        assertEquals(s1.getPaths(), myList);
        
    }
    
    
    @Test
    public void setLabel()
    {
        Label newLabel = new ModelLabel();
        newLabel.setName("newName");
        s1.setLabel(newLabel);
        
        assertEquals("newName", s1.getLabel().getName());
    }

            
    
}
