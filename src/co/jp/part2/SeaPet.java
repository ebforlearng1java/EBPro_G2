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
			System.out.println("����1��ʳ����8�������� ");
		}else {
			System.out.println("û���㹻��ʳ�����������������ʳ��");
		}
	}

	void grow() {
		// TODO Auto-generated method stub
		if(power>=4) {
			power = power-4;
			level++;
			System.out.println("����4�������������� "+level+"�ȼ�");
		}else {
			System.out.println("�������㣬�ɳ�ʧ�ܡ�");
		}
	}
	
	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("���Ǻ������ֻ����Ӿ��");
		
	}

}
