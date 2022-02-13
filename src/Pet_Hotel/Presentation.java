package Pet_Hotel;

import java.util.Scanner;

public class Presentation {
	
	public static void menu(){

		System.out.println("\n****************** Welcome to Pet Hotel! ******************");
		System.out.println("\n1.入住登录");
		System.out.println("2.访客查询");
		System.out.println("3.服务点单");
		System.out.println("4.退房");
		System.out.println("\n5.退出自助系统\n");
		System.out.println("***********************************************************");		
	}
	
	public static void main(String[] args){		
		System.out.println("実行開始\n");
		Scanner scl = new Scanner(System.in);
		Room.init();
		for(;;) {
			menu();   //显示主菜单内容
			System.out.println("请输入指令序号：");
			String instructor = scl.nextLine();
		 
			switch (instructor) {
				case "1":
					System.out.println("已选择服务：1.入住登录\n请稍后...\n");
					M1_CheckIn.main();
					break;
				case "2":
					System.out.println("已选择服务：2.入住情况查询\n请稍后...\n");
					M2_Consult.main();
					break;
				case "3":
					System.out.println("已选择服务：3.服务点单\n请稍后...\n");
					M3_RoomService.main();
					break;
				case "4":
					System.out.println("已选择服务：4.退房\n请稍后...\n");
					M4_CheckOut.main();
					break;
				case "5":
					System.out.println("已选择服务：5.退出自助系统\n系统退出中，请稍后...\n");
					break;
					
				default:
					System.out.println("请输入正确指令。\n返回主菜单中，请稍后...\n");
					break;
			}
			if (instructor.equals("5")) {
				break;
			}
		}
		System.out.println("\n実行結束\n");
	}
}
