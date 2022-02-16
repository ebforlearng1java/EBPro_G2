package co.jp.chapter03;

public class JavaChapter03 {
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタ�?
		
		//int suika_buy=1;
		//int tomato_buy=0;
		
		//int tomato=0;
		
		//if(tomato>=1) {
		//tomato_buy=2;
		//System.out.println("トマトあった！！�?");
		//}  else {
		//	tomato_buy = tomato;
					
		//}
		
		
		//System.out.println("買ったスイカ"+suika_buy);
		//System.out.println("買ったトマト"+tomato_buy);

		//}

		//}


        //鸡兔同笼的问�?   100  2 4
        // �?
        int x = 0;
        // 鸡脚
       int n = 2;
         // �?
          int y = 0;
      // 兔脚
          int m = 4;

           // nx + my = 100 �? 2x + 4y = 100

               // 1  �?有的鸡都把脚抬起来了
             if (x == 0) {
           y = (100 - 2 * x) / 4 ;
      }
              // 2 �?有的兔子都把脚抬起来�?
                 if(y==0) {
                	 x=(100-4*y)/2;
                 }
       


  System.out.println("�?: " + x + "�? ");
  System.out.println("�?: " + y + "�? ");
  
	}
}
