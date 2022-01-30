package co.jp.chapter06;

import co.jp.chapter01.Math;

public class JavaHomeWork06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してくださ い。
//		
//		 public static void main(String[] args);
//		回答；修饰子：public反却型：void関数名；main 引数:可变长引数 型为int or 配列
		質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼 び出してください
		public static int max(int[] input) {
//			 int MAX=0;
//			 for(int i=0;i<input.length;i++) {
//				 if(MAX < input[i]) {
//					 MAX = input[i]
//			 }
//		 }
//			 return MAX
//			 
//			 
//		 }
//		 public static int min(int[] input) {
//			 int MIN=0;
//			 for(int i=0;i<input.length;i++) {
//				 if(MIN > input[i]) {
//					 MIN = input[i]
//			 }
//		}
//			 return MAX
//		 }
//		 public static int avg(int[] input) {
//			 int =AVG;
//			 int =sum;
//			 for(int i=0;i<input.length;i++) {
//				 sum=sum + input[i]
//			 }
//		}
//		 AVG = sum/input.length;
//			 return AVG;
//		 }
//			public static void main(String[] args) {
//			
//			int [] a = new int[] {4,2,4,2,4,3,212,2,4};
//			
////			
//	         int ma= Math.max(a);//通过类名调用、
//	         int min = Math.min(a);
//	         int avg = Math.avg(a);。
//			}
//		
//		質問３．以下メソッドの実施結果を教えてください。 
//		public class Kicker {
//			 private static void sayHello(String y) {
//			 y = "Hello world";
//			 }
//			 public static void main(String args[]) {
//			 String x = null;
//			 sayHello(x);
//		
//			 System.out.println(x);
//		回答；null
//			質問４︓以下メソッドの実施結果を教えてください。 
			
//			public class Kicker {
//			 private static void fillArray(String[] array) {
//			 array[0] = "value2";
//			 }
//			 public static void main(String args[]) {
//			 String[] array = new String[]{"value1"};
//			 fillArray(array);
//			 System.out.println(array[0]);
//             回答:value2
//			質問５︓以下メソッドの実施結果を教えてください。
//			
//			
//			public class Kicker {
//			 private static void fillArray(String[] array) {
//			 array = new String[]{"1", "2"};
//			 }
//			 public static void main(String args[]) {
//			 String[] array = null;
//			 fillArray(array);
//			 System.out.println(array == null);
//			 
//			 回答:ture
//			質問６-１︓以下静的なメソッドを定義してください
//			1. メソッド名: megerArray
//			2. 引数１︓intの配列 left
//			3. 引数２︓intの配列 right 
//			4. 戻り値︓intの配列
//			5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。

			//	
//				 回答:public static int []megerArray(int[]left,int[]right) {
//				     int [] meger = new int[left.length+right.length];
//				     for(int i= 0;i<left.length;i++) {
//				    	 meger[i] = left[i];
//				    	 
//				    	 
//				     }
//				     for(int j =0;j<right.length;j++) {
//				    	 meger[j+left.length] = right[j];
//				    	 
//				     }
//				     return meger;
//				}

