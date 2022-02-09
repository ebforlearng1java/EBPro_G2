package co.jp.part2;

import java.util.Scanner;

public class Presentation {

	public static void main(String[] args) {

		Hotel hotel = new Hotel();
		String name = "";// 存储一个宠物的三个属性放到循环的外面
		int age = 0;
		String type = "";

		System.out.println("欢迎来到酒店管理系统，请在使用前阅读以下说明");
		System.out.println("本店提供服务：[1]查看房间状态，[2]订房，[3]退房，[4]喂食，[0]退出系统");

		Scanner scl = new Scanner(System.in);
		while (true) {
			int i = scl.nextInt();
			switch (i) {

			case 1:
				hotel.print();
				break;

			case 2:
				System.out.println("请输入宠物信息后进行订房：");
				System.out.println("宠物信息格式 NAME:xx AGE:xx TYPE:xx ");
				Pet pet = hotel.checkin(name, age, type);
				
				System.out.println("空闲订房编号提示：");
				hotel.print();
				int rooms = scl.nextInt();
				hotel.order(rooms, pet);
				break;
				
			case 3:
				System.out.print("请输入退房编号：");
				int roomNo = scl.nextInt();
				hotel.exit(roomNo);
				break;
				
			case 4:
				System.out.print("请确认喂食 ");
				//调用
				hotel.eat();
				hotel.print();
				break;
				
			case 0:
				System.out.println("退出系统成功，欢迎下次使用，谢谢！");
				System.exit(0);
				break;
				
			default:
				System.out.println("对不起您输入的编号错误,请输入正确的编号！");
				break;
			}
		}

	}
}
