package co.jp.chapter0709;

public class Animal {
	//Q13︓クラス「Animal」を定義して、インスタンス化しオブジェクト cat を作成します。
	//          変数catのsayHello()メソッドを呼び出してください。
	/*1. 属性︓年齢
	  2. 属性︓名前
	  3. 属性︓分類
	  4. コンストラクタ︓名前を渡して、初期化する
	  5. 操作︓sayHello()︓void
	  6. 操作︓getName(): String ⾃分の名称を返す
	*/
	int age;//1
	String name;//2
	int type;//3
	
	public Animal(String name) {
		this.name=name;//4		
	}//4

    public void sayHello() {
			System.out.println("hello");
		}//5

	public String getName() {
		// TODO 自動生成されたメソッド・スタブ
		return name;//6
	}
}
