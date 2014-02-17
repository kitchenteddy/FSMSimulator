package edu.union.adt.graph.tests;



import edu.union.adt.graph.tests.kitchent.ExtendedAPITests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses
({
    SimpleGraphTests.class,
    GraphTestsUsingEquals.class,
    ExtendedAPITests.class
})
public class GraphTestSuite
{ // no implementation needed; above annotations do the work.
}
