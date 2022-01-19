package co.jp.chapter06;

public class JavaChapter06 {

	int g = 1000;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int abc = 9999;
		int efg = 8888;
		//		String d = a + b;

		int abc1 = 1212;

		String abc_str = "9999";

		//		abc = abc_str;

		int c = sum(efg, abc_str);

		int d = minus(efg, abc1);

		//		System.out.println(c);
		//		System.out.println(d);

		//		Object obj = new Object();
		//
		//		obj = 123;
		//		sum(obj);
		//
		//
		//		obj = "123";
		//		sum(obj);
		//
		//		obj = new int[]{1,2,3};
		//		sum(obj);

		//		int[] arr = new int[]{1,2,3};
		//
		//		System.out.println("Method 1 : "+sum());
		//		System.out.println("Method 2 : "+sum(abc));
		//		System.out.println("Method 3 : "+sum(abc_str));
		//		System.out.println("Method 4 : "+sum(arr));
		//		System.out.println("Method 5 : "+sum(efg, abc_str));
		//		System.out.println("Method 6 : "+sum(efg, abc));

		//		System.out.println("Method 7 : "+sum(abc_str, abc_str));

		speck();

	}

	//	static String sum(int a) {
	//
	//		return "";
	//	}

	static void speck() {
		System.out.println("Hello world!");
	}

	static int sum() {

		return 0;
	}

	static int sum(int i) {

		return 1;
	}

	static int sum(String str) {

		return 2;
	}

	//	static int sum(Object obj) {
	//
	//		return 0;
	//	}

	static int sum(int[] array) {

		return 3;
	}

	static int sum(int efg, String abc_str) {

		return 4;
	}

	static int sum(int input01, int input02) {

		int output = input01 + input02;

		return output;

	}

	static int minus(int input01, int input02) {

		int output = input01 - input02;

		return output;

	}
}
