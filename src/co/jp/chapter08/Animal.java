package co.jp.chapter08;

public class Animal {
	//alive
	boolean alive;
	
	//legs
	int legs;
	
	//cell
	String[] cells;
	
	public Animal(boolean alive, int legs, String[] cells) {
		this.alive = alive;
		this.legs = legs;
		this.cells = cells;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public String[] getCells() {
		return cells;
	}

	public void setCells(String[] cells) {
		this.cells = cells;
	}
}
