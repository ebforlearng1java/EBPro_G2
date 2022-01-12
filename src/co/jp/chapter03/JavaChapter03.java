package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 鑷嫊鐢熸垚銇曘倢銇熴儭銈姐儍銉夈兓銈广偪銉�

		
		// 所有的脚
		  int total = 100;
		  // 鸡
		  int x = 0;
		  // 鸡脚
		  int n = 2;
		  // 兔
		  int y = 0;
		  // 兔脚
		  int m = 4;

		  // nx + my = 100 ⇒ 2x + 4y = 100
		  
		  // 2 所有的兔子都把脚抬起来了
		  if (y == 0) {
		   x = (total - m * y) / n;
		  }

		  // 1  所有的鸡都把脚抬起来了
		  if (x == 0) {
		   y = (total - n * x) / m ;
		  }
		  
		  
		  //0~100偶数
		  for(int i=0;i<=100;i++) {
			  if(i%2==0) System.out.println(i);
		  }

		 



		  System.out.println("鸡: " + x + "只 ");
		  System.out.println("兔: " + y + "只 ");
	}

}
