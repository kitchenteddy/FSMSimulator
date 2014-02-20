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
public class LabelTests
{
    
    private Label myLabel;
    
    
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
    
    @Test
    public void construct()
    {        
	assertEquals("Testing default constructor name", myLabel.getName(), ""); 
        assertEquals("Testing default constructor type", myLabel.getType(), LabelType.ePath);
    }
	   
    @Test
    public void testName()
    {
        myLabel.setName("newLabel");
        assertEquals("Testing setName/getName", myLabel.getName(), myLabel.getName());
    }  
    
    @Test
    public void testType()
    {
        myLabel.setType(LabelType.eState);
        assertEquals("Testing setType/getType", myLabel.getType(), LabelType.eState);
    }
    
    @Test
    public void testCollision()
    {
        // Add tests for collision when completed...
    }        
            
    
}
