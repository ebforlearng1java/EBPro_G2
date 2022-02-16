package co.jp.chapter10;

public enum Animal {

	DOG(0,"犬"),
	CAT(1,"猫"),
	BIRD(2,"鳥");

	private final int code;
	private final String type;


	Animal(int code, String type) {
		this.code = code;
		this.type = type;
	}

	int getCode() {
		return code;
	}
	String getType() {
		return type;
	}

	String getType(int code) {
		//
		return type;

	}


}
