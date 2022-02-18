package co.jp.chapter10;

import co.jp.chapter10.Pet.Type;

public class JavaHomeWork10 {
	
//	質問１︓以下３⾏⽂字列を「改⾏コード」と「,」を分割して２つペットオブジェクトを作成してください。
//	1. Petクラスを事前作成してください。
//	2. ペットのタイプは列挙型である︓type = 0︓猫、type = 1︓⽝
//	ペット病院⽤ペットマスタデータは以下通りです。（ファイルから読み取り不要）※トリム注意
//	回答１︓
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String database= 
//				"みみ, 10, 1\n" + 
//				"レオ, 1, 0\n"  + 
//				"マル,2,0\n" 
//				;
//		
//		String[] rows = database.split("\n");
//		for(String row : rows) {
//			String[] fields = row.split(",");
//			String name = fields[0].trim();
//			int age = Integer.parseInt(fields[1].trim());
//			String typeString =fields[2].trim();
//			Type type;
//			if("0".equals(typeString)) {
//				type = Type.cat;
//			}else {
//				type = Type.dog;
//			}
//			Pet animal = new Pet(name,age,type);
//			animal.speack();
//		}
//	}
//	
	
//	質問２︓Windowsは各ファイルの拡張⼦を持っています。例 「新規ドキュメント.docx」の拡張⼦は「docx」である。メソッドを作成して、ファイルパス（String型）から拡張⼦を取得してください。
//	回答２︓	
//	public static String getFileType(String path) {
//		if(path.contains(".")) {
//			String[] pieces = path.split("\\.");
//			return pieces[pieces.length-1];
//		}else {
//			return "Empty";
//		}	
//	}
//
//	public static void main(String... args) {
//		System.out.println(getFileType("c://windows//aa.xlsx")); // xlsx
//		System.out.println(getFileType("c://windows//a a.test")); // test
//		System.out.println(getFileType("c://windows//aa.bb.docx")); // docx
//		System.out.println(getFileType("c://windows//aaaaa")); // Empty
//	}
	
//	質問３︓Javaには、すべての⽂字コードはUTF-8であり。⽇本語（全⾓⽂字）の場合１⽂字 = 3バイト。
//			以下⽂字列のバイト数と桁数を求めてください。
//	回答３︓		
//	public static void main(String... args) {
//		String value = "abced12345あいうえお１２３４５";
//		// バイト数は？
//		byte[] array = value.getBytes();
//		System.out.println("バイト数は："+array.length);
//		// 桁数は？
//		System.out.println("桁数は："+value.length());
//	}

//	質問４︓各現場は⽂字列に null ⼜は empty 判断要共通メソッドを実装しています。似ているメソッドを実装してください。
//	回答４︓
//	public static boolean nullOrEmpty(String value) {
//		 // value は null or Empty 判断してください。
//		if(value==null) {
//			return true;
//		}else {
//			return value.isBlank();
//		}
//	}
//	public static void main(String... args) {
//		System.out.println(nullOrEmpty(null));
//		System.out.println(nullOrEmpty(""));
//		System.out.println(nullOrEmpty("asdas"));
//		System.out.println(nullOrEmpty("    "));
//	}

//	質問５︓以下仕様のフォーマティング指⽰コードを作成してくだい。
//		1. 浮動⼩数点数
//		2. ⻑さは5桁数
//		3. 精度は⼩数点後2位
//	回答５︓
//		1. 浮動⼩数点数：%f
//		2. ⻑さは5桁数：%05d
//		3. 精度は⼩数点後2位：%.2f
	
//	質問６︓整数16の16進数をSystem.out.println()してください。
//	回答６︓	
//	public static void main(String... args) {
//		System.out.println(String.format("%x", 16));
//	}
}
