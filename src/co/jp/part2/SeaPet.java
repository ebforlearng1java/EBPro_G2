package co.jp.part2;

public class SeaPet extends Pet implements Swim {



	public SeaPet(String name, int age) {
		super(name, age, 1);
		// TODO Auto-generated constructor stub
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		if(food>=1) {
			food = food-1;
			power = power+8;
			System.out.println("消耗1份食物，获得8点能量。 ");
		}else {
			System.out.println("没有足够的食物获得能量，请继续进食。");
		}
	}

	void grow() {
		// TODO Auto-generated method stub
		if(power>=4) {
			power = power-4;
			level++;
			System.out.println("消耗4点能量，提升到 "+level+"等级");
		}else {
			System.out.println("能量不足，成长失败。");
		}
	}
	
	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("我是海洋动物，我只会游泳。");
		
	}

}
