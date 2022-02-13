package Pet_Hotel;
import java.util.Scanner;

public class M2_Consult {
	private static void checkIn_menu(){
		Scanner scl = new Scanner(System.in);
		for(;;) {
			System.out.println("************************** 房间查询 **************************");
			System.out.println("\n1.通过昵称查询\n");
			
			System.out.println("2.返回主菜单\n");
			System.out.println("***********************************************************");	
			System.out.println("请输入指令序号：");
			String ind = scl.nextLine();
			switch (ind) {
				case "1":
					String[] check = new String[]{"age", "roomNo"};
					System.out.println("请输入想访问的宾客昵称：");
					String consult_name = scl.nextLine();
					
					if(Room.aquatic != 5) {
						for(int i=0; i<=(5-Room.aquatic-1); i++) {
							if(Room.guest_list_a[i].guest_name.equals(consult_name)) {
								check[0] = Room.guest_list_a[i].guest_age;
								check[1] = Room.guest_list_a[i].roomNo;
							}
						}
					}
					if(Room.terrestrial != 5) {
						for(int j=0; j<=(5-Room.terrestrial-1); j++) {
							if(Room.guest_list_t[j].guest_name.equals(consult_name)) {
								check[0] = Room.guest_list_t[j].guest_age;
								check[1] = Room.guest_list_t[j].roomNo;
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
							System.out.printf("您想要访问的宾客在[%s]房间。", check[1]);
						}
						else{
							System.out.printf("抱歉，没有[%s]入住的相关信息。", consult_name);
							break;
						}
					}
					break;
					
				case "2":
					System.out.println("\n返回主菜单中，请稍后...\n");
					break;
					
				default:
					System.out.println("请输入正确指令序号。\n稍后请重新输入...\n");
					break;
				}
				
			if (ind.equals("2")) {
				break;
			}
		}
	}
		
	public static void main(){
		checkIn_menu();
	}
}
