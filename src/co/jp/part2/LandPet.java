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
			System.out.println("����3��ʳ����10�������� ");
		}else {
			System.out.println("û���㹻��ʳ�����������������ʳ��");
		}
	}
	
	@Override
	void grow() {
		// TODO Auto-generated method stub
		if(power>=5) {
			power = power-5;
			level++;
			System.out.println("����5�������������� "+level+"�ȼ�");
		}else {
			System.out.println("�������㣬�ɳ�ʧ�ܡ�");
		}
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("��Ȼ����½�ض������ѧ������Ӿ��");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("����½�ض�����ó��ܲ���");
		
	}



}
