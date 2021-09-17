package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UndirUnweightedGraphAdjList implements IUnweightedGraph {

	private LinkedList<Integer>[] graph;
	private int vxs;

	@SuppressWarnings("unchecked")
	public UndirUnweightedGraphAdjList(int vxs) {
		this.vxs = vxs;
		graph = new LinkedList[vxs];

	}

	@Override
	public void addEdge(int v, int u) {

		if (graph[v] == null)
			graph[v] = new LinkedList<>();
		for (Integer i : graph[v]) {
			if (i.equals(u))
				return;
		}
		graph[v].add(u);
		if (graph[u] == null)
			graph[u] = new LinkedList<>();
		graph[u].add(v);
	}

	@Override
	public int[] DFS(int startVertex) {
		int[] result = new int[vxs];
		int[] resultCount = { 0 };
		boolean[] isVisited = new boolean[vxs];
		DFS(startVertex, result, isVisited, resultCount);

		return result;
	}

	private void DFS(int startVertex, int[] result, boolean[] isVisited, int[] resultCount) {
		if (isVisited[startVertex]) {
			return;
		}

		result[resultCount[0]++] = startVertex;
		isVisited[startVertex] = true;

		LinkedList<Integer> adjList = graph[startVertex];
		Iterator<Integer> itr = adjList.iterator();

		while (itr.hasNext()) {
			Integer vertex = itr.next();
			DFS(vertex, result, isVisited, resultCount);
		}

	}

	public int[] BFS(int startVertex) {
		int[] result = new int[vxs];
		boolean[] isVisited = new boolean[vxs];
		Queue<Integer> q = new LinkedList<>();
		int i = 0;
		isVisited[startVertex] = true;
		result[i++] = startVertex;
		q.add(startVertex);

		while (!q.isEmpty()) {
			int vertex = q.poll();

			for (int v : graph[vertex]) {
				if (!isVisited[v]) {
					isVisited[v] = true;
					result[i++] = v;
					q.add(v);
				}

			}
		}

		return result;
	}

}
