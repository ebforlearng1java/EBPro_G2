package co.jp.chapter08;

import co.jp.chapter08.JavaHomeWork08.Employee;

public class JavaChapter08 {

//	   public static void main(String[] args) {
//			String x = "a";
//			String y = "a";
//			System.out.println(x == y); 
//			// true ? false? 原因は ? 答え：結果は「true」なんですけれども，string型の比較は「equals()」の命令しか使えません。
//			System.out.println(x.equals(y)); 
//			// true ? false? 原因は ? 答え：結果は「true」です。「equals()」は変数のアドレスの中に書かれた値を比較している命令です。
//			String empty = "";
//			String nullString = null;
//			System.out.println(nullString.equals(empty)); 
//			// true ? false? 原因は ?
//	   }
	
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

}
