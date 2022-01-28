package co.jp.chapter08;

import co.jp.chapter08.Parent;

public class Child extends Parent {
	@Override // 親クラスの強制的にOverrideする意味（アノテーション）
	public void hello() {
		System.out.println("child method");
	} 
}