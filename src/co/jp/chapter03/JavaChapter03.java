package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
   
    
    //int suika_buy = 1;
	//int tomato_buy = 0;

	//int tomato = 13;

	//if (tomato <= 10 && tomato >0 || tomato == 13) {
		//tomato_buy = tomato;
		
		//System.out.println("買ったスイカ" + suika_buy);
		//System.out.println("買ったトマト" + tomato_buy);	 
		//}
		
		
	 // 鸡兔同笼的问题   100  2 4 //潜在的bug　潜在不良
    // int total = 100;
	  // 鸡
	 // int x = 0;
	  // 鸡脚
	//  int n = 2;
	  // 兔
	 // int y = 0;
	  // 兔脚
	//  int m = 4;

	  // nx + my = 100 ⇒ 2x + 4y = 100

	  // 1  所有的鸡都把脚抬起来了
	 // if (x == 0) {
	  // y = (total - n * x) / 4 ;
	  // System.out.println("兔: " + y + "只 ");
	  // System.out.println("鸡: " + x + "只 ");
	 // }
	  
	  //y = 0;
	  // 2 所有的兔子都把脚抬起来了
	 // if (y == 0) {
	//	x = (total - m * y)  / 2;
	 // }
	  // System.out.println("兔: " + y + "只 ");
      // System.out.println("鸡: " + x + "只 ");
      
       
//       // loop
//	  int total = 100;
//	  // 鸡
//	  int x = 0;
//	  // 鸡脚
//	  int n = 2;
//	  // 兔
//	  int y = 0;
//	  // 兔脚
//	  int m = 4;
//	  
//	  for (int i = 0;i < 100;i++) {
//	    System.out.println(i);
//	    x = i;
//	    y = (total - n * x) / m ;
//	    System.out.println(" " + (i+1) + "回目 鸡:" + x + "只,兔子:" + y + "只");
//	    
//	    if (y % 1 > 0) {
//	    	System.out.println(y % 1);
//	    	continue; //返回for
//	    }
//	    
//	    if (y <= 0) {
//	    	break;//停止for
//	    	
//	    }
//	    
//	}
//	  
//	  //20220112
//	  
//	   for (int i = 0;i <=100;i++) {
//		   if (i % 2 == 0) {
//		    	System.out.println(i);   
//	       }
//	   }
//	
//	   //while
//	    int i = 0;
//		while (i<=100) {
//			if (i % 2 == 0) {
//			System.out.println(i); 
//		    }
//			i++;
//		}
//		
//		// do while
//		do {
//			
//		}	while (i < 100);
//		
}
}

