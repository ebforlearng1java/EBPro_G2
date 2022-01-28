package co.jp.chapter07;

public class Animal {
	
	
	
	// 1 alive true; 02 false:C02
	boolean alive;
	
	// 2 legs     >  0    = 0
	int legs;
	
	// 3 array[ "":膜 "abcdefg...": 壁  ]
	String[] cells;

	/**
	 * @return alive
	 */
	public boolean isAlive() {
		return alive;
	}

	/**
	 * @param alive セットする alive
	 */
	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	/**
	 * @return legs
	 */
	public int getLegs() {
		return legs;
	}

	/**
	 * @param legs セットする legs
	 */
	public void setLegs(int legs) {
		this.legs = legs;
	}

	/**
	 * @return cells
	 */
	public String[] getCells() {
		return cells;
	}

	/**
	 * @param cells セットする cells
	 */
	public void setCells(String[] cells) {
		this.cells = cells;
	}

	
	}
	

	
	
	
