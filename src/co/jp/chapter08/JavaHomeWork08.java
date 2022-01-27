package co.jp.chapter08;

public class JavaHomeWork08 {

	public static void main(String[] args) {
		//質問︓以下コードのコンパイルエラー理由を教えてください。
		/*// Parent.java
		public final class Parent {}
		// Child.java
		public class Child extends Parent {}
		 */
		//答：final的类不可以被继承
		
		//質問１︓以下コードの出⼒するを回答してください。
		String x = "a";
		String y = "a";
		System.out.println(x == y); // true ? false? 原因は ?
		//答：true.因为字符a等于字符a，字符a的值相等而且地址也一样都是常量池中字符a的地址。
		System.out.println(x.equals(y)); // true ? false? 原因は ?
		//答：true.因为equals方法只比较值是否相等。字符a的值是相等的。

		String empty = "";
		String nullString = null;
		System.out.println(nullString.equals(empty)); // true ? false? 原因は ?
		//答：发生空指针异常的错误。null，不能使用equals方法
		System.out.println(empty.equals(nullString));
		//若交换位置，则为false.""和null不相等
		
		
		//質問２︓以下コードの出⼒を回答してください。
	// Employee.java
	/*public class Employee {
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
	 */
		// Kicker.java
		/*public class Kicker {
 			public static void main(String...args) {
 				Employee x = new Employee("1234");
 				Employee y = new Employee("1234");
 				System.out.println(x == y); // true ? false? 原因は ?
 				//答：false 通过Employee类创建了两个实例对象，位置不同
 				System.out.println(x.equals(y)); // true ? false? 原因は ?
 				//答：true 利用Employee类中的equals方法对比两个实例对象的id属性的值是否相等，都是字符串“1234”所以相等
 			}
		}
		 */
		
		//質問３︓以下コンパイルを修正してください。
		//回答在 Kicker3.java
	}

}
