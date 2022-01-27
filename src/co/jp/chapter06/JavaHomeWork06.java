package co.jp.chapter06;

public class JavaHomeWork06 {

	public static void main(String[] args) {
		//質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してください。
		//public static void main(String[] args);
		System.out.println("修飾子：publicとstatic");
		System.out.println("返却型：void");
		System.out.println("関数名：main");
		System.out.println("引数の型：string[]。引数の名称：args");
		
		
		//質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。
		int[] array2 = {1,4,5,8,7,6,3,9,2};
		System.out.println("max = " + max(array2));
		System.out.println("min = " + min(array2));
		System.out.println("sum = " + sum(array2));
		
		
		//質問３．以下メソッドの実施結果を教えてください。
		String x = null;
		sayHello(x);
		System.out.println(x);
		
		System.out.println("質問３実施結果null");
		
		
		//質問４︓以下メソッドの実施結果を教えてください。
		//String[] array4 = new String[]{"value1"};
		 //fillArray(array4);
		// System.out.println(array4[0]);
		 
		System.out.println("質問４実施結果value2");
		
		
		//質問５︓以下メソッドの実施結果を教えてください。
		String[] array5 = null;
		fillArray(array5);
		System.out.println(array5 == null);
		System.out.println("質問５実施結果true");
		
		
		//質問６-０︓配列は直接に印刷できません。下記メソッドを利⽤して、配列をprintします。以下メソッドを呼び出してください。
		Object[] objs ={1,4,5,8,7,6,3,9,2};
		printArray(objs);
		
		
		/*質問６-１︓以下静的なメソッドを定義してください。
		  	1. メソッド名: megerArray
			2. 引数１︓intの配列 left
			3. 引数２︓intの配列 right
			4. 戻り値︓intの配列
			5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。
		 */
		
		
		
		/*質問６-２︓以下静的なメソッドを定義してください。
		1. メソッド名: subArray
		2. 引数１︓intの配列 array
		3. 引数２︓開始のstartIndex
		4. 引数３︓⻑さlength
		5. 戻り値︓intの配列
		6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
		*/
		
		
		
		/*質問７︓以下静的なメソッドを定義してください。
		1. メソッド名︓trim
		2. 引数１︓charの配列
		3. 戻り値︓charの配列
		4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。
		*/
		
		
		
		/*質問８︓バブルソート⽤メソッドを作成してください。
		1. メソッド名︓bubbleSort
		2. 引数１︓intの配列
		3. 戻り値︓ソート済みの配列
		4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてください。
		*/
		int[] array8 = {1,5,7,9,4,3,8,11,4};
		bubbleSort(array8);
		
		
		/*質問９︓メソッドの呼び出す練習。
		1. 質問６-１を⽤い、２つ配列をマージします。
		2. 質問８を⽤い、ステップ１のマージした配列をソートする。
		3. 注意︓コードを１⾏にしてください。
		*/
		int[] left = new int[] {1, 2, 3, 4};
		int[] right = new int[] {5, 9, 7, 8};
		
		bubbleSort(megerArray(left,right));

	}
	//方法&函数	
	
	//質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。
	public static int max(int[] datas) {
		int max = datas[0];
		for(int i = 0; i < datas.length; i++) {
			if(max < datas[i]) {
				max = datas[i];
			}
		}
		return max;
	}
	
	public static int min(int[] datas) {
		int min = datas[0];
		for(int i = 0; i < datas.length; i++) {
			
			if(min > datas[i]) {
				min = datas[i];
			}
		}
		return min;
	}
	
	public static int sum(int[] datas) {
		int sum = 0;
		for(int i = 0; i < datas.length; i++) {
			sum = sum + datas[i];
		}
		return sum;
	}
	
	
	//質問３．以下メソッドの実施結果を教えてください。
		private static void sayHello(String y) {
			 y = "Hello world";
		}
		
		
	//質問４︓以下メソッドの実施結果を教えてください。
		//private static void fillArray(String[] array) {
		//	array[0] = "value2";
		//}
		
		

