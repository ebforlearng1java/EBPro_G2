package co.jp.chapter08;

public class JavaChapter08 {
	
	public static void main(String[] args) {
		
		//爷爷3
		Animal ani = new Animal(true, 4, new String[10]);
		ani.speck("abc");
		
		//爸爸1
		Ludishengwu ludi = new Ludishengwu(true, 4, new String[10], "3000");
		ludi.speck("aaa");
		
		//孩子1
		Dog dog = new Dog(true, 4, new String[10], "2000", "fuafua");
		
		dog.speck();
		
		System.out.println(ani instanceof Animal);
		System.out.println((Animal)ludi instanceof Animal);
		System.out.println((Animal)dog instanceof Animal);
		
		System.out.println(ani instanceof Dog);
		System.out.println((Animal)ludi instanceof Dog);
		System.out.println((Animal)dog instanceof Dog);
		
		
		
		System.out.println(ani.toString())
		;
		
		
		
		
		
		
		
		
		
		
		
	}

}
