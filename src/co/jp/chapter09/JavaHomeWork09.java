package co.jp.chapter09;

public class JavaHomeWork09 {
	
	

	public static void main(String...args) {
		
		//質問１︓以下３⾏⽂字列を「改⾏コード」と「,」を分割して２つペットオブジェクトを
		//作成してください。
		//意味わからないです。
		
		
		
		//質問２︓Windowsは各ファイルの拡張⼦を持っています。例 「新規ドキュメント.docx」
		//の拡張⼦は「docx」である。メソッドを作成して、ファイルパス（String型）から拡張⼦
		//を取得してください。
		//public static String getFileType(String path) {
		//   int num = -1;
		//   String ext = null;
		     
		//   for(int i = 1; i < path.length(); i++) {
		//	     if(Objects.equals(Character.toString(path.charAt(i)), ".")) {
		//		     num = i;
		//	     }
		//   }		
		
		
		//   if(num > 0) {
		//	     ext = path.substring(num+1);
		//   }else {
		//	     ext = "empty";
		//   }
		
		//   return ext;
		
	    //}
        //public static void main(String...args) {
        //	 System.out.println(getFileType("c://windows//aa.xlsx")); // xlsx
        //	 System.out.println(getFileType("c://windows//a a.test")); // test
        //	 System.out.println(getFileType("c://windows//aa.bb.docx")); // docx
        //	 System.out.println(getFileType("c://windows//aaaaa")); // Empty
        //}
		


		//a
		
		
		//質問３︓Javaには、すべての⽂字コードはUTF-8であり。⽇本語（全⾓⽂字）の場合１⽂
		//字 = 3バイト。以下⽂字列のバイト数と桁数を求めてください。
		 String value = "abced12345あいうえお１２３４５";
		 // バイト数は？
		 // 桁数は？
	     System.out.println("バイト数:" + value.getBytes().length);
	     System.out.println("桁数:" +value.length());
		
	     // バイト数: 40  桁数: 20
	     
	     
	     
	     
	     
	     
	     
	     //質問４︓各現場は⽂字列に null ⼜は empty 判断要共通メソッドを実装しています。似て
	     //いるメソッドを実装してください。
	     //public static boolean nullOrEmpty(String value) {
	    	 // value は null or Empty 判断してください
			
			//if(value == null) {
			//	System.out.println("This string is null.");
			//}else if (value.trim().isEmpty() && value.length()>=0) {
			//	System.out.println("This string is empty.");
			//}else {
			//	System.out.println("This string is neither empty nor null.");
			//}
	     //}

	     
	     
	     
	     
	     
	     
	     
	     //質問５︓以下仕様のフォーマティング指⽰コードを作成してくだい。
	     //5.1. 浮動⼩数点数
	     double a = 1234.56789;
	     int b = 123;
	     
	     System.out.println(String.format("a is %f", a));
	     
	     //5.2. ⻑さは5桁数
	     
	     System.out.println(String.format("5-digit b is %05d",b));
	     
	     //5.3. 精度は⼩数点後2位
	     System.out.println(String.format("2-digit-decimal of a is %,.2f",a));
	
	
	     
	     
	     
	     
	     
	     
	     
	     //質問６︓整数16の16進数をSystem.out.println()してください。
	     System.out.println(String.format("16進数： %x", 16));
	     //16の16進数: 10
	     
	     
	     
	}

}

