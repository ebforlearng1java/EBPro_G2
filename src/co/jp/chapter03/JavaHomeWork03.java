package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 
		
//		質問１︓成績ランキング判断を作成する「90以上︓A, 80-90︓B, 70-80︓C, 60-70︓D, 60以下︓E」
//		回答：题目中分数的交接处有重合，答案中稍微修改了一下
//		
		int a =56;
		System.out.println("成績ランキング判断。入力値=" + a);
		if(a>=90) {
			System.out.println("A");
		}else if(a>=80) {
			System.out.println("B");
		}else if(a>=70) {
			System.out.println("C");
		}else if(a>=60) {
			System.out.println("D");
		}else  {
			System.out.println("E");
		}
		
//		質問２︓⽇本のコインを１円、５円、１０円、１００円、５００円があります。３３４０円のコイン数をもとめください。
		int money=3340;
		for(int i=0;i<=money/500;i++) {
			int d1=money-500*i;
			for(int j=0;j<=d1/100;j++) {
				int d2 = d1-100*j;
				for(int k=0;k<=d2/10;k++) {
					int d3 =d2-10*k;
					for(int l=0;l<=d3/5;l++) {
						int m = d3-5*l;
						System.out.println("500円："+i+"  100円："+j+"  10円："+k+"  5円："+l+"  1円："+m);
					}
						
				}
				
			}
		}
	}

}
