package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VertexL<T> implements Comparable<VertexL<T>>{
	
	private T object;
	private String color;
	private int distance;
	private VertexL<T> predecessor;
	private List<Adjacent<T>> adjacents;
	private int f;
	
	public VertexL(T object) {
		super();
		this.object = object;
		adjacents = new ArrayList<Adjacent<T>>();
	}

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public VertexL<T> getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(VertexL<T> predecessor) {
		this.predecessor = predecessor;
	}

	public List<Adjacent<T>> getAdjacents() {
		return adjacents;
	}

	public void setAdjacents(List<Adjacent<T>> adjacents) {
		this.adjacents = adjacents;
	}
	
	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}

	public void deleteAdjacent(T toDelete) {
		boolean finded = false;
		for(int i = 0; i < adjacents.size() && !finded; i++) {
			if(adjacents.get(i).getVertex().getObject().equals(toDelete)) {
				adjacents.remove(i);
				finded = true;
			}
		}
	}

	@Override
	public String toString() {
		return object.toString();
	}
	
	public int weight(VertexL<T> vertex) {
		boolean finded = false;
		int weight = Integer.MAX_VALUE;
		for(int i = 0; i < adjacents.size() && !finded; i++) {
			if(adjacents.get(i).getVertex().equals(vertex)) {
				finded = true;
				weight = adjacents.get(i).getWeight();
			}
		}
		return weight;
	}

	@Override
	public int compareTo(VertexL<T> arg0) {
		return distance - arg0.distance;
	}
}
