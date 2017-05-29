package fr.exia.insanevehicles;

public class Coordinates {

	
	private int x;
	private int y;
	
	public Coordinates() {
		this(0, 0);
	}
	
	public Coordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public int addY(int nbr) {
		return this.y + nbr;
	}
}
