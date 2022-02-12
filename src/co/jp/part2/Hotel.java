package co.jp.part2;

import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Hotel {

	private final int floorCount;
	private final Floor[] floors;
	private final Map<String, Room> roomMap;
	private final Scanner scanner;

	public Hotel(Scanner scanner, int floorCount, int roomCountPerFloor) {
		this.scanner = scanner;
		this.floorCount = floorCount;
		this.floors = new Floor[floorCount];
		this.roomMap = new LinkedHashMap<>();

		for (int i = 0; i < floorCount; i++) {
			this.floors[i] = new Floor(i + 1 + "", roomCountPerFloor);
			for (Room room : this.floors[i].getRooms()) {
				this.roomMap.put(room.getRoomNo(), room);
			}
		}
	}

	/**
	 * 查看酒店的所有房间状态
	 */
	public void printInfo() {
		System.out.printf("=== 当前酒店，共有楼层数[%d]\n", floorCount);
		for (Floor floor : floors) {
			floor.printInfo();
		}
	}

	/**
	 * 入住酒店
	 */

	public void checkIn() {
		// 提示语
		System.out.println("欢迎入住本酒店!");

		// 查看是否有空闲房间
		Set<String> idleRoomNoSet = new LinkedHashSet<>();
		for (Floor floor : floors) {
			for (Room room : floor.getRooms()) {
				if (room.isIdle()) {
					idleRoomNoSet.add(room.getRoomNo());
				}
			}
		}
		if (idleRoomNoSet.isEmpty()) {
			System.out.println("对不起，没有空闲的房间了!");
			return;
		}
		System.out.println("空闲房间有: "); // 打印空闲的房间
		for (String roomNo : idleRoomNoSet) {
			System.out.println(roomNo);
		}

		// 收集需要预定的房间
		Room idleRoom;
		System.out.print("请输入需要预定的房号: ");
		while (true) {
			String roomNo = scanner.next();
			if (!roomMap.containsKey(roomNo)) {
				System.out.print("房间号输入错误，请重新输入: ");
				continue;
			}
			Room room = roomMap.get(roomNo);
			if (!room.isIdle()) {
				System.out.print("当前房间已经被占用，请重新输入: ");
				continue;
			}
			idleRoom = room;
			break;
		}

		// 收集住户信息
		System.out.println("请输入宠物信息后进行订房:");

		System.out.print("请输入宠物的名称: ");
		String petName = scanner.next();

		System.out.print("请输入宠物的年龄: ");
		int petAge = scanner.nextInt();

		System.out.print("请输入宠物的类型(1-鸟, 2-狗, 3-猫): ");
		int petType;
		Pet pet;
		outer: while (true) {
			petType = scanner.nextInt();
			switch (petType) {
			case 1: {
				pet = new Bird(petName, petAge);
				break outer;
			}
			case 2: {
				pet = new Dog(petName, petAge);
				break outer;
			}
			case 3: {
				pet = new Cat(petName, petAge);
				break outer;
			}
			default: {
				System.out.print("输入的宠物类型有错误, 请重新输入: ");
			}
			}
		}

		// 办理入住
		idleRoom.checkIn(pet);
		System.out.printf("办理入住成功，房号[%s]\n", idleRoom.getRoomNo());
	}

	/**
	 * 退房
	 */
	public void checkOut() {
		Room occupyRoom;
		System.out.print("请输入需要退房的房号: ");
		while (true) {
			String roomNo = scanner.next();
			if (!roomMap.containsKey(roomNo)) { // map工具查找空房
				System.out.print("房间号输入错误，请重新输入: ");
				continue;
			}
			Room room = roomMap.get(roomNo);
			if (room.isIdle()) {
				System.out.print("当前房间空闲，不需要退房，请重新输入(0-继续, 其他数字-退出): ");
				int ind = scanner.nextInt();
				if (ind == 0) {
					System.out.print("请输入需要退房的房号: ");
					continue;
				}
				return;
			}
			occupyRoom = room;
			break;
		}

		occupyRoom.checkOut();
		System.out.println(occupyRoom.getRoomNo() + "退房成功!" );

	}

	/**
	 * 喂食
	 * 
	 */

	public void eat() {

		Room targetRoom;
        System.out.print("请输入需要喂食的房号: ");
        while (true) {
            String roomNo = scanner.next();
            if (!roomMap.containsKey(roomNo)) {
                System.out.print("房间号输入错误，请重新输入: ");
                continue;
            }
            Room room = roomMap.get(roomNo);
            if (room.isIdle()) {
                System.out.print("当前房间没有宠物，请重新输入(0-重输房号, 其他数字-返回酒店服务前台): ");
                int ind = scanner.nextInt();
                if (ind == 0) {
                    System.out.print("请输入需要喂食的房号: ");
                    continue;
                }
                return;
            }
            targetRoom = room;
            break;
        }

        targetRoom.getPet().eat();
        System.out.println("喂食成功!");
    }

}
//		int i;
//		String s;
//		// room NO
//		System.out.println("请输入需要服务的房间号: ");
//		System.out.println("请服务内容: 1.喂鸟  2.喂猫  3.喂狗  0.退出");//根据房间号喂食
//		System.out.println("---------------------------------------------------------");
//
//		Pet pet;
//		Scanner scanner = new Scanner(System.in);
//		loop: while (true) {
//			System.out.println("选项：(提示:选项0可以回到前台)");
//			i = scanner.nextInt();
//			switch (i) {
//
//			case 0:
//				System.out.println("\t确定要退出喂食吗(y/n)");
//				s = scanner.next();
//				if (s.equalsIgnoreCase("y")) {
//					System.out.println("\t退出喂食");
//
//					break loop;
//				} else {
//					break;
//				}
//
//			case 1: // Bird 从房间拿pet 
//				Pet bird = new Bird(); // 如何实现调用以及分歧
//				bird.eat();
//				break;
//
//			case 2: // Cat
//				Pet cat = new Cat();
//				cat.eat();
//				break;
//
//			case 3:// Dog
//				Pet dog = new Dog();
//				dog.eat();
//				break;
//
//			default:
//				System.out.println("\t请输入其他正确选项");
//				break;
//