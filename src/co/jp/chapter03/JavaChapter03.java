package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		//package co.jp.chapter03;

		//public class JavaChapter03 {

			//public static void main(String[] args) {
				// TODO 自動生成されたメソッド・スタブ
				//int suika_buy = 1;
				//int tomato_buy = 0;

				//int tomato = 1;

			//	if (tomato >= 1) {
				//	tomato_buy = 2;
				//}

				//System.out.println("買ったスイカ" + suika_buy);
				//System.out.println("買ったトマト" + tomato_buy);//媳妇说，买一个西瓜，看到西红柿了买两个。 有歧义 引申出客户要求
				//暧昧，转换成代码后可能会与需求不符，所以需要确认1.对象 2.运算单位 3.够不够
				
		// TODO 鑷嫊鐢熸垚銇曘倢銇熴儭銈姐儍銉夈兓銈广偪銉�
		// 所有的脚
				int total = 100;
				// 鸡
				int x = 0;
				// 鸡脚
				int n = 2;
				// 兔
				int y = 0;
				// 兔脚
				int m = 4;
				// nx + my = 100 ⇒ 2x + 4y = 100
				// 1  所有的鸡都把脚抬起来了
				if (x == 0) {
					y = (total - n * x) / m ;
				}
				// 2 所有的兔子都把脚抬起来了
				if (y == 0) {
					x = (total - m * y) / n;
				}
				System.out.println("鸡: " + x + "只 ");
				System.out.println("兔: " + y + "只 ");
	}

}
