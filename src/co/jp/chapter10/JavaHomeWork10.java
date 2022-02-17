package co.jp.chapter10;

public class JavaHomeWork10 {

	public static void main(String[] args) {
		// 質問１︓以下３⾏⽂字列を「改⾏コード」と「,」を分割して２つペットオブジェクトを作成してください。
		/*
		 * 1. Petクラスを事前作成してください。
		 * 2. ペットのタイプは列挙型である︓type = 0︓猫、type = 1︓⽝
		 * ペット病院⽤ペットマスタデータは以下通りです。（ファイルから読み取り不要）※トリム注意 
		 * 1 name, age, type 
		 * 2 みみ, 10, 1
		 * 3 レオ, 1, 0 
		 * 4 マル,2,0F
		 */
		String input = "みみ, 10, 1\n"
				+ "レオ, 1, 0\n"
				+ "マル,2,0";
		
		//接收换行分割
		String[] input_array1 = new String[3];
		//接收逗号分割
		String[][] input_array2 = new String[3][3];
		
		//换行分割
		input_array1 = input.split("\n");
		
		//逗号分割
		for(int i = 0; i < input_array1.length; i++) {
			input_array2[i] = input_array1[i].split(",");
		}
		
		//清除空白
		for(int i = 0; i < input_array2.length; i++) {
			for(int j = 0; j < input_array2[i].length; j++) {
				input_array2[i][j] = input_array2[i][j].trim();
			}
		}
		
		//生成对象
		for(int i=0; i < input_array2.length; i++) {
			System.out.println("第" + (i+1) + "番プロジェクト");
			
			Pet pet = new Pet();
			pet.name = input_array2[i][0];
			pet.age = Integer.valueOf(input_array2[i][1]);
			pet.getType(Integer.valueOf(input_array2[i][2]));
			
			System.out.println("name:" + pet.name);
			System.out.println("age:" + pet.age);
		}
		
		
		/*質問２︓Windowsは各ファイルの拡張⼦を持っています。
		 * 例 「新規ドキュメント.docx」の拡張⼦は「docx」である。
		 * メソッドを作成して、ファイルパス（String型）から拡張⼦を取得してください。
		 */
		 System.out.println(getFileType("c://windows//aa.xlsx")); // xlsx
		 System.out.println(getFileType("c://windows//a a.test")); // test
		 System.out.println(getFileType("c://windows//aa.bb.docx")); // docx
		 System.out.println(getFileType("c://windows//aaaaa")); // Empty
		 
		 
		 /*質問３︓Javaには、すべての⽂字コードはUTF-8であり。
		  * ⽇本語（全⾓⽂字）の場合１⽂字 = 3バイト。以下⽂字列のバイト数と桁数を求めてください。
		  */
		 String value = "abced12345あいうえお１２３４５";
		 
		 byte[] value_byte = value.getBytes(); //⽂字列のバイト列を返し 
		 
		 System.out.println("文字列のバイト数：" + value_byte.length);
		 System.out.println("文字列の桁数：" + value.length());
		 
		 
		 /*質問４︓各現場は⽂字列に null ⼜は empty 判断要共通メソッドを実装しています。
		  * 似ているメソッドを実装してください。
		  */
		 System.out.println(nullOrEmpty(value));
		 
		 
		 /*質問５︓以下仕様のフォーマティング指⽰コードを作成してくだい。
		  * 1. 浮動⼩数点数
		  * 2. ⻑さは5桁数
		  * 3. 精度は⼩数点後2位
		  */
		 int a = 10;
		 float f = 1.0F;
		 System.out.println(String.format("浮動⼩数点数f = %f", f));
		 System.out.println(String.format("長さは5桁数a = %5d", a));
		 System.out.println(String.format("精度は小数点後2位f = %.2f", f));
		 
		 
		 //質問６︓整数16の16進数をSystem.out.println()してください。
		 int b = 16;
		 System.out.println(String.format("整数16の16進数 = %x", b));

	}

	/*質問２︓Windowsは各ファイルの拡張⼦を持っています。
	 * 例 「新規ドキュメント.docx」の拡張⼦は「docx」である。
	 * メソッドを作成して、ファイルパス（String型）から拡張⼦を取得してください。
	 */
	public static String getFileType(String path) {
		String[] array1 = path.split("//");
		String[] array2 = array1[array1.length - 1].split("\\.");
		
		if(array2.length == 1) {
			return "Empty";
		}else {
			return array2[array2.length - 1];
		}
	}
	
	/*質問４︓各現場は⽂字列に null ⼜は empty 判断要共通メソッドを実装しています。
	  * 似ているメソッドを実装してください
	  */
	public static boolean nullOrEmpty(String value) {
		if(value == null || value.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}

}
