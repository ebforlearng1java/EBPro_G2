package co.jp.chapter12;

public class ValidationException extends Exception {
	
	private String name; // カラム名称
	private String message; // エラーメッセージ

	public ValidationException(String name, String message) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name = name;
		this.message = message;
	}




	public void output() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Error: "+ name +"を"+ message);
		
	}


	


}
