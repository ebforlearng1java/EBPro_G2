package Pet_Hotel;

import java.util.Scanner;

public class M3_RoomService {
	private static int guest_index; 
	private static int roomtype; 
	
	private M3_RoomService(){
		guest_index = 0;
		roomtype = 0;
	}
	
	private static void RoomServoce_order(int roomtype, String sercive) {
		switch(roomtype) {
			case 1:
				Room.guest_list_a[guest_index].guest_service = sercive;
				System.out.printf("已帮入住%s的%s下单了服务：%s\n",Room.guest_list_a[guest_index].roomNo, 
														    Room.guest_list_a[guest_index].guest_name, 
														    sercive);
				break;
			case 2:
				Room.guest_list_t[guest_index].guest_service = sercive;
				System.out.printf("已帮入住%s的%s下单了服务：%s\n",Room.guest_list_t[guest_index].roomNo, 
														    Room.guest_list_t[guest_index].guest_name, 
														    sercive);
				break;
			default:
				break;
		}
	}
	
	private static void RoomService_menu() {
		for(;;) {
			Scanner scl = new Scanner(System.in);
			String[] check = new String[]{"age", "roomNo"};
			System.out.println("************************** 房间查询 **************************");
			System.out.println("\n1.通过昵称点单");
			System.out.println("2.通过房间号点单\n");
			
			System.out.println("3.返回主菜单\n");
			System.out.println("***********************************************************");	
			System.out.println("请输入指令序号：");
			String ind = scl.nextLine();
			switch (ind) {
			
				case "1":
					System.out.println("请输入想订单的宾客昵称：");
					String consult_name = scl.nextLine();
					if(Room.aquatic == 5 & Room.terrestrial == 5) {
						System.out.printf("抱歉，没有[%s]入住的相关信息。", consult_name);
						break;
					}
					if(Room.aquatic != 5) {
						for(int i=0; i<=(5-Room.aquatic-1); i++) {
							if(Room.guest_list_a[i].guest_name.equals(consult_name)) {
								check[0] = Room.guest_list_a[i].guest_age;
								check[1] = Room.guest_list_a[i].roomNo;
								guest_index = i;
								roomtype = 1;
							}
						}
					}
					if(Room.terrestrial != 5) {
						for(int j=0; j<=(5-Room.terrestrial-1); j++) {
							if(Room.guest_list_t[j].guest_name.equals(consult_name)) {
								check[0] = Room.guest_list_t[j].guest_age;
								check[1] = Room.guest_list_t[j].roomNo;
								guest_index = j;
								roomtype = 2;
							}
						}
					}
					if(check[0].equals("age")) {
						System.out.printf("抱歉，没有[%s]入住的相关信息。", consult_name);
						break;
					}
					else {
						System.out.println("请输入该宾客的年龄：");
						String consult_age = scl.nextLine();
						if(check[0].equals(consult_age)) {
							System.out.printf("请输入点单内容：");
							String Service = scl.nextLine();
							RoomServoce_order(roomtype, Service);
						}
						else{
							System.out.printf("抱歉，没有[%s]入住的相关信息。", consult_name);
							break;
						}
					}
					break;
					
				case "2":
					System.out.println("请输入想订单的房间号：");
					String consult_roomNo = scl.nextLine();
					if(Room.aquatic == 5 & Room.terrestrial == 5) {
						System.out.printf("抱歉，不符合[%s]房间的入住记录。", consult_roomNo);
						break;
					}
					if(Room.aquatic != 5) {
						for(int i=0; i<=(5-Room.aquatic-1); i++) {
							if(Room.guest_list_a[i].roomNo.equals(consult_roomNo)) {
								check[0] = Room.guest_list_a[i].guest_age;
								check[1] = Room.guest_list_a[i].roomNo;
								guest_index = i;
								roomtype = 1;
							}
						}
					}
					if(Room.terrestrial != 5) {
						for(int j=0; j<=(5-Room.terrestrial-1); j++) {
							if(Room.guest_list_t[j].roomNo.equals(consult_roomNo)) {
								check[0] = Room.guest_list_t[j].guest_age;
								check[1] = Room.guest_list_t[j].roomNo;
								guest_index = j;
								roomtype = 2;
							}
						}
					}
					if(check[0].equals("age")) {
						System.out.printf("抱歉，没有[%s]房间的入住记录。", consult_roomNo);
						break;
					}
					else {
						System.out.printf("请输入房间[%s]宾客的年龄：", consult_roomNo);
						String consult_age = scl.nextLine();
						if(check[0].equals(consult_age)) {
					    	System.out.printf("请输入点单内容：");
							String Service = scl.nextLine();
							RoomServoce_order(roomtype, Service);
						}
						else{
							System.out.printf("抱歉，不符合[%s]房间的入住记录。", consult_roomNo);
							break;
						}
					}
					break;
					
				case "3":
					System.out.println("\n返回主菜单中，请稍后...\n");
					break;
					
				default:
					System.out.println("请输入正确指令序号。\n稍后请重新输入...\n");
					break;
			}
			
			if (ind.equals("2")) {
				break;
			}
			if (ind.equals("3")) {
				break;
			}
		}	
	}
	
	public static void main() {
		RoomService_menu();
	}

}
