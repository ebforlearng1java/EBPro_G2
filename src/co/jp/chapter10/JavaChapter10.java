package co.jp.chapter10;

public class JavaChapter10 {

	public static void main(String[] args) {


		int inputType = 2;

		Animal[] animals = Animal.values();

		for (Animal animal: animals) {
			if (inputType == animal.getCode()) {
				System.out.println(animal.getType());
			}
		}



	}

}
