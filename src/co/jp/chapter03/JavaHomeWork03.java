package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		質問︓以下コードを補完してください。

//		1 boolean value = true;
//		2 switch(value) {
//		3 case ??:break; // case ??                 case true
//		4 case ??:break; // case ??                 case false
//		5 default:break; // default は必要ですか？       no
//		6}
		
		
		
//     質問１︓成績ランキング判断を作成する「90以上︓A, 80-90︓B, 70-80︓C, 60-70︓D, 60以下︓E」
//		
//		
//		1 int a = 56;
//		2 System.out.println("成績ランキング判断。入力値=" + a);
//		3 // 以下コードを完成してください。
//		4 if(...) {                         if(a>=90){
//		5  System.out.println("A");
//		6 } else if(...) {                  } else if(a>=80||a<90) {  
//		7  System.out.println("B");
//		8 } else if(...) {                  } else if(a>=70||a<80) {
//		9  System.out.println("C");
//		10} else if(...) {                  else if(a>=60||a<70) {
//		11 System.out.println("D");
//		12} else {                          } else {a<60
//		13 System.out.println("E");
//		14 }
//
//		
//		質問２︓⽇本のコインを１円、５円、１０円、１００円、５００円があります。３３４０円のコイン数をもとめください	
         // 3340  500*6+100*3+10*4 
		//Answer:  
		int x = 500;
		int a = 0;
		do {
		 a++;
		 x=x+500;
		} while (x<3340);
         System.out.println("500円のコイン数:"+a);
      
        int y = 100;
 		int b = 0;
 		do {
 		 b++;
 		 y=y+100;
 		} while (y<340);
          System.out.println("100円のコイン数:"+b);
         
        int z = 10;
  		int c = 0;
  		do {
  		 c++;
  		 z=z+10;
  		} while (z==40);
           System.out.println("10円のコイン数:"+c);
         
      System.out.println("３３４０円のコイン数のもとめ:"+(a+b+c));   
         
         
         
         
         
         
	}

}
