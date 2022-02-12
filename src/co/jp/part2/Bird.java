package co.jp.part2;

public class Bird extends Pet implements Fly {

	   private static final String TYPE = "BIRD";

	    public Bird(String name, int age) {
	        super(name, age, TYPE);
	    }

	    public Bird() {
			// TODO 自動生成されたコンストラクター・スタブ
		}

		@Override
	    public void fly() {
	        System.out.printf("小鸟[%s]在飞\n", getName());
	    }

	    @Override
	    public void eat() {
	        System.out.printf("小鸟[%s]在吃\n", getName());
	    }
	    


	
//	public void printInfo() {
//		countBird++;
//		System.out.println("小鸟的名字是：" + this.name + "小鸟的年龄是：" + this.age + "小鸟的类型是：" +this.type);
//		System.out.println("小鸟的数量是：" + this.countBird);;
//		
//    }




}



