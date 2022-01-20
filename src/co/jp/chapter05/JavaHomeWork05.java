package co.jp.chapter05;

import java.text.DecimalFormat;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//設問１︓1から100までの偶数の和を求める(for + if)。
		int sum = 0;
		
		for (int i = 1; i < 101; i++) {
			if ( i%2 == 0) {
				sum = sum + i;
			}
		}
		
		System.out.println("1から100までの偶数の和; " + sum);	
		
		//設問２︓5の階乗を求める(for)。
		int F = 5;
		for (int i = 5; i > 1; i=i-1) {
			F = F * (i-1);
		}
		
		System.out.println("5の階乗; " + F);	
		
		//質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
		int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1, 1, 1};
		int min = array[0];
		int max = array[0];
		int s = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}else if(array[i] > max) {
				max = array[i];
				
				
			}
			
			s += Double.valueOf( array[i] ); 
			
		}
		
		DecimalFormat d = new DecimalFormat("0.000");
		String average = d.format((float)s/array.length);
		
		System.out.println("max is " + max);
		System.out.println("min is " + min);
		System.out.println("sum is " + s);
		System.out.println("average is " + average);
		
		
		//質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
        int[] array4 = new int[] {1, 2, 6, 7, 9, 6, 2, 1,1,1};
		
		for ( int i = 0; i < array4.length; i++) {
			int tran = array4[i];
			int mini = array4[i];
			int k = i;
			
			//System.out.println(tran);
			for(int j = i+1; j< array4.length; j++) {
				if (array4[j] < mini) {
					mini = array4[j];
					k = j;
				}

			}
			array4[i] = mini;
			array4[k] = tran;
			
		}
		
		
		int zerocount = 0;
		for ( int i =0; i < array4.length; i++) {
			if( array[i] ==0) {
				zerocount = zerocount+1;
			}
		}
		
		if (zerocount > 1) {
			System.out.println("The repeated value is 0");
			
		}
		
		
		for ( int i = 0; i < array4.length-1; i++) {
			for ( int j = i+1; j < array4.length; j++) {
				if(array4[j] == array4[i]) {
					array4[j] = 0;
				}
			}
			
			
			
		}
		
		
		for ( int i = 0; i < array4.length-1; i++) {
			if(array4[i]!=0 && array4[i+1]==0) {
				System.out.println("The repeated value is " + array4[i]);
			}
		}
		

		
		
     
		//質問５︓質問３の配列に値「７」のインデックスを求む。
		for ( int i =0; i < array.length; i++) {
			if( array[i] ==7) {
				System.out.println("index is " + i);
				
			}
		}
		
		//質問６︓任意⾏列（２次元配列）の積を求める。
		int[][] array2d1 = new int[2][2];
		int[][] array2d2 = new int[2][2];
		int[][] array2d3 = new int[2][2];
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j <2; j ++) {
				array2d3[i][j] = array2d1[i][j]*array2d2[i][j];
				
			}
		}
		
		
		
		
		//質問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
		int[] array7 = new int[] {1, 2, 6, 7, 9, 6, 2, 1,1,1};
		
		for ( int i = 0; i < array7.length; i++) {
			int tran = array7[i];
			int mini = array7[i];
			int k = i;
			
			//System.out.println(tran);
			for(int j = i+1; j< array7.length; j++) {
				if (array7[j] < mini) {
					mini = array7[j];
					k = j;
				}

			}
			array7[i] = mini;
			array7[k] = tran;
			
		}
		
		for ( int i = 0; i < array7.length; i++) {
			System.out.println("Elements from smallest to biggest are: "  + array7[i]);
		}
	
		
		
		
		//質問８︓LV10のパスカルの三⾓形を出⼒してください。
		
		
		// 卒論に間に合わないので、この問題を解決時間がありません。
		
		

	}

}
