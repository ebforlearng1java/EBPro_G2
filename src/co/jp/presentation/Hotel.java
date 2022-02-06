package co.jp.presentation;

import java.util.Scanner;

public class Hotel {

	private static final String String = null;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		int num = 0;
		
		Room room = new Room();
		Room dog = new Dog();
		Room cat = new Cat();
		Room bird = new Bird();
		
		//Room info = new Room(;)
		
		
		
		String type = null;
		
		System.out.println("Program Starting......");
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println("-----------What is the name of this pet?--------------");
			Scanner scanner_name = new Scanner(System.in);
			String name = scanner_name.nextLine();
			
			System.out.println("How old is it? Enter an Integer!");
			Scanner scanner_age = new Scanner(System.in);
			int age = scanner_age.nextInt();
			
			
			System.out.println("Can it fly? Y for Yes, N for No");
			Scanner scanner_fly = new Scanner(System.in);
			String fly = scanner_fly.nextLine();
			if ("Y".contentEquals(fly)) {
				System.out.println("It is a bird.");
				type = "bird";
				bird.food(type);
				room.roominfo(age);
				room.roominfo(name);
				room.info();
				
				//manage[i] = new Manage(name, age, type, num);
				//int roomnum = manage[i].manageinfo(name);
				//room.roominfo(num,type);
				num = num + 1;
			} else if("N".contentEquals(fly)){
				System.out.println("How many legs?");
				Scanner scanner_leg = new Scanner(System.in);
				int leg = scanner_leg.nextInt();
				if (leg == 4) {
					System.out.println("Does it meow or woof? Input meow or woof");
					Scanner scanner_sound = new Scanner(System.in);
					String sound = scanner_sound.nextLine();
					switch(sound)
					{
					case "meow":
						System.out.println("It is a cat.");
						type = "cat";
						cat.food(type);
						room.roominfo(age);
						room.roominfo(name);
						room.info();
						cat.ballplay();
						//manage[i] = new Manage(name, age, type, num);
						//manage[i].manageinfo();
						num = num + 1;
						break;
					case "woof":
					    System.out.println("It is a dog.");
					    type = "dog";
					    dog.food(type);
					    room.roominfo(age);
						room.roominfo(name);
						room.info();
					    dog.waterplay();
					    //manage[i] = new Manage(name, age, type, num);
					    //manage[i].manageinfo();
					    num = num + 1;
					    break;
					default:
						System.out.println("Beyond Acceptance");				 
					}								
				} else {
					System.out.println("Beyond Acceptance");
				}			
			} else {
				System.out.println("Input error: Program Stops!");
			}
			
		}
		
		//System.out.println("num: " + num);
		

	}

}