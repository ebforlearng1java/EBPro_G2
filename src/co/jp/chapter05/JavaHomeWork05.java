package co.jp.chapter05;

public class JavaHomeWork05 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		設問１︓
		System.out.println("質問1︓1から100までの偶数の和を求める(for + if)。\n答え：");
		int sum1 = 0;
		for(int i =1; i<=100; i++) {
			if(i % 2 == 0) {
				sum1 += i;
			}
		}
		System.out.println(sum1);

//		設問２︓
		System.out.println("質問2︓5の階乗を求める(for)。\n答え：");
		int mul2 = 1;
		for(int i=1; i<=5; i++) {
			mul2 = mul2 * i;
		}
		System .out.println(mul2);
				
//		質問３︓
		System.out.println("質問3︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。\n答え：");
		int[] array3 = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		int max3 = array3[0];
		int min3 = array3[0];
		float sum3 = array3[0];
		for (int i = 1; i < array3.length; i++) {
			if(max3 < array3[i]) {
				max3 = array3[i];
			}
			if(min3 > array3[i]) {
				min3 = array3[i];
			}
			sum3 += array3[i];
		}
		float ave3 = sum3/array3.length;
		System.out.printf("配列の最大値は：%d\n", max3);
		System.out.printf("配列の最小値は：%d\n", min3);
		System.out.printf("配列の和は：%.2f\n", sum3);
		System.out.printf("配列の平均値は：%.2f\n", ave3);

		
		
//		質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
		System.out.println("質問4︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。\n答え：");
		int[] array4 = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		for (int i = 0; i < array4.length; i++) {
			for(int j = 1+i; j<=(array4.length-1-i); j++ ) {
				if(array4[i] == array4[j]){
					System.out.printf("重複ある要素は：%d\n", array4[j]);
				}
			}
		}
		
//		質問５︓
		System.out.println("質問5︓質問３の配列に値「７」のインデックスを求む。\n答え：");
		int[] array5 = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		for (int i = 0; i < array5.length; i++) {
			if(array5[i] == 7){
				System.out.printf("「7」のインデックスは：%d\n", i);
			}
		}
		
		
//		質問６︓
		System.out.println("質問6︓任意⾏列（２次元配列）の積を求める。\n答え：");
		int mul6 = 1;
		int[][] array2d6 = new int[3][4];
		for(int i=0; i < array2d6.length; i++) {
			for(int j=0; j < array2d6[0].length; j++) {
				mul6 = mul6 * array2d6[i][j];
			}
		}
		System.out.printf("この配列の和は%d\n", mul6);
		
//		質問７︓
		System.out.println("質問7︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。\n答え：");
		int[] array7 = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		for (int i = 0; i < array7.length; i++) {
			for(int j = i+1; j < array7.length-1; j++ ) {
				if(array7[i] < array7[j]){
					int temp = array7[i];
					array7[i] = array7[j];
					array7[j] = temp;
				}
			}
		}
		System.out.println("昇順配列は：");
		for (int i = 0; i < array7.length; i++) {
			if(i == array7.length-1) {
				System.out.printf("%d", array7[i]);
			}
			else {
				System.out.printf("%d, ", array7[i]);
			}
		}

		
//		質問８
		System.out.println("質問８︓LV10のパスカルの三⾓形を出⼒してください。\n答え：");
		int[][] array8 = new int[10][10];
		array8[0][0] = 1;
		for(int i=1; i<10; i++) {
			for(int j=0; j<=i; j++) {
				if(j == 0) {
					array8[i][j] = array8[i-1][j];
				}
				else {	
					array8[i][j] = array8[i-1][j-1] + array8[i-1][j];
				}
			}
		}
		System.out.println("LV10のパスカルの三角形:");
		for (int i = 0; i < array8[0].length; i++) {
			for (int j=0; j<=i+1; j++) {
				if(j == i+1) {
					System.out.printf("\n");
				}
				else {
					System.out.printf("%d ", array8[i][j]);
				}
			}
		}
		
	}
}
