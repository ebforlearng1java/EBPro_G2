package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//設問１︓1から100までの偶数の和を求める(for + if)。
		int sum1 = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				sum1 = sum1 + i;
			}
		}
		System.out.println("1から100までの偶数の和:" + sum1);
		
		
		//設問２︓5の階乗を求める(for)。
		int product = 1;
		for(int i = 1; i < 6; i++) {
			product = product * i;
		}
		System.out.println("5の階乗：" + product);
		
		
		//質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
		int[] int_array = {1, 2, 6, 7, 9, 6, 2, 1};
		int max = int_array[0];
		int min = int_array[0];
		int sum3 = 0;
		float arrange = 0;
		float length = int_array.length;
		
		for(int i = 0; i < int_array.length; i++) {
			sum3 = sum3 + int_array[i];
			if(max < int_array[i]) {
				max = int_array[i];
			}
			if(min > int_array[i]) {
				min = int_array[i];
			}
		}
		arrange = sum3 / length;
		System.out.println("最大値：" + max);
		System.out.println("最小値：" + min);
		System.out.println("和：" + sum3);
		System.out.println("平均値：" + arrange);
		
		
		//質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
		for(int i = 0; i < int_array.length - 1; i++) {
			for(int j = i + 1; j < int_array.length ; j++) {  //改进点：3个以上一样的时候会多次输出
				if(int_array[i] == int_array[j]) {
					System.out.println("質問３の配列に重複ある要素：" + int_array[i]);
					break;
				}
			}
		}
		
		
		//質問５︓質問３の配列に値「７」のインデックスを求む。
		for(int i = 0; i < int_array.length; i++) {
			if(int_array[i] == 7){
				System.out.println("質問３の配列に値「７」のインデックス：" + i);
			}
		}
		
		
		//質問６︓任意⾏列（２次元配列）の積を求める。
		int[][] array2d_1 = {
				{1,2}, 
				{4,5}
			};
		int[][] array2d_2 = {
				{3,4}, 
				{5,6}
			};
		
		int[][] array2d_product = new int[array2d_1.length][array2d_2[0].length];
		
		System.out.println("２次元配列の積：");
		for(int i = 0; i < array2d_1.length; i++) {
			for(int j = 0; j < array2d_2[0].length; j++) {
				for(int m = 0; m < array2d_2.length; m++) {  //1的列等于2的行
					array2d_product[i][j] = array2d_product[i][j] + array2d_1[i][m] * array2d_2[m][j];
				}
				System.out.print(array2d_product[i][j] + " ");
			}
			System.out.println();
		}
		
		
		//質問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
		int change;
		for(int i = 0; i < int_array.length - 1; i++) {
			for(int j = i + 1; j < int_array.length ; j++) {
				if(int_array[i] > int_array[j]) {
					change = int_array[i];
					int_array[i] = int_array[j];
					int_array[j] = change;
				}
			}
		}
		System.out.println("質問３の配列を昇順でソートする");
		for(int i = 0; i < int_array.length; i++) {
				System.out.print(int_array[i]);
		}
		System.out.println();
		
		
		//質問８︓LV10のパスカルの三⾓形を出⼒してください。
		int n = 10;  //杨辉三角等级（行数）
		int[][] triangle = new int[n][2*n-1];
		triangle[0][n-1] = 1;
		triangle[1][n-2] = 1;
		triangle[1][n] = 1;
		
		for(int i = 2; i < triangle.length; i++) {
			triangle[i][n-1-i] = 1;
			triangle[i][n-1+i] = 1;
			for(int j = 1; j <= i-1 ; j++) {
				triangle[i][n-1-i+2*j] = triangle[i-1][n-1-i+2*j-1] + triangle[i-1][n-1-i+2*j+1];
			}
		}
		for(int i = 0; i < triangle.length; i++) {  
			for(int j = 0; j < triangle[i].length ; j++) {
				if(triangle[i][j] == 0) {
					System.out.print(" ");
				}else {
					System.out.print(triangle[i][j]);  //数的位数不一样导致三角形有点错位咋办？（1位，2位，3位）
				}
			}
			System.out.println();
		}
	}
}
