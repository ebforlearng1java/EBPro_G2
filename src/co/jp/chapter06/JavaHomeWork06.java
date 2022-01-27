package co.jp.chapter06;

public class JavaHomeWork06 {
	
	
//			質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してください。
//			public static void main(String[] args);	
/*回答:
  			修飾⼦：	公開public と 静的static 
			返却型：	void  → 返却値なし
			関数名：	main
			引数:
			（引数の型)	string
			(名称）		args
 */
	

//			質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。	
/*回答:
 			public static void main(String[] args) {
		 		int[] array = new int[] {1,2,3,4,5,6,7,8,9};
		 		int max = max(array);
		 		int min = min(array);
		 		int sum = sum(array);
		 
		 		System.out.println("max is" + max);
		 		System.out.println("min is" + min);
		 		System.out.println("sum is" + sum);
	 }
	 
	 
	 		public static int max(int[] datas) {
		 		int max = datas[0];
		 		for(int i=0; i< datas.length; i++) {
			 		if(max < i) {
				 	max = datas[i];
			 }
		 }
				return max;
	 }
	 
	 		public static int min(int[] datas) {
		 		int min = datas[0];
		 		for(int j=0; j< datas.length; j++) {
			 		if(min > j) {
				 	min = datas[j];
			 }
		 }
				return min;
	 }
	 
	 		public static int sum(int[] datas) {
		 		int sum = 0;
		 		for(int k=0; k< datas.length; k++) {
			 		sum += datas[k];
			 }
		 		return sum;
	 }
 */
	
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
//回答:  質問３の実施結果は"null"です。
	

//質問４︓以下メソッドの実施結果を教えてください。
/*	public class Kicker {
		private static void fillArray(String[] array) {
			array[0] = "value2";
	}
		public static void main(String args[]) {
			String[] array = new String[]{"value1"};
			fillArray(array);
			System.out.println(array[0]);
	}
}	
*/	
//回答:	質問４の実施結果は"value2"です。
	
	
//質問５︓以下メソッドの実施結果を教えてください。	
/*	public class Kicker {
		private static void fillArray(String[] array) {
			array = new String[]{"1", "2"};
	}
		public static void main(String args[]) {
			String[] array = null;
			fillArray(array);
			System.out.println(array == null);
	}
}	
*/
//回答:	質問５の実施結果は"true"です。

//質問６-０︓配列は直接に印刷できません。下記メソッドを利⽤して、配列をprintします。以下メソッドを呼び出してください。
/*	public static void printArray(Object[] objs) {
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
			refix = ", ";
			}
		sb.append("]");
		System.out.println(sb.toString());
	}
*/	
/*回答:	
  		public static void main(String[] args) {
		String[] array = new String[] {null};
		printArray(array);
		}
*/		
		
	
//質問６-１︓以下静的なメソッドを定義してください。
/*	1. メソッド名: megerArray
	2. 引数１︓intの配列 left
	3. 引数２︓intの配列 right
	4. 戻り値︓intの配列
	5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。
*/	
/*回答:	
  		public static int[] megerArray(int[] left, int[] right) {
		int[] megerArray = new int[left.length + right.length];
		
		for(int i=0; i < length; i++) {
			if(i < left.length) {
				megerArray[i] = left[i];
				
			}else {
				megerArray[i] = right[i-left.length];
				
			}
		
		return megerArray;
		}
	}
	
*/ 	
	
	
//質問６-２︓以下静的なメソッドを定義してください。	
/*	1. メソッド名: subArray
	2. 引数１︓intの配列 array
	3. 引数２︓開始のstartIndex
	4. 引数３︓⻑さlength
	5. 戻り値︓intの配列
	6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する	
*/	
/*回答:
  		public static int[] subArray(int[] array,int startIndex,int length) {
		int[] subArray = new int[length];
		for(int i=0; i< length; i++) {
			subArray = array[startIndex + i];
		}
		return subArray;	
	}
*/

	
//質問７︓以下静的なメソッドを定義してください。
/*	1. メソッド名︓trim
	2. 引数１︓charの配列
	3. 戻り値︓charの配列
	4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。
*/
/*回答:	public static char[] trim(char[] array) {
		
		int start = 0;
		for(int i=0; i < array.length; i++) {
			if(array[i] == ' ') {
				start ++;
			}else {
				break;
			}
		}
		
		int length = input.length - start;
		
		for(int i=array.length-1; i >= 0; i--) {
			if(array[i] == ' ') {
				length --;
			}else {
				break;
			}
		}
		return subArray(array, starr, length);
*/	
	

//質問８︓バブルソート⽤メソッドを作成してください。
/*	1. メソッド名︓bubbleSort
	2. 引数１︓intの配列
	3. 戻り値︓ソート済みの配列
	4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてください。
*/
/*回答:
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
 */
	
	
//質問９︓メソッドの呼び出す練習。
/*	1. 質問６-１を⽤い、２つ配列をマージします。
	2. 質問８を⽤い、ステップ１のマージした配列をソートする。
	3. 注意︓コードを１⾏にしてください。
*/	
/*回答：	
		public static int[] megerArray(int[] left, int[] right) {
			int[] megerArray = new int[left.length + right.length];
	
			for(int i=0; i < length; i++) {
				if(i < left.length) {
				megerArray[i] = left[i];			
			}else {
				megerArray[i] = right[i-left.length];
			}
				return megerArray;
		}
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
			int[] array1 = new int[] {1, 2, 3, 4};  
			int[] array2 = new int[] {5, 6, 7, 8};
			int[] result1 = megerArray(array1, arrat2);
			int[] result2 = bubbleSort(result1);
				for (int i = 0; i < result.length; i++) {
					System.out.println(result2[i]);
		}
	}
*/	
	
}	