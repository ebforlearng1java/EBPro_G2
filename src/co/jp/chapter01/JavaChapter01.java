package co.jp.chapter01;

import java.util.Scanner;

public class JavaChapter01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//System.out.println("Hello world!");      //文字列
		//System.out.println(1+1444443);    //整数
		
		
		
		// 質問１︓以下変数nの値は︖ 
		//1 int i = 10;
		//2 int n = i%5;
		
		int i = 10;
		int n = i%5;
		System.out.println(i);
		System.out.println(n);
		
		
		
		// 質問２︓ 右の式を解釈してください: a = a > 10 ? 11 : 0;
		
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter an integer: ");  
		int a = sc.nextInt();
		 
		if (a > 10) {
			System.out.println("a = 11");
			    }
			    else {
			        System.out.println("a = 0");
			    }
		
		
		
		// 質問３︓変数値を⽐較する演算⼦は = or == ?
		
		// 「==」 です。
		
		
		// 質問４︓ブリアン（ boolean ）変数に設定可能の値は「?」「?」。
		// 「true]「false」です。
		
		// 質問１︓ System.out.println(“this is line1\tthis line2“); は何⾏出⼒しますか︖
		
		// 1行です。
		
		// 質問２︓Stringを⽐較⽅法は︖
		
		// Stringの文字列を比較するため、「equals]を使います。
		
		// 質問３︓Float値⇒String⽂字列変更する場合、どうなメソッドを利⽤しますか
		// 「String.valueOf(“1.0F“)」です。
		
		// 質問４︓以下式の値を記載してください。
		// 1. 1.0 + 2.0
		// 2. 1.0 + “2.0“
		// 1. 3.0です。
		// 2.  1.02.0です。
		
		// 質問５︓以下ステートメントの出⼒を記載してください。
		//int a = 10;
		//System.out.println("a");
		
		// 出力は「a」です。

		
	
		

	}

}
