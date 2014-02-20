package union.codebreakers.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import union.codebreakers.helper.enums.LabelType;
import union.codebreakers.model.Label;
import union.codebreakers.model.ModelLabel;



@RunWith(JUnit4.class)
public class DummyStateTests
{
    
    private Automaton fsm;
    private DummyState myDummyState = new DummyState();
    
    @Before
    public void setUp()
    {
        myLabel = new ModelLabel();
    }

    @After
    public void tearDown()
    {
        myLabel = null;
    }       
            
    
}