package co.jp.chapter01;

import java.util.Scanner;

public class JavaHomeWork01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		// dummy commit
		
		
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
		
		
	}

}
