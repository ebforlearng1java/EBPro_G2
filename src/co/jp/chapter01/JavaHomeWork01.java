package co.jp.chapter01;

public class JavaHomeWork01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//Q1
		int i = 10;
		int n = i%5;
		System.out.println("Q1 answer "
				+ ": the value of n is "+n+"; " +"the value of i is "+ i);
		
		// 赋值10给i， 打印i的值即为10；。
		//i%5是i（赋值为10）与5取余，整除，所以n=0。
		
		//Q2
		int a = 10 +(int)(Math.random()*2);// 产生[10，12)的随机整数，即10，11。
		System.out.println("Q2 present a value is: "+a);
		if(a>10) {
			System.out.println("Q2 answer: "+10);
		}
		else {
			System.out.println("Q2 answer: "+0);
		}
		//条件a的值大于10时，输出10；条件a的值不满足a>10的时候,输出0。
		
		
		//Q3
		int b = 2;
		int d = 3;
		boolean g = b==d;
		System.out.println("Q3 answer: "+ (b==d));
		//“=” 是赋值符号， 将右边的变量赋值给左边的变量名。
		//“==”是关系符号， 返回值是true 或false。
		
		//Q4
		boolean e = false;
		boolean f = true;
		boolean h = e==f;
		boolean j = b!=d;
		System.out.println( h);
		System.out.println(j);
		//boolean设置的变量可以是true和false。


		// dummy commit
	}

}
