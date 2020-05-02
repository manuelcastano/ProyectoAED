package model;

import java.util.List;

public interface IGraph<T> {
	
	public void add(T toAdd);
	public void connect(T one, T two, double weight);
	public void delete(T toDelete);
	public T consult(String theVertex);
	public void BFS(String origin);
	public void DFS();
	public List prim();
	public List Kruskal();
}