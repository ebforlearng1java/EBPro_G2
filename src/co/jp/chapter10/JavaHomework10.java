package co.jp.chapter10;

public class JavaHomework10 {

//	質問１︓以下３⾏⽂字列を「改⾏コード」と「,」を分割して２つペットオブジェクトを作成してください。
//	1. Petクラスを事前作成してください。
//	2. ペットのタイプは列挙型である︓type = 0︓猫、type = 1︓⽝
//	ペット病院⽤ペットマスタデータは以下通りです。（ファイルから読み取り不要）※トリム注意
//	1 name, age, type
//	2 みみ, 10, 1
//	3 レオ, 1, 0
//	4 マル,2,0
//	
//	
//	
//	質問２︓Windowsは各ファイルの拡張⼦を持っています。例 「新規ドキュメント.docx」の拡張⼦は「docx」である。メソッドを作成して、ファイルパス（String型）から拡張⼦を取得してください。
//	
//	1 public static String getFileType(String path) {
//	2 	// return ??
//	3 }
//	4 public static void main(String...args) {
//	5 	System.out.println(getFileType("c://windows//aa.xlsx")); // xlsx
//	6	System.out.println(getFileType("c://windows//a a.test")); // test
//	7	System.out.println(getFileType("c://windows//aa.bb.docx")); // docx
//	8	System.out.println(getFileType("c://windows//aaaaa")); // Empty
//	9 }
//	
//	Answer:
//	public static String getFileType(String path) {
//		int i = path.length();
//		if (path.substring(i - 5, i - 4).equals(".")) {
//			if (path.substring(i - 4, i).equals("xlsx")) {
//				path = "xlsx";
//				return path;
//			}
//			if (path.substring(i - 4, i).equals("test")) {
//				path = "test";
//				return path;
//			}
//			if (path.substring(i - 4, i).equals("docx")) {
//				path = "docx";
//				return path;
//			}
//		} else {
//			path = "Empty";
//			return path;
//		}
//		return path;
//	}
//
//	
//	
//	質問３︓Javaには、すべての⽂字コードはUTF-8であり。⽇本語（全⾓⽂字）の場合１⽂字 = 3バイト。以下⽂字列のバイト数と桁数を求めてください。
//
//	1 public static void main(String...args) {
//	2 	String value = ”abced12345あいうえお１２３４５”;
//	3	// バイト数は？
//	4	// 桁数は？
//	5 }
	
	// バイト数は？ 5+5+3*5+5*3 = 40byte
    // 桁数は？    5+5+5+5 = 20

	
	
//	
//	質問４︓各現場は⽂字列に null ⼜は empty 判断要共通メソッドを実装しています。似ているメソッドを実装してください。
//	
//	1 public static boolean nullOrEmpty(String value) {
//	2 	// value は null or Empty 判断してください。
//	3 }
	
//  Answer:	
//	public static boolean nullOrEmpty(String value) {
//	
//		if (value == null) {
//			System.out.println("null");
//			return true;
//		}
//		
//		else if(value!=null && value.equals("")) {
//			System.out.println("empty");
//			return true;
//			}
//		
//		else {
//			System.out.println("nullOrEmpty以外");
//			return false;
//		}
//		}
	
//	
//	質問５︓以下仕様のフォーマティング指⽰コードを作成してくだい。
//	1. 浮動⼩数点数			String.format("%f",数)
//	2. ⻑さは5桁数			String.format("%05d",数)
//	3. 精度は⼩数点後2位		String.format("%,.2f",数)
//	
//	
//	
//	質問６︓整数16の16進数をSystem.out.println()してください。
//	  
	public static void main(String[] args) {
		System.out.println(String .format("%x", 16));
	}
//	

}
