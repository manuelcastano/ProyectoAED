package model;

public class VertexM<T> {
	
	private T object;
	private VertexM<T> predecessor;
	private String color;
	private int position;
	private int distance;
	
	public VertexM(T object) {
		super();
		this.object = object;
	}

	
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}



	public VertexM<T> getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(VertexM<T> predecessor) {
		this.predecessor = predecessor;
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

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}
}
