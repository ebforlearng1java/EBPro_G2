package co.jp.chapter0709;

public class JavaHomeWork0709 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// Q1︓クラス（Class）とは︖クラス定義⽤のキーワードは「 class 」である。
		// A1：类名首字母大些和文件同名。
		//
		// package 所属的包名; 修飾子 class クラス名 { }
		//

		// Q2︓クラスメンバ（Class member）の何種類ありますか。
		// A2：
		// 1. 属性・フィールド (Field)
		// 2. 関数(Function)・メソッド(Method)・操作(Operator)

		// Q3︓クラスメンバの関数は特殊の関数「コンストラクタ」が持っています。
		// A3：构造函数，在类生成实例时，new之后调用，是特殊的方法。作用是初始化对象。

		// Q4︓コンストラクタの特徴
		//
		// A4：1. 戻り値不要 2. 関数名＝クラス名称

		// Q5︓コンストラクタの作⽤:
		// A5:クラス属性の初期化する。

		// Q6︓１つクラスに複数のコンストラクタ持つ可能。
		// A6：一个类可以有多个构造函数。多个构造函数就是重载

		// Q7︓キーワード this の使⽤⽅法︓ this.name ︖ name ?
		// A7：this.name = name;
		// public class People {
		// private String name;
		// public void setName(String name) {
		// this.name = name;
		// }
		// }

		// Q8︓クラスを利⽤する為、インスタンス化する必要です。インスタンスの演算⼦はnew です。
		// A8：类名 变量名 = new 类名();
        //     Dog dog = new Dog();  
	
		// Q9︓演算⼦ new の直後呼び出しているメソッドは「コンストラクタ」︔
		// A9：new后调出的方法为构造函数。

		// Q10︓アクセス制御の３種類あります。
		// A10：公有public：同一个包的类、不同包的类、子类都可以访问到
		// 私有private：只有自己可以访问，其他都不可以访问到
		// 受保护的protected：同包的类和子类可以访问到，不同包的不可以

		// Q11&A11︓静的のメンバの定義するキーワード（修飾⼦）は static 。

		// Q12&A12︓静的のメンバアクセス時、インスタンス化不要。アクセス⽅法は「クラス名.静的のメンバ」。
		//
	    //	System.out.println("1234"); // 静的のField
	    //	String value = String.format("%05d", 0); // 静的のメソッド
		
		// Q13︓クラス「Animal」を定義して、インスタンス化しオブジェクト cat を作成します。
		// 変数catのsayHello()メソッドを呼び出してください。
		/*
		 * 1. 属性︓年齢 
		   2. 属性︓名前 
		   3. 属性︓分類 
		   4. コンストラクタ︓名前を渡して、初期化する 
		   5. 操作︓sayHello()︓void
		   6.操作︓getName(): String ⾃分の名称を返す
		 */
		Animal cat = new Animal("cat");
	

		// Q14︓以下１⾏を解釈してください。
		System.out.println(new Animal("cat").getName());
		// A14：Animal类调用了getName方法，并且把它输出。

		// Q15︓クラス継承する⽤キーワードは「 extends 」︖
		// A15：修饰子 class 子类名 extends 父类名

		// Q16&A16︓継承しているクラス。上位クラスは「親クラス」・「スーパークラス」。下位クラスは「サブクラス」と呼びます。

		// Q17︓サブクラス＆アクセス制御（ public, protected ）。
		// A17：子类只能继承父类中 public和 protected的属性和方法

		// Q18︓サブクラスと親クラス同じメソッド名かつメソッドの引数は⼀致する場合、「オーバーライド」となります。
		// A18：override。子类对父类的允许访问的方法（方法名与参数相同）的实现过程进行重新编写。

		/*
		 * Q19︓以下Animalクラスを継承して以下２クラスを作成してください。
		 *  1. クラスCat。sayHelloメソッドをオーバーライドして、System.out.println(“ニャー“); 
		 *  2. クラスDog。sayHelloメソッドをオーバーライドして、System.out.println(“ワン“);
		 * ※親クラスに明⽰的なコンストラクタが存在しない場合、サブクラスは必ず親クラスのコンストラクタをオーバーライドします。
		 */

		// Q20︓以下コードをIS-A関係で説明してください。
		
//		1 Animal v0 = new Animal(); // v0 は Animal 型
//		2 Animal v1 = new Cat("a cat"); // v1 は Cat 型, v1 は Animal 型
//		3 Animal v2 = new Dog("a dog"); // v2 は Dog 型, v2 は Animal 型
//		4 Cat v3 = new Cat(""); // OK
//		5 Dog v4 = new Dog(""); // OK
//		6 Cat v5 = new Animal(""); // NG
	   // 1 （）内缺少参数 v0为Animal型
	   // 2  v1 は Cat 型, v1 は Animal 型
	   // 3  v2 は Dog 型, v2 は Animal 型
       // 4  v3 は Cat 型, v3 は Animal 型
	   // 5  v4 は Dog 型, v4 は Animal 型
       // 6  错误语句，=左边不可以是子类。
	}

}
