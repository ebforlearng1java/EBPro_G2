package co.jp.chapter10;

/*質問１︓以下３⾏⽂字列を「改⾏コード」と「,」を分割して２つペットオブジェクトを作成してください。
	1. Petクラスを事前作成してください。
	2. ペットのタイプは列挙型である︓type = 0︓猫、type = 1︓⽝
	ペット病院⽤ペットマスタデータは以下通りです。（ファイルから読み取り不要）※トリム注意
		name, age, type
		みみ, 10, 1
		レオ, 1, 0
		マル,2,0
*/
/*回答
 * public class JavaHomeWork10 {

	public static void main(String[] args) {

		String data = "みみ, 10, 1\n" + "レオ, 1, 0\n" + "マル,2,0\n";
		String[] data1 = new String[3];
		data1 = data.split("\n");

		String[][] input = new String[3][3];
		for (int i = 0; i < data1.length; i++) {
			input[i] = data1[i].split(",");
		}

		for (int i = 0; i < input.length; i++) {

			Pet pet = new Pet();
			pet.name = input[i][0];
			pet.age = Integer.valueOf(input[i][1]);
			pet.getType(Integer.valueOf(input[i][2]));

			System.out.println("name:" + pet.name);
			System.out.println("age:" + pet.age);

		}

	}

}
*/


//質問２︓Windowsは各ファイルの拡張⼦を持っています。例 「新規ドキュメント.docx」の拡張⼦は「docx」である。メソッドを作成して、ファイルパス（String型）から拡張⼦を取得してください。
/*	public static String getFileType(String path) {
 	* // return ??
	}
	public static void main(String...args) {
		System.out.println(getFileType("c://windows//aa.xlsx")); // xlsx
		System.out.println(getFileType("c://windows//a a.test")); // test
		System.out.println(getFileType("c://windows//aa.bb.docx")); // docx
		System.out.println(getFileType("c://windows//aaaaa")); // Empty
	}
*/
/*回答:
 *		public static String getFileType(String path) {
			if(path.contains(".")) {
				String[] file = path.split("\\.");
				return file[file.length -1];
			}else {
				return "Empty";
			}
		 	}
*/


/*質問３︓Javaには、すべての⽂字コードはUTF-8であり。⽇本語（全⾓⽂字）の場合１⽂字 = 3バイト。以下⽂字列のバイト数と桁数を求めてください。
	public static void main(String...args) {
		String value = ”abced12345あいうえお１２３４５”;
	 	バイト数は？
	 	桁数は？
	}
*/
/*回答:
 * 		public static void main(String[] args) {
		String value = "abced12345あいうえお１２３４５";
		
		byte[] value_byte = value.getBytes();
		
		System.out.println("バイト数は" + value_byte.length);
		System.out.println("桁数は" + value.length());
		}
 */


/*質問４︓各現場は⽂字列に null ⼜は empty 判断要共通メソッドを実装しています。似ているメソッドを実装してください。
		public static boolean nullOrEmpty(String value) {
 		value は null or Empty 判断してください。
		}
*/
/*回答:
 * 		public static boolean nullOrEmpty(String value) {		
		
			if(value == null || value.isEmpty()) {
				return true;
			}else {
				return false;
			}
		}
 */


/*質問５︓以下仕様のフォーマティング指⽰コードを作成してくだい。
1. 浮動⼩数点数
2. ⻑さは5桁数
3. 精度は⼩数点後2位
*/
/*回答:
 * 	float a = 1.0F;
	int b = 1;
	float c = 2.0F;
	System.out.println(String.format("a=%,f",a));
	System.out.println(String.format("b=%05d",b));	
	System.out.println(String.format("a=%,.2f",c));
 */

//質問６︓整数16の16進数をSystem.out.println()してください。
/*回答:
	int a = 16;
	System.out.println(String.format("16の16進数=%x", a));
	
	答案为10。
*/