package co.jp.chapter08;

public class Child extends Parent {
	//質問３︓以下コンパイルを修正してください。
	 @Override // 親クラスの強制的にOverrideする意味（アノテーション）
	 public void hello() {
		 System.out.println("child method");
	 }
}
