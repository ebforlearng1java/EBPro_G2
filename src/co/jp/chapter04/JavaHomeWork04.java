package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Q1	
		//int[] array = new int[4] ; 
		//for(int i = 0; i < array.length; i++) {
	    //System.out.println(array[i]); 
		// 配列の要素を出力する
		//各要素の値は0、0、0、0である。
		
		//Q2
		//int[] array = new int[] {5,6};{
		//for(int i = 0; i < array.length; i++) {
	   // System.out.println(array[i]); 
//				}
		//array[0]=5;
		//array[1]=6;
		
		//Q3
//		int[][] array = new int[2][3];
	// 各要素の値は(0,0,0),(0,0,0)である。
		
		//Q4
//		int[][] array2d = new int[4][2];
//		{
//		     for (int[] out : array2d) {
//			 for (int inner : out) {
//			 System.out.println(inner);
//			 }
//		     }
		//For-Each 循环可以在不使用下标的情况下，逐行逐个地输出数组内所有要素的值。
		 //    先将数组out等同于数组array2d。再将数组inner等同于数组out。
		 //实质上逐行逐个地输出输出array2d内所有要素的值。
		     
	    //Q5
//		int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
//		int max=array[0],min=array[0];
//		for(int i = 0; i < array.length; i++) {
//			 int x = array[i];
//			 if(x>max) max=x;
//			 if(x<min) min=x;
//			}
//		System.out.println("最⼤値:"+max);
//		System.out.println("最⼩値:"+min);
		
		//Q6
	//	int[] array = new int[4];
	//	int sum = 0;
	//	for(int i=0; i < array.length; i++) {
	//		sum += array[i];
	//	}
	 //     System.out.println("总和为： " + sum);
		
		    // System.out.println(String.valueOf("A");
			//System.out.println(String.valueOf(1.0F));
			//System.out.println(1.0F +"");
		
        //Q7
	//    int[][]array1=new int[][] {{1,2},{3,4}};
	//    int[][]array2=new int[][] {{1,2},{3,4}};
	//    int[][]sum=new int [2][2];
	//    int[][]mul=new int [2][2];
	//    for(int i=0;i<2;i++) {
	//    for(int j=0;j<2;j++) {
	//    sum[i][j]=array1[i][j]+array2[i][j];
	//	  mul[i][j]=array1[i][j]*array2[i][j];
	//	  System.out.println("sum"+sum[i][j]);
	//	  System.out.println("mul"+mul[i][j]);
		
    //输出结果为
	//	sum2
	//	mul1
	//	sum4
	//	mul4
	//	sum6
	//	mul9
	//	sum8
	//	mul16
    // 值是对的但应该达不到要求，需要讲解。
	    int[][]array1=new int[][] {{1,2}};
	    int[][]array2=new int[][] {{1,2}};
	    int[][]sum=new int [1][2];
	    int[][]mul=new int [1][2];
	    for(int i=0;i<1;i++) {
	    for(int j=0;j<2;j++) {
	    sum[i][j]=array1[i][j]+array2[i][j];
		mul[i][j]=array1[i][j]*array2[i][j];
		System.out.printf(sum[i][j]+"");
		System.out.printf(mul[i][j]+"");
	//另外做了一个只有一个要素的版本。
	//println输出结果为
	//	sum2
	//	mul1
	//	sum4
	//	mul4	
	//printf输出结果为 sum2mul1sum4mul4
	//只有一个要素是否可以称为“二次元配列”？
	}
}
}
}