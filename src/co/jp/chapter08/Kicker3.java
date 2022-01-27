package co.jp.chapter08;

public class Kicker3 {
	public static void print(Child v) {
		 v.hello();
	}
	
	//修正所添加的代码
	public static void print(Parent v) {
		 v.hello();
	}
	
	//質問３︓以下コンパイルを修正してください。
	public static void main(String...args) {
		 print(new Parent());
		 print(new Child());
	}

}