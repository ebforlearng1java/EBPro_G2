package co.jp.chapterOOP;

public class Animal {
	//質問１３︓クラス「Animal」を定義して、インスタンス化しオブジェクト cat を作成します。
	//          変数catのsayHello()メソッドを呼び出してください。
	/*1. 属性︓年齢
	  2. 属性︓名前
	  3. 属性︓分類
	  4. コンストラクタ︓名前を渡して、初期化する
	  5. 操作︓sayHello()︓void
	  6. 操作︓getName(): String ⾃分の名称を返す
	*/
	
	//1. 属性︓年齢
	int age;
	
	// 2. 属性︓名前
	String name;
	
	//3. 属性︓分類
	int type;
	
	//4. コンストラクタ︓名前を渡して、初期化する
	public Animal(String name) {
		this.name = name;
	}
	
	// 5. 操作︓sayHello()︓void
	public void sayHello() {
		System.out.println("hello");
	}

	//6. 操作︓getName(): String ⾃分の名称を返す
	public String getName() {
		return name;
	}
	
}
