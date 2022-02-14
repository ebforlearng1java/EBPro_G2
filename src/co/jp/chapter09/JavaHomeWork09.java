package co.jp.chapter09;

import co.jp.part2.cat;
import co.jp.part2.dog;

public class JavaHomeWork09 {
	public static void main(String[] args) {
		
		Animal []x =new Animal[10];
		System.out.println(x[9]);
		int []a ={1,5,6,32,5,4};
		x[1] = new Animal(true,2,a);
		
		for(int i = 0;i>x.length;i++) {
			
			System.out.println(x[i].legs);
			
		}
//		
//		Dog ani [] = new Dog [10];
//		for (int i = 0; i < 10;i++) {
//			System.out.println(ani[i].legs);
//		}
		
//		
//		
//		String a = "fsdfdaf";
//		int b = Integer.valueOf(a);
//		boolean c = Integer.valueOf(a) instanceof Integer;
//		System.out.println(c);
//		System.out.println("欢迎来到宠物旅馆，请您选择功能\n1.入住\n2.退房\n3.查询\n4.预约\n5.退出");
//		System.out.println("欢迎来到宠物旅馆，请您提供您的姓名，或输入查询房间状况");
//		String input = sc1.nextLine();// 输入系统
//		if ("查询房间状况".equals(input)) {
//			for (int i = 0; i < 10; i++) {
//				if (hotel[i] == null) {
//					System.out.println(i + 1 + "号房空");
//				} else {
//					System.out.println(i + 1 + "号房满");
//				}
//			}
//		}
//		if ("退出".equals(input)) {
//			break;
//		}
//		if (!"".equals(input) && !"查询房间状况".equals(input)) {
//			name = input;
//			System.out.println("您的姓名为" + name + "，请提供你的年龄");
//			String inputage = sc1.nextLine();
//
//			if (Integer.valueOf(inputage) != 0) {
//				age = Integer.valueOf(inputage);
//				System.out.println("您的年龄为" + age + "，请提供你的类别");
//
//				String inputtype = sc1.nextLine();
//				if (inputtype != "") {
//					type = inputtype;
//					System.out.println("基本信息为姓名" + name + ",年龄" + age + ",类型" + type + "。请您核对，如没有问题请入住");
//					String check = sc1.nextLine();
//					if ("有问题".equals(check)) {
//						continue;
//
//					}
//					if ("没问题".equals(check)) {
//						for (;;) {
//							System.out.println("请选择你的房间 1-10");
//							String number = sc1.nextLine();
//							roomnumber = Integer.valueOf(number) - 1;
//							if (hotel[roomnumber] == null) {
//
//								switch (type) {
//								case "cat":
//									hotel[roomnumber] = new cat(input, age, "cat");
//									System.out.println(number + "号房入住成功");
//
//									break;
//								case "dog":
//									hotel[roomnumber] = new dog(input, age, "dog");
//									System.out.println(number + "号房入住成功");
//									break;
//								case "fish":
//									hotel[roomnumber] = new fish(input, age, "fish");
//									System.out.println(number + "号房入住成功");
//									break;
//								}
//								break;
//							} else {
//								System.out.println("已经有住户，请重新选择");
//							}
//
//						}
//
//					}
//
//				}
//
//			}
//
//		}
//
//	}
//
//}
//}


	}

}
