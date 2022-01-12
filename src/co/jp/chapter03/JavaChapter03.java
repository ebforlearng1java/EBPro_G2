package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

/*		int suika_buy = 1;
		int tomato_buy = 13;
		
		int tomato = 11;
		
		if (tomato < 10 && tomato > 0 || tomato == 13) {
			tomato_buy = tomato;
			System.out.println("トマトあった！！！");
		} ;
		
		
		System.out.println("買ったスイカ" + suika_buy);
		System.out.println("買ったトマト" + tomato_buy);
*/
		//鸡兔同笼的问题
		//所有的脚
		int total = 100;
		// 鸡
		int x = 0;
		// 鸡脚
		int n = 2;
		// 兔
		int y = 0;
		// 兔脚
		int m = 4;
		
		
//		for (int i = 0; i < total; i ++) {
//			System.out.println(i);
//			x = i;
//			y = (total - n * x ) / m;
			
//			if (y % 1 >0) {
//				System.out.println(y % 1);
//				continue;
				
			
//					System.out.println(" " + (i+1) + "回目 → 鸡； " + x + "只 ---- 兔:" + y + "只");
//					System.out.println();
					
//					if (y <= 0) {
//						break;
		
		// nx + my = 100 → 2x + 4y = 100
		
		// 1 所有的鸡把脚抬起来了
//		if(x == 0) {
//			y = (total - n * x) / m;
			
//			System.out.println("兔: " + y + "只");
		

		// 2 所有的兔子把脚抬起来了
//		if(y == 0) {
//			x = (total - m * y) / n;
//			System.out.println("鸡: " + x + "只");
		
	    int i = 0;
		for (;;) {
			i = i + 2;
			System.out.println(i);
			if(i > 100) {
				break;
}
			}
}
}