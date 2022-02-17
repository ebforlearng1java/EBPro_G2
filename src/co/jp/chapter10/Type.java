package co.jp.chapter10;

public enum Type {
	
	CAT(0,"猫"),
	DOG(1,"犬");
		
	private final int number;
	private final String type;
	

	Type(int number, String type) {
		this.number = number;
		this.type = type;
	}

	public int getNumber() {
		return number;
	}

	public String getType() {
		return type;
	}
	
}
