package collections;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UndirUnweightedGraphAdjListTest {

	UndirUnweightedGraphAdjList graph;

	@BeforeEach
	void setUp() throws Exception {
		graph = new UndirUnweightedGraphAdjList(7);
	}

	@AfterEach
	void tearDown() throws Exception {
		graph = null;
	}

	@Test
	void testDFS() {
		graph.addEdge(2, 0);
		graph.addEdge(2, 6);
		graph.addEdge(2, 4);
		graph.addEdge(2, 3);
		graph.addEdge(0, 1);
		graph.addEdge(0, 3);
		graph.addEdge(1, 5);
		graph.addEdge(5, 6);
		graph.addEdge(5, 4);
		int[] arr = {2,0,1,5,6,4,3};
		assertArrayEquals(arr, graph.DFS(2));
		
	}
	
	
	@Test
	void testBFS() {
		graph.addEdge(2, 0);
		graph.addEdge(2, 6);
		graph.addEdge(2, 4);
		graph.addEdge(2, 3);
		graph.addEdge(0, 1);
		graph.addEdge(0, 3);
		graph.addEdge(1, 5);
		graph.addEdge(5, 6);
		graph.addEdge(5, 4);
		int[] arr = {2,0,6,4,3,1,5};
		assertArrayEquals(arr, graph.BFS(2));
		
	}
	
	
	

}
