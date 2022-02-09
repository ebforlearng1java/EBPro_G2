package co.jp.part2;

import java.util.Scanner;

public class Presentation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        Hotel hotel = new Hotel(scanner, 2, 5);

        System.out.println("欢迎来到酒店管理系统，请在使用前阅读以下说明");
        System.out.println("本店提供服务：[1]查看房间状态，[2]订房，[3]退房，[4]喂食，[0]退出系统");

        while (true) {
            System.out.print("\n请输入指令: ");
            int ind = scanner.nextInt();
            switch (ind) {
                case 0: {
                    System.out.println("欢迎下次光临!");
                    System.exit(0);
                }
                //查看房间状态
                case 1: {
                    hotel.printInfo();
                    break;
                }
                //订房输入宠物信息
                case 2: {
                    hotel.checkIn();
                    break;
                }
                //退房
                case 3: {
                    hotel.checkOut();
                    break;
                }
                //喂食
                case 4: {
                    hotel.eat();
                    break;
                }
            }
        }
    }
        
	}


