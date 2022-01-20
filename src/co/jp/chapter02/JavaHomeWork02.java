package co.jp.chapter02;

public class JavaHomeWork02 {

	public static void main(String[] args) {

//		質問1: System.out.println(“this is line1\tthis line2“); は何行出力しますか?
//		答案是 1行
		
//		質問2:Stringを比較方法は?
//		答案是 == 和 equals都可以
		
		String a="123";
		String b="123";
		String c="567";
		
//		if (a==b) {
//			System.out.println("a等于b");
//		}else {
//			System.out.println("a不等于b");
//		}
//		if (a==c) {
//			System.out.println("a等于c");
//		}else {
//			System.out.println("a不等于c");
//		}
		if (a.equals(b)) {
			System.out.println("a等于b");
		}else {
			System.out.println("a不等于b");
		}
		if (a.equals(c)) {
			System.out.println("a等于c");
		}else {
			System.out.println("a不等于c");
		}
		
//		質問3:Float値⇒String文字列変更する場合、どうなメソッドを利用しますか
//		答案是 1，2都可以
		
		float d=1.0F;

		String f=String.valueOf(d);
		
		f=d+"";
		
//		質問4:以下式の値を記載してください。
//		答案是 3.0和1.02.0
		
		String h=1.0+"2.0";
		System.out.println(h);
		
//		質問5:以下ステートメントの出力を記載してください。
//		答案是 a
	
		int p=10;
		System.out.println("p");
		
		
		
		
	}

}


