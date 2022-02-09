package co.jp.part2;

import java.util.Scanner;

public class Hotel {

	// 宠物酒店对象,房间查询

	private Room[][] rooms;
	//private Object presentation;

	/*
	 * 房间编号： 
	 * 一楼：101 102 103 104 105 105
	 * 二楼：201 202 203 204 205 205 
	 * 
	 */

//设置10个房间

	public Hotel() {
		rooms = new Room[2][5];
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				if (i == 0) {
					rooms[i][j] = new Room((i + 1) * 100 + j + 1, true);
				} else if (i == 1) {
					rooms[i][j] = new Room((i + 1) * 100 + j + 1, true);
				}
			}
		}
	}

//print:打印房间状态列表的方法

	public void print() {
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				Room room = rooms[i][j];
				System.out.print(room);
			}
			System.out.println();
		}
	}
	
	
// printPetInfo
	public void printPetInfo() {
		
		Scanner scanner = new Scanner(System.in);
		loop:
		while (true) {
			System.out.println("选项：(提示:选项0可以回到前台)");
			i = scanner.nextInt();
			switch (i) {
			
			case 0:
				System.out.println("\t确定要退出喂食吗(y/n)");
				s = scanner.next();
				if (s.equalsIgnoreCase("y")) {
					System.out.println("\t退出喂食");
					
					break loop;
				} else {
					break;
				}

			case 1: 
				Pet pet = new Dog();
				Pet pet1 = new Cat();
				//Pet pet2 = new Bird(s, i, s);
				pet.printInfo();
				break;

//			case 2: // cat
//				Cat cat = new Cat();
//				cat.printInfo();
//				cat.eat();
//				break;
//
//			case 3:// bird
//				Bird bird = new Bird();
//				bird.printInfo();
//				bird.eat();
//				break;

			default:
				System.out.println("\t请输入其他正确选项");
				break;

			}
		
	}
	
	

// order:订房方法，订完房后，放被占用。 将room对象的status属性修改为false。

	public void order(int roomNo, Pet pet) {
		Room room = rooms[roomNo / 100 - 1][roomNo % 100 - 1];
		room.setStatus(false);
		
		
		
		System.out.println(roomNo + "订房成功");
	}

//宠物信息录入以及宠物入住	
	public Pet checkin(String name, int age, String type) {
		
		Pet result = null;

		Scanner scl = new Scanner(System.in);

		for (;;) {

			System.out.println("---exit退出信息录入---");
			String input = scl.nextLine();

			if ("exit".equals(input)) {
				System.out.println("---　信息录入停止,请选择需要的房间号　---");
				break;
			}

			// 规定输入的形式 NAME:MISO AGE:1 TYPE:CAT
			String[] input_array = input.split(":");

			// input error check
			if (input_array.length < 2) {
				System.out.println("---　输入的形式不正确　---");
				break;
			}

			// 收集情报
			if ("NAME".equals(input_array[0])) {
				name = input_array[0];
			}

			if ("AGE".equals(input_array[0])) { // 常量(不可能是null的值)写在前面,进行类型转换
				age = Integer.valueOf(input_array[0]); // “字符串内容”通过Integer.ValueOf转换为 int类型
			}

			if ("TYPE".equals(input_array[0])) {
				type =input_array[0];
			}

			if (!"".equals(name) && age != 0 && !"".equals(type)) {
				// 情报收集成功
				
				if ("DOG".equals(type)) {
					Dog dog = new Dog(name, age ,type);
					dog.printInfo();
					result = dog;
				}
				else if ("CAT".equals(type)) {
					Cat cat = new Cat(name, age ,type);
					cat.printInfo();
					result = cat;
				}
				else if ("BIRD".equals(type)) {
					Bird bird = new Bird(name, age ,type);
					result = bird;
				}
				
				

			}
			
			System.out.println("あなたのPETは：" + input);

		}
		
		
		return result;
	}

//exit:退房方法，退完房，房间空闲 将room的statues属性修改为true

	public void exit(int roomNo) {
		Room room = rooms[roomNo / 100 - 1][roomNo % 100 - 1];
		room.setStatus(true);
		System.out.println(roomNo + "退房成功");
	}

	
	
	
	
	
// 喂食机能
	public void eat() {

		int i;
		String s;

		// room NO
		System.out.println("1.喂食 0.退出");
		System.out.println("---------------------------------------------------------");

		Scanner scanner = new Scanner(System.in);
		loop:
		while (true) {
			System.out.println("选项：(提示:选项0可以回到前台)");
			i = scanner.nextInt();
			switch (i) {
			
			case 0:
				System.out.println("\t确定要退出喂食吗(y/n)");
				s = scanner.next();
				if (s.equalsIgnoreCase("y")) {
					System.out.println("\t退出喂食");
					
					break loop;
				} else {
					break;
				}

			case 1: 
				Pet pet = new Cat(); //如何实现调用以及分歧
				pet.printInfo();
				pet.eat();
				break;

//			case 2: // cat
//				Cat cat = new Cat();
//				cat.printInfo();
//				cat.eat();
//				break;
//
//			case 3:// bird
//				Bird bird = new Bird();
//				bird.printInfo();
//				bird.eat();
//				break;

			default:
				System.out.println("\t请输入其他正确选项");
				break;

			}
			
			
			// break
			
			
			

	
	}
		
		
	}

	public Room[][] getRooms() {
		return rooms;
	}

	public void setRooms(Room[][] rooms) {
		this.rooms = rooms;
	}

}
