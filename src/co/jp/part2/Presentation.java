package co.jp.part2;

import java.util.Arrays;
import java.util.Scanner;


public class Presentation {

	public static void main(String[] args) {

		System.out.println("welcome to PetHotel");
		System.out.println("请选择您需要的服务种类：");
		System.out.println("1. 查询空房");
		System.out.println("2. 入住");
		System.out.println("3. 退房");
		System.out.println("4. 喂食");
		System.out.println("5. 预约");
		System.out.println("6. 查看信息");
		System.out.println("7. 退出");

		String name = "";
		int age = 0;
		String type = "";
		Pet[] room = new Pet[10];

		Scanner sc1 = new Scanner(System.in);

		for (;;) {
			String input = sc1.nextLine();

			if ("7".equals(input)) {
				System.out.println("欢迎使用，下次再见");
				break;
			}

			if ("1".equals(input)) {
				System.out.println("空房显示如下：");
				for (int i = 0; i < room.length; i++) {
					if (room[i] == null) {
						System.out.println("room" + i + ":" + room[i]);
					}
				}
			}

			if ("2".equals(input)) {
				System.out.println("您已选择入住");
				System.out.println("请输入宠物入住信息");

				for (;;) {
					System.out.println("请输入宠物姓名：");
					String input1 = sc1.nextLine();
					name = input1;

					
					System.out.println("请输入宠物年龄：");
					String input2 = sc1.nextLine();
					Integer a = Integer.valueOf(input2);
					age = a;

					System.out.println("请输入宠物种类：");
					System.out.println("a.猫  b.狗  c.鸟");
					System.out.println("例：如果品种为猫，则输入a");
					String type_input = sc1.nextLine();
					type = type_input;

					if ("a".equals(type_input)) {
						Cat cat = new Cat();
						cat.name = name;
						cat.age = age;
						cat.type = "猫";
						for (int i = 0; i < room.length; i++) {
							if (room[i] == null) {
								room[i] = cat;
								System.out.println("您已入住成功");
								System.out.println("房间号为:" + i);
								break;
							}
						}
						break;
					}

					if ("b".equals(type_input)) {
						Dog dog = new Dog();
						dog.name = name;
						dog.age = age;
						dog.type = "狗";
						for (int i = 0; i < room.length; i++) {
							if (room[i] == null) {
								room[i] = dog;
								System.out.println("您已入住成功");
								System.out.println("房间号为:" + i);
								break;
							}
						}
						break;
					}

					if ("c".equals(type_input)) {
						Bird bird = new Bird();
						bird.name = name;
						bird.age = age;
						bird.type = "鸟";
						for (int i = 0; i < room.length; i++) {
							if (room[i] == null) {
								room[i] = bird;
								System.out.println("您已入住成功");
								System.out.println("房间号为:" + i);
								break;
							}
						}
					}
					break;
				}
			}

			if ("3".equals(input)) {
				System.out.println("已选择退房：");
				System.out.println("请选择房间号：");
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
				if (num < 10) {
					if (room[num] == null) {
						System.out.println("房间为空房，不需要退房");
					} else {
						room[num] = null;
						System.out.println("恭喜您退房成功，欢迎下次再来");
					}
				} else {
					System.out.println("你输入的房间号有误，请重新输入！");
				}
				
			}
			
			if ("4".equals(input)) {
				System.out.println("您已选择喂食");
				System.out.println("请选择房间");
				int eatnum = sc1.nextInt();
				if (eatnum < 10) {
					room[eatnum].eat();
					System.out.println(room[eatnum].name+"吃的很饱");
				} else {
					System.out.println("输入房间不正确，请重新输入");
				}
				
			}
			
			if ("5".equals(input)) {
				System.out.println("您已选择预约");
				System.out.println("请输入宠物姓名：");
						String bookname = sc1.nextLine();
						Pet guest = new Pet();
						guest.name = bookname;
				System.out.println("请选择您要预约的房间：");
				int num = sc1.nextInt();
				if (num < 10) {
					if (room[num] == null) {
						room[num] = guest;
						System.out.println("您已预约成功");
						System.out.println("房间号为："+num);
					} 
					else {
						System.out.println("输入房间不可用，请重新选择");
					}
				}
			}
			
			if ("6".equals(input)) {
				System.out.println("请输入房间号");
				int num = sc1.nextInt();
				if(num>9) {
					System.out.println("输入房间号不正确，请重新输入");
					}else if(room[num]==null) {
						System.out.println("房间并未被入住，请重新输入");
					}else {
					System.out.println("名字是："+room[num].name);
					System.out.println("年龄是："+room[num].age);
					System.out.println("类型是："+room[num].type);
					}
				
				}
					
			}

		}
	}

