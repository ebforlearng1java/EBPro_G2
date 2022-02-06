package co.jp.part2;

public abstract class Pet {
	String name;
	int age;
	int type;
	
	int food=0;
	int power=0;
	int level=1;
	
	static int COUNT;
	
	public Pet(String name, int age,int type) {
		this.name = name;
		this.age = age;
		this.type = type;
		COUNT++;
	}
	abstract void eat();
	abstract void grow();
}
