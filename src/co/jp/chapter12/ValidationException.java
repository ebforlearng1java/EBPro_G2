package co.jp.chapter12;

public class ValidationException extends Exception{
	/*質問２︓Validation Exceptionを作成して、ユーザー⼊⼒した値を検証します。
	 * 該当は実際商⽤アプリで利⽤しています。
	 * 
	 * STEP1 : ValidationException クラスを定義する
	 * STEP2 : チェック処理（サンプル）
	 */
	
	// STEP1 : ValidationException クラスを定義する
	// カラム名称
	private String name;
	
	// エラーメッセージ
	private String message;
	
	public ValidationException(String name, String message) {
		this.name = name;
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public String getMessage() {
		return message;
	}
	
	
}