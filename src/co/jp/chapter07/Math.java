package co.jp.chapter07;

public class Math {
	public static void main(int[]input ) {
		
			
		int min = Min.min(input);
		int max = Max.max(input);
		int avg = Avg.avg(input);
		
		System.out.println("最小値は："+ min);
		System.out.println("最大値は："+ max);
		System.out.println("平均値は："+ avg);
		

}
	}