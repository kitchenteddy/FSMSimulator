//package union.codebreakers.tests;
//
//import java.awt.Point;
//import static org.junit.Assert.assertEquals;
//import org.junit.Test;
//import org.junit.Before;
//import org.junit.After;
//import static org.junit.Assert.assertTrue;
//import org.junit.runner.RunWith;
//import org.junit.runners.JUnit4;
//import union.codebreakers.helper.enums.StateType;
//import union.codebreakers.model.Automaton;
//import union.codebreakers.model.DummyState;
//import union.codebreakers.model.Label;
//import union.codebreakers.model.ModelAutomaton;
//import union.codebreakers.model.ModelLabel;
//
//
//
//@RunWith(JUnit4.class)
//public class DummyStateTests
//{
//    
//    private Automaton fsm;
//    private Label myLabel;
//    
//    private DummyState myDummyState;
//    
//    @Before
//    public void setUp()
//    {
//        fsm = new ModelAutomaton();      
//        myLabel = new ModelLabel();
//        
//        myDummyState = new DummyState(fsm, myLabel);
//        
//    }
//
//    @After
//    public void tearDown()
//    {
//        
//        fsm = null;
//        myLabel = null;
//        
//        myDummyState = null;
//        
//    }       
//    
//    @Test
//    public void construct() {
//        
//        Point dummyPoint = new Point(0, 0);
//        
//        assertEquals("Testing default automaton", myDummyState.getAutomaton(), fsm);
//        assertEquals("Testing default type", myDummyState.getType(), StateType.eStart);
//        assertEquals("Testing default automaton", myDummyState.getPos(), dummyPoint);
//        
//    }
//    
//    @Test
//    public void testAddRemove() {
//        
//        DummyState newDummyState = new DummyState(fsm, myLabel);
//        myDummyState.addPath(newDummyState);
//       
//        assertTrue("The outgoing paths are no longer null", (myDummyState.getPaths() != null));        
//        
//    }
//    
//    @Test
//    public void setGet() {
//        
//        myDummyState.setType(null);
//        assertEquals("Testing setter/getter for type", myDummyState.getType(), StateType.eNormal);
//        
//    }
//            
//    
//}