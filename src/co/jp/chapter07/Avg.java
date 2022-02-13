package co.jp.chapter07;

public class Avg {

public static int avg(int[] input) {
		
	
		int length = input.length;
		int sum = 0;
		for(int i=1; i<input.length;i++) {
			sum = sum+1;
			}
		int avg = sum/length;
		return avg;
	}
}
