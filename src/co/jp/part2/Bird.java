package co.jp.part2;

public class Bird extends Pet implements Fly {

	void eat() {
		System.out.println(name + "吃鸟粮");
	}

	public void fly() {
	}

	public void fly(String order) {
	}
}
