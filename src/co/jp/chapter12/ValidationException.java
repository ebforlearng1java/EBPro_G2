package co.jp.chapter12;

public class ValidationException extends Exception {

	private String name; // カラム名称
	private String message; // エラーメッセージ
	
	
	public ValidationException(String name, String message) {
		super();
		this.name = name;
		this.message = message;
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

	public void errotInfo() {
		
		System.out.println("error:" + name + message);
	}

}
