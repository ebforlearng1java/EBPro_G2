package co.jp.part2;

public class cat extends pet implements game{
	
	public cat(String name, int age, String type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}
	public void FEED(){
		System.out.println("喵！谢谢投喂！");
	}
	void game() {};
	
	

}
