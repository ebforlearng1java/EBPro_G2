package co.jp.chapter08;

public class JavaHomeWork08 {
//	質問１︓以下コードの出⼒するを回答してください。
	String x = "a";
	String y = "a";
	System.out.println(x == y); 
// true ? false? 原因は ? 答え：結果は「true」です「＝＝」は変数のアドレスを比較している命令ですけれども，
// string型の比較は「equals()」の命令を使うのほうがいいです。
	System.out.println(x.equals(y)); 
// true ? false? 原因は ? 答え：結果は「true」です。「equals()」は変数のアドレスの中に書かれた値を比較している命令です。
	String empty = "";
	String nullString = null;
	System.out.println(nullString.equals(empty)); 
	// true ? false? 原因は ?
	
	
//	質問２︓以下コードの出⼒を回答してください。
	// Employee.java
	public class Employee {
		 private String id;
		 public Employee(String id) {
			 this.id = id;
		 }
		 @Override	
		 public boolean equals(Object another) {
			if (another instanceof Employee) {
				Employee an = (Employee) another;
				return an.id.equals(id);
			}
			return false;
		 }
	 }
	// Kicker.java
	public class Kicker {
		public static void main(String...args) {
			Employee x = new Employee("1234");
			Employee y = new Employee("1234");
			System.out.println(x == y); // true ? false? 原因は ?
			System.out.println(x.equals(y)); // true ? false? 原因は ?
		} 
	}

	
//	質問３︓以下コンパイルを修正してください。
	// Parent.java
	public class Parent {
		public void hello() {
			System.out.println("parent method");
		} 
	}
	// Child.java
	public class Child extends Parent {
		@Override // 親クラスの強制的にOverrideする意味（アノテーション）
		public void hello() {
			System.out.println("child method");
		} 
	}
	// Kicker.java
	public class Kicker {
		public static void print(Child v) {
			v.hello();
		}
		public static void main(String...args) {
			print(new Parent());
			print(new Child());
		} 
	}
}