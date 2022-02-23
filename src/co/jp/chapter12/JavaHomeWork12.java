package co.jp.chapter12;

import java.util.Scanner;

//質問１︓配列の範囲外を指定している場合、ArrayIndexOutOfBoundsException例外を発⽣します。該当例外を処理するサンプルコードを書いてください。
public class JavaHomeWork12 {
	public static void main(String[] args) {
		try {
			int[] array = new int[1];
			System.out.println(array[0]);
			System.out.println(array[1]);

		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("以上代码报错为ArrayIndexOutOfBoundsException");
		}

//質問２︓Validation Exceptionを作成して、ユーザー⼊⼒した値を検証します。該当は実際商⽤アプリで利⽤しています。

		Scanner scl = new Scanner(System.in);
		String input = scl.nextLine();

		// 
		try {
			method(input);
		} catch (ValidationException e) {
			
			System.out.println(e.getName());
			System.out.println(e.getMessage());
		}

	}

	public static void method(String name) throws ValidationException {
		if (name.matches("^[0-9]+$")) {

			throw new ValidationException("名称", "半角数字を入力してください。");
		}
	}

}