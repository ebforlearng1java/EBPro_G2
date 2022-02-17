package co.jp.chapter11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JavaChapter11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	//配列
//    String[] array = new String[2];
    //
    
//    array[0]="abcd";
 //   array[1]="efg";
//    System.out.println("Array index 0 :"+array[0]);
//   System.out.println("Arrays:"+Arrays.toString(array));
    
//    Object[]objArray= new Object[100];
    
    //List（列表）是一类接口 生成不了实体类 所以等号右边要用ArrayList实现
//    List<String>list= new ArrayList<String>();
    //List是不定长的，之后长度可扩张
    //尖括号是指定类型
    
//    list.add("abcd");
//    list.add("efg");
    
    
//    list.get(0);
 //   System.out.println("List index 0 :"+list.get(0));
    
    
    //System.out.println("List:"+list);
		
//	String[]array=new String[100];
//	String str1="abcec";
//	for(int i =0;i<array.length;i++);{

//	int i;
//	array[i]=String.valueOf(i);
//	}
//		System.out.println(Arrays.toString(array));
		
//		for (String str:array) {
//			System.out.print(str);
//			System.out.print(",");
//			if (Integer.valueOf(str)!=0 && Integer.valueOf(str)%10==0);{
//				System.out.println();
//			}
//		}
		
//		List<String>list = new ArrayList<>();
//		System.out.println(list.size());
//		for (int i =0; i <100;i++) {
//			 System.out.println("list list list");
	// list.size();
    //リストの長さを取得した時に、何のメソッドを使用する
	//リストをループ使用する前に、どうやって判断する		
	//循环一个list前 加一个
	//		 if	(list !=null){
	//       }
   
    //配列不能remove 长度是固定的；List可以
	//如 list.remove(55);		 
	//55之后的值会往前窜
			 
	//检索
	//两个方法
	//list.contains（“55”） 返回true false
	//list.indexof("55")  如果有，返回indexof55 如果没有，返回indexof-1
	//List里可以有重复的值
		
	Set<String>set = new HashSet<>();
   //Set里的数据是自然序列不可重复
   //Hash即为自然排序
	
	Map<String, String> map = new HashMap<>();
	
	
//	map.put("key", "value");
	//左边是键，右边是值  map存的是键值对
	//输出是自然sort 自然排序  先比第一位 先数字后字母
	//map put的时候是无序的  list add的时候是有序的
	map.put("1", "abc");
	map.put("2", "efg");
	map.put("111", "xyz");
	
//	map.put(9, 99999999);
//	map.put(1, 100);
//	map.put(2, 200);
//	map.put(1111, 0);
//排序只与key有关
	for (Map.Entry<String, String> entry : map.entrySet()) {
		//用到的是Set 所以Map里一个key不可以对应多个值
		 System.out.println("key=" + entry.getKey() + "; value=" + entry.getValue());
		 }
	System.out.println(map.get("1"));
	//这里的1是键，get的是值100
	System.out.println(map);
		}
	

}
