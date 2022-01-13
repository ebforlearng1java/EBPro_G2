package co.jp.chapter02;

public class JavaHomeWork02 {

	public static void main(String[] args) {

	//Q1
	System.out.println("this is line1\tthis line2");
	//1行出力します。
	//\t→Tab 改行は\nである。
	
	//Q2
	//Stringを比較（する）方法はequalsである。
	//==は関係演算子の１つで、全ての数値型をサポートしておりますが、Stringは数値型ではありません。
	
	//Q3
	//Float値⇒String⽂字列変更する場合、以下のようなメソッドを利用します。
	//String.valueOf("1.0F")
	
	//Q4
	System.out.println(1.0+2.0);
	//1.0+2.0=3.0
	System.out.println(1.0+"2.0");
	//1.0+"2.0"= 1.02.0
	
	//Q5
	int a =10;
	System.out.println("a");
	//このステートメントの出力はaである。
	
	}

}
