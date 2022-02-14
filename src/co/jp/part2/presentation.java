package co.jp.part2;

import java.util.Scanner;

public class presentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "";
		int age = 0;
		String type = "";
		int roomnumber = 0;
		String reservationname = "";
		pet[] hotel = new pet[10];
		pet[] reservation = new pet[10];

		loop1: for (;;) {
			System.out.println("欢迎来到宠物旅馆，请您选择功能\n1.入住\n2.退房\n3.查询\n4.预约\n5.喂食");
			Scanner sc1 = new Scanner(System.in);
			String first = sc1.nextLine();
			switch (first) {
			case "1":
				System.out.println("您是否有预约\n1.是\n2.否");
				String checkr = sc1.nextLine();
				switch (checkr) {
				case "1":
					System.out.println("请输入您的姓名");
					String rname = sc1.nextLine();
					reservationname = rname;
					loop2: for (int i = 0; i < reservation.length; i++) {
						if (reservation[i] != null) {
							
							if (reservationname.equals(reservation[i].name)) {
								
								switch (reservation[i].type) {
								case "cat":
									hotel[i] = new cat(reservation[i].name, reservation[i].age, "cat");
									System.out.println(i + 1 + "号房入住成功");
									reservation[i] = null;
									break;
								case "dog":
									hotel[i] = new dog(reservation[i].name, reservation[i].age, "dog");
									System.out.println(i + 1 + "号房入住成功");
									reservation[i] = null;
									break;
								case "fish":
									hotel[i] = new fish(reservation[i].name, reservation[i].age, "fish");
									System.out.println(i + 1 + "号房入住成功");
									reservation[i] = null;
									break;

								}
							}
							continue loop1;
						} else if (reservation[i] == null) {
							
							continue loop2;
						}

					}

					break;
				case "2":
					System.out.println("请输入您的姓名");
					String input = sc1.nextLine();
					if ("" != input) {
						name = input;
						System.out.println("您的姓名为" + name + "，请提供你的年龄");
						String inputage = sc1.nextLine();

						if (Integer.valueOf(inputage) != 0) {
							age = Integer.valueOf(inputage);
							System.out.println("您的年龄为" + age + "，请提供你的类别");

							String inputtype = sc1.nextLine();
							if (inputtype != "") {
								type = inputtype;
								System.out.println("基本信息为姓名" + name + ",年龄" + age + ",类型" + type + "。请您核对，如没有问题请入住");
								String check = sc1.nextLine();
								if ("有问题".equals(check)) {
									continue;

								}
								if ("没问题".equals(check)) {
									for (;;) {
										System.out.println("请选择你的房间 1-10");
										String number = sc1.nextLine();
										roomnumber = Integer.valueOf(number) - 1;
										if (hotel[roomnumber] == null && reservation[roomnumber] == null) {

											switch (type) {
											case "cat":
												hotel[roomnumber] = new cat(input, age, "cat");
												System.out.println(number + "号房入住成功");

												break;
											case "dog":
												hotel[roomnumber] = new dog(input, age, "dog");
												System.out.println(number + "号房入住成功");
												break;
											case "fish":
												hotel[roomnumber] = new fish(input, age, "fish");
												System.out.println(number + "号房入住成功");
												break;
											}
											continue loop1;
										} else if (hotel[roomnumber] != null) {
											System.out.println("已经有住户，请重新选择");
										} else if (reservation[roomnumber] != null) {
											System.out.println("已经有预约，请重新选择");
										}

									}

								}

							}

						}
					}
				}

				break;
			case "2":
				loop3: for (;;) {
					System.out.println("请提供您的姓名");
					String checkoutname = sc1.nextLine();
					if ("" != checkoutname) {
						System.out.println("您的姓名为" + checkoutname + "，请提供你的年龄");
						String checkoutage = sc1.nextLine();
						if (Integer.valueOf(checkoutage) != 0) {
							System.out.println("您的年龄为" + age + "，请提供你的类别");
							String checkouttype = sc1.nextLine();
							if ("" != checkouttype) {
								System.out.println("基本信息为姓名" + checkoutname + ",年龄" + checkoutage + ",类型" + checkouttype
										+ "\n1.确定退房\n2.取消");
								String checkout = sc1.nextLine();
								switch (checkout) {
								case "1":
									loop4:for (int i = 0; i < hotel.length; i++) {
										if(hotel[i]!=null) {
										if (checkoutname.equals(hotel[i].name) && Integer.valueOf(checkoutage).equals(hotel[i].age)
												&& checkouttype.equals(hotel[i].type)) {
											hotel[i] = null;
											System.out.println("退房成功，欢迎再次光临");

											continue loop1;
										}
										}
										else if (hotel[i]==null) {
											continue loop4;
										}
									}
											loop4: for (;;) {
												System.out.println("信息有误，请\n1.重新输入\n2.返回主页");
												String backto = sc1.nextLine();
												switch (backto) {
												case "1":
													continue loop3;

												case "2":
													continue loop1;

												default:
													System.out.println("输入错误，请重新输入");
													continue loop3;
												}

											}

										
							
							
							
								case "2":
									continue loop1;

								}
							}
						}
					}
				}

			case "3":
				for (int i = 0; i < 10; i++) {
					if (hotel[i] == null && reservation[i] == null) {
						System.out.println(i + 1 + "号房空");
					} else if (hotel[i] == null && reservation[i] != null) {
						System.out.println(i + 1 + "号房已被预约");
					} else if (hotel[i] != null) {
						System.out.println(i + 1 + "号房已有住户");
					}
				}

				
				continue loop1;
			case "4":
				loop4: for (;;) {
					System.out.println("请提供您的姓名");
					String rname = sc1.nextLine();
					if ("" != rname) {
						name = rname;
						System.out.println("您的姓名为" + name + "，请提供你的年龄");
						String rage = sc1.nextLine();

						if (Integer.valueOf(rage) != 0) {
							age = Integer.valueOf(rage);
							System.out.println("您的年龄为" + age + "，请提供你的类别");

							String rtype = sc1.nextLine();
							if (rtype != "") {
								type = rtype;
								System.out.println("基本信息为姓名" + name + ",年龄" + age + ",类型" + type + "。请您核对，如没有问题请继续");
								String check = sc1.nextLine();
								if ("有问题".equals(check)) {
									continue loop4;

								}
								if ("没问题".equals(check)) {
									for (;;) {
										System.out.println("请选择你的房间 1-10");
										String number = sc1.nextLine();
										roomnumber = Integer.valueOf(number) - 1;
										if (hotel[roomnumber] == null && reservation[roomnumber] == null) {

											switch (type) {
											case "cat":
												reservation[roomnumber] = new cat(name, age, "cat");
												System.out.println(number + "号房预约成功");

												break;
											case "dog":
												reservation[roomnumber] = new dog(name, age, "dog");
												System.out.println(number + "号房预约成功");
												break;
											case "fish":
												reservation[roomnumber] = new fish(name, age, "fish");
												System.out.println(number + "号房预约成功");
												break;
											}
											continue loop1;
										} else if (hotel[roomnumber] != null) {
											System.out.println(number + "号房已经有住户，请重新选择");
										} else if (reservation[roomnumber] != null) {
											System.out.println("已经有预约，请重新选择");
										}

									}
								}

							}
						}

					}

				}
			case "5" : 
				System.out.println("请选择房间");
				String roomnumberf = sc1.nextLine();
				if(hotel[Integer.valueOf(roomnumberf)-1]!= null) {
					hotel[Integer.valueOf(roomnumberf)-1].FEED();
					
				}
				else if (hotel[Integer.valueOf(roomnumberf)-1]== null) {
					System.out.println("没有宠物入住，返回主页");
					continue loop1;
				}
				break;
				
			}
			
			

		}
		
	}
}
