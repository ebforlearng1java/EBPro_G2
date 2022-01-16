package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
//	   int total = 100;
//	   // 鸡
//	   int x = 0;
//	   // 鸡脚
//	   int n = 2;
//	   // 兔
//	   int y = 0;
//	   // 兔脚
//	   int m = 4;
//
//	   // nx + my = 100 ⇒ 2x + 4y = 100
// 
//	   // 1  所有的鸡都把脚抬起来了
//	   if (x == 0) {
//	   y = (total - n * x) / m ;
//       }
//	   System.out.println("兔: " + y + "只 ");
//	   	   
//  	   // 2 所有的兔子都把脚抬起来了
//	   if (y == 0) {
//	   x = (total - m * y) / n;
//	   }
//	   System.out.println("鸡: " + x + "只 ");
	   int CSum = 0, Cplus = 0;
	   int Sum = 3340;
	   
	   if (Sum % 500 != 0){
		   do{
			   Cplus += 1;
		   }while(Cplus * 500 < Sum);
		   Sum = Sum % 500;
		   CSum += Cplus-1;
		   System.out.printf("500円の枚数は%d枚です。\n", Cplus-1);
	   }
	   else {
		   Cplus = Sum / 500;
		   CSum += Cplus;
		   Sum = 0;
		   System.out.printf("500円の枚数は%d枚です。\n", Cplus);
	   }
	   Cplus = 0;
	   
	   
	   if ((Sum != 0) && (Sum % 100 != 0)){
		   do {
			   Cplus++;
		   }while(Cplus * 100 < Sum);
		   Sum = Sum % 100;
		   CSum += Cplus-1;
		   System.out.printf("100円の枚数は%d枚です。\n", Cplus-1);
	   }
	   else {
		   Cplus = Sum / 100;
		   CSum += Cplus;
		   Sum = 0;
		   System.out.printf("100円の枚数は%d枚です。\n", Cplus);
	   }
	   Cplus = 0;
	   
	   
	   if ((Sum != 0) && (Sum % 10 != 0)){
		   do {
			   Cplus++;
		   }while(Cplus * 10 < Sum);
		   Sum = Sum % 10;
		   CSum += Cplus-1;
		   System.out.printf("10円の枚数は%d枚です。\n", Cplus-1);
	   }
	   else {
		   Cplus = Sum / 10;
		   CSum += Cplus;
		   Sum = 0;
		   System.out.printf("10円の枚数は%d枚です。\n", Cplus);
	   }
	   Cplus = 0;
	   
	   
	   if ((Sum != 0) && (Sum % 5 != 0)){
		   Sum = Sum % 5;
		   do {
			   Cplus++;
		   }while(Cplus * 5 < Sum);
		   CSum += Cplus-1;
		   System.out.printf("5円の枚数は%d枚です。\n", Cplus-1);
	   }
	   else {
		   Cplus = Sum / 5;
		   CSum += Cplus;
		   Sum = 0;
		   System.out.printf("5円の枚数は%d枚です。\n", Cplus);
	   }
	   Cplus = 0;
	   
	   
	   Cplus = Sum / 1;
	   CSum += Cplus;
	   System.out.printf("1円の枚数は%d枚です。\n", Cplus);
	   Cplus = 0;
	   
	   System.out.printf("３３４０円の一番少ないコイン数の組み合わせは%d枚です。", CSum);
	}

}
