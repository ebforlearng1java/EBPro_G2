package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 鑷嫊鐢熸垚銇曘倢銇熴儭銈姐儍銉夈兓銈广偪銉�
		
		//質問１︓成績ランキング判断を作成する「90以上︓A, 80-90︓B, 70-80︓C, 60-70︓D, 60以下︓E」
		
		int a = 56;
		System.out.println("成績ランキング判断。入力値=" + a);
		// 以下コードを完成してください。
		if(a>=90) {
		 System.out.println("A");
		} else if(a>=80&&a<90) {
		 System.out.println("B");
		} else if(a>=70&&a<80) {
		 System.out.println("C");
		} else if(a>=60&&a<70) {
		 System.out.println("D");
		} else {
		 System.out.println("E");
		}
		
		
		//︓⽇本のコインを１円、５円、１０円、１００円、５００円があります。３３４０円のコイン数をもとめください。
		int money=3340;
		int c500=0,c100 = 0,c10 = 0,c5 = 0,c1 = 0;
		System.out.println("３３４０円のコイン数は：");
		while(money!=0) {
			if(money>=500) {
				c500=money/500;
				money=money%500;
				System.out.println("５００円"+c500+"枚");
			}else if(money<500&&money>=100) {
				c100=money/100;
				money = money%100;
				System.out.println("１００円"+c100+"枚");
			}else if(money<100&&money>=10) {
				c10=money/10;
				money = money%10;
				System.out.println("１０円"+c10+"枚");
			}else if(money<10&&money>=5) {
				c5=money/5;
				money = money%5;
				System.out.println("５円"+c5+"枚");
			}else {
				c1=money/1;
				money = money%1;
				System.out.println("１円"+c1+"枚");
			}
		}
		System.out.println("合計"+(c500+c100+c10+c5+c1)+"枚");
		
		
		

		
		
		
		
		
	}

}
