package co.jp.chapter10;

public class Pet {
	String name;
	int age;
	Type type;
	
	enum Type{
		cat,dog,
	}
	
	public Pet(String name,int age, Type type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}
	
	public void speack() {
		System.out.println("�ҵ����ֽ�"+name+"������"+age+"���ˣ�����һֻ"+type.name());
	}
}
