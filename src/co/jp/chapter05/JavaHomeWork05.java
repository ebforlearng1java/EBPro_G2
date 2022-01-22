package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// 質問１︓1から100までの偶数の和を求める(for + if)。
		
		int sumQ1 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				sumQ1 += i;
		}
		System.out.println("【質問1】\n" + sumQ1);

		// 質問２︓5の階乗を求める(for)。
		
		int mulQ2=1;
		for(int i=5;i>=1;i--) {
			mulQ2*=i;
		}
		System.out.println("【質問2】\n" + mulQ2);
		
		// 質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める。
		
		int arrayQ3[] = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		int maxQ3 = arrayQ3[0];
		int minQ3 = arrayQ3[0];
		int sumQ3 = 0;
		double averageQ3;

		for (int i : arrayQ3) {
			maxQ3 = maxQ3 > i ? maxQ3 : i;
			minQ3 = minQ3 < i ? minQ3 : i;
			sumQ3 += i;
		}
		averageQ3 = Double.valueOf(sumQ3) / arrayQ3.length;

		System.out.println("【質問3】");
		System.out.println("最大值：" + maxQ3);
		System.out.println("最小值：" + minQ3);
		System.out.println("和：" + sumQ3);
		System.out.println("平均值：" + averageQ3);

		// 質問４︓質問３の配列に重複ある要素を探す（要素の表示次数集計必要なし）。

		System.out.println("【質問4】");
		// 此处直接用第三问中的数组，不再构造新数组。
		// int arrayQ3[] = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		for (int i = 0; i < arrayQ3.length; i++) { // 下标i的循环，array[i]作为第一个对比数
			for (int j = i + 1; j < arrayQ3.length; j++) { // i+1的基础上下标j的循环，array[j]作为第二个对比数
				if (arrayQ3[i] == arrayQ3[j]) {
					System.out.println("重复要素：" + arrayQ3[j]); //对比判断，值相同则输出。
				}
			}
		}
		
		// 質問５︓質問３の配列に値「７」のインデックスを求む。
		
		System.out.println("【質問5】");
		// 此处直接用第三问中的数组，不再构造新数组。
		// int arrayQ3[] = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		for (int index = 0; index < arrayQ3.length; index++) { 
			if(arrayQ3[index]==7) {
				System.out.println(index);
			}
		}
		
		// 質問６︓任意行列（２次元配列）の積を求める。
		
		// 此处以构建一个3x3的二维数组为例。实际代码可替换为输入的任意二维数组
		int[][] array2D = new int[][] { { -1, 2, 1 }, { 3, 2, 3 }, { -1, -3, -4 }};
		// 主要思路为二重foreach循环并逐个计算乘积
		int mul = 1;
		for (int[] outer : array2D) {
			for (int value : outer) {
				mul *= value;
			}
		}
		System.out.println("【質問6】\n" + mul);
				
		// 質問７︓配列を昇順でソートする（java.util等メソッド利用禁止）。

		int arrayQ7[] = new int[] { 3, 0, 9, 7, 9, 11, 1, -5 };
		System.out.println("【質問7】");
		// 此处以构建一个具体int数组为例。实际代码可替换为输入的任意int数组
		for (int i = 0; i < arrayQ7.length; i++) { // 下标i的循环，第一个对比值
			for (int j = i + 1; j < arrayQ7.length; j++) { // i+1基础上下标j的循环，第二个对比值
				if (arrayQ7[i] > arrayQ7[j]) { // 对比判断，只要后面的值小于前面的值，便交换两个值
					int x = arrayQ7[i];
					arrayQ7[i] = arrayQ7[j];
					arrayQ7[j] = x;
				}
			}
			// 每次第二重的for循环结束，就能把当前剩余未排序数组值中的最小值移动到相对最左位
			System.out.println(arrayQ7[i]); // 为了便于确认，顺便输出当前的值
		}

		// 質問８︓LV10のパスカルの三角形を出力してください。
		
		System.out.println("【質問8】");
		int[][] triangle = new int[10][10]; // 构建10x10二维数组作为构建三角所用
		for (int i = 0; i < 10; i++) { // 行数循环
			for (int j = 0; j <= i; j++) { // 每行的列数循环
				if (j == 0 || j == i) {
					triangle[i][j] = 1; // 三角边缘数值为1
				} else {
					triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j]; // 三角中间数值为上行两数之和
				}
				System.out.print(triangle[i][j] + " \t"); // 输出各个数值，不换行
			}
			System.out.println(); // 换行
		}
	}

}
