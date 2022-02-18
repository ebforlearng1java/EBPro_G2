package co.jp.chapter12;

import java.util.Scanner;

public class JavaHomeWork12 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
//	質問１︓配列の範囲外を指定している場合、ArrayIndexOutOfBoundsException例外を発生します。該当例外を処理するサンプルコードを書いてください。
//	回答１︓
		try {
			 int[] array = {1,2,3,4,5};
			 System.out.println(array[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			 System.out.println("发生了索引越界错误");
		}
		
		
//	質問２︓Validation Exceptionを作成して、ユーザー⼊⼒した値を検証します。
//		該当は実際商⽤アプリで利⽤しています。
		Scanner scl = new Scanner(System.in);
		String input = scl.nextLine();
		try {
			verify(input);
		}catch (ValidationException e) {
			e.print();
		}
		
	}
	
	public static void verify(String value) throws ValidationException {
		if(value.matches("^[0-9]+$")) {
			 throw new ValidationException("名称", "半角数字を入力してください。");
		}
	}
	



}
