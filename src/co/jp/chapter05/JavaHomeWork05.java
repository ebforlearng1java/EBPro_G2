package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		設問１︓1から100までの偶数の和を求める(for + if)。
//		答え：
		int sum = 0;
		for(int i =1; i<=100; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
//		設問２︓5の階乗を求める(for)。
//		答え：
		int mul = 1;
		for(int i=1; i<=5; i++) {
			mul = mul * i;
		}
		System .out.println(mul);
				
//		質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
//		答え：
		int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		for (int i = 0; i < array.length; i++) {
			for(int j = 1; j < array.length-1-i;j++ ) {
				if(array[i] < array[j]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;						
				}
			}
		}
		System.out.printf("配列の最大値は：%d\n", array[0]);
		System.out.printf("配列の最小値は：%d\n", array[array.length-1]);
		
//		質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
//		答え：
		
		
//		質問５︓質問３の配列に値「７」のインデックスを求む。
//		答え：
		
//		質問６︓任意⾏列（２次元配列）の積を求める。
//		答え：
		
//		質問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
//		答え：
		
//		質問８︓LV10のパスカルの三⾓形を出⼒してください。
//		答え：
		
		
	}
}
