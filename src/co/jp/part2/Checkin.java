package co.jp.part2;

import java.util.Scanner;

public class Checkin {

	public static void main(String[] args) {

		String name = "";
		int age = 0;
		String type = "";

		Scanner sc1 = new Scanner(System.in);
		System.out.println("请输入宠物入住信息");
		
		for (;;) {
			System.out.println("请输入宠物姓名：");
			String input = sc1.nextLine();
			name = input;

			// String转int
			System.out.println("请输入宠物年龄：");
			String input1 = sc1.nextLine();
			Integer a = Integer.valueOf(input1);
			age = a;

			System.out.println("请输入宠物种类：");
			System.out.println("1.猫  2.狗  3.鸟");
			System.out.println("例：如果品种为猫，则输入1");
			type = input1;
			
			
			if ("1".equals(input1)) {
				switch(type) {
				case "1":
					Cat cat = new Cat();
					cat.name = name;
					cat.age = age;
				}
				break;
			}
			if ("2".equals(input1)) {
				switch(type) {
				case "2":
					Dog dog = new Dog();
					dog.name = name;
					dog.age = age;
				}
				break;
			}
			if ("3".equals(input1)) {
				switch(type) {
				case "3":
					Bird bird = new Bird();
					bird.name = name;
					bird.age = age;	
				}
				break;
			}
				else {
				System.out.println("输入格式有误，请重新输入");
			}

		}
	}
	}

