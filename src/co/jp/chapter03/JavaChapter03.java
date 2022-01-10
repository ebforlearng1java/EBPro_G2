package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int suika_buy = 1;
		int tomato_buy = 13;
		
		int tomato = 11;
		
		if (tomato < 10 && tomato > 0 || tomato == 13) {
			tomato_buy = tomato;
			System.out.println("トマトあった！！！");
		} ;
		
		
		System.out.println("買ったスイカ" + suika_buy);
		System.out.println("買ったトマト" + tomato_buy);
	}

}
