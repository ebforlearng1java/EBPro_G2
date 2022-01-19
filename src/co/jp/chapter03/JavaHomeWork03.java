package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
	   // TODO 自動生成されたメソッド・スタブ
	   //質問１︓成績ランキング判断を作成する「90以上︓A, 80-90︓B, 70-80︓C, 60-70︓ D, 60以下︓E」
	   int a = 56;
	   System.out.println("成績ランキング判断。入力値=" + a);
	   // 以下コードを完成してください。
	   if( a >= 90 ) {
	   System.out.println("A"); 
	   } 
	   else if( a >= 80 ) {
	   System.out.println("B"); 
	   } 
	   else if( a >= 70 ) {
	   System.out.println("C"); 
	   }
	   else if( a >= 60 ) {
	   System.out.println("D"); 
	   } 
	   else {
	   System.out.println("E");
	   
	   //質問２︓⽇本のコインを１円、５円、１０円、１００円、５００円があります。３３４０円のコイン数をもとめください。
	   //答え：以下はコイン枚数が一番少ない提案です。
		//	   500円の枚数は6枚です。
		//	   100円の枚数は3枚です。
		//	   10円の枚数は4枚です。
		//	   5円の枚数は0枚です。
		//	   1円の枚数は0枚です。
		//	   ３３４０円の一番少ないコイン数の組み合わせは13枚です。
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
}
