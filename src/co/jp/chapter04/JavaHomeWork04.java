package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		
//		問題1:int[] array = new int[4]; 各要素の値を記載してください。
		
		//int[] array = new int[4];
		//array[0] = 9;
		//array[1] = 8;
		//array[2] = 7;
		//array[3] = 6;
		//array[4] = 5;
				
        
		
//		問題2:int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		
		
		//int[] array = new int[] {5, 6};
		//array[0] = 5;
		//array[1] = 6;
		
//		問題3:int[][] array = new int[2][3]; 各要素の値を記載してください。
		//int[][] array = new int[2][3];
		//array[0] = {1,2,3,4};
		//array[1] = {5,6,7,8};
		//array[2] = {1,3,4,5};
        
		
//		問題4:以下2重Foreachを理解してください。	
		
		//1  int[][] array2d = new int[4][2];          //配列変数名array2d = new データ型[要素数4][要素数2]
        //2		      for (int[] out : array2d) {      //配列変数outに配列array2dの要素が順に代入されていく。
        //3			    for (int inner : out) {　　　　　//変数innerに配列変数outの要素が順に代入されていく。
        //4			       System.out.println(inner);  //output:inner
        //5			    }
        //6	          }
		
		
//		問題5:int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最大値と最小桁値をSystem.out.println()。
		
        int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
        int  max = array[0]; 
        int  min = array[0];
		int indexmin = 0;
		
		  for (int i = 0; i < array.length; i++) {
			  if( max < array[i]) {
				     max =array[i];
				    }
			  if( min > array[i]) {
				     min =array[i];
				     indexmin = i;
				    }
		  }

		  
		  System.out.println("最大値: " + max );
		  System.out.println("最小桁値: " + indexmin);
	
		
//		問題6:問題1の配列のSUMを求める。
		
		int[] array1 = new int[4];
		array1[0] = 9;
		array1[1] = 8;
		array1[2] = 7;
		array1[3] = 6;
		int sum = 0;
		
		for (int num : array) {
			 sum += num;
		}
		System.out.println(sum);
		
//		問題7:行列(2次元配列)の和と積を計算してください。
		
		int[][] A = {{1,2},{3,4}};
		int[][] B = {{5,6},{7,8}};	
		
		int[][] C = new int[A.length][];
		int[][] D = new int[A.length][];
		
		for(int i = 0; i < A.length; i++) {
			C[i] = new int [A[i].length];
			D[i] = new int [A[i].length];
			
		}
		
		for(int i = 0;i < A.length; i++) {
			for(int j = 0;j < A[i].length; j++) {
				for(int k = 0;k < A.length; k++) {
					  C[i][j] = A[i][j] * B[i][j];
					  D[i][j] = A[i][j] + B[i][j];
				}
			}
		}
		System.out.print("配列の積：" + " ");
		System.out.println();
		for(int i = 0;i < C.length; i++) {
			for(int j=0;j < C[i].length; j++) {;
				System.out.print(C[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.print("配列の和：" + " ");
		System.out.println();
		for(int i = 0;i < D.length; i++) {
			for(int j=0;j < D[i].length; j++) {
				System.out.print(D[i][j] + "  ");
			}
			System.out.println();
		}
		
	}

}
