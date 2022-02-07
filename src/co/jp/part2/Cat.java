package co.jp.part2;

public class Cat extends Pet implements Run {

	void eat() {
		System.out.println(name + "吃猫粮");
	}

	public void run() {
	}

	public void run(String order) {
	}
}
