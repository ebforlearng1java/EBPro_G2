package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//Q1

//		int a = 56;
//		   System.out.println("成績ランキング判断。入力値=" + a);
		   // 以下コードを完成してください。
//		   if( a >= 90 ) {
//		   System.out.println("A"); 
//		   } 
//		   else if( a >= 80 ) {
//		   System.out.println("B"); 
//		   } 
//		   else if( a >= 70 ) {
//		   System.out.println("C"); 
//		   }
	//	   else if( a >= 60 ) {
//		   System.out.println("D"); 
//		   } 
//		   else {
//		   System.out.println("E");
//		   }
		   
//Q2
		//想像课上鸡兔同笼问题一样把所有情况列举出来，但是过于复杂不知道如何写，以下提案使用硬币数最少的方法。
		int total=3340;
		int c500=0,c100 = 0,c10 = 0,c5 = 0,c1 = 0;
		System.out.println("３３４０円のコイン数は：");
		while(total!=0) {
			if(total>=500) {
				c500=total/500;
				total=total%500;
				System.out.println("５００円"+c500+"枚");
			}else if(total<500&&total>=100) {
				c100=total/100;
				total = total%100;
				System.out.println("１００円"+c100+"枚");
			}else if(total<100&&total>=10) {
				c10=total/10;
				total = total%10;
				System.out.println("１０円"+c10+"枚");
			}else if(total<10&&total>=5) {
				c5=total/5;
				total = total%5;
				System.out.println("５円"+c5+"枚");
			}else {
				c1=total/1;
				total = total%1;
				System.out.println("１円"+c1+"枚");
			}
		}
		System.out.println("合計"+(c500+c100+c10+c5+c1)+"枚");
		
		
		

		
		
		
		
		
	}
}