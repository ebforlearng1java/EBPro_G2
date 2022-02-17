package co.jp.chapter12;

public class ValidationException extends Exception {

	private String name; // カラム名称
	private ValidationException (String name) {
		this.name=name;
	}
	private String message; // エラーメッセージ
	this.message=message;
	
	
	public static void dosomething(String input) throws  ValidationException{
		if (name.matches("^[0-9]+$")) {
			throw new ValidationException("名称", "半角数字を入力してください。");
		}
	}
	
	public static void main(String... args) {
		 try {
		 dosomething("123");
		 } catch (ValidationException ex) {
			System.out.println("名称"+"半角数字を入力してください。");
		 
		 }
		 }
}
