package co.jp.part2;

import java.util.Arrays;
import java.util.Scanner;

public class Presentation {

	public static void main(String[] args) {

		System.out.println("welcome to PetHotel");
		System.out.println("��ѡ������Ҫ�ķ������ࣺ");
		System.out.println("1. ��ѯ�շ�");
		System.out.println("2. ��ס");
		System.out.println("3. �˷�");
		System.out.println("4. ιʳ");
		System.out.println("5. ԤԼ");
		System.out.println("6. �˳�");

		String name = "";
		int age = 0;
		String type = "";
		Pet[] room = new Pet[10];

		Scanner sc1 = new Scanner(System.in);

		for (;;) {
			String input = sc1.nextLine();

			if ("6".equals(input)) {
				System.out.println("��ӭʹ�ã��´��ټ�");
				break;
			}

			if ("1".equals(input)) {
				System.out.println("�շ���ʾ���£�");
				for (int i = 0; i < room.length; i++) {
					if (room[i] == null) {
						System.out.println("room" + i + ":" + room[i]);
					}
				}
			}

			if ("2".equals(input)) {
				System.out.println("����ѡ����ס");
				System.out.println("�����������ס��Ϣ");

				for (;;) {
					System.out.println("���������������");
					String input1 = sc1.nextLine();
					name = input1;

					
					System.out.println("������������䣺");
					String input2 = sc1.nextLine();
					Integer a = Integer.valueOf(input2);
					age = a;

					System.out.println("������������ࣺ");
					System.out.println("a.è  b.��  c.��");
					System.out.println("�������Ʒ��Ϊè��������a");
					String type_input = sc1.nextLine();
					type = type_input;

					if ("a".equals(type_input)) {
						Cat cat = new Cat();
						cat.name = name;
						cat.age = age;
						for (int i = 0; i < room.length; i++) {
							if (room[i] == null) {
								room[i] = cat;
								System.out.println("������ס�ɹ�");
								System.out.println("�����Ϊ:" + i);
								break;
							}
						}
						break;
					}

					if ("b".equals(type_input)) {
						Dog dog = new Dog();
						dog.name = name;
						dog.age = age;
						for (int i = 0; i < room.length; i++) {
							if (room[i] == null) {
								room[i] = dog;
								System.out.println("������ס�ɹ�");
								System.out.println("�����Ϊ:" + i);
								break;
							}
						}
						break;
					}

					if ("c".equals(type_input)) {
						Bird bird = new Bird();
						bird.name = name;
						bird.age = age;
						for (int i = 0; i < room.length; i++) {
							if (room[i] == null) {
								room[i] = bird;
								System.out.println("������ס�ɹ�");
								System.out.println("�����Ϊ:" + i);
								break;
							}
						}
					}
					break;
				}
			}

			if ("3".equals(input)) {
				System.out.println("��ѡ���˷���");
				System.out.println("��ѡ�񷿼�ţ�");
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
				if (num < 9) {
					if (room[num] == null) {
						System.out.println("����Ϊ�շ�������Ҫ�˷�");
					} else {
						room[num] = null;
						System.out.println("��ϲ���˷��ɹ�����ӭ�´�����");
					}
				} else {
					System.out.println("������ķ�����������������룡");
				}
				
			}
			
			if ("4".equals(input)) {
				System.out.println("����ѡ��ιʳ");
				System.out.println("��ѡ�񷿼�");
				int eatnum = sc1.nextInt();
				if (eatnum < 9) {
					room[eatnum].eat();
					System.out.println(room[eatnum]+"ιʳ�ɹ�");
				} else {
					System.out.println("���뷿�䲻��ȷ������������");
				}
				
			}
			
			if ("5".equals(input)) {
				System.out.println("����ѡ��ԤԼ");
				System.out.println("���������������");
						String bookname = sc1.nextLine();
						Pet guest = new Pet();
						guest.name = bookname;
				System.out.println("��ѡ����ҪԤԼ�ķ��䣺");
				int num = sc1.nextInt();
				if (num < 9) {
					if (room[num] == null) {
						
						room[num] = guest;
						System.out.println("����ԤԼ�ɹ�");
						System.out.println("�����Ϊ��"+num);
					} 
					else {
						System.out.println("���뷿�䲻��ȷ������������");
					}
				}
			}

		}
	}
}
