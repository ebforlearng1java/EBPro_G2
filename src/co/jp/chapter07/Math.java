package co.jp.chapter07;

public class Math {
	public static void main(int[]input ) {
		
			
		int min = Min.min(input);
		int max = Max.max(input);
		int avg = Avg.avg(input);
		
		System.out.println("��С���ϣ�"+ min);
		System.out.println("��󂎤ϣ�"+ max);
		System.out.println("ƽ�����ϣ�"+ avg);
		

}
	}