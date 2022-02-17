package co.jp.chapter11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaChapter11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Object[] objArray = new Object[10]; //开始就定义了长度,之后不能改变
		
		//list
		List<String> list = new ArrayList<String>(); //尖括号内指定类型
		list.add("a"); //可以直接添加消除数据，长度可扩展
		list.get(0); //获取列表对应下表的数据
		
		System.out.println(list);
		
		List<String> list2 = new ArrayList<String>();
		//循环放值的时候没有length的方法
		for(int i = 0; i < 100; i++) { //数组array.length这相当于一个变量。 字符str.length()方法。 列表list.size()
			list.add(String.valueOf(i));
		}
		
		if(list != null) { //循环前对list进行判断，
			for(String str:list2) { //在循环内用不到i时可以这么写直接遍历
				System.out.println(str);
				System.out.println(",");
				if(Integer.valueOf(str) != 0 && Integer.valueOf(str) % 10 == 0) {
					System.out.println();
				}
			}
		}
		
		
		//map
		Map <String,String> map = new HashMap<>();
		map.put("key", "value");
		System.out.println(map.get("key"));
		System.out.println(map);
	}

}
