package co.jp.part2;

import java.util.Scanner;

public class Checkin {

	public static void main(String[] args) {

		String name = "";
		int age = 0;
		String type = "";

		Scanner sc1 = new Scanner(System.in);
		System.out.println("�����������ס��Ϣ");
		
		for (;;) {
			System.out.println("���������������");
			String input = sc1.nextLine();
			name = input;

			// Stringתint
			System.out.println("������������䣺");
			String input1 = sc1.nextLine();
			Integer a = Integer.valueOf(input1);
			age = a;

			System.out.println("������������ࣺ");
			System.out.println("1.è  2.��  3.��");
			System.out.println("�������Ʒ��Ϊè��������1");
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
				System.out.println("�����ʽ��������������");
			}

		}
	}
	}

