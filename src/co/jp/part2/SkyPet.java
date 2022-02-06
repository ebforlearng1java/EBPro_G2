package co.jp.part2;

public class SkyPet extends Pet implements Fly,Run,Swim{



	public SkyPet(String name, int age) {
		super(name, age, 3);
		// TODO Auto-generated constructor stub
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		if(food>=2) {
			food = food-2;
			power = power+6;
			System.out.println("消耗2份食物，获得6点能量。 ");
		}else {
			System.out.println("没有足够的食物获得能量，请继续进食。");
		}
	}
	
	void grow() {
		// TODO Auto-generated method stub
		if(power>=3) {
			power = power-3;
			level++;
			System.out.println("消耗3点能量，提升到 "+level+"等级");
		}else {
			System.out.println("能量不足，成长失败。");
		}
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("我是天空动物，我也会浮在水面上。");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("我是天空动物，我也会在陆地上蹦蹦跳跳。");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("我是天空动物，我很擅长飞行。");
	}
	

}
