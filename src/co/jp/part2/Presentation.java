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
		
		System.out.println("----いらっしゃいませ----");
		
		
		for(;;) {
			System.out.println("hotel:" + Arrays.toString(hotel));
			
			System.out.println("1、チェックイン");
			System.out.println("2、インタラクティブ");
			System.out.println("3、チェックアウト");
			System.out.println("4、空きスペースの検索");
			System.out.println("5、予約");
			System.out.println("6、予約キャンセル");
			System.out.println("7、ソート");
			System.out.println("---exitを入力すれば、終了します---");
			
			String input_chose = scl.nextLine(); //接收选择的输入
			
			if("exit".equals(input_chose)) {
				System.out.println("---ありがとうございました---");
				break;
			}
			
			
			if("1".equals(input_chose)) {
				System.out.println("---チェックイン---");
				System.out.println("---「チェックイン終了」を入力すれば、チェックイン終了します---");
				
				for(;;) {
					String input = scl.nextLine(); //接收入住信息的输入
					String[] input_array = input.split(":"); //冒号分割
					
					if("チェックイン終了".equals(input)) { //改进 跟功能选择退出区分
						System.out.println("---チェックイン終了---");
						break;
					}
					
					//エラーチェック
					if(input_array.length < 2) {
						System.out.println("input不正のため、異常終了");
						System.out.println("「NAME:xxx」のかたで入力ください。");
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
								
								for(int i = 0; i < hotel.length; i++) {
									if(hotel[i] == null) {
										hotel[i] = dog;
										System.out.println("お部屋番号は" + i + "です。");
										break;
									}
								}
								
								name = ""; //一个住入成功之后给入住信息清空，不然在连续入住2位时会产生只输入名字就入住的bug
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
										System.out.println("お部屋番号は" + i + "です。");
										break;
									}
								}
								
								name = ""; 
								age = 0;
								type = "";
								break;
								
							case "3":
								Brid brid = new Brid();
								brid.name = name;
								brid.age = age;
								
								for(int i = 0; i < hotel.length; i++) {
									if(hotel[i] == null) {
										hotel[i] = brid;
										System.out.println("お部屋番号は" + i + "です。");
										break;
									}
								}
								
								name = ""; 
								age = 0;
								type = "";
								break;
								
							case "4":
								Fish fish = new Fish();
								fish.name = name;
								fish.age = age;
								
								for(int i = 0; i < hotel.length; i++) {
									if(hotel[i] == null) {
										hotel[i] = fish;
										System.out.println("お部屋番号は" + i + "です。");
										break;
									}
								}
								
								name = ""; 
								age = 0;
								type = "";
								break;
								
							case "5":
								Hamster hamster = new Hamster();
								hamster.name = name;
								hamster.age = age;
								
								for(int i = 0; i < hotel.length; i++) {
									if(hotel[i] == null) {
										hotel[i] = hamster;
										System.out.println("お部屋番号は" + i + "です。");
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
				System.out.println("---インタラクティブ---");
				System.out.println("部屋番号を入力してください");
				//System.out.println("走る/飛ぶ/泳ぐ"); //TODO 跑，飞，游 的方法调用
				
				String input_room = scl.nextLine();
				int room_number= Integer.valueOf(input_room);
				
				System.out.print(hotel[room_number].name + ":");
				hotel[room_number].eat();
			}
			
			
			if("3".equals(input_chose)) {
				System.out.println("---チェックアウト---");
				System.out.println("部屋番号を入力してください");
				
				String input_checkout = scl.nextLine();
				int room_number = Integer.valueOf(input_checkout);
				
				hotel[room_number] = null;
				System.out.println("---チェックアウト終了---");
				//break;
			}
			
			
			if("4".equals(input_chose)) {
				System.out.println("---空きスペースの検索---");
				
				emptyRoom(hotel);
			}
			
			
			if("5".equals(input_chose)) {
				System.out.println("---予約---");
				
				emptyRoom(hotel); 
				
				System.out.println("予約したい部屋番号を入力してください");
				String input_reserve = scl.nextLine();
				int room_number = Integer.valueOf(input_reserve);
				
				System.out.println("個人情報を入力してください");
				System.out.println("---「入力終了」を入力すれば、予約終了します---");
				for(;;) {
					String input = scl.nextLine(); //接收入住信息的输入
					String[] input_array = input.split(":"); //冒号分割
					
					if("入力終了".equals(input)) { //改进 区别退出
						System.out.println("----予約終了-----");
						break;
					}
					
					//エラーチェック
					if(input_array.length < 2) {
						System.out.println("input不正のため、異常終了");
						System.out.println("「NAME:xxx」のかたで入力ください。");
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
								
								name = ""; //一个住入成功之后给入住信息清空，不然在连续入住2位时会产生只输入名字就入住的bug
								age = 0;
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
								Brid brid = new Brid();
								brid.name = name;
								brid.age = age;
								
								hotel[room_number] = brid;
								
								name = ""; 
								age = 0;
								type = "";
								break;
								
							case "4":
								Fish fish = new Fish();
								fish.name = name;
								fish.age = age;
								
								hotel[room_number] = fish;
								
								name = ""; 
								age = 0;
								type = "";
								break;
								
							case "5":
								Hamster hamster = new Hamster();
								hamster.name = name;
								hamster.age = age;
								
								hotel[room_number] = hamster;
								
								name = ""; 
								age = 0;
								type = "";
								break;
						}
					}
				}
				System.out.println(room_number + "号室の予約完了");
			}
			
			
			if("6".equals(input_chose)) {
				System.out.println("---予約キャンセル---");
				System.out.println("予約した部屋番号を入力してください");
				
				String input_cancel = scl.nextLine();
				int room_number = Integer.valueOf(input_cancel);
				
				if(hotel[room_number] != null) {
					hotel[room_number] = null;
					System.out.println("---予約キャンセルしました---");
				}else {
					System.out.println("この部屋を予約していません");
				}
			}
			
			
			if("7".equals(input_chose)) {
				bubbleSort(hotel);
				System.out.println("hotel:" + Arrays.toString(hotel));
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
	
	
	//ソート
	public static void bubbleSort(Pet[] array) {
		Pet change;
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length -1 - i; j++) {
				if(array[j] == null && array[j + 1] != null) {
					change = array[j];
					array[j] = array[j+1];
					array[j+1] = change;
				}
			}
		}
	}
}
