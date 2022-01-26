package co.jp.chapter06;

public class JavaHomework06 {
//		質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してくださ い
//		public static void main(String[] args);
//		答え：修飾⼦：公開のpublicと静的のstaticです。 
//			返却型：voidで、返却値なしです。
//			関数名：mainです。
//			引数（引数の型・名称）：string配列型のargsという引数です。
		
		
//		質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼 び出してください。
//		// 例：配列のMax値を求めるメソッド
//	    答え：
		public static int max2(int[] datas) {
			int max2 = datas[0];
			for  (int i=1; i < datas.length; i++) {
				if (max2 < datas[i]) {
					max2 = datas[i];
				}
			}
			return max2;
		}
		
		public static int min2(int[] datas) {
			int min2 = datas[0];
			for  (int i=1; i < datas.length; i++) {
				if (min2 > datas[i]) {
					min2 = datas[i];
				}
			}
			return min2;
		}
		
		public static int sum2(int[] datas) {
			int sum2 = 0;
			for (int i=0; i < datas.length; i++) {
				sum2 += datas[i];
			}
			return sum2;
		}
		
		public static void main(String[] args) {
			int[] array2 = new int[]{7, 6, 2, 6, 7, 9, 6, 2, 1};
			int max2 = max2(array2);
			int min2 = min2(array2);
			int sum2 = sum2(array2);
			System.out.printf("配列の最大値は：%d\n", max2);
			System.out.printf("配列の最小値は：%d\n", min2);
			System.out.printf("配列の和は：%d\n", sum2);
		}

		
//		質問３．以下メソッドの実施結果を教えてください。
//		public class Kicker {
//			 private static void sayHello(String y) {
//				 y = "Hello world";
//			 }
//			 public static void main(String args[]) {
//				 String x = null;
//				 sayHello(x);
//				 System.out.println(x);
//	 		}
//		}
//	    答え：sayHelloの返却値がないので，実施結果は「ｘ」が「null」のままでプリントアウトしています。
		
		
		
//		質問４︓以下メソッドの実施結果を教えてください。
//		public class Kicker {
//			 private static void fillArray(String[] array) {
//				 array[0] = "value2";
//			 }
//			 public static void main(String args[]) {
//				 String[] array = new String[]{"value1"};
//				 fillArray(array);
//				 System.out.println(array[0]);
//			 } 
//		 }
//	    答え：実施結果は「value2」です。
		
		
//		質問５︓以下メソッドの実施結果を教えてください。
//		public class Kicker {
//			 private static void fillArray(String[] array) {
//				 array = new String[]{"1", "2"};
//			 }
//			 public static void main(String args[]) {
//				 String[] array = null;
//				 fillArray(array);
//				 System.out.println(array == null);
//			 }
//		}
//		答え：sayHelloの返却値がないので，「array」が変わらず，「null」です。実施結果は「true」です。
		
		
//		質問６-０︓配列は直接に印刷できません。下記メソッドを利⽤して、配列をprintしま す。以下メソッドを呼び出してください。
//		答え：
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
		public static void main(String[] args) {
			String[] array6_0 = new String[] {null};  
			printArray(array6_0);
		}
		
		
//		質問６-１︓以下静的なメソッドを定義してください。
//		1. メソッド名: megerArray 
//		2. 引数１︓intの配列 left 
//		3. 引数２︓intの配列 right 
//		4. 戻り値︓intの配列 
//		5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。
//		以下メソッドの実施例︓
//		int[] left = new int[] {1, 2, 3, 4}; 
//		int[] right = new int[] {5, 6, 7, 8};
//		メソッドを実施後 int[] 
//		result = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
//		答え：
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
			 
		public static void main(String[] args) {
			int[] l_array6_1 = new int[] {1, 2, 3, 4};  
			int[] r_array6_1 = new int[] {5, 6, 7, 8};
			int[] result6_1 = mergeArray(l_array6_1, r_array6_1);
			for (int i = 0; i < result6_1.length; i++) {
				System.out.println(result6_1[i]);
			}
		}
		
		
//		質問６-２︓以下静的なメソッドを定義してください。
//		1. メソッド名: subArray 
//		2. 引数１︓intの配列 array 
//		3. 引数２︓開始のstartIndex 
//		4. 引数３︓⻑さlength 
//		5. 戻り値︓intの配列 
//		6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
//		以下メソッドの実施例︓
//		int[] array = new int[] {1, 2, 3, 4};
//		// start = 1, length = 2
//		int[] result = new int[] {2, 3}
//		答え：
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
			int[] array8 = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
			int[] result8 = bubbleSort(array8);
			for (int i = 0; i < result8.length; i++) {
				System.out.println(result8[i]);
			}
		}
		
		
		
//		質問７︓以下静的なメソッドを定義してください。
//		1. メソッド名︓trim 
//		2. 引数１︓charの配列 
//		3. 戻り値︓charの配列 
//		4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。
//		以下メソッドの実施例︓
//		char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '}; // 入力引数
//		// メソッドを実施後 
//		char[] output = new char[] {'A', 'b', ' ', ' ', 'C'}; // 入力引数
//		ヒント︓ 
//		1. 配列の起点から、 ' ' ではない⽂字列のインデックスを探す。 
//		2. 配列の終点から、 ' ' ではない⽂字列のインデックスを探す。 
//		3. 起点と終点を引数として、質問６-２で作成したサブ配列メソッドを呼び出して、結果 を求める。
//		答え：
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
			char[] result7 = trim(input7, start7, length7);
			System.out.println(result7);
		}
		
		
//		質問８︓バブルソート⽤メソッドを作成してください。
//		1. メソッド名︓bubbleSort 
//		2. 引数１︓intの配列 
//		3. 戻り値︓ソート済みの配列 
//		4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてください。
//		答え：
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
			int[] array8 = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
			int[] result8 = bubbleSort(array8);
			for (int i = 0; i < result8.length; i++) {
				System.out.println(result8[i]);
			}
		}
		
		
//		質問９︓メソッドの呼び出す練習。		
//		1. 質問６-１を⽤い、２つ配列をマージします。 
//		2. 質問８を⽤い、ステップ１のマージした配列をソートする。 
//		3. 注意︓コードを１⾏にしてください。
//		答え：
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