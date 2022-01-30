package co.jp.chapter07;

import co.jp.chapter01.Math;

public class JavaHomeWork07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		質問１︓ペットクラスを定義してください。ペットクラスは名称と年齢を保有して。以下 ２インスタンスを作成してください。
//		変数１︓cat , 変数２︓dog。catの名称は ”cat”, 年齢 =2, dogの名称は ”dog”, 年齢=5。 
//		1. クラスを定義する。クラス名は Pet。 
//		2. 該当クラスに、「名称」「年齢」属性が保有しています。 
//		3. Petクラスをインスタンス化する。以下２つオブジェクトを作成してください。
//		4. オブジェクト１︓変数名 = cat。名称 = “cat“, 年齢 = 2。
//		5. オブジェクト２︓変数名 = dog。名称 = “dog“, 年齢 = 5。
//		pet cat = new pet();
//		pet dog = new pet();
//		cat.age = 2;
//		cat.name = "cat";
//		dog.age = 5;
//		dog.name = "dog";
		
		
//		質問２︓アマゾンの各商品(Product)にて、クラスを定義してください。例︓価格、写 真、商品名など…
		
//		質問︓以下メソッドの静的メンバアクセス所を説明してください。（１箇所）
//		 public static void main(String...args) {
//			 System.out.println("some thing"); // ここに１箇所静的メンバアクセスしている
//			}
//		
//		1. 静的なフィールドは︖原因は︖ 
//		2. メソッドを呼び出していますか︖
//		3. メソッドを呼び出す時、渡すの引数は︖
//		回答：１．static インスタント化してなかったから
//		２．はいprintlnです
//		３．"some thing"
//		2. 以下ソースのコンパイルエラーを説明してください。 
//		
	
//		  public class Kicker {
//		 private String word = "abc";
//		 public void print(String name) {
//		 System.out.println(name);
//		 }
//		 public static void main(String...args) {
//			 print("dcnet.java.教育");
//			 System.out.println(word);
//			 } }
		
//		回答：因为Print方法并不是一个static的方法，所以想使用print方法却没有实例化（インスタント化）造成bug
//		
	
//	
//		3.質問２に以下ソース修正したらコンパイルエラー解消できますが、理由を教えてくださ い。 
		//		 }
//		 public static void main(String...args) {
//		 print("dcnet.java.教育");
//		 System.out.println(word);
//		 } } 123456789
//		
//		public class Kicker {
//		 private String word = "abc";
//		 public void print(String name) {
//		 System.out.println(name);
//		 }
//		 public static void main(String...args) {
//		 Kicker kicker = new Kicker();
//		 kicker.print("dcnet.java.教育");
//		 System.out.println(kicker.word);
//		 } }
//		回答：实例化构造函数后定义的print方法变得可以使用。
//		質問１︓以下コードのコンパイルエラー理由を教えてください。 
//		
//		// Pet.java
//		public class Pet {
//		 public String name;
//		 
//		 public void setName(String value) {
//		 this.name = value;
//		 } }
//		// Kicker.java
//		public class Kicker {
//		 public static void main(String...args) {
//		 Pet cat = new Pet();
//		 cat.setAge(1234);
//		 } } 
//		回答:成员变量age没有被定义，set方法不是静态的方法故不能直接使用。
//		回答：
//		質問２︓Mathクラスを作成してください。以下メソッドを定義します。 
//		1. 配列のMAXを求める静的メソッドを定義。（引数は int 配列） 
//		2. 配列のMINを求める静的メソッドを定義。（引数は int 配列） 
//		3. 配列の平均値を求める静的メソッドを定義。（引数は int 配列） 
//		4. mainメソッドで上記それぞれメソッドを呼び出してください。 以下はメソッドの定義のソースの抜枠です。
//		public class Math {
//		 public static int max(int[] input) {
//			 int MAX=0;
//			 for(int i=0;i<input.length;i++) {
//				 if(MAX < input[i]) {
//					 MAX = input[i]
//			 }
//		 }
//			 return MAX
//			 
//			 
//		 }
//		 public static int min(int[] input) {
//			 int MIN=0;
//			 for(int i=0;i<input.length;i++) {
//				 if(MIN > input[i]) {
//					 MIN = input[i]
//			 }
//		}
//			 return MAX
//		 }
//		 public static int avg(int[] input) {
//			 int =AVG;
//			 int =sum;
//			 for(int i=0;i<input.length;i++) {
//				 sum=sum + input[i]
//			 }
//		}
//		 AVG = sum/input.length;
//			 return AVG;
//		 }
//		public static void main(String[] args) {
//		
//		int [] a = new int[] {4,2,4,2,4,3,212,2,4};
//		
////		
//        int ma= Math.max(a);//通过类名调用、
//          int mi = Math.min(a);
//         int av = Math.avg(a);
		}
		 
			 
		 //...
		
//		2.⾏列計算。2D⾏列クラスのコンストラクタには１配列引数設定してください。 
//		ヒント︓⾏列の加算は以下通り 質問のヒント ⾏列計算の考え⽅法１
//		1. 新規型 Matrix を定義します。
//		2. ⾏列の加算を考えます。Matrix a, Matrix b, Matrix c = a + b;
//		3. 但し算術演算⼦は基本型（数値型）のみ利⽤可能の為、addメソッドを定義する必 要。 
//		4. addメソッド︓引数１︓タイプ⾏列、戻り値の型︓⾏列（Matrix）⇒ this をよく理解 してください。 ⾏列計算の考え⽅法２ 
//		
//		public class Matrix {
//		 private final int[][] data;
//		 /** construct method */
//		 public Matrix(int[][] data) {
//		 this.data = data;
//		 }
//		 // 行列 ADD
//		 public Matrix add(Matrix b) {
//		 //....
//		 return ???
//		 } }
	
////		
////
////	
//	}


