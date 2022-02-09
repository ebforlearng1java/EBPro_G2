package co.jp.part2;

public class Cat extends Pet implements Run {

	@Override
	void eat() {
		// TODO 自動生成されたメソッド・スタブ
		  System.out.println("小猫吃东西");
	}
	
	
	public Cat(String name, int age, String type) {
		super(name, age, type);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Cat() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	private int countCat=0;
	

	public int getCount() {
		return countCat;
	}

	public void setCount(int count) {
		this.countCat = count;
	}


	
	public void printInfo() {
		countCat++;
		System.out.println("猫猫的名字是：" + this.name + "猫猫的年龄是：" + this.age + "猫猫的类型是：" +this.type);
		System.out.println("猫猫的数量是：" + this.countCat);;
		
    }


	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("出门遛猫");
		
	}
	
}

