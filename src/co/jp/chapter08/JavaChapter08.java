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
		Dog dog = new Dog(true, 4, new String[10], "2000", new Mao());

		dog.speck();



		System.out.println(ani instanceof Animal);

		System.out.println((Animal)ludi instanceof Animal);

		System.out.println((Animal)dog instanceof Animal);


		System.out.println(ani instanceof Dog);

		System.out.println((Animal)ludi instanceof Dog);

		System.out.println((Animal)dog instanceof Dog);



		System.out.println(ani.toString());


		int a = 123456;// int ⇔ String
//		float
		System.out.println((float)a);
		float b = 1.45f;

		System.out.println((int)b);


//		System.out.println(dog.alive);




//		System.out.println(dog.alive);

//		dog.total = 101;

//		System.out.println();

//		dog.count = 100;
	}


}
