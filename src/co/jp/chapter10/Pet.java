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
		System.out.println("我的名字叫"+name+"，今年"+age+"岁了，我是一只"+type.name());
	}
}
