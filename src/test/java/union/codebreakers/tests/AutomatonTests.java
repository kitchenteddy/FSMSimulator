package union.codebreakers.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import union.codebreakers.model.*;
import java.awt.Point;
import union.codebreakers.helper.enums.StateType;
import java.util.ArrayList;


@RunWith(JUnit4.class)
public class AutomatonTests
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
        
        assertEquals(myList, myAutomaton.getCollectionStates());

    }
    
    
    @Test
    public void addState()
    {
        myAutomaton.addState(s1);
        myList.add(s1);
        assertEquals(myList, myAutomaton.getCollectionStates());
        
        myAutomaton.addState(s2);
        myList.add(s2);
        assertEquals(myList, myAutomaton.getCollectionStates());
        
    }
    
    @Test
    public void removeState()
    {
        myAutomaton.addState(s1);
        myList.add(s1);
        myAutomaton.addState(s2);
        myList.add(s2);
        
        myAutomaton.removeState(s1);
        myList.remove(s1);
        assertEquals(myList, myAutomaton.getCollectionStates());
        
        myAutomaton.removeState(s2);
        myList.remove(s2);
        
        assertEquals(myList, myAutomaton.getCollectionStates());
    }


            
    
}
