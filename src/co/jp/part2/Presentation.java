package co.jp.part2;

import java.util.Arrays;
import java.util.Scanner;

public class Presentation {

	public static void main(String[] args) {

		Pet[] hotel = new Pet[10];
		String name = "";
		int age = 0;
		String type = "";

		Scanner scl = new Scanner(System.in);

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~ Welcome to the PetHotel ~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		loop: for (;;) {
			System.out.println();
			System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
			System.out.println("1 -----------办理入住-----------");
			System.out.println("2 -----------办理退房-----------");
			System.out.println("3 -----------查询空房-----------");
			System.out.println("4 -----------钱包充值-----------(待完善)");
			System.out.println("0 -----------退出系统-----------");
			System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");

			System.out.println("请选择目录:");
			String menu = scl.nextLine();

			// 办理入住
			if ("1".equals(menu)) {

				System.out.println();
				System.out.print("目前的房间状况: ");
				for (int i = 0; i < hotel.length; i++) {
					if (hotel[i] != null) {
						System.out.print(hotel[i].name + ", ");
					}
					if (hotel[i] == null) {
						System.out.print("空房  ");
					}
				}
				for (;;) {
					System.out.println();
					System.out.println("==========开始办理入住==========:");
					System.out.println("请输入名字:");
					String input_name = scl.nextLine();
					System.out.println("请输入年龄:");
					String input_age = scl.nextLine();
					System.out.println("请输入种类:");
					String input_type = scl.nextLine();
					System.out.println("\n请确认您的信息\n名字:" + input_name + "\n年龄" + input_age + "\n种类:" + input_type);
					System.out.println("是否正确？YES or NO");
					String input_correct = scl.nextLine();

					if ("exit".equals(input_correct)) {
						System.out.println("~~~慢走不送~~~");
						break;
					} else if ("YES".equals(input_correct)) {
						System.out.println("入住成功！");
					} else if ("NO".equals(input_correct)) {
						System.out.println("请重新输入信息");
						continue;
					} else {
						System.out.println("输入错误");
						break;
					}
					if (!"".equals(input_name) && !"0".equals(input_age) && !"".equals(input_type)) {
						switch (input_type) {

						case "dog":
							Dog dog = new Dog();
							dog.name = input_name;
							dog.age = Integer.valueOf(input_age);

							for (int i = 0; i < hotel.length; i++) {
								if (hotel[i] == null) {
									hotel[i] = dog;
									int room = i+101;
									System.out.println(input_name+"在" + room + "号房住下");
									break;
								}
							}
							break;
						case "cat":
							Cat cat = new Cat();
							cat.name = input_name;
							cat.age = age;
							for (int i = 0; i < hotel.length; i++) {
								if (hotel[i] == null) {
									hotel[i] = cat;
									int room = i+101;
									System.out.println(input_name+"在" + room + "号房住下");
									break;
								}
							}
							break;
						case "fish":
							Fish fish = new Fish();
							fish.name = input_name;
							fish.age = age;
							for (int i = 0; i < hotel.length; i++) {
								if (hotel[i] == null) {
									hotel[i] = fish;
									int room = i+101;
									System.out.println(input_name+"在" + room + "号房住下");
									break;
								}
							}
							break;
						case "bird":
							Bird bird = new Bird();
							bird.name = input_name;
							bird.age = age;
							for (int i = 0; i < hotel.length; i++) {
								if (hotel[i] == null) {
									hotel[i] = bird;
									int room = i+101;
									System.out.println(input_name+"在" + room + "号房住下");
									break;
								}
							}
							break;
						default:
							System.out.println("不在服务范围之内");		
						}
					}
					continue loop;

				}
			}
			
			if("2".equals(menu)) {
				System.out.println("请输入房间号\n房间号:");
				String input_name = scl.nextLine();
				int room = Integer.valueOf(input_name);
				room = room - 101;
				hotel[room] = null;
				System.out.println("退房成功");				
			}
			
			// 查询空房
			if ("3".equals(menu)) {
				System.out.println();
				int room = 0;
				for (int i = 0; i < hotel.length; i++) {
					if (hotel[i] == null) {
						room = room + 1;
					}
				}
				System.out.println("剩余" + room + "间空房");

				System.out.print("目前的房间状况: ");
				for (int i = 0; i < hotel.length; i++) {
					if (hotel[i] != null) {
						System.out.print(hotel[i].name + ", ");
					}
					if (hotel[i] == null) {
						System.out.print("空房  ");

					}
				}
				continue loop;
			}
			
			//充值
			if("4".equals(menu)) {
				int sum = 0;
				int remain = 0;

				// 充值循环
				chargeLoop: for (;;) {
					System.out.println("请输入充值金额:");					
					String c = scl.nextLine();
					int charge = Integer.valueOf(c);// 充值为charge的金额
					
					System.out.println("充值金额是否为:" + charge + "？ YES or NO");
					String answer = scl.nextLine();
					if ("YES".equals(answer)) {
						remain = moneyCharge(charge);
						sum = sum + remain;
						System.out.println("现在您的余额为:" + sum + "元");
						System.out.println("继续充值选择continue, 返回主菜单选择back");
						String choose = scl.nextLine();
						if ("back".equals(choose)) {
							continue loop;
						}
						if ("continue".equals(choose)) {
						} else {
							System.out.println("输入格式错误");
						}
					} else {
						System.out.println("请重新输入");
					}
					continue loop;
				}
			}
			
			// 0退出系统
			if ("0".equals(menu)) {
				System.out.println("(๑´ㅂ`๑)欢迎下次光临(๑´ㅂ`๑)");
				break;
			}
		}
	}
	
	//充值功能
	public static int moneyCharge(int charge) {
		int remain = 0;
		System.out.println("充值:" + charge);
		remain = remain + charge;

		return remain;
	}
}