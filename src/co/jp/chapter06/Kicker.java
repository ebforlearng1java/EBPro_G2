package co.jp.chapter06;

public class Kicker {
	//質問３．以下メソッドの実施結果を教えてください。
	private static void sayHello(String y) {
		 y = "Hello world";
	}
	//public static void main(String args[]) {
	//	String x = null;
	//	sayHello(x);
	//	System.out.println(x);
	//}
	
	
	//質問４︓以下メソッドの実施結果を教えてください。
//	private static void fillArray(String[] array) {
//		 array[0] = "value2";
//	}
	//public static void main(String args[]) {
		// String[] array = new String[]{"value1"};
		// fillArray(array);
		// System.out.println(array[0]);
	//}
	
	
	//質問５︓以下メソッドの実施結果を教えてください。
	private static void fillArray(String[] array) {
		array = new String[] {"1","2"};
	}
	public static void main(String args[]) {
		String[] array = null;
		fillArray(array);
		System.out.println(array == null);
	}
}
