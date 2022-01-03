package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int tamago = 5;
		int tomato = 3;

		int tamago_buy = 0;
		int tomato_buy = 0;//10

		if (tamago >= 1) {
			if ((tomato <= 10 && tomato > 0) || tomato == 13 ) {
				tomato_buy = tomato;
				tamago_buy = 1;
			}
		}
		
		if (tamago >= 1) {
			
		}



		System.out.println("買ったスイカ" + tamago_buy);
		System.out.println("買ったトマト" + tomato_buy);

	}

}
