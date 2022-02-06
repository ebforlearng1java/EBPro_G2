package co.jp.chapter06;

public class JavaChapter06 {
	
//	public static int max2(int[] datas) {
//		int max2 = datas[0];
//		for  (int i=1; i < datas.length; i++) {
//			if (max2 < datas[i]) {
//				max2 = datas[i];
//			}
//		}
//		return max2;
//	}
//	
//	public static int min2(int[] datas) {
//		int min2 = datas[0];
//		for  (int i=1; i < datas.length; i++) {
//			if (min2 > datas[i]) {
//				min2 = datas[i];
//			}
//		}
//		return min2;
//	}
//	
//	public static int sum2(int[] datas) {
//		int sum2 = 0;
//		for (int i=0; i < datas.length; i++) {
//			sum2 += datas[i];
//		}
//		return sum2;
//	}
//	
//	public static void main(String[] args) {
//		int[] array2 = new int[]{7, 6, 2, 6, 7, 9, 6, 2, 1};
//		int max2 = max2(array2);
//		int min2 = min2(array2);
//		int sum2 = sum2(array2);
//		System.out.printf("配列の最大値は：%d\n", max2);
//		System.out.printf("配列の最小値は：%d\n", min2);
//		System.out.printf("配列の和は：%d\n", sum2);
//	}
//	 private static void sayHello(String y) {
//		 y = "Hello world";
//	 }
//	 public static void main(String args[]) {
//		 String x = null;
//		 sayHello(x);
//		 System.out.println(x);
//	 }
//	
//		 private static void fillArray(String[] array) {
//		 array[0] = "value2";
//	}
//	public static void main(String args[]) {
//		 String[] array = new String[]{"value1"};
//		 fillArray(array);
//		 System.out.println(array[0]);
//	}
	
//	 private static void fillArray(String[] array) {
//	 array = new String[]{"1", "2"};
//	 }
//	 public static void main(String args[]) {
//		 String[] array = null;
//		 fillArray(array);
//		 System.out.println(array == null);
//	 }
	
//	public static void printArray(Object[] objs) {
//		 if(objs == null) {
//			 System.out.println("null");
//			 return;
//		 }
//		 String prefix = "";
//		 StringBuilder sb = new StringBuilder();
//		 sb.append("[");
//		 for(Object obj : objs) {
//			 sb.append(prefix);
//			 sb.append(String.valueOf(obj));
//			 prefix = ", ";
//		 }
//		 sb.append("]");
//		 System.out.println(sb.toString()); 
//	 }
//	public static void main(String[] args) {
//		String[] array6 = new String[] {null};  
//		printArray(array6);
//	}
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
//		 
//	public static void main(String[] args) {
//		int[] l_array6_1 = new int[] {1, 2, 3, 4};  
//		int[] r_array6_1 = new int[] {5, 6, 7, 8};
//		int[] m_array6_1 = mergeArray(l_array6_1, r_array6_1);
//		for (int i = 0; i < m_array6_1.length; i++) {
//			System.out.println(m_array6_1[i]);
//		}
//	}
	
//	public static int[] subArray (int[] array, int startIndex, int length) {
//		int[] subArray = new int[length];
//		for (int i = 0; i < length; i++ ) {
//			subArray[i] = array[startIndex + i];
//		}
//		return subArray;
//	}
//		 
//	public static void main(String[] args) {
//		int[] array6_2 = new int[] {1, 2, 3, 4};
//		int start6_2 = 1;
//		int length6_2 = 2;
//		int[] sub_array6_2 = subArray(array6_2, start6_2, length6_2);
//		for (int i = 0; i < sub_array6_2.length; i++) {
//			System.out.println(sub_array6_2[i]);
//		}
//	}
	

//	public static char[] trim(char[] input, int startIndex, int length) {
//		char[] trimArray = new char[length];
//		for (int i = 0; i < length; i++ ) {
//			trimArray[i] = input[startIndex + i];
//		}
//		return trimArray;
//	}
//
//	public static void main(String[] args) {
//		char[] input7 = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '};
//		int start7 = 1;
//		int length7 = input7.length - 2;
//		char[] trimArray7 = trim(input7, start7, length7);
//		System.out.println(trimArray7);
//	}
//	
	public static int[] mergeArray(int[] left, int[] right) {
		int[] mergeArray = new int[left.length + right.length];
		for (int i = 0; i < left.length; i++ ) {
			mergeArray[i] = left[i];
		}
		for (int j = 0; j < right.length; j++) {
			mergeArray[left.length + j] = right[j];
		}
		return mergeArray;
	}
	
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
		 
	public static void main(String[] args) {
		int[] l_array9 = new int[] {1, 2, 6, 7};  
		int[] r_array9 = new int[] {9, 6, 2, 1};
		int[] m_result9 = mergeArray(l_array9, r_array9);
		int[] result9 = bubbleSort(m_result9);			
		for (int i = 0; i < result9.length; i++) {
			System.out.println(result9[i]);
		}
	}
}
