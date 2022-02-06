package Pet_Hotel;

import java.util.Scanner;

public class M1_CheckIn{
//	public String room_type;
	public static String room_type;
	public static String[] checkIn_menu(){
//		房间种类（栅栏，水族），名字，物种，年龄，入住天数，入住天数，添加服务。
		Scanner scl = new Scanner(System.in);
		String roomNo = "null";
		for(;;) {
			System.out.println("\n************************** 入住登录 **************************");
			System.out.println("请选择房间的种类\n");
			System.out.println("1.水缸房");
			System.out.println("2.栅栏房");
			
			System.out.println("\n3.返回主菜单\n");
			System.out.println("***********************************************************");	
			System.out.println("请输入序号：");
			room_type = scl.nextLine();

			switch (room_type) {
				case "1":
					System.out.println("已选择房间：1.水缸房\n请稍后...\n");
					roomNo = Room.checkin_ava(room_type);
					break;
				case "2":
					System.out.println("已选择房间：2.栅栏房\n请稍后...\n");
					roomNo = Room.checkin_ava(room_type);
					break;
				case "3":
					System.out.println("\n返回主菜单中，请稍后...\n");
					break;

				default:
					System.out.println("请输入正确房间类型。\n稍后请重新输入...\n");
					break;
			}
			if (room_type.equals("1") || room_type.equals("2")) {
				if (roomNo.equals("很抱歉，目前没有相应空房。")) {
					System.out.println(roomNo);
					System.out.println("\n返回主菜单中，请稍后...\n");
					System.out.println("--------------------------------------------------------------");
					room_type = "3";
				}
				break;
			}
			if (room_type.equals("3")) {
				break;
			}
		}
		
		String[] guest = new String[]{room_type, "name", "species", "age", "roomNo",  "stays", "no service"};
		
		
		if (room_type.equals("3")) {
			return guest;
		}
			
		for(;;) {
			System.out.println("\n************************** 请登记入住信息 **************************");
			System.out.println("爱宠昵称：");
			guest[1] = scl.nextLine();
			
			System.out.println("物种：");
			guest[2] = scl.nextLine();
			
			System.out.println("年龄：");
			guest[3] = scl.nextLine();
			guest[4] = roomNo;
			System.out.println("入住天数：");
			guest[5] = scl.nextLine();
			
			System.out.println("添加服务(若无,请输入'no'。)：");
			guest[6] = scl.nextLine();
			
			System.out.println("\n************************** 请确认信息 **************************");
			
			System.out.printf("爱宠昵称：%s\n", guest[1]);
			System.out.printf("种类：%s\n", guest[2]);
			System.out.printf("年龄：%s\n", guest[3]);
			System.out.printf("入住天数：%s\n", guest[5]);
			
			System.out.println("\n以下是房间信息：");

			if(room_type.equals("1")) {
				System.out.printf("房间类型：1.水缸房\n");
			}
			else {
				System.out.printf("房间类型：2.栅栏房\n");
			}
			System.out.printf("房间号：%s\n", guest[4]);
			System.out.printf("内含餐点：%s\n", "xxx");
			System.out.printf("添加服务：%s\n", guest[6]);
			System.out.println("--------------------------------------------------------------");	
			
			System.out.println("是否入住？");
			System.out.println("1.是");
			System.out.println("2.否");
			System.out.println("3.重新输入信息");
			
			String sub_in2 = scl.nextLine();
			switch (sub_in2) {
			case "1":
				System.out.println("\n**************************************************************");
				System.out.println("感谢您爱宠的入住!\n");
				Room.checkin(guest);
				System.out.println("--------------------------------------------------------------");	
				break;
				
				
			case "2":
				System.out.println("欢迎下次光临，返回主菜单中...\n");
				break;
			case "3":
				System.out.println("\n请稍后...\n");
				break;

			default:
				System.out.println("请输入正确指令。\n稍后请重新输入...\n");
				continue;
			}
			if (sub_in2.equals("1") || sub_in2.equals("2")) {
				break;
			}

		}
	return guest;
	}
	
	public static void checkIn_main() {
		String[] guest = checkIn_menu();
		if(guest[0].equals("3")) {
			return;
		}
	}
	
}