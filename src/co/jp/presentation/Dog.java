package co.jp.presentation;

public class Dog extends Room implements Swim {


	public void food(String type) {
		super.food(type);
		System.out.println("Food is bones.");
	}

	public void waterplay() {
		super.waterplay();
		System.out.println("So offers a  "+ pool);
	}

}
