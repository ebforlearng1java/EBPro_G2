package co.jp.part2;
import java.util.Arrays;
import java.util.Scanner;

public class Presentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet[][] hotel = new Pet[9][10];
		Scanner scl = new Scanner(System.in);
		
		for(;;) {
			System.out.println();
			System.out.println("==========��ӭ���������ù�===========");
			//ѯ�����֣������֤
			System.out.println("�������������֣�");
			String name =scl.nextLine();
			if("admin".equals(name)) {
				adminPanel(hotel,scl);
				continue;
			}
			Pet pet = isAlredyCheckedIn(name,hotel); 
			if(pet==null) {
				System.out.println("�������Ƿ���Ҫ������ס��1���ǵģ����Ұ�����ס����2��������˼���ߴ�����");
				String request =scl.nextLine();
				if(request.equals("1")) {
					System.out.println("==========��ʼ������ס����==========");
					Pet newPet = identify(name,scl);
					if(newPet ==null) continue;
					Pet[][] currentHotel =checkIn(newPet,hotel,scl);
					if(currentHotel!=null) {
						hotel= currentHotel;
					}
				}else if(request.equals("2")) {
					System.out.println("������ת�����߲��ͣ�");
					continue;
				}else {
					System.out.println("����������������룡");
					continue;
				}
				
			}else {
				loop:
				for(;;) {
					System.out.println("����������Ҫ�ķ���1�������˷�����2���ṩ��ʳ����3���˶�������4������к�");
					String service =scl.nextLine();
					switch(service){
						case "1":
							hotel = checkOut(pet,hotel);
							System.out.println("�˷��ɹ���ף����;��졣");
							break loop;
						case"2":
							dinner(pet,scl);
							break;
						case "3":
							System.out.println("��ѡ����Ҫ���ж�������Ŀ��1��������Ӿ����2�������ɡ���3���������");
							String activity =scl.nextLine();
							System.out.println("Ĭ�϶���1Сʱ�������Ҫ�����һ�ᣬ��������ϣ��������Сʱ����");
							String timeString =scl.nextLine();
							Integer time;
							try {
						        time = Integer.parseInt(timeString);
						        exercise(pet,activity,time);
						    } catch (NumberFormatException e) {
						    	System.out.println("�������Ĭ�϶���1Сʱ");
						    	System.out.println();
						    	exercise(pet,activity);
						    }
							break;
						case "4":
							break loop;
					}
				}
				
			}
			
		}
	}
	private static void adminPanel(Pet[][] hotel,Scanner scl) {
		System.out.println("���������Ա���룺");
		
		String password =scl.nextLine();
		if("eb2022".equals(password)){
			loop:
			for(;;) {
				System.out.println("�����������1���鿴��ס�������2���鿴����������3���˳�����ϵͳ");
				String operator=scl.nextLine();
				switch(operator) {
					case "1":
						System.out.println("��ǰ����ס���Ϊ��");
						for(int floor=8;floor>=0;floor--) {
							System.out.print("[");
							for(int room=0;room<10;room++) {
								Pet pet =hotel[floor][room];
								if(pet==null) {
									System.out.print("��");
								}else {
									System.out.print(pet.name);
								}
								if(room!=9) {
									System.out.print(", ");
								}
								
							}
							System.out.println("]");
						}
						break;
					case"2":
						int amout = Pet.COUNT;
						System.out.println("��ǰ�Ŀ�����Ϊ��"+amout);
						break;
					case"3":
						break loop;
					default:
						System.out.println("û����������Сʱ����Ĭ�϶���1Сʱ");
						break;
				}
			}
			
		}else {
			System.out.println("��⵽�Ƿ����֣�����ϵ���졣");
		}
	}
	
	private static Pet isAlredyCheckedIn(String name,Pet[][] hotel) {
		for(Pet[] floor:hotel) {
			for(Pet pet:floor) {
				if(pet!=null&&pet.name.equals(name)) {
					return pet;
				}
			}
		}
		return null;
	}
	
	private static Pet identify(String name,Scanner scl) {
		System.out.println("�������������䣺");
		String input =scl.nextLine();
		int age = Integer.parseInt(input);
		if(age<6) {
			System.out.println("�ǳ���Ǹ�����ڳ��궯����������ס��");
			return null;
		}
		System.out.println("�������������֣�1���������2��½�ض����3����ն���");
		String typeInput =scl.nextLine();
		int type = Integer.parseInt(typeInput);
		if(type==1) {
			return new SeaPet(name, age);
		}else if(type==2) {
			return new LandPet(name, age);
		}else if(type==3) {
			return new SkyPet(name, age);
		}else {
			System.out.println("�ǳ���Ǹ�����ùݲ��Ӵ����Ƕ������ס��");
			return null;
		}
	}
	
	private static Pet[][] checkIn(Pet pet,Pet[][] hotel,Scanner scl) {
		int type = pet.type;
		for(;;) {
			System.out.println("������ѡ�����ס�ķ���Ϊ��");
			for(int i = type*3-1;i>type*3-4;i--) {
				System.out.print("��"+(i+1)+"�㣺[");

				for(int j=0;j<10;j++) {
					if(hotel[i][j]==null) {
						System.out.print(i+1+""+j);
					}else {
						System.out.print("����ס");
					}
					if(j!=9) {
						System.out.print(", ");
					}
				}
				System.out.println("]");
			}
			System.out.println("��������Ҫ��ס�ķ���ţ�");
			String numberInput =scl.nextLine();
			int number = Integer.parseInt(numberInput);
			int floor = number/10;
			int room = number-floor*10;
			
			if(floor<type*3-2||floor>type*3) {
				System.out.println("��������ס"+floor+"¥��ķ���");
				continue;
			}
			if(hotel[floor-1][room]==null) {
				System.out.println("�ɹ���ס����"+floor+"�� ��"+room+"�ŷ���");
				hotel[floor-1][room]=pet;
				return hotel;
			}else {
				System.out.println("��סʧ�ܣ��÷�����������������ס��");
				continue;
			}
		}
		
	}
	
	private static Pet[][] checkOut(Pet pet,Pet[][] hotel) {
		for(int i=0;i<9;i++) {
			for(int j=0;j<10;j++) {
				if(hotel[i][j]==pet) {
					hotel[i][j]=null;
				}
			}
		}
		return hotel;
	}
	
	private static void dinner(Pet pet,Scanner scl) {
		if(pet.food>5) {
			System.out.println("�����ٳ������ùݿ챻����Ʋ�����");
		}else {
			pet.food++;
			System.out.println("������������ù��ṩ��һ�ٷ�ʢ����ʳ��");
			System.out.println("�������Ѿ�������"+pet.food+"��ʳ��");
			System.out.println("�����Ƿ�Ҫ��ʳ��1���ԡ���2������");
			String answer = scl.nextLine();
			if("1".equals(answer)) {
				pet.eat();
			}
			
		}
	}
	
	private static boolean exercise(Pet pet,String activity) {
		if(pet.power<3) {
			System.out.println("�Ͽ�ȥ�Ե㶫���ɣ���Ȼû�������������塣");
			return false;
		}else {
			switch(activity) {
				case"1":
					((Swim) pet).swim();
					break;
				case"2":
					if(pet instanceof SeaPet == false) {
						((Run) pet).run();
					}else {
						pet.power = pet.power-10;
						System.out.println("��������ˮ�л���ϰ�����ʧ10��������");
						return false;
					}
					break;
				case"3":
					if(pet instanceof SkyPet) {
						((Fly) pet).fly();
					}else {
						pet.power = pet.power-10;
						System.out.println("ֻ����ն�����ܷ��裬��������ʧ10��������");
						return false;
					}
					break;
			}
			pet.grow();
			System.out.println();
			return true;
		}
	}
	
	//��������overload���� ����ѡ�������ʱ��
	private static void exercise(Pet pet,String activity,int hour) {
		for(int i= 0;i<hour;i++) {
			System.out.println("==============");
			System.out.println("��ʼ��"+(i+1)+"��Сʱ�Ķ���������");
			boolean result=	exercise(pet,activity);
			if(!result) {
				System.out.println("��ѽѽ���������㣬û�����ԭ�ƻ�"+hour+"Сʱ���˶���");
				System.out.println();
				return;
			}
		}
		System.out.println("��ϲ�㣬������������"+hour+"Сʱ���˶���");
		System.out.println();
		
	}
	

	
}
