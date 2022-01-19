package co.jp.chapter08;

public class Ludishengwu extends Animal {

	public Ludishengwu(boolean alive, int legs, String[] cells, String run) {
		super(alive, legs, cells);
		this.run = run;
	}

	String run;


	final int total = 100;


	void speck(String word) {
		System.out.println("I am Ludishengwu!" + word);
	}


}
