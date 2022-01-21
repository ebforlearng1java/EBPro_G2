package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//質問１︓成績ランキング判断を作成する「90以上︓A, 80-90︓B, 70-80︓C, 60-70︓
//		 D, 60以下︓E」
		
		
		int a = 56;
		if(a >= 90) {
		 System.out.println("A");
		} else if(a >= 80 && a < 90) {
		 System.out.println("B");
		} else if(a >= 70 && a < 80) {
		 System.out.println("C");
		} else if(a >= 60 && a < 70) {
		 System.out.println("D");
		} else {
		 System.out.println("E");
		}
		
		
//質問２︓⽇本のコインを１円、５円、１０円、１００円、５００円があります。３３４０
//		 円のコイン数をもとめください。	(循環：2929326回目；最小枚数：500円:6张,100円:3张,10円:4张,5円:0张,1円:0张)
		
		
		//int total = 3340;    
		//面额   1   5  10 100 500
//		        x   y   z   w   v
		//数量   a   b   c   d   e

		int x = 1;
		int y = 5;
		int z = 10;
		int w = 100;
		int v = 500;
		int i = 0; // 组合循环次数
		  
	  
		
for (int e = 0;e <= 6;e++) {
  for (int d = 0;d <= 33;d++) {
    for (int c = 0;c <= 334;c++) {
      for (int b = 0;b <= 668;b++) {
    	  for (int a = 0;a <= 3340;a++) {
            if ( a * x + y * b + z * c + w * d + v * e == 3340) {
        	i++;
            System.out.println(" " + (i+1) + "回目 500円:" + e + "张,100円:" + d + "张,10円:" + c + "张,5円:" + b + "张,1円:" + a + "张");	
            }
          }
      }
    }
  }
}


		
	}

}
