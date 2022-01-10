package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//		int tamago = 5;
		//		int tomato = 3;
		//
		//		int tamago_buy = 0;
		//		int tomato_buy = 0;//10
		//
		//		if (tamago >= 1) {
		//			if ((tomato <= 10 && tomato > 0) || tomato == 13 ) {
		//				tomato_buy = tomato;
		//				tamago_buy = 1;
		//			}
		//		}
		//
		//		if (tamago >= 1) {
		//
		//		}
		//
		//
		//
		//		System.out.println("買ったスイカ" + tamago_buy);
		//		System.out.println("買ったトマト" + tomato_buy);

		// 鸡兔同笼的问题   100  2 4   // 潜在不良

		//		// nx + my = 100 ⇒ 2x + 4y = 100
		//		// 1  所有的鸡都把脚抬起来了
		//		if (x == 0) {
		//			y = (total - n * x) / m;
		//			System.out.println("兔: " + y + "只 ");
		//			System.out.println("只有兔子");
		//		} else {
		//			//
		//			System.out.println("有鸡也有兔子");
		//		}
		//
		//
		//		// 2 所有的兔子都把脚抬起来了
		//		if (y == 0) {
		//			x = (total - m * y) / n;
		//			System.out.println("鸡: " + x + "只 ");
		//			System.out.println("只有鸡");
		//		} else {
		//			System.out.println("有鸡也有兔子");
		//		}
		//

		// nx + my = 100 ⇒ 2x + 4y = 100
		//		// 1  所有的鸡都把脚抬起来了
		//		if (x == 0 && y != 0) {
		//			y = (total - n * x) / m;
		//			System.out.println("兔: " + y + "只 ");
		//		}
		//
		//		// 2 所有的兔子都把脚抬起来了
		//		if (y == 0 && x != 0) {
		//			x = (total - m * y) / n;
		//			System.out.println("鸡: " + x + "只 ");
		//
		//		}

		// 所有的脚
		int total = 8;
		// 鸡脚
		float n = (float) 2.0;//50
		// 兔脚
		float m = (float) 4.0;//25

		// 鸡
		int x = 0;
		// 兔
		float y = 0;

		// loop

		for (int i = 0; i < total; i++) {
			//			System.out.println(i);
			x = i;
			y = (total - n * x) / m;
			if (y % 1 > 0) {
//				System.out.println(y % 1);
				continue;
			}
			System.out.println("   " + (i + 1) + "回目 ⇒ 鸡: " + x + "只 ---- 兔: " + y + "只 ");
			if (y <= 0) {
				break;
			}
		}

		//
		//		// 1  所有的鸡都把脚抬起来了
		//		if (x == 0) {
		//			y = (total - n * x) / m;
		//			System.out.println("只有兔子");
		//		}
		//		// 2 所有的兔子都把脚抬起来了
		//		else if (y == 0) {
		//			x = (total - m * y) / n;
		//			System.out.println("只有鸡");
		//			// 3
		//		} else {
		//			System.out.println("有鸡也有兔子");
		//
		//			if (x == 1) {
		//				y = (total - n * x) / m;
		//			} else if (x == 2) {
		//				y = (total - n * x) / m;
		//			}
		//		}
		//
		//		System.out.println("鸡: " + x + "只 ");
		//		System.out.println("兔: " + y + "只 ");

	}

}
