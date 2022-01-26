package co.jp.chapter08;

public class Dog extends Ludishengwu {

	public Dog(boolean alive, int legs, String[] cells, String run, Mao mao) {
		super(alive, legs, cells, run);
		this.mao = mao;

	}


	Mao mao = new Mao();



	void speck() {
		System.out.println("I am Dog!");
	}

}
