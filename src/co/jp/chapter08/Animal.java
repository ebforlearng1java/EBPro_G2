package co.jp.chapter08;

public class Animal {

	public Animal(boolean alive, int legs, String[]cells) {
		this.alive = alive;
		this.legs = legs;
		this.cells = cells;
		count++;

	}

	//1 alive true:o2 false:co2
    public boolean alive;
    
    //2 legs >0 =0
	public int legs;
	
	//3 array["":Ä¤ "abcdefg":±Ú]
	public String[] cells;
	
	private int count = 0;
	
	
	
}
