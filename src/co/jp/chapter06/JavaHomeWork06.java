package co.jp.chapter06;

public class JavaHomeWork06 {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してください。
//		public static void main(String[] args)
//		回答１：
//		修飾子：public static
//		返却型：void
//		関数名：main
//		引数：(型)String[] (名称)args
		

//	}
//	質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。
//	回答２：
//	public static void main(String[] args) {
//		int[] array = {4,23,64,3256,3244,325,43643,23423};
//		int max = max(array);
//		System.out.println("最大值为："+max);
//	}
//	public static int max(int[] datas) {
//		int max = datas[0];
//		for(int i:datas) {
//			if(i>max) max=i;
//		}
//		return max;
//	}
	
//	質問３．以下メソッドの実施結果を教えてください。
//	回答３："Hello world"
	
//	質問４．以下メソッドの実施結果を教えてください。
//	回答４："value2"
	
//	質問５．以下メソッドの実施結果を教えてください。
//	回答５：true
	
//	質問６-０︓配列は直接に印刷できません。下記メソッドを利⽤して、配列をprintします。以下メソッドを呼び出してください。
//	回答６-０：
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
	//后面题目用的各种类型数组不能识别为Object数组，overload一个各种数组打印方法
	public static void printArray(int[] objs) {
		 if(objs == null) {
			 System.out.println("null");
		 	return;
		 }
		 String prefix = "";
		 StringBuilder sb = new StringBuilder();
		 sb.append("[");
		 for(int obj : objs) {
			 sb.append(prefix);
			 sb.append(String.valueOf(obj));
			 prefix = ", ";
		 }
		 sb.append("]");
		 System.out.println(sb.toString());
	}
	public static void printArray(char[] objs) {
		 if(objs == null) {
			 System.out.println("null");
		 	return;
		 }
		 String prefix = "";
		 StringBuilder sb = new StringBuilder();
		 sb.append("[");
		 for(char obj : objs) {
			 sb.append(prefix);
			 sb.append(String.valueOf(obj));
			 prefix = ", ";
		 }
		 sb.append("]");
		 System.out.println(sb.toString());
	}
	

//	質問６-１︓以下静的なメソッドを定義してください。
//		1. メソッド名: megerArray
//		2. 引数１︓intの配列 left
//		3. 引数２︓intの配列 right
//		4. 戻り値︓intの配列
//		5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。
		
//	回答６-１︓
	private static int[] megerArray(int[] left,int[]right) {
		int[] array = new int[left.length+right.length];
		for(int i=0;i<left.length;i++) {
			array[i]=left[i];
		}
		for(int i=0;i<right.length;i++) {
			array[i+4]=right[i];
		}

		return array;
	}
//	
//	public static void main(String[] args) {
//		int[] left = new int[] {1, 2, 3, 4};
//		int[] right = new int[] {5, 6, 7, 8};
//		var meger = megerArray(left,right);
//		printArray(meger);
//	}
	
//	質問６-２︓以下静的なメソッドを定義してください。
//		1. メソッド名: subArray
//		2. 引数１︓intの配列 array
//		3. 引数２︓開始のstartIndex
//		4. 引数３︓⻑さlength
//		5. 戻り値︓intの配列
//		6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
//	回答６-２︓	
	
//	private static int[] subArray(int[] array,int startIndex,int length) {
//		int[] sub = new int[length];
//		for(int i=startIndex;i<startIndex+length;i++) {
//			sub[i-startIndex]=array[i];
//		}
//		return sub;
//	}
//	public static void main(String[] args) {
//		int[] array = new int[] {1, 2, 3, 4};
//		var a =subArray(array,1,2);
//		printArray(a);
//	}
	
//	質問７︓以下静的なメソッドを定義してください。
//		1. メソッド名︓trim
//		2. 引数１︓charの配列
//		3. 戻り値︓charの配列
//		4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。
//	回答７︓
//	private static char[] trim(char[] array) {
//		int start=0;
//		int end=0;
//		for(int i=0;i<array.length;i++) {
//			if(array[i]!=' ') {
//				start=i;
//				break;
//			}
//		}
//		for(int i=array.length-1;i>=0;i--) {
//			if(array[i]!=' ') {
//				end=i;
//				break;
//			}
//		}
//		char[] sub = new char[end-start+1];
//		for(int i=start;i<=end;i++) {
//			sub[i-start]=array[i];
//		}
//		return sub;
//		
//	}
//	public static void main(String[] args) {
//		char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '};
//		char[] newArray= trim(input);
//		
//		printArray(newArray);
//	}
	
//	質問８︓バブルソート⽤メソッドを作成してください。
//		1. メソッド名︓bubbleSort
//		2. 引数１︓intの配列
//		3. 戻り値︓ソート済みの配列
//		4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてください。
	
//	回答８：
	private static int[] bubbleSort(int[] array){
		for(int t=0;t<array.length-1;t++) {
			for(int i=0;i<array.length-t-1;i++) {
				if(array[i+1]<array[i]) {
					int temp = array[i+1];
					array[i+1]=array[i];
					array[i]=temp;
				}
			}
		}
		return array;
	}
	
//	質問９︓メソッドの呼び出す練習。
//		1. 質問６-１を⽤い、２つ配列をマージします。
//		2. 質問８を⽤い、ステップ１のマージした配列をソートする。
//		3. 注意︓コードを１⾏にしてください。
//	回答９︓
	public static void main(String[] args) {
	int[] a= {7,4,3,2};
	int[] b= {1,8,5,9,6};
	printArray(bubbleSort(megerArray(a,b)));
	//一行
//	printArray(bubbleSort(megerArray(new int[]{7,4,3,2},new int[]{1,8,5,9,6})));
	}	
}
