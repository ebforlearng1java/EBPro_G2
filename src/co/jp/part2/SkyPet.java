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
			System.out.println("����2��ʳ����6�������� ");
		}else {
			System.out.println("û���㹻��ʳ�����������������ʳ��");
		}
	}
	
	void grow() {
		// TODO Auto-generated method stub
		if(power>=3) {
			power = power-3;
			level++;
			System.out.println("����3�������������� "+level+"�ȼ�");
		}else {
			System.out.println("�������㣬�ɳ�ʧ�ܡ�");
		}
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("������ն����Ҳ�ḡ��ˮ���ϡ�");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("������ն����Ҳ����½���ϱı�������");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("������ն���Һ��ó����С�");
	}
	

}
