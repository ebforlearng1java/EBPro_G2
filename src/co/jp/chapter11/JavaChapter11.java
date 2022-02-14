package co.jp.chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaChapter11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//
		//		// 配列
		//		String[] array = new String[2];
		//
		//		array[0] = "abcd";
		//		array[1] = "efg";
		//
		//		System.out.println("Array index 0 :" + array[0]);
		//
		//		//		System.out.println("Array:" + Arrays.toString(array));
		//
		//		//
		//		Object[] objArray = new Object[100];
		//
		//		// List
		//		List<String> list = new ArrayList<String>();
		//
		//		list.add("abcd");
		//		list.add("efg");
		//
		//		System.out.println("List index 0 :" + list.get(0));
		//
		//
		//		list[0];
		//
		//		//		System.out.println("List:" + list);
		//
		//		//		list.add
		//
		//		// Map

		String[] array = new String[100];
		String str1 = "abcec";
		str1 = "1231231231231";
		//		array = null;
		for (int i = 0; i < array.length; i++) {
			array[i] = String.valueOf(i);
		}

		System.out.println(array.length);
		System.out.println(str1.length());

		//		System.out.println(Arrays.toString(array));

		array[99] = null;

		for (String str : array) {
			if (str != null) {
				System.out.print(str);
				if (Integer.valueOf(str) != 0 && Integer.valueOf(str) % 10 == 0) {
					System.out.println();
				}
			} else {
				System.out.println("null");
			}
			System.out.print(",");

		}

		List<String> list = new ArrayList<>();
		System.out.println(list.size());
		// list.size()

		for (int i = 0; i < 100; i++) {
			list.add(String.valueOf(1));
		}
		System.out.println("list:" + list);

		Set<String> set = new HashSet<>();
		for (int i = 0; i < 100; i++) {
			set.add(String.valueOf(1));
		}
		System.out.println("set:" + set);

		// list = null;
		if (list != null) {
			for (String str : list) {
				if (str != null) {
					System.out.print(str);
				} else {
					System.out.println("null");
				}
				System.out.print(",");
				if (Integer.valueOf(str) != 0 && Integer.valueOf(str) % 10 == 0) {
					System.out.println();
				}
			}
		}

		System.out.println("-------------------------------------------------------");

		Collections.sort(list, (t1, t2) -> {
			return t2.compareTo(t1);
		});

		// list.size();
		// リストの長さを取得したときに、何のメソッドを使用する
		// リストをループ使用する前に、どうやって判断する

		// list = null;
		System.out.println("befor remove " + list.size() + " ------- index 55:" + list.get(55));
		System.out.println("55が含まれるかどうか contains" + list.contains("55"));
		System.out.println("55が含まれるかどうか indexof" + list.indexOf("55"));
		if (list != null) {

			list.remove(55);
			System.out.println("after remove" + list.size() + " ------- index 55:" + list.get(55));
			System.out.println("55が含まれるかどうか contains" + list.contains("55"));
			System.out.println("55が含まれるかどうか indexof" + list.indexOf("55"));
			for (int i = 0; i < list.size(); i++) {
				String str = list.get(i);
				if (str != null) {
					System.out.print(str);
				} else {
					System.out.println("null");
				}
				System.out.print(",");
				if (Integer.valueOf(str) != 0 && Integer.valueOf(str) % 10 == 0) {
					System.out.println();
				}
			}
		}

		String input = "exit login  exit";

		if (input.indexOf("exit") != -1) {
			System.out.println(" 您已退出！");
		}

		// Map

		Map<String, String> map = new HashMap<>();

		map.put("key", "value");
		map.put("1", "abc");
		map.put("2", "abc");
		map.put("111", "xyz");


		map.put("111", "asdasdasdasdasdsdassdsd");
		//		map.put(9,999999999);
		//		map.put(1,100);
		//		map.put(2,200);
		//		map.put(11111,0);

		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("key=" + entry.getKey() + "; value=" + entry.getValue());
		}

		System.out.println(map.get("123123123123123123123213"));

		System.out.println(map);

	}

}
