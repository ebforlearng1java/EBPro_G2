package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//Q1
		int sum1 = 0;
		for(int i =1; i<101; i++) {
			if(i % 2 == 0) {
				sum1 += i;
			}
		}
		System.out.println(sum1);
		
		
//Q2
		int mul2=1;
		for(int i=1;i<=5;i++) {
				mul2=mul2*i;
		}
		System.out.println(mul2);
		
		
//Q3
		int[] array3 = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		int max3 = array3[0];
		int min3 = array3[0];
		float sum3 = array3[0];
		for (int i = 0; i < array3.length; i++) {
			if(max3 < array3[i]) {
			   max3 = array3[i];
			}
			if(min3 > array3[i]) {
			   min3 = array3[i];
			}
			sum3 += array3[i];
		}
		float ave3 = sum3/array3.length;
		System.out.println("配列の最大値は："+max3);
		System.out.println("配列の最小値は："+min3);
		System.out.println("配列の和は："+sum3);
		System.out.println("配列の平均値は："+ave3);

//Q4
		int[] array4 = new int[]{1, 2, 6, 7, 9, 6, 2, 1};
	    for(int i =0;i<array4.length;i++) {
		for(int j =i+1;j<array4.length;j++) {
				if(array4[i]==array4[j]) {
					System.out.println(array4[i]);
				}
			}
		}
	    
//Q5
		int[] array5 = new int[]{1, 2, 6, 7, 9, 6, 2, 1};
		for(int i =0;i<array5.length;i++) {
			if(array5[i]==7) {
				System.out.println("「７」のインデックスは："+i);
			}
		}	
		
//Q6
		int[][]array_1=new int[][] {{1,2},{3,4}};
		int[][]array_2=new int[][] {{1,2},{3,4}};
 	    int[][]sum=new int [2][2];
		    int[][]mul=new int [2][2];
		    for(int i=0;i<2;i++) {
		    for(int j=0;j<2;j++) {
		    sum[i][j]=array_1[i][j]+array_2[i][j];
			  mul[i][j]=array_1[i][j]*array_2[i][j];
			  System.out.println("sum"+sum[i][j]);
			  System.out.println("mul"+mul[i][j]);
	//参见JavaHomeWork04中问题7中的问题。
	}
    }

//Q7
			int[] array7 = new int[]{1, 2, 6, 7, 9, 6, 2, 1};
			for (int i = 0; i < array7.length -1; i++){    
		    for (int j = 0 ;j < array7.length - i - 1; j++){    
			if(array7[j] > array7[j + 1]){    
		    int temp = array7[j];
		    array7[j] = array7[j + 1];
            array7[j + 1] = temp;
}
}
}
			for(int a:array7) {
		    System.out.println(a);
}	    

//Q8

	        int[][] array = new int[10][10];
	         
	        for (int i = 0; i < 10; i++){
	            for(int j = 0;j<= i;j++){
	                if (j==0 || j==i){
	                	array[i][j]=1;
	                     
	                }else{
	                	array[i][j]=array[i-1][j-1]+array[i-1][j];
	                }
	            }
	        }

	        for (int i = 0; i < 100; i++){
	            int num = 100 -i;
	            for(int j = 0;j<= num;j++){
	                System.out.print(" "); 
	        }
	            for(int k= 0;k<= i;k++){
	                System.out.print(array[i][k]+" ");   
	        }
	            System.out.println();		
	        }
}
}
