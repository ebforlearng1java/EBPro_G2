package co.jp.chapter04;

public class JavaChapter04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] int_array = {1,2,3};
		
		for(int i = 0; i < int_array.length; i++) {
			System.out.println(int_array[i]);
		}	
		
		for(int x : int_array) {
			 System.out.println(x); // foreach
		}
		
		int[][] array2d = {
			{1,2,3}, //大括号，还有逗号
			{4,5,6}
		};
		System.out.println(array2d[1][0]); //[行][列]
	}

}
