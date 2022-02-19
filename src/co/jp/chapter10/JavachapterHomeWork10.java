package co.jp.chapter10;

import co.jp.chapter10.Pet.Type;

public class JavachapterHomeWork10 {

	/**
	 * 質問１︓以下３⾏⽂字列を「改⾏コード」と「,」を分割して２つペットオブジェクトを作成してください。 1. Petクラスを事前作成してください。 2.
	 * ペットのタイプは列挙型である︓type = 0︓猫、type = 1︓⽝
	 * ペット病院⽤ペットマスタデータは以下通りです。（ファイルから読み取り不要）※トリム注意
	 * 
	 */

   public static void main(String[] args) {
		String addData = "みみ, 10, 1," + "レオ, 1, 0," + "マル,2,0,";

		String[] addData1 = addData.split("\\,");//逗号分割

		for (int i = 0; i < addData1.length; i++) {

			String pet = addData1[i].trim();

			String code;
			// 判断code的值,从code中拿type并且打印.
			if ("1".equals(pet) && (i + 1) % 3 == 0) {

				code = "1";
				System.out.println(pet.replaceAll(" ", "") + " : " + Type.getInfo(code).type + "です");
				System.out.println();//改行
				// System.out.println(pet.trim() + " : " + Type.getInfo(code).type);

			} else if ("0".equals(pet) && (i + 1) % 3 == 0) {

				code = "0";
				System.out.println(pet.replaceAll(" ", "") + " : " + Type.getInfo(code).type + "です");
				System.out.println();//改行

			} else {
				System.out.print(pet.trim());
				System.out.print(",");
			}

		}
}

	/**
	 * 質問２︓Windowsは各ファイルの拡張⼦を持っています。例 「新規ドキュメント.docx」の拡張⼦は「docx」である。
	 * メソッドを作成して、ファイルパス（String型）から拡張⼦を取得してください。
	 * 
	 */

//	public static String getFileType(String path) {
//
//		if (path != null && path.contains(".")) {
//			
//			String[] output = path.split("\\.");
//			// System.out.println(output[output.length - 1].toString());
//			return output[output.length - 1];
//			
//		} else {
//
//			return "Empty";
//		}
//	}
//
//	public static void main(String... args) {
//
//		System.out.println(getFileType("c://windows//aa.xlsx")); // xlsx
//		System.out.println(getFileType("c://windows//a a.test")); // test
//		System.out.println(getFileType("c://windows//aa.bb.docx")); // docx
//		System.out.println(getFileType("c://windows//aaaaa")); // Empty
//
//	}
	
	/**
	 * 質問３︓Javaには、すべての⽂字コードはUTF-8であり。⽇本語（全⾓⽂字）の場合１⽂字 = 3バイト。
	 *        以下⽂字列のバイト数と桁数を求めてください。
	 * 
	 * 
	 */
	
//	public static void main(String...args) {
//		
//		 String value = "abced12345あいうえお１２３４５" ;
//		 byte[] arr = value.getBytes();
//		 // バイト数は？ 40
//		 System.out.println(arr.length);
//		 // 桁数は？ 20
//		 System.out.println(value.length());
//    }
	
	
	/**質問４︓各現場は⽂字列に null ⼜は empty 判断要共通メソッドを実装しています。
	 *        似ているメソッドを実装してください。
	 * 
	 */
//	public static void main(String[] args) {
//		
//		//System.out.println(nullOrEmpty());()内输入nullOrEmpty需要判断的值
//		System.out.println(nullOrEmpty(" "));
//		System.out.println(nullOrEmpty("123"));
//		
//	}
//	
//	
//	public static boolean nullOrEmpty(String value) {
//	    //value は null or Empty 判断してください。
//		if (value == null) {
//		   System.out.println(value); 
//		} else if (value == " ") {
//		   System.out.println("Empty"); 
//		} else {
//		   System.out.println("输入有误"); 
//		}
//		return  value == null|| value == " " ?  true : false;
//		
//		
//		}
	
	/**質問５:以下仕様のフォーマティング指⽰コードを作成してくだい。
	 * 
	 *        1. 浮動⼩数点数
	 *        2. ⻑さは5桁数
	 *        3. 精度は⼩数点後2位
	 * 
	 * 答案:
	 *        1. 浮動⼩数点数       --> %f
	 *        2. ⻑さは5桁数　      --> %05d
	 *        3. 精度は⼩数点後2位　 --> %.2f
	 */
	
	/**質問６:整数16の16進数をSystem.out.println()してください。
	 * 
	 * 
	 * 答案: 10
	 */
	
//	public static void main(String[] args) {
//		
//		int num = 16;
//		System.out.println(String.format("%x", num));
//		
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	

}
