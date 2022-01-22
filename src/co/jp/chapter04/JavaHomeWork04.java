package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// 問題１︓int[] array = new int[4]; 各要素の値を記載してください。
		// array[0]的值为0，array[1]的值为0，array[2]的值为0，array[3]的值为0。

		// 問題２︓int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		// array[0]的值为5，array[1]的值为6。

		// 問題３︓int[][] array = new int[2][3]; 各要素の値を記載してください。
		// array[0][0]的值为0，array[0][1]的值为0，array[0][2]的值为0。
		// array[1][0]的值为0，array[1][1]的值为0，array[1][2]的值为0。

		// 問題４︓以下２重Foreachを理解してください。

		int[][] array2d = new int[4][2];	// 新构造一个4行2列的二维数组
		for (int[] out : array2d) {			// 此处的foreach循环为对应二维数组第一个变量的循环，即行数，循环4次，每次循环的int[]out为二维数组对应行上的一维数组。
			for (int inner : out) {			// 此处的foreach循环为第二次的内部循环，即每行上的列数，每回循环2次，每次循环的int inner为对应行上的一维数组的各个值。
				System.out.println(inner);	// 经过二重foreach，逐行然后逐列地输出各个值
			}
		}
		
		// 問題５︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
		// 配列の最大値と最小桁値をSystem.out.println()。

		int[] array = new int[] { 1, 3, 5, 7, 100, 0, 1 };
		int max = array[0], min = array[0];
		for (int i : array) {
			max = max > i ? max : i;
			min = min < i ? min : i;
		}
		System.out.println("\n【问题5】\n" + "最大值：" + max + "\t最小值：" + min);

		// 問題６︓問題１の配列のSUMを求める。

		int[] arrayQ1 = new int[4];
		int sum = 0;
		for (int t : arrayQ1) {
			sum += t;
		}
		System.out.println("\n【问题6】\n" + "arrayQ1のSUM：" + sum);

		// 問題７︓行列（２次元配列）の和と積を計算してください。

		// 此处以构建一个4x3的二维数组为例。
		int[][] array_2D = new int[][] { { 2, 2, 1 }, { 3, 5, 3 }, { -1, -3, -4 }, { 5, 10, 2 } };
		// 主要思路为在类似問題４的二重foreach循环的基础上，搭配记录“和と積”数值的变量plus与mult。
		int plus = 0;
		int mult = 1;

		for (int[] outer : array_2D) {
			for (int value : outer) {
				plus += value;
				mult *= value;
			}
		}
		System.out.println("\n【问题7】\n" + "和为：" + plus + "\t积为：" + mult);
	}

}
