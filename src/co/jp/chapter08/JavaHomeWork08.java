package co.jp.chapter08;

class JavaHomeWork08 {
	
//質問１︓質問１︓以下コードの出⼒するを回答してください。
/*		String x = "a";
		String y = "a";
		System.out.println(x == y); // true ? false? 原因は ?
		//回答:  true。　アドレスと内容どちらも文字列"a"である為等しい。
		  
		System.out.println(x.equals(y)); // true ? false? 原因は ?	
		//回答:  true。 equalsは内容の比較なので、xとyどちらも"a"という内容で一致する。
		 
		String empty = "";
		String nullString = null;
		System.out.println(nullString.equals(empty)); // true ? false? 原因は ?
		//回答:  エラーが生じて、比較不可。nullの場合equalsが使えない。
		  		System.out.println(empty.equals(nullString));に変換すれば比較可能になるが、答えがfalse。
		  		理由は" "とnullは等しくないからである。
*/	
	
	
//質問２︓以下コードの出⼒を回答してください。
/*		public class Employee {
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
				//回答:  false。 Employeeを使って二つの実例を作ったのでアドレスが異なるため。
				 
				System.out.println(x.equals(y)); // true ? false? 原因は ?
				//回答:  true。　　equalsは前後の内容を比較しているので、今回の場合において値は等しい。
			}
		}
*/	
	

//質問３︓以下コンパイルを修正してください。	
//回答:
/*
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
			public static void print(Parent v) {
			v.hello();
		}
		public static void main(String...args) {
			print(new Parent());
			print(new Child());
		}
	}
*/
	
	
	
	
	
	
	
	
	
	
	
}
