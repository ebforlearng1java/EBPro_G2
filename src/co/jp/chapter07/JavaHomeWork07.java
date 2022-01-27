package co.jp.chapter07;

public class JavaHomeWork07 {

	public static void main(String[] args) {
		/*質問１︓ペットクラスを定義してください。ペットクラスは名称と年齢を保有して。以下
		２インスタンスを作成してください。変数１︓cat , 変数２︓dog。catの名称は ”cat”, 年齢
		=2, dogの名称は ”dog”, 年齢=5。
			1. クラスを定義する。クラス名は Pet。
			2. 該当クラスに、「名称」「年齢」属性が保有しています。
			3. Petクラスをインスタンス化する。以下２つオブジェクトを作成してください。
			4. オブジェクト１︓変数名 = cat。名称 = “cat“, 年齢 = 2。
			5. オブジェクト２︓変数名 = dog。名称 = “dog“, 年齢 = 5。
		*/
		
		Pet cat = new Pet();
		cat.name = "cat";
		cat.age = 2;
		System.out.println("オブジェクト１︓名称＝" + cat.getName() + "年齢＝" + cat.getAge());
		
		Pet dog = new Pet();
		dog.name = "dog";
		dog.age = 5;
		System.out.println("オブジェクト２︓名称＝" + dog.getName() + "年齢＝" + dog.getAge());
		
		
		
		/*質問１︓以下コードのコンパイルエラー理由を教えてください。
		// Pet.java
		public class Pet {
 			public String name;
 
 			public void setName(String value) {
 				this.name = value;
 			}
		}
		// Kicker.java
		public class Kicker {
 			public static void main(String...args) {
 				Pet cat = new Pet();
 				cat.setAge(1234);
 			}
		}
		 */
		System.out.println("エラー理由はPetクラスの中にsetAgeメソッドがありません。");
		
		
		/*質問２︓Mathクラスを作成してください。以下メソッドを定義します。
		1. 配列のMAXを求める静的メソッドを定義。（引数は int 配列）
		2. 配列のMINを求める静的メソッドを定義。（引数は int 配列）
		3. 配列の平均値を求める静的メソッドを定義。（引数は int 配列）
		4. mainメソッドで上記それぞれメソッドを呼び出してください。
		*/
		
		//4. mainメソッドで上記それぞれメソッドを呼び出してください。
		int[] array = {1, 2, 6, 7, 9, 6, 2, 1};
		
		//Math math = new Math(); 静的なメンバのアクセス⽅法は︓クラス名.属性名 or クラス名.メソッド名(引数)
		
		System.out.println("maxメソッド：" + Math.max(array));
		System.out.println("minメソッド：" + Math.min(array));
		System.out.println("arrangeメソッド：" + Math.arrange(array));
		
		
		//2.⾏列計算。2D⾏列クラスのコンストラクタには１配列引数設定してください。
		int[][] array1 = {
				{7,2},
				{3,4}
		};
		int[][] array2 = {
				{1,2},
				{3,4}
		};
		
		Matrix a = new Matrix(array1);
		Matrix b = new Matrix(array2);
		a.add(b);
		
		
	}

}
