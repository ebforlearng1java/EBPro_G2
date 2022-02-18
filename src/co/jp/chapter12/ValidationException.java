package co.jp.chapter12;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ValidationException extends Exception {
	private String name; // カラム名称
	private String message; // エラーメッセージ

	public ValidationException(String name, String msg) {
		this.name = name;
		this.message = msg;
	}

	public static void dosomething(String name) throws ValidationException{
		if(name.matches("^[0-9]+$")) {
		throw new ValidationException("名称", "半角数字を入力してください。");
		}
	}
	public static void main(String... args) {
		try {
			dosomething("789");
		}catch(ValidationException e) {
			Logger.getLogger(Kicker.class.getName()).log(Level.SEVERE, null, e);
		}
	}
}

