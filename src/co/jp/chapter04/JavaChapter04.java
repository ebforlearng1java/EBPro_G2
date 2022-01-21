package co.jp.chapter04;

public class JavaChapter04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] array2d = new int[4][2];
		for (int[] out : array2d) {
//			 System.out.println(out);
			 for (int inner : out) {
				 System.out.println(inner);
			 } 
		}
//		
//		int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
////		System.out.println(array[0]);
//		int min = array[0];
//		int max = array[0];
//		for(int i=1; i < (array.length-1); i++){
//			System.out.println(array[i]);
//			min = array[0] < array[i] ? array[0] : array[i];
//			max = array[0] > array[i] ? array[0] : array[i];
//			System.out.println(max);
//			System.out.println(min);
//			array[0]<array[i] ? min = array[0] : min = array[i];
//			array[0]>array[i] ? max = array[0] : max = array[i];
//		}
		
//		int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
//		for(int i=0; i < (array.length-1); i++) {
//			for(int j=0; j < (array.length-1-i); j++){
//				if(array[j] < array[j+1]) {
//					int temp = array[j];
//					array[j] = array[j+1];
//					array[j+1] = temp;
//				}
//			}
//		}
//		System.out.printf("一番大きいのは%dです。\n", array[0]);
//		System.out.printf("一番小さいのは%dです。", array[array.length-1]);
		
//		int acc = 0;
//		int mul = 1;
//		int[][] array2d = new int[3][4];
//		for(int i=0; i < array2d.length; i++) {
//			for(int j=0; j < array2d[0].length; j++) {
//				acc += array2d[i][j];
//				mul = mul * array2d[i][j];
//			}
//		}
//		System.out.printf("この配列の和は%d\n", acc);
//		System.out.printf("この配列の和は%d\n", mul);
		
//        int[][] i = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        for (int[] j : i) {
//            for (int k : j) {
//                System.out.print(k);
//            }
////            System.out.println();
//        }

	}

}
