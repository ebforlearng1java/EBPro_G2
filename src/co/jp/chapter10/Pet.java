package co.jp.chapter10;

public class Pet {
	
	String name;
	
	int age;
	
	Type type;

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
	
	void getType(int number) {
		
		for(Type ty: Type.values()) {
			if(number == ty.getNumber()) {
				System.out.println(ty.getType());
				break;
			}
		}
	
	}
}
