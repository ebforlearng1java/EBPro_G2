package co.jp.part2;

public class LandPet extends Pet implements Run,Swim{


	public LandPet(String name, int age) {
		super(name, age, 2);
		// TODO Auto-generated constructor stub
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		if(food>=3) {
			food = food-3;
			power = power+10;
			System.out.println("消耗3份食物，获得10点能量。 ");
		}else {
			System.out.println("没有足够的食物获得能量，请继续进食。");
		}
	}
	
	@Override
	void grow() {
		// TODO Auto-generated method stub
		if(power>=5) {
			power = power-5;
			level++;
			System.out.println("消耗5点能量，提升到 "+level+"等级");
		}else {
			System.out.println("能量不足，成长失败。");
		}
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("虽然我是陆地动物，但我学会了游泳。");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("我是陆地动物，我擅长跑步。");
		
	}



}
