package co.jp.chapter07;

public class Math {
	public int max2;
	public int min2;
	public int ave2;
	private int sum2;
	
	public array() {
		max2 = 0;
		min2 = 0;
		sum2 = 0;
		ave2 = 0;
	}
	
	public int max2(int[] input) {
	 	max2 = input[0];
		for  (int i=1; i < input.length; i++) {
			if (max2 < input[i]) {
				max2 = input[i];
			}
		}
		return max2;
	}
	
	public int min2(int[] input) {
		int min2 = input[0];
		for  (int i=1; i < input.length; i++) {
			if (min2 > input[i]) {
				min2 = input[i];
			}
		}
		return min2;
	}
	
	public int ave2(int[] input) {
		int sum2 = 0;
		for (int i=0; i < input.length; i++) {
			sum2 += input[i];
		int ave2 = sum2/input.length;
		}
		return ave2;
	}
}