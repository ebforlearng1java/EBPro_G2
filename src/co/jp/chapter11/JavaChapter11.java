package co.jp.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaChapter11 {

	public static void main(String[] args) {

//		//���� �����͸�ָ����
//		//��List�����𣺼�Ԫ�صĻ���Ҫ�ȸ����г��ȣ���list���ã�ֱ�ӼӾ���
//		String[] array = new String[2];
//		
//		array[0] = "abcd";
//		array[1] = "efg";
//		
//		System.out.println("List index 0 :"+array[0]);
//		System.out.println(Arrays.toString(array));
//		
//		Object[] objArray = new Object[100];
//		
//		//List �ٳ��ȿ����� ��
//		List list = new ArrayList(); //δָ������
//		
//		List<String> list = new ArrayList<String>(); // ����ôд ���interface���ұ߸��ӿ�
//													 // List�ǽӿڣ�����ʵ���࣬Ҫ�����±߶��Ǹ�ArrayList
//		//List.add											 
//		list.add("abcd");
//		list.add("efg");
//		
//		System.out.println("List index 0 :"+list.get(0));
//		
//		System.out.println(list);
//		


//		String[] array = new String[100];
//		String str1 = "abcde";
//		for (int i=0; i<array.length; i++) {
//			array[i] = String.valueOf(i);
//		}
//		
//		System.out.println(array.length);
//		System.out.println(str1.length());     
//		
//		System.out.println(Arrays.toString(array));
//		
//		for(String str: array) {
//			System.out.print(str);
//			System.out.print(",");
//			if(Integer.valueOf(str)!=0 && Integer.valueOf(str)%10 == 0) {
//				System.out.println();
//			}
//		}

//		// list
//		List<String> list = new ArrayList<>();
//		System.out.println(list.size());
//
//		// list.size() //list�ĳ�����size����length
////		for (int i = 0; i < 100; i++) {
////			list.add(String.valueOf(i));
////		}
////		System.out.println(list);
////
////		if (list != null) {
////			for (String str : list) {
////				if(str != null) {
////				System.out.println(str);
////				}else {
////					System.out.println("null");
////				}
////				System.out.println(",");
////				if (Integer.valueOf(str) != 0 && Integer.valueOf(str) % 10 == 0) {
////					System.out.println();
////				}
////			}
////		}
//
//		// list.size()
//		// �����ȡ��list�ĳ��ȣ���Ҫʹ��ʲô������method
//		// list��ʹ��֮ǰ��Ҫ��ô�ж�
//
////		list = null; // �Ǹ��඼�п�����null
//		
//		Collections.sort(list, (t1,t2) ->{
//			return t2.compareTo(t1);
//		});
//
//		System.out.println("before remove" + list.size() + "--------- index 55:" + list.get(55));
//		System.out.println("��55�� contains" + list.contains(55));
//		System.out.println("��55�� indexOf" + list.indexOf(55));
//		
//		if (list != null) { // ���õ�list.size��ʱ��һ��Ҫ�����ж�һ��list�ǲ���null
//			
//			list.remove(55);
//			System.out.println("after remove" + list.size()+"--------- index 55:" + list.get(55));
//			System.out.println("��55�� contains" + list.contains(55));
//			System.out.println("��55�� indexOf" + list.indexOf(55));
//			
//			for (int i = 0; i < list.size(); i++) {
//				String str = list.get(i);
//				if(str != null) {
//					System.out.println(str);
//					}else {
//						System.out.println("null");
//					}
//				System.out.println(",");
//				if (Integer.valueOf(str) != 0 && Integer.valueOf(str) % 10 == 0) {
//					System.out.println();
//				}
//			}
//		}
//		
//		
//		
//		String input = "exit login";
//		
//		if(input.indexOf("exit")!= -1) {		//�����exit�������м���������exit��һ�����ֵ�index�ĵط�
//			System.out.println("�����˳�");
//		}
//		
		
		//Map     ������ô�ţ�map���Լ���˳��mapû��index�����󻯳���key�� map����key�������ַ�����ȡvalue������Ǽ�ֵ�Զ�
		Map<String, String> map = new HashMap<>();
		
		System.out.println(map);
		
		map.put("key", "value");
		map.put("1", "abc");
		map.put("2", "efg");
		map.put("3", "xyz");
		
		System.out.println(map);
		
		
		

	}

}
