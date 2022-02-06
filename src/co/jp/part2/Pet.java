package co.jp.part2;

public abstract class Pet {
	String name;
	
	int age;
	
	String type;
	
	static int COUNT = 0;
	
	Pet(){
		COUNT++;
	}
	
	abstract void eat();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