	//質問５︓以下メソッドの実施結果を教えてください。
		private static void fillArray(String[] array) {
			array = new String[] {"1","2"};
		}
	
		
	//質問６-０︓配列は直接に印刷できません。下記メソッドを利⽤して、配列をprintします。以下メソッドを呼び出してください。
	public static void printArray(Object[] objs) {
		 if(objs == null) {
			 System.out.println("null");
			 return;
		 }
		 
		 String prefix = "";
		 StringBuilder sb = new StringBuilder();
		 sb.append("[");
		 
		 for(Object obj : objs) {
			 sb.append(prefix);
			 sb.append(String.valueOf(obj));
			 prefix = ", ";
		 }
		 
		 sb.append("]");
		 System.out.println(sb.toString());
	}
	
	/*質問６-１︓以下静的なメソッドを定義してください。
  	1. メソッド名: megerArray
	2. 引数１︓intの配列 left
	3. 引数２︓intの配列 right
	4. 戻り値︓intの配列
	5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。
	*/
	public static int[] megerArray(int[] left, int[] right) {
		int length = left.length + right.length;
		int[] result = new int[length];
		
		for(int i=0; i < length; i++) {
			if(i < left.length) {
				result[i] = left[i];
				
			}else {
				result[i] = right[i-left.length];
				
			}
		}
		return result;
		
	}
	
		
	
	/*質問６-２︓以下静的なメソッドを定義してください。
	1. メソッド名: subArray
	2. 引数１︓intの配列 array
	3. 引数２︓開始のstartIndex
	4. 引数３︓⻑さlength
	5. 戻り値︓intの配列
	6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
	*/
	public static int[] subArray(int[] array, int startIndex, int length) {
		int[] subArray = new int[length];
		
		
		for(int i=0; i < length; i++) {
			subArray[i] = array[startIndex + i];
			
		}
		return subArray;
	}
	
	
	/*質問７︓以下静的なメソッドを定義してください。
	1. メソッド名︓trim
	2. 引数１︓charの配列
	3. 戻り値︓charの配列
	4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。
	*/
	
	public static char[] trim(char[] input) {
		
		int star = 0;
		
		for(int i=0; i < input.length; i++) {
			if(input[i] == ' ') {
				star ++;
			}else {
				break;
			}
		}
		
		int length = input.length - star;
		
		for(int i=input.length-1; i >= 0; i--) {
			if(input[i] == ' ') {
				length --;
			}else {
				break;
			}
		}
		return subArray(input, star, length);
	}
	//6-2方法参数char类型的版本
		public static char[] subArray(char[] array, int startIndex, int length) {
			char[] subArray = new char[length];
			
			
			for(int i=0; i < length; i++) {
				subArray[i] = array[startIndex + i];
				
			}
			return subArray;
		}
			
			
	
	/*質問８︓バブルソート⽤メソッドを作成してください。
	1. メソッド名︓bubbleSort
	2. 引数１︓intの配列
	3. 戻り値︓ソート済みの配列
	4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてください。
	*/
	public static void bubbleSort(int[] array) {
		int change;
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length -1 - i; j++) {
				if(array[j] > array[j + 1]) {
					change = array[j];
					array[j] = array[j+1];
					array[j+1] = change;
				}
			}
		}
		printArray(array);
	}
	//参数为整数型数组的printArray方法
			public static void printArray(int[] objs) {
				 if(objs == null) {
					 System.out.println("null");
					 return;
				 }
				 
				 String prefix = "";
				 StringBuilder sb = new StringBuilder();
				 sb.append("[");
				 
				 for(Object obj : objs) {
					 sb.append(prefix);
					 sb.append(String.valueOf(obj));
					 prefix = ", ";
				 }
				 
				 sb.append("]");
				 System.out.println(sb.toString());
			}
			
}
