package co.jp.part2;

import java.util.Arrays;
import java.util.Scanner;

public class Presentation {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("----- 実行開始 -----");

		Pet[] hotel = new Pet[10];

		String name = "";
		int age = 0;
		String type = "";

		System.out.println("hotel: " + Arrays.toString(hotel));

		Scanner sc1 = new Scanner(System.in);
		for (;;) {
			System.out.println("----- ループ開始 -----");
			String input = sc1.nextLine();

			if ("exit".equals(input)) {
				System.out.println("----- ループ終了 -----");
				break;
			}

			// 形式   NAME:金柑  AGE:18  TYPE:DOG
			String[] input_array = input.split(":");

			// INPUT エラーチェック
			if (input_array.length < 2) {
				System.out.println("INPUT形式不正のため、異常終了");
				break;
			}

			if ("NAME".equals(input_array[0])) {
				name = input_array[1];
			}

			if ("AGE".equals(input_array[0])) {
				age = Integer.valueOf(input_array[1]);
			}

			if ("TYPE".equals(input_array[0])) {
				type = input_array[1];
			}

			if (!"".equals(name) && age != 0 && !"".equals(type)) {
				// input 情報を収集できた時点
				switch (type) {
				case "1":
					//TODO DOG
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
					type = "";
					break;
				case "2":
					//TODO CAT
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
					//TODO BIRD
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
				default:
					System.out.println("TYPE範囲外のため、異常終了");
				}
			}

			System.out.println("入力した文字は=" + input);

		}

		System.out.println("----- 実行終了 -----");
	}

}
