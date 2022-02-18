package co.jp.chapter12;

import java.util.Scanner;

public class JavaHomeWork12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//質問１︓配列の範囲外を指定している場合、ArrayIndexOutOfBoundsException例外を発⽣
		//します。該当例外を処理するサンプルコードを書いてください。
		
		int[] num = new int[11];

		try {
			System.out.println(num[1]);
			System.out.println(num[111]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException例外");
		}
		
		
		
		//質問２︓Validation Exceptionを作成して、ユーザー⼊⼒した値を検証します。該当は実際
		//商⽤アプリで利⽤しています。
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		try {
			check(input);
		} catch (ValidationException e) {
			e.output();
			}	
		}

	    public static void check(String name) throws ValidationException{
		if(name.matches("^[0-9]+$")) {
			throw new ValidationException("名称", "半角数字を入力してください。");
		}
	}

	

}
