package co.jp.chapter10;

public class Pet {
	private String name;
	private int age;
	private Type type;
	Pet(String name, int age, int type) {
		this.name = name;
		this.age = age;
        if (type ==0)	{
        	this.type= Type.CAT;
        }
        else if(type == 1){
            this.type= Type.DOG;
        }
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}

}
