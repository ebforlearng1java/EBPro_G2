package co.jp.part2;

public class dog extends pet implements game{
	
public dog(String name, int age, String type) {
	this.name = name;
	this.age = age;
	this.type = type;
		
		// TODO Auto-generated constructor stub
	}

	

	public void FEED(){
		System.out.println("汪！！好吃！");
	}
	
	void game() {};
	
	
}