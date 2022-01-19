package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println(String.valueOf("1.0F"));
		System.out.println(String.valueOf(1.0F));
		System.out.println(1.0F +"");
		
		//問題１︓int[] array = new int[4]; 各要素の値を記載してください。
		int[] array1 = new int[4];
		for(int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		
		//問題２︓int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		int[] array2 = new int[] {5,6};
		for(int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		
		//問題３︓int[][] array = new int[2][3]; 各要素の値を記載してください。
		int[][] array3 = new int[2][3];
		for(int i = 0; i < array3.length; i++) {
			for(int j = 0; j < array3[i].length; j++){
			System.out.print(array3[i][j]);
			}
			System.out.println();
		}
		
		
		//問題４︓以下２重Foreachを理解してください。
		int[][] array2d = new int[4][2];
		for (int[] out : array2d) {
			 for (int inner : out) {
			 System.out.println(inner);
			 }
		}
		for(int i = 0; i < array2d.length; i++) {
			for(int j = 0; j < array2d[i].length; j++){
			System.out.println(array2d[i][j]);
			}
		}

		
		//問題５︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最⼤値と最⼩桁値をSystem.out.println()。
		int[] array5 = new int[] {1, 3, 5, 7, 100, 0, 1};
		int max = array5[0];
		int min = array5[0];
		
		for(int i = 0; i < array5.length - 1; i++) {
			if(max < array5[i+1]) {
				max = array5[i+1];
			}
			if(min > array5[i+1]) {
				min = array5[i+1];
			}
		}
		System.out.println("最大値：" + max);
		System.out.println("最小値：" + min);
		
		
		//問題６︓問題１の配列のSUMを求める。
		int sum = 0;
		for(int i = 0; i < array1.length; i++) {
			sum = sum + array1[i];
		}
		System.out.println("問題１の配列のSUM：" + sum);
		
		
		//問題７︓⾏列（２次元配列）の和と積を計算してください。
		int[][] array7 = {
				{1,2},
				{4,5}
		};
		int[][] array7_product = new int[2][2];
		int[][] array7_sum = new int[2][2];
		
		System.out.println("２次元配列の和：");
		for(int i = 0; i < array7.length; i++) {
			for(int j = 0; j < array7[i].length; j++) {
				array7_sum[i][j] = array7[i][j] + array7[i][j];
				System.out.print(array7_sum[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("２次元配列の積：");
		for(int i = 0; i < array7.length; i++) {
			for(int j = 0; j < array7[i].length; j++) {
				for(int m = 0; m < array7.length; m++) {
					array7_product[i][j] = array7_product[i][j] + array7[i][m] * array7[m][j];
				}
				System.out.print(array7_product[i][j] + " ");
			}
			System.out.println();
		}
	}

}
