package co.jp.chapter12;

public class ValidationException extends Exception {

	private String name;	 // カラム名称
	private String message;	// エラーメッセージ
	public ValidationException(String string, String string2) {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
		
}
