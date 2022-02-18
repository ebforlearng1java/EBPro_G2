package co.jp.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaChapter11 {

	public static void main(String[] args) {

//		//配列 把类型给指定上
//		//和List的区别：加元素的话，要先改配列长度，但list不用，直接加就行
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
//		//List ①长度可扩张 ②
//		List list = new ArrayList(); //未指定类型
//		
//		List<String> list = new ArrayList<String>(); // 得这么写 左边interface，右边副接口
//													 // List是接口，不能实现类，要用它下边儿那个ArrayList
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
//		// list.size() //list的长度用size不用length
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
//		// 如果想取得list的长度，需要使用什么各样的method
//		// list在使用之前，要怎么判断
//
////		list = null; // 是个类都有可能是null
//		
//		Collections.sort(list, (t1,t2) ->{
//			return t2.compareTo(t1);
//		});
//
//		System.out.println("before remove" + list.size() + "--------- index 55:" + list.get(55));
//		System.out.println("有55吗 contains" + list.contains(55));
//		System.out.println("有55吗 indexOf" + list.indexOf(55));
//		
//		if (list != null) { // 当用到list.size的时候，一定要先手判断一下list是不是null
//			
//			list.remove(55);
//			System.out.println("after remove" + list.size()+"--------- index 55:" + list.get(55));
//			System.out.println("有55吗 contains" + list.contains(55));
//			System.out.println("有55吗 indexOf" + list.indexOf(55));
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
//		if(input.indexOf("exit")!= -1) {		//如果有exit，无论有几个，返回exit第一个出现的index的地方
//			System.out.println("您已退出");
//		}
//		
		
		//Map     不管怎么放，map有自己的顺序，map没有index，表象化成了key。 map是用key（任意字符，）取value，存的是键值对儿
		Map<String, String> map = new HashMap<>();
		
		System.out.println(map);
		
		map.put("key", "value");
		map.put("1", "abc");
		map.put("2", "efg");
		map.put("3", "xyz");
		
		System.out.println(map);
		
		
		

	}

}
