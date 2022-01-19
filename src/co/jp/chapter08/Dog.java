package co.jp.chapter08;

public class Dog extends Ludishengwu {

	public Dog(boolean alive, int legs, String[] cells, String run, String mao) {
		super(alive, legs, cells, run);
		this.mao = mao;

	}


	String mao;



	void speck() {
		System.out.println("I am Dog!");
	}

}
