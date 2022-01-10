package co.jp.chapter01;

public class JavaHomeWork01 {

	public static void main(String[] args) {
		
		/*質問１︓以下変数nの値は︖
		 * 1 int i = 10;
		 * 2 int n = i%5;
		 */
		int i = 10;
		int n = i % 5;
		System.out.println("質問1変数nの値：" + n);
		
		
		//質問２︓ 右の式を解釈してください: a = a > 10 ? 11 : 0;
		int a = 10;
		
		if(a > 10) {
			a = 11;
		}else {
			a = 0;
		}
		System.out.println("質問2変数aの値：" + a);
		
		
		//質問３︓変数値を比較する演算⼦は = or == ?
		int x = 1;
		
		if(x == 1) {
			x = 10;
		}
		System.out.println("質問3変数xの値：" + x + "変数値を比較する演算子は ==");
		
		
		//質問４︓ブリアン（ boolean ）変数に設定可能の値は「?」「?」。
		boolean t = true;
		boolean f = false;
		System.out.println("質問4ブリアン（ boolean ）変数に設定可能の値は：" + t + "と" + f);
	}

}
