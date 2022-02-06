package co.jp.presentation;

public class Cat extends Room implements Ball {

	

	public void food(String type) {
		super.food(type);
		System.out.println("Food is fish.");
	}

	public void ballplay() {
		super.ballplay();
		System.out.println("So offers a  "+ ball);
	}

}
