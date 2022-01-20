package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		
		//問題１︓int[] array = new int[4]; 各要素の値を記載してください。
		int[] array1 = new int[4];
		
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i] );	
		}
		// 0 0 0 0 
		
		
		//問題２︓int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		
		int[] array2 = new int[] {5, 6};
		
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i] );	
		}
		// 5 6
		
		
		//問題３︓int[][] array = new int[2][3]; 各要素の値を記載してください。
		int[][] array3 = new int[2][3];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(array3[i][j] );	
				
			}
		}
		// 0 0
		// 0 0 
		// 0 0
		
		//問題４︓以下２重Foreachを理解してください。
		int[][] array2d = new int[4][2];
		for (int[] out : array2d) {
			 for (int inner : out) {
			 System.out.println(inner);
			 }
			}
		// 0 0 0 0
		// 0 0 0 0

		
		//問題５︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最⼤値と最⼩桁値を
		//System.out.println()。
		int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 
		int min = array[0];
		int max = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}else if(array[i] > max) {
				max = array[i];
				
				
			}
		}
		System.out.println("max is " + max);
		System.out.println("min is " + min);
		
		
		//問題６︓問題１の配列のSUMを求める。
		
		int sum = 0;
		for (int i = 0; i < array1.length; i++) {
			
			sum = sum + array1[i];
			
		}
		System.out.println(sum );	
		
		//問題７︓⾏列（２次元配列）の和と積を計算してください。
	
		
		// この問題の意味が分からないです。
	}
		

		
		
		
		
		
		
		
		
		

}
