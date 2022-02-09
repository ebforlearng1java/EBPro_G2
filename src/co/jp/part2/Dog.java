package co.jp.part2;

public class Dog extends Pet implements Run{
	
	 private static final String TYPE = "小狗";

	    public Dog(String name, int age) {
	        super(name, age, TYPE);
	    }

	    public Dog() {
			// TODO 自動生成されたコンストラクター・スタブ
		}

		@Override
	    public void run() {
	        System.out.printf("小狗[%s]在跑\n", getName());
	    }

	    @Override
	    public void eat() {
	        System.out.printf("小狗[%s]在吃\n", getName());
	    }
	    
	
//	public void printInfo() {
//		countDog++;
//		System.out.println("狗狗的名字是：" + this.name + "狗狗的年龄是：" + this.age + "狗狗的类型是：" +this.type);
//		System.out.println("狗狗的数量是：" + this.countDog);;
//		
//    }


	
}
