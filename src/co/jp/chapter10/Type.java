package co.jp.chapter10;

public enum Type
{
    CAT("猫",0),DOG("⽝",1);
	
	private String type;
	private int index;
	
	Type(String string, int i) {
		this.setType(string);
		this.setIndex(i);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public String getType() {
		return type;
	}

	private void setType(String type) {
		this.type = type;
	}

	public int getIndex() {
		return index;
	}

	private void setIndex(int index) {
		this.index = index;
	}

}
