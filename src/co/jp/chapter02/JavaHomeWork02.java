package co.jp.chapter02;

public class JavaHomeWork02 {

	public static void main(String[] args) {
		/*質問１︓ System.out.println(“this is line1\tthis line2“); は何⾏出⼒しますか︖
		 * 1. １⾏
		 * 2. ２⾏
		 */
		
		System.out.println("this is line1\tthis line2");
		System.out.println("1行出力します。これはtabです。");
		
		/*質問２︓Stringを⽐較⽅法は︖
		 * 1. ==
		 * 2. equals
		 */
		
		String str1 = "abc";
		String str2 = "123";
		
		if(str1 == str2) {
			System.out.println("abcと123は同等です。");
		}else {
			System.out.println("==は比較方法です");
		}
		
		/*質問３︓Float値⇒String⽂字列変更する場合、どうなメソッドを利⽤しますか
		 * 1. String.valueOf(“1.0F“)
		 * 2. 1.0F + ““
		 */
		
		String str3 = String.valueOf(1.0F);  //括号里加不加双引号
		System.out.println(str3);
		
		/*質問４︓以下式の値を記載してください。
		 * 1. 1.0 + 2.0
		 * 2. 1.0 + “2.0“
		 */
		
		System.out.println("1.0+2.0この+は算数演算子です。結果：" + (1.0+2.0));
		System.out.println("1.0+“2.0”この結果：" + (1.0 + "2.0"));
		
		/*質問５︓以下ステートメントの出⼒を記載してください。
		 * public static void main(String[] args) {
		 *		int a = 10;
		 *		System.out.println("a");
		 *}
		 */
		
		int a = 10;
		System.out.println("a" + "このaは文字列です。整数型変数aではありません。");


	}

}
