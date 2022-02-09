package co.jp.part2;

public class Dog extends Pet implements Run{
	
	public Dog(String name, int age, String type) {
		super(name, age, type);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Dog() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	private int countDog=0;
	

	public int getCount() {
		return countDog;
	}

	public void setCount(int count) {
		this.countDog = count;
	}

	@Override
	void eat() {
		// TODO 自動生成されたメソッド・スタブ
		  System.out.println("小狗吃东西");
	}
	
	public void printInfo() {
		countDog++;
		System.out.println("狗狗的名字是：" + this.name + "狗狗的年龄是：" + this.age + "狗狗的类型是：" +this.type);
		System.out.println("狗狗的数量是：" + this.countDog);;
		
    }

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("出门遛狗");
	}
	
}
