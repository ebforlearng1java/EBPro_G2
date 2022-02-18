package co.jp.chapter12;

public class ValidationException extends Exception{
	private String name; // ¥«¥é¥àÃû³Æ
	private String message; // ¥¨¥é©`¥á¥Ã¥»©`¥¸
	
	public ValidationException(String name, String message) {
		this.name = name;
		this.message = message;
	}
	
	public void print() {
		System.out.println("¡¾·¢Éú´íÎó¡¿"+name+":"+message);
	}
}
