package union.codebreakers.tests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses
({
    
	AutomatonTests.class,
	LabelTests.class,
	PathTests.class,
	StateTests.class

})
public class TestSuite
{ // no implementation needed; above annotations do the work.
}