package collections;

import java.util.Arrays;

public class UndirUnweightedGraphAdjMatrix implements IUnweightedGraph {

	int[][] adjMat; // singlyLis[] adjList
	int n; // vertex count

	public UndirUnweightedGraphAdjMatrix(int n) {
		adjMat = new int[n][n];
		this.n = n;
		// initialise adjaceny matrix as no edge info present

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				adjMat[i][j] = 0;
		}

	}

	@Override
	public void addEdge(int v, int u) {
		adjMat[v][u] = 1;
		adjMat[u][v] = 1;

	}

// wrong
	private void DFS(int vertex, boolean[] isVisited, int[] result, int[] resultCount) {
		if (!isVisited[vertex]) {
			System.out.println(vertex);
			result[resultCount[0]] = vertex;
			resultCount[0]++;
			isVisited[vertex] = true;
		} else {
			return;
		}
		// for every adjacent vertex to startVertex
		for (int i = 0; i < n; i++) {
			if (adjMat[vertex][i] != 0) {
				// verex i is adjacent to vertex
				// if adjacent vertex is not visited
//				if (!isVisited[i]) {
					// DFS(vertex)
					DFS(i, isVisited, result, resultCount);
//				}
			}
		}
	}

// wrong
	@Override
	public int[] DFS(int startVertex) {
		for (int[] q : adjMat)
			System.out.println(Arrays.toString(q));
		// MArk every vertex as not visited
		boolean[] isVisited;
		isVisited = new boolean[n];
//		for (int i = 0; i < n; i++)
//			isVisited[i] = false;

		// create result array
		int[] result = new int[n];
		int[] resultCount = new int[1];
		resultCount[0] = 0;

		DFS(startVertex, isVisited, result, resultCount);

		return result;
	}

}
