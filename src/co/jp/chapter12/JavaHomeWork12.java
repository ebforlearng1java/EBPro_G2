package co.jp.chapter12;

import java.util.Scanner;

public class JavaHomeWork12 {

	public static void main(String[] args) {
		/*質問１︓配列の範囲外を指定している場合、ArrayIndexOutOfBoundsException例外を発⽣します。
		 * 該当例外を処理するサンプルコードを書いてください。
		 */
		try {
			String[] array = new String[10];
			System.out.println(array[0]);
			System.out.println(array[10]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException例外を発⽣しました");
		}
		
		
		/*質問２︓Validation Exceptionを作成して、ユーザー⼊⼒した値を検証します。
		 * 該当は実際商⽤アプリで利⽤しています。
		 * 
		 * STEP1 : ValidationException クラスを定義する
		 * STEP2 : チェック処理（サンプル
		 */
		Scanner scl = new Scanner(System.in);
		String input = scl.nextLine();
		try {
			check(input);
		} catch (ValidationException e) {
			
			System.out.println(e.getName());
			System.out.println(e.getMessage());
			
		}

	}

	public static void check(String name) throws ValidationException{
		if(name.matches("^[0-9]+$")) {
			 throw new ValidationException("名称", "半角数字を入力してください。");
		}
	}
}
