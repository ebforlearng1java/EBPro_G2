package co.jp.chapter12;

public class ValidationException extends Exception{
	private String name; // カラム兆各
	private String message; // エラ�`メッセ�`ジ
	
	public ValidationException(String name, String message) {
		this.name = name;
		this.message = message;
	}
	
	public void print() {
		System.out.println("‐窟伏危列／"+name+":"+message);
	}
}
