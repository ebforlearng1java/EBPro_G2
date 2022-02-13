package co.jp.chapter07;

public class Max {
	public static int max(int[] input) {
		
		int max = input[0];
		for(int i=1; i<input.length;i++) {
			if(input[i]>max) {
				max=input[i];
			}
		}
		return max;
	}
	
}
