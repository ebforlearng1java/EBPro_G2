package co.jp.chapter0709;

public class Dog extends Animal{
	public Dog(String name) {
		super(name);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	//Q19︓以下Animalクラスを継承して以下２クラスを作成してください。
	//  1. クラス Cat。sayHelloメソッドをオーバーライドして、System.out.println(“ニャー“);
	//  2. クラス Dog。sayHelloメソッドをオーバーライドして、System.out.println(“ワン“);
	
		
	//A19-2  クラス Dog。sayHelloメソッドをオーバーライドして、System.out.println(“ワン“);
		public void sayHello() {
			System.out.println("ワン");
		}
}