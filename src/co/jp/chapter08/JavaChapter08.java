package co.jp.chapter08;

public class JavaChapter08 {



	public static void main(String[] args) {



		// 爷爷 3
		Animal ani = new Animal(true, 4, new String[10]);
		ani.speck("abc");


		// 爸爸1
		Ludishengwu ludi = new Ludishengwu(true, 4, new String[10], "3000");
		ludi.speck("aaa");

		// 孩子1
		Dog dog = new Dog(true, 4, new String[10], "2000", "fuafua");

		dog.speck();


		System.out.println(dog.alive);




//		System.out.println(dog.alive);

//		dog.total = 101;

//		System.out.println();

//		dog.count = 100;
	}


}
