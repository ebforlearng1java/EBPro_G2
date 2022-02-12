package co.jp.part2;

public class Cat extends Pet implements Run {

    private static final String TYPE = "CAT";

    public Cat(String name, int age) {
        super(name, age, TYPE);
    }
    


    public Cat() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
    



	@Override
    public void run() {
        System.out.printf("小猫[%s]在跑\n", getName());
    }

    @Override
    public void eat() {
        System.out.printf("小猫[%s]在吃\n", getName());
    }

	
//	public void printInfo() {
//		System.out.println("猫猫的名字是：" + this.name + "猫猫的年龄是：" + this.age + "猫猫的类型是：" +this.type)
//		
//    }


	
}

