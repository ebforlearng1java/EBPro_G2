package co.jp.chapter05;
public class JavaHomeWork06 {


//			質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してください。
//			public static void main(String[] args);
//         回答:
//  		修飾⼦：	public static
//			返却型：	void  ( 返却値なし)
//			関数名：	main
//			引数:   string , args
//
//


//			質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。
//          回答:
// 			public static void main(String[] args) {
//		 		int[] array = new int[] {1,2,3,4,5};
//		 		int max = max(array);
//		 		int min = min(array);
//		 		int sum = sum(array);
//
//		 		System.out.println("max is" + max);
//		 		System.out.println("min is" + min);
//		 		System.out.println("sum is" + sum);
//	 }
//
//
//	 		public static int max(int[] datas) {
//		 		int max = datas[0];
//		 		for(int i=0; i< datas.length; i++) {
//			 		if(max < i) {
//				 	max = datas[i];
//			 }
//		 }
//				return max;
//	 }
//
//	 		public static int min(int[] datas) {
//		 		int min = datas[0];
//		 		for(int i=0; i< datas.length; i++) {
//			 		if(min > i) {
//				 	min = datas[i];
//			 }
//		 }
//				return min;
//	 }
//
//	 		public static int sum(int[] datas) {
//		 		int sum = 0;
//		 		for(int k=0; i< datas.length; i++) {
//			 		sum += datas[i];
//			 }
//		 		return sum;
//	 }
//

//質問３．以下メソッドの実施結果を教えてください。
/*		public class Kicker {
			private static void sayHello(String y) {
			y = "Hello world";
		}
		public static void main(String args[]) {
			String x = null;
			sayHello(x);

			System.out.println(x);
	 }
 }
*/
//質問3回答: null。

//質問4 回答:	value2


//質問5 回答:true
//質問6-0回答:
//public static void printArray(Object[] objs) {
//    if(objs == null) {
//        System.out.println("null");
//        return;
//    }
//    String prefix = "";
//    StringBuilder sb = new StringBuilder();
//    sb.append("[");
//    for(Object obj : objs) {
//        sb.append(prefix);
//
//        sb.append(String.valueOf(obj));
//        refix = ", ";
//    }
//    sb.append("]");
//    System.out.println(sb.toString());
//}
//質問6-1回答:
// public static int[] megerArray(int[] left, int[] right) {
//		int[] megerArray = new int[left.length + right.length];
//
//		for(int i=0; i < length; i++) {
//			if(i < left.length) {
//				megerArray[i] = left[i];
//
//			}else {
//				megerArray[i] = right[i-left.length];
//
//			}
//
//		return megerArray;
//		}
//	}




//質問6-2︓回答:
//public static char[] subArray(char[] array, int startIndex, int length) {
//    char[] subArray = new char[length];
//
//
//    for(int i=0; i < length; i++) {
//        subArray[i] = array[startIndex + i];
//
//    }
//    return subArray;
//}

//質問7回答:
// public static char[] trim(char[] array) {
//		int start = 0;
//		for(int i=0; i < array.length; i++) {
//			if(array[i] == ' ') {
//				start ++;
//			}else {
//				break;
//			}
//		}
//
//		int length = input.length - start;
//
//		for(int i=array.length-1; i >= 0; i--) {
//			if(array[i] == ' ') {
//				length --;
//			}else {
//				break;
//			}
//		}
//		return subArray(array, starr, length);
//}



//質問8回答:
//		public static int[] bubbleSort(int[] array) {
//			for (int i = 0; i < array.length; i++) {

//				for(int j = i+1; j < array.length; j++ ) {

//					if(array[i] > array[j]){

//						int temp = array[i];

//						array[i] = array[j];

//						array[j] = temp;
//					}
//				}
//			}
//			return array;
//		}



//質問9:回答：
//		public static int[] megerArray(int[] left, int[] right) {
//			int[] megerArray = new int[left.length + right.length];
//
//			for(int i=0; i < length; i++) {
//				if(i < left.length) {
//				megerArray[i] = left[i];
//			}else {
//				megerArray[i] = right[i-left.length];
//			}
//				return megerArray;
//		}
//	}
//		public static int[] bubbleSort(int[] input) {
//			for (int i = 0; i < input.length; i++) {
//				for(int j = i+1; j < input.length; j++ ) {
//					if(input[i] > input[j]){
//						int temp = input[i];
//						input[i] = input[j];
//						input[j] = temp;
//					}
//				}
//			}
//				return input;
//		}
//
//		public static void main(String[] args) {
//			int[] array1 = new int[] {1, 2, 3, 4};
//			int[] array2 = new int[] {5, 6, 7, 8};
//			int[] result1 = megerArray(array1, arrat2);
//			int[] result2 = bubbleSort(result1);
//				for (int i = 0; i < result.length; i++) {
//					System.out.println(result2[i]);
//		}
//	}
//

}
