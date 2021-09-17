package collections;

public interface IUnweightedGraph {

	void addEdge(int v, int u);
	
	int[] DFS(int startVertex);
	
}
