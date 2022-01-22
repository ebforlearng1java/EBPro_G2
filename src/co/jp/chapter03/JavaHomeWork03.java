package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {

		// 问题一解答：

		int a = 56;
		System.out.println("成績ランキング判断。入力値=" + a);
		// 以下默认输入的a的范围符合条件，即为小于等于100的非负整数
		if (a >= 90) {
			System.out.println("A");
		} else if (a >= 80) {
			System.out.println("B");
		} else if (a >= 70) {
			System.out.println("C");
		} else if (a >= 60) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}

		System.out.println(); // 问题一和问题二的输出结果中间的空行

		// 问题二解答：

		// 硬币组合的可能的结果有几千种, 此处仅计算使硬币枚数最少的最优解
		// 题干信息中忘了提及五十円硬币, 下列方法中把五十円硬币也一并纳入

		int money = 3340;
		int coin1 = 0, coin10 = 0, coin100 = 0;
		int coin5 = 0, coin50 = 0, coin500 = 0;

		while (money >= 500) {
			coin500++;
			money -= 500;
		}
		while (money >= 100) {
			coin100++;
			money -= 100;
		}
		while (money >= 50) {
			coin50++;
			money -= 50;
		}
		while (money >= 10) {
			coin10++;
			money -= 10;
		}
		while (money >= 5) {
			coin5++;
			money -= 5;
		}
		while (money >= 1) {
			coin1++;
			money -= 1;
		}
		
		System.out.println("500円枚数：" + coin500);
		System.out.println("100円枚数：" + coin100);
		System.out.println("50円枚数：" + coin50);
		System.out.println("10円枚数：" + coin10);
		System.out.println("5円枚数：" + coin5);
		System.out.println("1円枚数：" + coin1);
		System.out.println("总枚数：" + (coin500 + coin100 + coin50 + coin10 + coin5 + coin1));
	}

}
