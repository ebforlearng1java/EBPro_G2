package co.jp.chapter07;

public class Animal {



//	Animal(boolean alive, int legs, String[] cells){
//
//		System.out.println("Animalクラスのコンストラクタ");
//		this.alive = alive;
//		this.legs = legs;
//		this.cells = cells;
//	}


	static int count = 0;


	Animal(boolean alive, int legs, String[] cells) {

		this.alive = alive;
		this.legs = legs;
		this.cells = cells;
		count++;
	}

	Animal(){

	}


	Animal(boolean alive, int legs){
		this.alive = alive;
		this.legs = legs;
	}



	Animal(String[] cells){
		this.cells = cells;
	}


	// 1 alive  true: O2  false: CO2
	public boolean alive;

	// 2 legs   > 0   = 0
	public int legs;

	// 3 array[ "":膜  "abcefg...": 壁  ]
	public String[] cells;

	/**
	 * @return alive
	 */
	public boolean isAlive() {
		return alive;
	}


	/**
	 * @return legs
	 */
	public int getLegs() {
		return legs;
	}


	/**
	 * @return cells
	 */
	public String[] getCells() {
		return cells;
	}



//	/**
//	 * @return alive
//	 */
//	public boolean isAlive() {
//		return alive;
//	}
//
//	/**
//	 * @param alive セットする alive
//	 */
//	public void setAlive(boolean alive) {
//		this.alive = alive;
//	}
//
//	/**
//	 * @return legs
//	 */
//	public int getLegs() {
//		return legs;
//	}
//
//	/**
//	 * @param legs セットする legs
//	 */
//	public void setLegs(int legs) {
//		this.legs = legs;
//	}
//
//	/**
//	 * @return cells
//	 */
//	public String[] getCells() {
//		return cells;
//	}
//
//	/**
//	 * @param cells セットする cells
//	 */
//	public void setCells(String[] cells) {
//		this.cells = cells;
//	}

}
