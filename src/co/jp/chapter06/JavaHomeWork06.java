package co.jp.chapter06;

public class JavaHomeWork06 {

// 	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
  //Q1
  //修飾子：public,static
  //返却型：void
  //関数名：main
  //引数の型：String[]　　　　　引数の名称：args
		
  //Q2
//	public static int max2(int[] datas) {
//		int max2 = datas[0];
//		for  (int i=1; i < datas.length; i++) {
//			if (max2 < datas[i]) {
//				max2 = datas[i];
//			}
//		}
//		return max2;
//	}
 
//	public static int min2(int[] datas) {
//		int min2 = datas[0];
//		for  (int i=1; i < datas.length; i++) {
//			if (min2 > datas[i]) {
//				min2 = datas[i];
//			}
//		}
//		return min2;
//	}

//	public static int sum2(int[] datas) {
//		int sum2 = 0;
//		for (int i=0; i < datas.length; i++) {
//			sum2 += datas[i];
//		}
//		return sum2;
//	}
//		public static void main(String[] args) {
//			int[] array2 = new int[]{1,2,3};
//			int max2 = max2(array2);
//			int min2 = min2(array2);
//			int sum2 = sum2(array2);
//			System.out.println("配列の最大値は："+max2);
//			System.out.println("配列の最小値は："+ min2);
//			System.out.println("配列の和は："+sum2);
			
 //Q3
//			public class Kicker {
//				 private static void sayHello(String y) {
//				 y = "Hello world";
//				 }
//				 public static void main(String args[]) {
//				 String x = null;
//				 sayHello(x);

//				 System.out.println(x);

    //実施結果は「null」です。
				 
//Q4
//				     public class Kicker {
//					 private static void fillArray(String[] array) {
//					 array[0] = "value2";
//					 }
//					 public static void main(String[] args) {
//					 String[] array = new String[]{"value1"};
//					 fillArray(array);
//					 System.out.println(array[0]);
    //実施結果は「value2」です。
	
//Q5
//	     public class Kicker {
//		 private static void fillArray(String[] array) {
//		 array = new String[]{"1", "2"};
//		 }
//		 public static void main(String args[]) {
//		 String[] array = null;
//		 fillArray(array);
//		 System.out.println(array == null);
//		 } }
	//　実施結果は「true」です。
	
//Q6-0
//	     public static void printArray(Object[] objs) {
//		 if(objs == null) {
//		 System.out.println("null");
//		 return;
//		 }
//		 String prefix = "";
//		 StringBuilder sb = new StringBuilder();
//		 sb.append("[");
//		 for(Object obj : objs) {
//		 sb.append(prefix);
//		 sb.append(String.valueOf(obj));
//		 prefix = ", ";
//		 }
//		 sb.append("]");
//		 System.out.println(sb.toString()); }
	     
//	     public static void main(String[] args) {
//		 String[] array6_0 = new String[] {null};  
//	     printArray(array6_0);
//			}
	  
//Q6-1
//	public static int[] mergeArray(int[] left, int[] right) {
//		int[] mergeArray = new int[left.length + right.length];
//		for (int i = 0; i < left.length; i++ ) {
//			mergeArray[i] = left[i];
//		}
//		for (int j = 0; j < right.length; j++) {
//			mergeArray[left.length + j] = right[j];
//		}
//		return mergeArray;
//	}
		 
//	public static void main(String[] args) {
//		int[] l_array6_1 = new int[] {1, 2, 3, 4};  
//		int[] r_array6_1 = new int[] {5, 6, 7, 8};
//		int[] result6_1 = mergeArray(l_array6_1, r_array6_1);
//		for (int i = 0; i < result6_1.length; i++) {
//			System.out.println(result6_1[i]);
//		}
//	}

	
//Q6-2
//	private static int[] subArray(int[] array,int startIndex,int length) {
//	int[] sub = new int[length];
//	for(int i=startIndex;i<startIndex+length;i++) {
//		sub[i-startIndex]=array[i];
//	}
//	return sub;
//}
//    public static void main(String[] args) {
//	int[] array = new int[] {1, 2, 3, 4};
//	var a =subArray(array,1,2);
//	printArray(a);
//    }

	
//Q7
	public static char[] trim(char[] input, int startIndex, int length) {
		char[] trimArray = new char[length];
		for (int i = 0; i < length; i++ ) {
			trimArray[i] = input[startIndex + i];
		}
		return trimArray;
	}

	public static void main(String[] args) {
		char[] input7 = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '};
		int start7 = 1;
		int length7 = input7.length - 2;
		char[] output7 = trim(input7, start7, length7);
		System.out.println(output7);
	}
	
//Q8
	public static int[] bubbleSort(int[] input) {
		for (int i = 0; i < input.length; i++) {
			for(int j = i+1; j < input.length; j++ ) {
				if(input[i] > input[j]){
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		return input;
	}

	public static void main8(String[] args) {
		int[] array8 = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		int[] result8 = bubbleSort(array8);
		for (int i = 0; i < result8.length; i++) {
			System.out.println(result8[i]);
		}
	}

//Q9
//	printArray(bubbleSort(megerArray(new int[]{7,4,3,2},new int[]{1,8,5,9,6})));
	

}
	
	
	
	
	
	
	

		

