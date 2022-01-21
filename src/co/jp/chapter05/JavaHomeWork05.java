package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		
		// TODO 自動生成されたメソッド・スタブ
		
		
		
//		設問1:1から100までの偶数の和を求める(for + if)。
		
		int evenSum =0;
		for (int i = 0; i <=100;i++) {
			if (i % 2 == 0) {
		        evenSum += i;	
		    }
		}
	    System.out.println("偶数の和：" + evenSum);
		
		
//		設問2:5の階乗を求める(for)。
		
		int mul =1;
        for (int i = 1; i <= 5; i++){
        	
            mul = 1;
            for (int j = 1;j <= i; j++)
                mul = mul * j ; 
          
        }
        System.out.println("5!="+ mul);
//    
		
//		質問3:配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める。

		int[] arr = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		int max = arr[0];
        int min = arr[0];
		int sum = 0;
        int average = 0;
        
        for (int num : arr) {
        	sum += num;
        }
        
        for(int i = 0; i < arr.length; i++) {
          average = sum / (i + 1);
		
			 if (max < arr[i]) {
				 max = arr[i];
			 }
             if (min > arr[i]) {
            	 min = arr[i];
			 }
		}
        
		System.out.println("配列の最大値：" + max);
		System.out.println("配列の最小値：" + min);
		System.out.println("配列の和：" + sum);
		System.out.println("配列の平均値：" + average);
		
//		質問4:質問3の配列に重複ある要素を探す(要素の表示次数集計必要なし)。
		
		int a = 0;
		int sum1 =0;
		int[] arr1 = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		
			for (int i = 0; i < arr1.length; i++) {	
				for (int j = i + 1; j < arr1.length; j++) {	
			       if (arr1[j] == arr1[i]) {
			    	   a = arr1[j];
				       sum1++;
				   }
			       
			    }
				if(sum1==1)
		        System.out.println( "配列の重複ある要素 : " +  a );
		      sum1 = 0;
		    }
		
			
//		質問5:質問3の配列に値「7」のインデックスを求む。
		
		int[] arr2 = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		int x = 0;
		
        for (int i = 0; i < arr2.length; i++) {
        	if (arr2[i] == 7) {
        		x = i;
        	}
        }
        System.out.println("index:" + x);
        
		
//		質問6:任意行列(2次元配列)の積を求める。
		
		int[][] A = {{1,2},{3,4}};
		int[][] B = {{5,6},{7,8}};	
		
		int[][] C = new int[A.length][];
		
		for(int i = 0; i<A.length; i++) {
			C[i] = new int [A[i].length];
		}
		
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[i].length;j++) {
				for(int k=0;k<A.length;k++) {
					  C[i][j] = A[i][j] * B[i][j];
				}
			}
		}
		for(int i=0;i<C.length;i++) {
			for(int j=0;j<C[i].length;j++) {
					System.out.print(C[i][j]+"  ");
			}
			System.out.println();
		}

		
//		質問7:配列を昇順でソートする(java.util等メソッド利用禁止)。
		
		int[] arr3 = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
        select(arr3);     
        for (int i = 0; i<arr3.length; i++) {
                
            System.out.print(arr3[i] + ","); 
        }
    }
 
  public static void select(int[] arr3) {
 
        for (int j = 0; j<arr3.length - 1; j++) {
            
            for (int i = j; i < arr3.length; i++) {
                if (arr3[i] < arr3[j]) {
                    int temp = arr3[j];
                    arr3[j] = arr3[i];
                    arr3[i] = temp;
                }
            }
        }
        
//		質問8:LV10のパスカルの三角形を出力してください。
	
	      int[][] arr = new int[10][];      
	        for (int i = 0; i < arr.length; i++) {  
	            arr[i]=new int[i+1];      
	            for (int j = 0; j < arr[i].length; j++) { 
	                if (i == j || j == 0){     
	                    arr[i][j] = 1;
	                }else {
	                    arr[i][j] = arr[i-1][j]+arr[i-1][j-1]; 
	                }
	            }
	        }
	        for (int i = 0; i < arr.length; i++) {
	            int[] cellArr = arr[i];   
	            for (int j = 9 - i; j > 0; j--) {     
	              System.out.print(" ");
	            }
	            for (int i1 = 0; i1 < cellArr.length; i1++) {      
	                System.out.print(cellArr[i1]+" ");
	            }
	            System.out.println();
	        }    
	 
		
		
		
	}
	

}
