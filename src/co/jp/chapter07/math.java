package co.jp.chapter07;

public class math {
	
		public static int max(int[] input) {
			
			int max = input[0];
			
			for(int i=0; i<input.length;i++) {
				if(max < input[i]) {
					max = input[i];
				}
			}
			return max;
		}
		
		public static int min(int[] input) {
			
			int min = input[0];
			
			for(int i=0; i<input.length;i++) {
				if(min > input[i]) {
					min = input[i];
				}
			}
			return min;
		}
		public static double avg(int[] input) {
			
			int sum = 0;
			
			for(int i=0; i<input.length;i++) {
				 
				sum += input[i];
				}
			
			return sum/input.length;
		}
		
		public static void main(String[] args) {
			int array[] = {1,2,3,4};
			int max = max(array);
			int min = min(array);
			double avg = avg(array);
			System.out.println("max is " + max);
			System.out.println("minimum is " + min);
			System.out.println("average is " + avg);
			
		}
	}	
	

