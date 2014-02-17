package edu.union.adt.graph.tests.kitchent;

import java.util.*;

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

import edu.union.adt.graph.Graph;
//import edu.union.adt.graph.HashGraph;
import edu.union.adt.graph.GraphFactory;
@RunWith(JUnit4.class)
public class ExtendedAPITests{



	private Graph<String> g;

	private String a;
	private String b;
	private String c;


    @Before
    public void setUp()
    {
        g = GraphFactory.createGraph();

        a = "A";
		b = "B";
		c = "C";

        
        
    }

    @After
    public void tearDown()
    {
    	g = null;

    	a = null;
    	b = null;
    	c = null;

    }




	@Test
	public void isEmptyTest()
	{
		assertTrue("checking if new graph is empty", g.isEmpty());
		g.addVertex(a);

		assertFalse("checking if graph with one vertex is empty",g.isEmpty());




	}

	@Test
	public void removeVertexTest()
	{
		


		g.addVertex(a);
		g.addVertex(b);
		g.addVertex(c);

		g.addEdge(b,a);
		g.addEdge(a,c);

		g.removeVertex(a);


		assertEquals("checking if edgeNum is updated correctly", 0, g.numEdges());

		assertFalse("checking if vertex was correctly removed", g.contains(a));
		
		assertEquals("making sure number of vertices is correct", 2, g.numVertices());


		g.removeVertex(c);

		assertFalse("checking if vertex was correctly removed", g.contains(c));

		assertEquals("making sure number of vertices is correct", 1, g.numVertices());







	}

	@Test
	public void removeEdgeTest()
	{	
		g.addVertex(a);
		g.addVertex(b);
		g.addVertex(c);

		g.addEdge(a, c);
		g.addEdge(a, b);

		g.removeEdge(a,b);

		assertFalse("the graph should not have the edge", g.hasEdge(a,b));
		

		assertEquals("checking the number of edges", 1, g.numEdges());



	}


	@Test
	public void hasPathTest()
	{
		g.addVertex(a);
		g.addVertex(b);
		g.addVertex(c);

		g.addEdge(a, c);

		assertTrue("checking if the graph has the path",g.hasPath(a,c));
		assertFalse("making sure the path only goes 1 way",g.hasPath(c,a));

		
		g.addEdge(c, b);

		assertTrue("trying 2 edge path",g.hasPath(a,b));

		g.addEdge(a,a);

		assertTrue("trying on a path to itself",g.hasPath(a,a));


	}


	@Test
	public void pathLengthTest()
	{

		g.addVertex(a);
		g.addVertex(b);
		g.addVertex(c);

		assertEquals("making sure max integer is returned if no path exists",Integer.MAX_VALUE, g.pathLength(a,b));

		g.addEdge(a, c);

		assertEquals("checking path length", 1, g.pathLength(a,c));

		g.addEdge(c, b);

		assertEquals("checking path length", 2, g.pathLength(a,b));

		g.addEdge(a, b);

		assertEquals("checking path length", 1, g.pathLength(a,b));

	}


	@Test
	public void getPathTest()
	{
		g.addVertex(a);
		g.addVertex(b);
		g.addVertex(c);

		ArrayList rightPath = new ArrayList();

		


		assertTrue("if there is no path returns an empty iterable", iterEquals(rightPath, g.getPath(a,c)));

		g.addEdge(a, c);

		rightPath.add(a);
		rightPath.add(c);


		assertTrue("testing path", iterEquals(rightPath, g.getPath(a,c)));


		g.addEdge(c, b);
		rightPath.add(b);
		assertTrue("testing path", iterEquals(rightPath, g.getPath(a,b)));

		g.addEdge(a,b);
		rightPath.clear();
		rightPath.add(a);
		rightPath.add(b);

		assertTrue("testing that best path is used", iterEquals(rightPath, g.getPath(a,b)));


	}


	@Test
	public void AdvanceTest1()
	{
		g.addEdge(a, b);
		g.removeVertex(a);
		g.removeVertex(b);

		assertTrue("testing if removing results in an empty graph",g.isEmpty());

		assertFalse("testing if the edge still exists in the graph", g.hasPath(a,b));




		

	}

	@Test
	public void AdvanceTest2()
	{
		g.addVertex(a);
		assertTrue("ensuring that vertex hasPath with itself", g.hasPath(a,a));

		assertEquals("making sure that path length is zero", 0, g.pathLength(a,a));


		ArrayList correctPath = new ArrayList();
		correctPath.add(a);

		assertEquals("making sure that the path is gotten correctly", correctPath,g.getPath(a,a));






	}


	@Test
	public void AdvanceTest3()
	{
		g.addEdge(a,b);
		g.addEdge(a,c);
		g.addEdge(c,a);
		g.addEdge(b,a);

		g.removeVertex(a);

		assertEquals("making sure the number of edges is zero",0,g.numEdges());
		assertFalse("ensuring hasPath is false",g.hasPath(b,c));
		assertEquals("ensuring number of vertices",2,g.numVertices());

		g.addVertex(a);
		assertEquals("making sure edgeNum is still zero",0, g.numEdges());
		assertFalse("ensuring paths do not remain", g.hasPath(a,b));





	}

	@Test
	public void AdvanceTest4()
	{



		
		g.addEdge(a,b);
		g.addEdge(a,c);
		g.addEdge(c,a);
		g.addEdge(b,a);


		assertEquals("checking degree", 2, g.degree(a));

		g.removeEdge(a,b);

		assertEquals("checking degree", 1, g.degree(a));

		g.removeVertex(c);
		assertEquals("checking degree", 0,g.degree(a));

		assertEquals("checking degree", 1,g.degree(b));



	}



	private boolean iterEquals(Iterable iter1, Iterable iter2)
	{
		ArrayList a1 = new ArrayList();
		ArrayList a2 = new ArrayList();

		Iterator i1 = iter1.iterator();
		Iterator i2 = iter2.iterator();

		while (i1.hasNext())
		{
			a1.add(i1.next());
		}

		while (i2.hasNext())
		{
			a2.add(i2.next());
		}

		return (a1.equals(a2));



	}






	
}


