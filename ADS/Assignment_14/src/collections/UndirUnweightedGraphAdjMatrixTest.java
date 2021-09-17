package collections;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class UndirUnweightedGraphAdjMatrixTest {

	@Test
	void test() {
		UndirUnweightedGraphAdjMatrix graph = new UndirUnweightedGraphAdjMatrix(5);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);

		graph.DFS(0);
		assertTrue(true);

	}

}
