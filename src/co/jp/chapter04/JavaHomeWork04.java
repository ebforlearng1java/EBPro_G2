package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println(String.valueOf("1.0F"));
		System.out.println(String.valueOf(1.0F));
		System.out.println(1.0F +"");
	}

	//問題１︓int[] array = new int[4]; 各要素の値を記載してください。
	//回答:[0,0,0,0]
	
	//問題２︓int[] array = new int[] {5, 6}; 各要素の値を記載してください。
	//回答:[5,6]
	
	//問題３︓int[][] array = new int[2][3]; 各要素の値を記載してください。
	//回答:[0,0,0]、[0,0,0]
	
	//問題４︓以下２重Foreachを理解してください。	
/*
  		int[][] array2d = new int[4][2]; 
		for (int[] out : array2d) { 
		for (int inner : out) { 
		System.out.println(inner); 
	 } 
	} 
*/
	//回答:逐行逐个输出array2d的所有值
	
	//問題５︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最⼤値と最⼩桁値をSystem.out.println()。
	
/*回答:			
  			int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
				int max = array[0];
				int min = array[0];
			
			for (int i = 0; i < arr.length;i++) {
				if(array[i] > max) {
					max = array[i];		
			} 
				if(array[i] < min) {
					min = array[i];
			}
		}
		System.out.println("最大値は："+ max);
		System.out.println("最小値は："+ min);
*/			
			
	//問題６︓問題１の配列のSUMを求める
	
/*回答:
			int[] array = new int[4];
			int sum = 0;
			for(int i = 0; i<array.length;i++) {
				sum = sum + array[i];
		}
			System.out.println(sum);
*/	
	
	//問題７︓⾏列（２次元配列）の和と積を計算してください。
	
/*回答:	  
		int[][] array1 = {{1,2},{3,4}};
		int[][] array2 = {{5,6},{7,8}};
		int[][] arraysum = new int[2][2];
		int[][] arraymul = new int[2][2];
		for(int i = 0; i < 2; i++) 
		{
			for(int j = 0; j < 2; j++)
			{
				arraysum[i][j] = array1[i][j] + array2[i][j];
				arraymul[i][j] = array1[i][j] * array2[i][j];
			}
		}
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				System.out.println("the sum is " + arraysum[i][j]);
				System.out.println("the product is " + arraymul[i][j]);
			}
	
		}
	}
}
	
			
			
			
			
			
*/			
	
		
	
	
	}		

