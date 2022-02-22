package co.jp.chapter12;

public class JavaHomework12 {

//	質問１︓配列の範囲外を指定している場合、ArrayIndexOutOfBoundsException例外を発⽣します。該当例外を処理するサンプルコードを書いてください。

//	public static void main(String[] args) {
//		try {
//			System.out.println(args[0]);
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("配列の範囲外の要素を入力しました");
//		}
//	}
//	
//	
//	質問２︓Validation Exceptionを作成して、ユーザー⼊⼒した値を検証します。該当は実際商⽤アプリで利⽤しています。
//	STEP1 : ValidationException クラスを定義する
//	
//	
//	1 public class ValidationException extends Exception {
//	2 	private String name; // カラム名称
//	3 	private String message; // エラーメッセージ
//	4 }
//	
//	STEP2 : チェック処理（サンプル）
//	
//	1 if(name.matches("^[0-9]+$")) {
//	2 	throw new ValidationException("名称", "半角数字を入力してください。");
//	3 }
//
//	
	

	public static void method(String name) throws ValidationException {
		if (name.matches("^[0-9]+$")) {
			throw new ValidationException("名称" , "半角数字を入力してください。");
		}
	}

}
