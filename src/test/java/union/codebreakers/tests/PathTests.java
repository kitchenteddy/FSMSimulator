package union.codebreakers.tests;

import java.awt.Point;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import union.codebreakers.helper.enums.PathType;
import union.codebreakers.helper.enums.StateType;
import union.codebreakers.model.Automaton;
import union.codebreakers.model.Label;
import union.codebreakers.model.ModelAutomaton;
import union.codebreakers.model.ModelLabel;
import union.codebreakers.model.ModelPath;
import union.codebreakers.model.ModelState;
import union.codebreakers.model.Path;
import union.codebreakers.model.State;



@RunWith(JUnit4.class)
public class PathTests
{
    private Automaton myAutomaton;
    
    private State s1;
    private State s2;
    
    private Point s1Pos;    
    private Label s1L;
    
    private Point s2Pos;  
    private Label s2L;
    
    private Path p1;
    
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
        
        Path p1 = new ModelPath(s1, s2, myAutomaton);
        s1.addPath(p1);
        
        p1 = s1.getPathTo(s2);
        
        
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
        
        p1 = null;
        myList = null;
    }
    
    
    
    @Test
    public void getPoints()
    {
        assertEquals(s1, p1.getStartPoint());
        assertEquals(s2, p1.getEndPoint());
        
    }
    
    @Test
    public void setLabel()
    {
        Label myLabel = new ModelLabel();
        myLabel.setName("myName");
        
        p1.setLabel(myLabel);
        
        assertEquals(myLabel, p1.getLabel());
        
    }
    
    @Test
    public void setType()
    {
        p1.setType(PathType.eNormal);
        assertEquals(PathType.eNormal, p1.getType());
    }
    

    


            
    
}
