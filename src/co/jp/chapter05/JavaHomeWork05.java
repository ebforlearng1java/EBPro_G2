package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}
	
//	設問１︓1から100までの偶数の和を求める(for + if)。
/*回答:
  	{	
  		int sum = 0;
		for(int i  = 0; i <= 100 ; i++) {
			if(i % 2 == 0) {
				sum += i;
				
			}
			
		}
		System.out.println(sum);	
	}		
 */
	
	
//	設問２︓5の階乗を求める(for)。
/*回答:
  	{
  		int x = 1;
		for(int i = 1; i <= 5; i++) {
				x = x*i;
		}
			System.out.println(x);
	}
 */
	
	
//	質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
/*回答:	
  {
  		int array[] = new int[]{1, 2, 6, 7, 9, 6, 2, 1};
		int max = array[0];
		int min = array[0];
		float sum = 0;
		for(int i = 0; i < array.length; i++) {
			if(max > array[i]) {
				max = array[i];
			}
			if(min < array[i]) {
				min = array[i];
			}
		}
		for(int i = 0; i <= array.length; i++) {
			sum += i;
		}
		System.out.println("max is " + max);
		System.out.println("min is " + min);
		System.out.println("avg is " + sum/array.length);
	}
 */
	
	
//	質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
/*回答:
 	{	
 		int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		for(int i = 0; i < array.length; i++) {
			for(int j = 1+i; j < array.length; j++) {
				if(array[i] == array[j]) {
					System.out.println("重複する数は " + array[j]);
				}
				
			}
		}
	}	
 */
	
	
//	質問５︓質問３の配列に値「７」のインデックスを求む。
/*回答:
 	{	
 		int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		for(int i = 0; i < array.length; i++) {
			if(array[i] == 7) {
				System.out.println("値「7」のインデックスは" + i);
			}
		}
	}
 */
	
	
//	質問６︓任意⾏列（２次元配列）の積を求める。
/*回答:
  
  	{
		int[][] array1 = {{1,2},{3,4}};
		int[][] array2 = {{5,6},{7,8}};
		int[][] arraymul = new int[2][2];
		for(int i = 0; i < 2; i++) 
		{
			for(int j = 0; j < 2; j++)
			{
				arraymul[i][j] = array1[i][j] * array2[i][j];
			}
		}
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				System.out.println("the product is " + arraymul[i][j]);
			}
	
		}
	}
 */
	
	
//	質問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
/*回答:
	{
		int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		 for (int i = 0; i < array.length; i++) 
		    {      
		        for (int j = i + 1; j < array.length; j++) 
		        {  
		            int tmp = 0;                        
		            if (array[i] > array[j]) 
		            {           
		                tmp = array[i];               
		                array[i] = array[j];            
		                array[j] = tmp;
		            }
		        }
		    }
		      

		           for (int i = 0; i < array.length; i++) 
		           {     
		              System.out.print(array[i]+",");  
		           }
	}
*/
	
	
//	質問８︓LV10のパスカルの三⾓形を出⼒してください。
/*回答:
		//自分で書けなかったので、ネット上のやり方を見ながら書きました。
	
		public static void pascal(int n) {
		
			int [][] a = new int [n][n];
			for(int i = 0; i < n ; i++) {
				a[i][0] = 1;
				a[i][i] = 1;
				if(i>=2) {
					for(int j=1; j<i; j++) {
						a[i][j] = a[i-1][j]+a[i-1][j-1];
					}
				}
			}
			for(int i=0;i<n;i++) {
				
				for(int k=1; k<n-1;k++) {
					System.out.print(" ");
				}
				
				for(int j=0; j<=i; j++) {
					System.out.print(a[i][j]);
					if(j!=i) System.out.print(" ");
				}
				System.out.println();
			}
			
			
		}
			public static void main(String[] args) {
				pascal(5);
	}
*/	
		
//		ps. URL
//		https://www.bilibili.com/video/BV1Gb411S7hz?from=search&seid=1899195986034369726&spm_id_from=333.337.0.0
	
	
}
