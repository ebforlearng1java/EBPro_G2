package co.jp.part2;

public class Dog extends Pet implements Run, Guard {

	void eat() {
		System.out.println(name + "吃狗粮");
	}

	public void run() {
	}

	public void run(String order) {
	}

	public void guard() {
	}

	public void guard(String order) {
	}

}
