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
		
		
		for(;;) {
			System.out.println("hotel:" + Arrays.toString(hotel));
			
			System.out.println("1、チェックイン");
			System.out.println("2、チェックアウト");
			System.out.println("3、空き部屋検索");
			System.out.println("4、予約");
			System.out.println("5、予約キャンセル");
			System.out.println("---exitを入力すれば、終了します---");
			
			String input_chose = scl.nextLine(); //输入想要选择的功能
			
			if("exit".equals(input_chose)) {
				System.out.println("---ありがとうございました ---");
				break;
			}
			
			
			if("1".equals(input_chose)) {
				System.out.println("---チェックイン---");
				
				for(;;) {
					String input = scl.nextLine(); //输入入住信息
					String[] input_array = input.split(":"); //冒号分割
					
					if("exit".equals(input)) {
						System.out.println("---チェックイン終了---");
						break;
					}
					
					//エラーチェック
					if(input_array.length < 2) {
						System.out.println("input不正のため、異常終了");
						break;
					}
					
					if("NAME".equals(input_array[0])) {
						name = input_array[1];
					}
					
					if("AGE".equals(input_array[0])) {
						age = Integer.valueOf(input_array[1]);
					}
					
					if("TYPE".equals(input_array[0])) {
						type = input_array[1];
					}
					
					if(!"".equals(name) && age != 0 && !"".equals(type) ) {
						//// input 情報を収集できた時点
						switch(type) {
							case "1":
								Dog dog = new Dog();
								dog.name = name;
								dog.age = age;
								
								for(int i = 0; i < hotel.length; i++) {
									if(hotel[i] == null) {
										hotel[i] = dog;
										System.out.println("部屋番号は" + i + "です。");
										break;
									}
								}
								
								name = ""; //重置入住信息
								age = 0;
								type = "";
								break;
								
							case "2":
								Cat cat = new Cat();
								cat.name = name;
								cat.age = age;
								
								for(int i = 0; i < hotel.length; i++) {
									if(hotel[i] == null) {
										hotel[i] = cat;
										System.out.println("部屋番号は" + i + "です。");
										break;
									}
								}
								
								name = ""; 
								age = 0;
								type = "";
								break;
								
							case "3":
								Bird brid = new Bird();
								brid.name = name;
								brid.age = age;
								
								for(int i = 0; i < hotel.length; i++) {
									if(hotel[i] == null) {
										hotel[i] = brid;
										System.out.println("部屋番号は" + i + "です。");
										break;
									}
								}
								
								name = ""; 
								age = 0;
								type = "";
								break;
						}
					}
				}
			}
				
			if("2".equals(input_chose)) {
				System.out.println("---チェックアウト---");
				System.out.println("部屋番号を入力してください");
				
				String input_checkout = scl.nextLine();
				int room_number = Integer.valueOf(input_checkout);
				
				hotel[room_number] = null;
				System.out.println("---チェックアウト終了---");
				//break;
			}
			
			
			if("3".equals(input_chose)) {
				System.out.println("---空き部屋検索---");
				
				emptyRoom(hotel);
			}
			
			
			if("4".equals(input_chose)) {
				System.out.println("---予約---");
				
				emptyRoom(hotel); 
				
				System.out.println("予約したい部屋番号を入力してください");
				String input_reserve = scl.nextLine();
				int room_number = Integer.valueOf(input_reserve);
				
				System.out.println("個人情報を入力してください");
				for(;;) {
					String input = scl.nextLine(); //输入入住信息
					String[] input_array = input.split(":"); //冒号分割
					
					if("exit".equals(input)) {
						System.out.println("---------");
						break;
					}
					
					//エラーチェック
					if(input_array.length < 2) {
						System.out.println("input不正のため、異常終了");
						break;
					}
					
					if("NAME".equals(input_array[0])) {
						name = input_array[1];
					}
					
					if("AGE".equals(input_array[0])) {
						age = Integer.valueOf(input_array[1]);
					}
					
					if("TYPE".equals(input_array[0])) {
						type = input_array[1];
					}
					
					if(!"".equals(name) && age != 0 && !"".equals(type) ) {
						switch(type) {
							case "1":
								Dog dog = new Dog();
								dog.name = name;
								dog.age = age;
								
								hotel[room_number] = dog;
								
								name = ""; 
								type = "";
								break;
								
							case "2":
								Cat cat = new Cat();
								cat.name = name;
								cat.age = age;
								
								hotel[room_number] = cat;
								
								name = ""; 
								age = 0;
								type = "";
								break;
								
							case "3":
								Bird brid = new Bird();
								brid.name = name;
								brid.age = age;
								
								hotel[room_number] = brid;
								
								name = ""; 
								age = 0;
								type = "";
								break;
						}
					}
				}
				System.out.println(room_number + "号室の予約完了");
			}
			
			
			if("5".equals(input_chose)) {
				System.out.println("---予約キャンセル---");
				System.out.println("予約した部屋番号を入力してください");
				
				String input_cancel = scl.nextLine();
				int room_number = Integer.valueOf(input_cancel);
				
				if(hotel[room_number] != null) {
					hotel[room_number] = null;
					System.out.println("---予約キャンセルしました---");
				}else {
					System.out.println("この部屋が予約されていません");
				}
			}	
		
		}
	
		System.out.println("hotel:" + Arrays.toString(hotel));
		
	}

	//空き部屋
		public static void emptyRoom (Pet[] hotel) {
			System.out.print("空き部屋番号：");
			
			for(int i = 0; i < 10; i++) {
				if(hotel[i] == null) {
					System.out.print(i + "");
				}
			}
			System.out.println("");
		}
	
	
	
}