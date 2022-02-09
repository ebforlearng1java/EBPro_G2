package co.jp.part2;

public class Bird extends Pet implements Fly {

	@Override
	void eat() {
		// TODO 自動生成されたメソッド・スタブ
		  System.out.println("小鸟吃东西");
		   

	}
	
	
	
	public Bird(String name, int age, String type) {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

	private int countBird=0;
	

	public int getCount() {
		return countBird;
	}

	public void setCount(int count) {
		this.countBird = count;
	}


	
	public void printInfo() {
		countBird++;
		System.out.println("小鸟的名字是：" + this.name + "小鸟的年龄是：" + this.age + "小鸟的类型是：" +this.type);
		System.out.println("小鸟的数量是：" + this.countBird);;
		
    }



	@Override
	public void fly() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("出门遛鸟");
	}
	
}



