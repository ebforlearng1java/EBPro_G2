package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int suika_buy = 1;
		int tomato_buy = 0;

		int tomato = 13;

		if ((tomato<=10&&tomato>0)||(tomato==13)) {
		}else {
			tomato_buy = tomato;
		}

		System.out.println("買ったスイカ" + suika_buy);
		System.out.println("買ったトマト" + tomato_buy);

		// 鸡兔同笼的问题   100  2 4
		  int total;
		  // 鸡
		  int x = 0;
		  // 鸡脚
		  int n = 2;
		  // 兔
		  int y = 0;
		  // 兔脚
		  int m = 4;

		  // nx + my = 100 ⇒ 2x + 4y = 100

		  // 1  所有的鸡都把脚抬起来了
		  if (x == 0) {
		   y = (100 - 2 * x) / 4 ;
		  }
		  // 2 所有的兔子都把脚抬起来了
         if (y == 0) {
        	 x= (100-4*y) / 2;
         }


		  System.out.println("鸡: " + x + "只 ");
		  System.out.println("兔: " + y + "只 ");
//		int total = 100;
		   // 鸡
//		   int x = 0;
//		   // 鸡脚
//		   float y = 0;
//		   float n = (float) 2.0;
//		   float m = (float) 4.0;
		   // 兔
 //       for (int i= 0; i< total;i++) {
 //       	System.out.println(i);
 //           x=i;
 //       	y=(total-n*x)/m;
        	
 //       	if (y%1>0) {
//        		System.out.println(y%1);
 //       		continue;
 //       	}
 //       	System.out.println(""+(i+1)+ "回目→鸡:"+x+"只---- 兔"+y+"只");
 //       	System.out.println();
 //       	if (y<=0) {
 //       		break;
  //      	}
//0~100 所有的偶数
        	for (int i=0 ; i<=100; i++) {
        		System.out.println(i);
        		i=i+1;
        	}
        	int i=0;
        	for(;;) {
        		System.out.println(i);
        		i=i+2;
        		if (i>100) {
        		break;
        	}
	}
		   // nx + my = 100 ⇒ 2x + 4y = 100

		   // 1  所有的鸡都把脚抬起来了
		  
		   
		   // 兔脚
		   // 2 所有的兔子都把脚抬起来了
		   //else  if (y == 0) {
		    //x = (total - m * y) / n;

}
}
