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
			System.out.println("==========欢迎来到宠物旅馆===========");
			//询问名字，身份验证
			System.out.println("请输入您的名字：");
			String name =scl.nextLine();
			if("admin".equals(name)) {
				adminPanel(hotel,scl);
				continue;
			}
			Pet pet = isAlredyCheckedIn(name,hotel); 
			if(pet==null) {
				System.out.println("请问您是否需要办理入住：1：是的，帮我办理入住　　2：不好意思，走错门了");
				String request =scl.nextLine();
				if(request.equals("1")) {
					System.out.println("==========开始办理入住手续==========");
					Pet newPet = identify(name,scl);
					if(newPet ==null) continue;
					Pet[][] currentHotel =checkIn(newPet,hotel,scl);
					if(currentHotel!=null) {
						hotel= currentHotel;
					}
				}else if(request.equals("2")) {
					System.out.println("出门右转，好走不送！");
					continue;
				}else {
					System.out.println("输入错误，请重新输入！");
					continue;
				}
				
			}else {
				loop:
				for(;;) {
					System.out.println("请输入您需要的服务：1：办理退房　　2：提供餐食　　3：运动健身　　4：打个招呼");
					String service =scl.nextLine();
					switch(service){
						case "1":
							hotel = checkOut(pet,hotel);
							System.out.println("退房成功，祝您旅途愉快。");
							break loop;
						case"2":
							dinner(pet,scl);
							break;
						case "3":
							System.out.println("请选择您要进行锻炼的项目：1：花样游泳　　2：马拉松　　3：天空盘旋");
							String activity =scl.nextLine();
							exercise(pet,activity);
							break;
						case "4":
							break loop;
					}
				}
				
			}
			
		}
	}
	private static void adminPanel(Pet[][] hotel,Scanner scl) {
		System.out.println("请输入管理员密码：");
		
		String password =scl.nextLine();
		if("eb2022".equals(password)){
			loop:
			for(;;) {
				System.out.println("请输入操作：1：查看入住情况　　2：查看客流量　　3：退出管理系统");
				String operator=scl.nextLine();
				switch(operator) {
					case "1":
						System.out.println("当前的入住情况为：");
						for(int floor=8;floor>=0;floor--) {
							System.out.print("[");
							for(int room=0;room<10;room++) {
								Pet pet =hotel[floor][room];
								if(pet==null) {
									System.out.print("×");
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
						System.out.println("当前的客流量为："+amout);
						break;
					case"3":
						break loop;
					default:
						System.out.println("输入错误，请重新输入");
						break;
				}
			}
			
		}else {
			System.out.println("检测到非法入侵，已联系警察。");
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
		System.out.println("请输入您的年龄：");
		String input =scl.nextLine();
		int age = Integer.parseInt(input);
		if(age<6) {
			System.out.println("非常抱歉，请在成年动物的陪伴下入住。");
			return null;
		}
		System.out.println("请输入您的物种：1：海洋动物　　2：陆地动物　　3：天空动物");
		String typeInput =scl.nextLine();
		int type = Integer.parseInt(typeInput);
		if(type==1) {
			return new SeaPet(name, age);
		}else if(type==2) {
			return new LandPet(name, age);
		}else if(type==3) {
			return new SkyPet(name, age);
		}else {
			System.out.println("非常抱歉，本旅馆不接待外星动物的入住！");
			return null;
		}
	}
	
	private static Pet[][] checkIn(Pet pet,Pet[][] hotel,Scanner scl) {
		int type = pet.type;
		for(;;) {
			System.out.println("您可以选择的入住的房间为：");
			for(int i = type*3-1;i>type*3-4;i--) {
				System.out.print("第"+(i+1)+"层：[");

				for(int j=0;j<10;j++) {
					if(hotel[i][j]==null) {
						System.out.print(i+1+""+j);
					}else {
						System.out.print("已入住");
					}
					if(j!=9) {
						System.out.print(", ");
					}
				}
				System.out.println("]");
			}
			System.out.println("请输入您要入住的房间号：");
			String numberInput =scl.nextLine();
			int number = Integer.parseInt(numberInput);
			int floor = number/10;
			int room = number-floor*10;
			
			if(floor<type*3-2||floor>type*3) {
				System.out.println("您不能入住"+floor+"楼层的房间");
				continue;
			}
			if(hotel[floor-1][room]==null) {
				System.out.println("成功入住：第"+floor+"层 第"+room+"号房间");
				hotel[floor-1][room]=pet;
				return hotel;
			}else {
				System.out.println("入住失败，该房间已有其他客人入住。");
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
			System.out.println("不能再吃啦！旅馆快被你吃破产啦。");
		}else {
			pet.food++;
			System.out.println("您获得了我们旅馆提供的一顿丰盛的膳食。");
			System.out.println("您现在已经积累了"+pet.food+"份食物");
			System.out.println("请问是否要进食：1：吃　　2：不吃");
			String answer = scl.nextLine();
			if("1".equals(answer)) {
				pet.eat();
			}
			
		}
	}
	
	private static void exercise(Pet pet,String activity) {
		if(pet.power<3) {
			System.out.println("赶快去吃点东西吧，不然没有力气锻炼身体。");
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
						System.out.println("您必须在水中活动，上岸后损失10点能量。");
					}
					break;
				case"3":
					if(pet instanceof SkyPet) {
						((Fly) pet).fly();
					}else {
						pet.power = pet.power-10;
						System.out.println("只有天空动物才能飞翔，您跌落损失10点能量。");
					}
					break;
			}
			pet.grow();
			System.out.println();
			
		}
	}

}
