package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// 		問題１︓int[] array = new int[4]; 各要素の値を記載してください。
		//		答え ： array[] = {0, 0, 0, 0}です。
		
		
		//		問題２︓ int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		//		答え ： array[0] = 5;
		//			  array[1] = 6;
		
		
		//		問題３︓int[][] array = new int[2][3]; 各要素の値を記載してください。
		//		答え： array = {{0, 0, 0}, {0, 0, 0}};です。
		
		
		//		問題４︓以下２重Foreachを理解してください。
		//		int[][] array2d = new int[4][2];
		//		for (int[] out : array2d) {
		//			 for (int inner : out) {
		//			 System.out.println(inner);
		//			 } }
		//		答え：2dの行列の全ての元素をプリントアウトしているコーディング。
		//		0
		//		0
		//		0
		//		0
		//		0
		//		0
		//		0
		//		0
		
		
		//		問題５︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最⼤値と最⼩桁値を 
		//		System.out.println()。
		//		答え：
		//		int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
		//		for(int i=0; i < (array.length-1); i++) {
		//			for(int j=0; j < (array.length-1-i); j++){
		//				if(array[j] < array[j+1]) {
		//					int temp = array[j];
		//					array[j] = array[j+1];
		//					array[j+1] = temp;
		//				}
		//			}
		//		}
		//		System.out.printf("一番大きいのは%dです。\n", array[0]);
		//		System.out.printf("一番小さいのは%dです。", array[array.length-1]);
			
		
		//		問題６︓問題１の配列のSUMを求める。
		//		答え：
		//		int sum = 0;
		//		for(i=0,  i < ,i++) {
		//			sum += new int[i];
		//		}
		//		System.out.printf("この配列の和は%d\n", sum);
		
		
		//		問題７︓⾏列（２次元配列）の和と積を計算してください。
		//		答え：
		//		int acc = 0;
		//		int mul = 1;
		//		int[][] array2d = new int[3][4];
		//		for(int i=0; i < array2d.length; i++) {
		//			for(int j=0; j < array2d[0].length; j++) {
		//				acc += array2d[i][j];
		//				mul = mul * array2d[i][j];
		//			}
		//		}
		//		System.out.printf("この配列の和は%d\n", acc);
		//		System.out.printf("この配列の和は%d\n", mul);
	}

}
