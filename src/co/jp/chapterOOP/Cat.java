package co.jp.chapterOOP;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	//質問１９︓以下Animalクラスを継承して以下２クラスを作成してください。
	//1. クラス Cat。sayHelloメソッドをオーバーライドして、System.out.println(“ニャー“);
	//2. クラス Dog。sayHelloメソッドをオーバーライドして、System.out.println(“ワン“);
	
	//1. クラス Cat。sayHelloメソッドをオーバーライドして、System.out.println(“ニャー“);
	public void sayHello() {
		System.out.println("ニャー");
	}
}
