package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//
//質問１︓成績ランキング判断を作成する「90以上:A, 80-90:B, 70-80:C, 60-70:D, 60以下:E」
		
/*		int a = 56;
		System.out.println("成績ランキング判断。入力値=" + a);
		// 以下コードを完成してください。
		 * 
	回答:	if(a >= 90) {
		 	System.out.println("A"); }
			else if(a>=80&&a<=90) {
		 	System.out.println("B"); }
			else if(a>=70&&a<=80) {
		 	System.out.println("C"); }
			else if(a>=60&&a<=70) {
		 	System.out.println("D"); }
			else {
		 	System.out.println("E"); }
*/
		
//質問２:⽇本のコインを１円、５円、１０円、１００円、５００円があります。３３４０ 円のコイン数をもとめください。 
		
		//１円玉の数a、５円玉の数b、１０円玉の数c、１００円玉の数d、５００円玉の数e
		
		//方法(1)
/*	{	
  		
		int i = 3340;
		int a,b,c,d,e;
		
		e=i/500;
		d=i%500/100;
		c=i%500%100/10;
		b=c%10/5;
		a=b%5/1;
		
		int sum = a+b+c+d+e;
				
			System.out.print("1円玉の数は" + a +"枚,");
			System.out.print("5円玉の数は" + b +"枚,");
			System.out.print("1０円玉の数は" + c +"枚,");
			System.out.print("1００円玉の数は" + d +"枚,");
			System.out.println("5００円玉の数は" + e +"枚。");
			System.out.println("３３４０円のコイン数の最少配分は" + sum +"枚");
			
		}
*/
		//方法(2)
		 
/*	{
			int i = 3340;
		 
		 	int x = 500;
			int e = 0;
			do {
				e++;
				x=x+500;
		} while (x<=i);
         System.out.println("5００円玉の数は:"+ e + "枚");
      
         	int y = 100;
         	int d = 0;
         	do {
         		d++;
         		y=y+100;
 		} while (y<=i-500*e);
         System.out.println("100円玉の数は:"+ d + "枚");
         
      		int z = 10;
      		int c = 0;
      		do {
      			c++;
      			z=z+10;
  		} while (z<=i-500*e-100*d);
           System.out.println("10円玉の数は:"+ c + "枚");
         
           	int sum = c+d+e;
           	System.out.println("３３４０円のコイン数の最少配分は" + sum + "枚");
		 
		 
	}
*/		
		
		

	}	
}

