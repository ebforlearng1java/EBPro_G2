//質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してくださ
//い。
//public static void main(String[] args)

// 修飾⼦ -> public static
// 返却型 -> void
// 関数名 -> main
// 引数（引数の型・名称） -> string・args

//質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼
//び出してください。

//public static void main(String[] args) {
		
//		int[] array = new int[] {1,2,3,4};
//		int max = max(array);
//		int min = min(array);
	    
		
//		System.out.println(max);
//		System.out.println(min);


//	}
	
	
//public static int max(int[] datas) {
//      int max = datas[0];
		
//		for (int i = 1; i < Array.getLength(datas); i++) {
//			if(datas[i] > max) {
//				max = datas[i];
//			}
//		}
		
//		return max;
		
//	}
	
//public static int min(int[] datas) {
		
//		int min = datas[0];
		
//		for (int i = 1; i < Array.getLength(datas); i++) {
//			if(datas[i] < min) {
//				min = datas[i];
//			}
//		}
		
//		return min;
		
		
//	}


// 質問３．以下メソッドの実施結果を教えてください。
//　実施結果は「null」です。

// 質問４︓以下メソッドの実施結果を教えてください。
//　実施結果は「value2」です。

// 質問５︓以下メソッドの実施結果を教えてください。
//　実施結果は「true」です。


//質問６-０︓配列は直接に印刷できません。下記メソッドを利⽤して、配列をprintしま
//す。以下メソッドを呼び出してください。
//public static void main(String[] args) {
//    Object[] array = new Object[] {1, 3, 5, 7, 100, 0, 1};
//	  printArray(array);


//}
	
	
//public static void printArray(Object [] objs) {
//    if(objs == null) {
//		   System.out.println("null");
//		   return;
//	  }
//	  String prefix = "";
//	  StringBuilder sb = new StringBuilder();
//	  sb.append("[");
//	  for(Object obj : objs) {
//		  sb.append(prefix);
//		  sb.append(String.valueOf(obj));
//		  prefix = ", ";
//	  }
//	  sb.append("]");
//	  System.out.println(sb.toString());		
		
//}

//質問６-１︓以下静的なメソッドを定義してください。

//public static void main(String[] args) {	
//	  int left[] = {1, 2, 3, 4};
//	  int right[]= {5, 6, 7, 8};
//	  int result [];
//	  result = megerArray(left,right);



//    printArray(result);


//}

//public static void printArray(int [] objs) {
//	  if(objs == null) {
//		   System.out.println("null");
//		   return;
//	  }
//	  String prefix = "";
//	  StringBuilder sb = new StringBuilder();
//	  sb.append("[");
//	  for(Object obj : objs) {
//		  sb.append(prefix);
//		  sb.append(String.valueOf(obj));
//		  prefix = ", ";
//	  }
//	  sb.append("]");
//	  System.out.println(sb.toString());		
		
//}

//public static int[] megerArray(int left[], int right[]) {
//	  int merge[] = new int[left.length+right.length];
		
//	  for(int i = 0; i < left.length; i++) {
//		  merge[i] = left[i];
//	  }
		
//	  for(int i = 0; i < right.length; i++) {
//		  merge[i+left.length] = right[i];
//	  }
		
//	  return merge;
		
//}


// 質問６-２︓以下静的なメソッドを定義してください。
//public static void main(String[] args) {	
//	  int left[] = {1, 2, 3, 4};
//	  int start = 1;
//	  int length = 2;
		
//	  int result [];
//	  result = subArrayy(left,start, length);



//	  printArray(result);


//}

//public static void printArray(int [] objs) {
//	  if(objs == null) {
//		   System.out.println("null");
//		   return;
//	  }
//	  String prefix = "";
//	  StringBuilder sb = new StringBuilder();
//	  sb.append("[");
//	  for(Object obj : objs) {
//		  sb.append(prefix);
//		  sb.append(String.valueOf(obj));
//		  prefix = ", ";
//	  }
//	  sb.append("]");
//	  System.out.println(sb.toString());		
		
//}

//private static int[] subArrayy(int[] array, int startIndex, int length) {
		
//    int array1[] = new int[length];
		
//	  for (int i = 0; i < length; i++) {
//		  array1[i] = array[startIndex+i];
			
			
//	  }
		
//	  return array1;
//	}
		

//質問８︓バブルソート⽤メソッドを作成してください。

//public static void main(String[] args) {
//	  Random r = new Random();
//    int[] array = new int[8];
//    for (int i = 0; i < array.length; i++) {
//        array[i] = r.nextInt(30);
//    }

 //   print(array);
 //   bubbleSort(array);
 //   print(array);
 //}

//static void print(int[] array) {
//    for (int i = 0; i < array.length; i++) {
//        if (i != 0) {
//            System.out.print(" ");
//        }
//        System.out.print(array[i]);
//    }
//    System.out.println();
//}

//static void bubbleSort(int[] array) {
	
//    for (int i = 0; i < array.length - 1; i++) {
//        for (int j = array.length - 1; j > i; j--) {
//            if (array[j - 1] > array[j]) {
               
 //               int tmp = array[j - 1];
 //               array[j - 1] = array[j];
 //               array[j] = tmp;
 //           }
//        }
 //   }
//}


//質問９︓メソッドの呼び出す練習。
//6-1
//public static void main(String[] args) {	
//	  int left[] = {1, 2, 3, 4};
//	  int right[]= {5, 6, 7, 8};
//	  int result [];
//	  result = megerArray(left,right);



//    printArray(result);


//}

//public static void printArray(int [] objs) {
//	  if(objs == null) {
//		   System.out.println("null");
//		   return;
//	  }
//	  String prefix = "";
//	  StringBuilder sb = new StringBuilder();
//	  sb.append("[");
//	  for(Object obj : objs) {
//		  sb.append(prefix);
//		  sb.append(String.valueOf(obj));
//		  prefix = ", ";
//	  }
//	  sb.append("]");
//	  System.out.println(sb.toString());		
		
//}

//public static int[] megerArray(int left[], int right[]) {
//	  int merge[] = new int[left.length+right.length];
		
//	  for(int i = 0; i < left.length; i++) {
//		  merge[i] = left[i];
//	  }
		
//	  for(int i = 0; i < right.length; i++) {
//		  merge[i+left.length] = right[i];
//	  }
		
//	  return merge;
		
//}

//8
//public static void main(String[] args) {
//	  Random r = new Random();
//    int[] array = new int[8];
//    for (int i = 0; i < array.length; i++) {
//        array[i] = r.nextInt(30);
//    }

 //   print(array);
 //   bubbleSort(array);
 //   print(array);
 //}

//static void print(int[] array) {
//    for (int i = 0; i < array.length; i++) {
//        if (i != 0) {
//            System.out.print(" ");
//        }
//        System.out.print(array[i]);
//    }
//    System.out.println();
//}

//static void bubbleSort(int[] array) {
	
//    for (int i = 0; i < array.length - 1; i++) {
//        for (int j = array.length - 1; j > i; j--) {
//            if (array[j - 1] > array[j]) {
               
 //               int tmp = array[j - 1];
 //               array[j - 1] = array[j];
 //               array[j] = tmp;
 //           }
//        }
 //   }
//}




