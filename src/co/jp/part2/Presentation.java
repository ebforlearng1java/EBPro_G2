package co.jp.part2;

import java.util.Scanner;

public class Presentation {

	public static void main(String[] args) {

		Pet[] hotel = new Pet[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("宠物旅馆系统已开启");

		// 系统本身的主界面循环，需要用关闭系统指令break
		outerLoop: for (;;) {
			System.out.println();
			System.out.println("※※※※※※※※※※※※※※※※※");
			System.out.println("※　　　宠物旅馆系统主菜单　　　※");
			System.out.println("※　【１】入住　【９】房间信息　※");
			System.out.println("※　【２】退房　【０】关闭系统　※");
			System.out.println("※※※※※※※※※※※※※※※※※");
			System.out.println("请输入指令：");
			String input = scanner.nextLine();

			innerLoop: switch (input) {

			// 关闭系统
			case "0":
			case "０":
				for (int i = 0; i < hotel.length; i++) {
					if (hotel[i] != null) {
						System.out.println("【系统提示】尚有未退房的信息，是否强制关闭？（Y/N）");
						String answer = scanner.nextLine();
						switch (answer) {
						case "Y":
						case "y":
							System.out.println("【系统提示】强制关闭系统。现有入住信息将输出，请做好人工记录");
							for (int t = 0; t < hotel.length; t++) {
								if (hotel[t] != null)
									System.out.println("【入住信息输出】" + t + "号房：" + hotel[t].name + " " + hotel[t].age
											+ "岁 " + hotel[t].type);
							}
							break outerLoop;
						case "N":
						case "n":
							System.out.println("【系统提示】撤消关闭。将返回主菜单");
							break innerLoop;
						default:
							System.out.println("【系统提示】无法识别回答。将返回主菜单");
							break innerLoop;
						}

					}
				}
				System.out.println("【系统提示】谢谢使用，正在关闭系统");
				break outerLoop;

			// 房间信息
			case "9":
			case "９":
				for (int i = 0; i < hotel.length; i++)
					System.out.println(hotel[i] == null ? i + "号房间：空" : i + "号房间：" + hotel[i].type);
				break innerLoop;

			// 退房
			case "2":
			case "２":
				System.out.println("请输入要退房的房间号，或按「回车」返回主菜单：");
				String num = scanner.nextLine();
				if ("".equals(num)) // 回车则直接返回主菜单
					break innerLoop;

				// 房间字符串是否可以顺利转换为int型的前置判断
				for (int i = 0; i < num.length(); i++) {
					if (Character.isDigit(num.charAt(i)) == false) {
						System.out.println("【系统提示】房间号必须为自然数。将返回主菜单");
						break innerLoop;
					}
				}
				int outRoom = Integer.valueOf(num);// 退房的房间号的值
				if (outRoom > hotel.length) {
					System.out.println("【系统提示】该房间不存在。将返回主菜单");
					break innerLoop;
				} else if (hotel[outRoom] == null) {
					System.out.println("【系统提示】房间本来就是空的。将返回主菜单");
					break innerLoop;
				} else {
					hotel[outRoom] = null;
					System.out.println("【系统提示】「" + outRoom + "号房间」退房成功。将返回主菜单");
					break innerLoop;
				}

			// 入住
			case "1":
			case "１":
				int inRoom = -1;// 入住的房间号的值，默认值-1
				for (int i = 0; i < hotel.length; i++) {
					// 通过循环查找到第一个空房间后赋对应的值
					if (hotel[i] == null) {
						inRoom = i;
						System.out.println("【系统提示】为您自动选取了空闲的「" + i + "号房间」");
						break;
					}
					if (i + 1 == hotel.length) {
						System.out.println("【系统提示】已经没有空房了。将返回主菜单");
						break innerLoop;
					}

				}
				System.out.println("请依照括号内以空格分隔的格式，输入宠物信息〖名字 年龄 类型〗，或按「回车」返回主菜单：");
				String infoGroup = scanner.nextLine(); // 一次性输入，通过空格分隔
				if ("".equals(infoGroup)) // 回车则直接返回主菜单
					break innerLoop;
				String[] info = infoGroup.split(" ");

				if (info.length == 3 && !"".equals(info[1])) { // 判断是否分为三个字符串
					// 年龄字符串是否可以顺利转换为int型的前置判断
					for (int i = 0; i < info[1].length(); i++) {
						if (Character.isDigit(info[1].charAt(i)) == false) {
							System.out.println("【系统提示】年龄必须为自然数。将返回主菜单");
							break innerLoop;
						}

					}

					String nameValue = "";
					int ageValue = 0;
					String typeValue = "";
					nameValue = info[0];
					ageValue = Integer.valueOf(info[1]);
					typeValue = info[2];

					// 三个值都有意义的话则安排入住步骤，通过switch来筛选动物类型
					if (!"".equals(nameValue) && ageValue != 0 && !"".equals(typeValue)) {

						switch (typeValue) {
						case "DOG":
						case "Dog":
						case "dog":
						case "狗":
							hotel[inRoom] = new Dog();
							hotel[inRoom].name = nameValue;
							hotel[inRoom].age = ageValue;
							hotel[inRoom].type = "狗";
							break;
						case "CAT":
						case "Cat":
						case "cat":
						case "猫":
							hotel[inRoom] = new Cat();
							hotel[inRoom].name = nameValue;
							hotel[inRoom].age = ageValue;
							hotel[inRoom].type = "猫";
							break;
						case "BIRD":
						case "Bird":
						case "bird":
						case "鸟":
							hotel[inRoom] = new Bird();
							hotel[inRoom].name = nameValue;
							hotel[inRoom].age = ageValue;
							hotel[inRoom].type = "鸟";
							break;
						default:
							System.out.println("【系统提示】不合适的动物类型。将返回主菜单");
							break innerLoop;
						}
					} else {
						System.out.println("【系统提示】输入信息不全面。将返回主菜单");
						break innerLoop;
					}

					// 入住成功时输出信息
					System.out.println("【系统提示】" + hotel[inRoom].age + "岁的小" + hotel[inRoom].type + "「 "
							+ hotel[inRoom].name + "」成功入住「" + inRoom + "号房间」。将返回主菜单");
					break innerLoop;
				} else {
					System.out.println("【系统提示】输入格式不正确。将返回主菜单");
					break innerLoop;
				}
			default:
				System.out.println("【系统提示】无法识别的指令");
			}

		}
		System.out.println("\n宠物旅馆系统已关闭");
	}

}
