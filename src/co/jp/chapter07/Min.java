package co.jp.chapter07;

public class Min {
public static int min(int[] input) {
		
		int min = input[0];
		for(int i=1; i<input.length;i++) {
			if(input[i]<min) {
				min=input[i];
			}
		}
		return min;
	}
}
