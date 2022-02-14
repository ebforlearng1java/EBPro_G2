package co.jp.part2;

public class fish extends pet implements game{
	
	public fish(String name, int age, String type) {
		 {
			this.name = name;
			this.age = age;
			this.type = type;
		}
		// TODO Auto-generated constructor stub
	}

	public void FEED(){
		System.out.println("咕噜咕噜咕");
	}
	
   void game() {};
}
