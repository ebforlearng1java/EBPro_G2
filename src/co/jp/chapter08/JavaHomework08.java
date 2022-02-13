package co.jp.chapter08;

public class JavaHomework08 {

//	質問１︓以下コードの出⼒するを回答してください。
//	1 String x = "a";
//	2 String y = "a";
//	3 System.out.println(x == y); // true ? false? 原因は ? 
//		false. x和y不是同一个东西
//	4 System.out.println(x.equals(y)); // true ? false? 原因は ?
//		true. x和y的值相等
//	5
//	6 String empty = "";
//	7 String nullString = null;
//	8 System.out.println(nullString.equals(empty)); // true ? false? 原因は ?
//		false. 这俩玩意的值不相等吧
//	
//	質問２︓以下コードの出⼒を回答してください。
//	1 // Employee.java
//	2 public class Employee {
//	3 	private String id;
//	4 	public Employee(String id) {
//	5  		this.id = id;
//	6  	}
//	7 	@Override
//	8  	public boolean equals(Object another) {
//	9  		if (another instanceof Employee) {
// 10 			Employee an = (Employee) another;
// 11 			return an.id.equals(id);
// 12 		}
// 13 		return false;
// 14 	}
// 15 }
// 16 // Kicker.java
// 17 public class Kicker {
// 18 	public static void main(String...args) {
// 19 		Employee x = new Employee("1234");
// 20 		Employee y = new Employee("1234");
// 21 		System.out.println(x == y); // true ? false? 原因は ?
//			Answer: false 值一样，但东西是俩东西
// 22 		System.out.println(x.equals(y)); // true ? false? 原因は ?
//			Answer: true 值一样
// 23 	}
// 24 }
//   
//   
//   
//	質問３︓以下コンパイルを修正してください。
//	1 // Parent.java
//	2 	public class Parent {
//	3 	public void hello() {
//	4 		System.out.println("parent method");
//	5 	}
//	6 }
//	7 // Child.java
//	8 	public class Child extends Parent {
//	9 	@Override // 親クラスの強制的にOverrideする意味（アノテーション）
// 10 	public void hello() {
// 11		System.out.println("child method");
// 12 	}
// 13 }
// 14 // Kicker.java
// 15 	public class Kicker {
// 16 	public static void print(Child v) {
// 17 		v.hello();
// 18	}
// 19 	public static void main(String...args) {
// 20		print(new Parent());
// 21		print(new Child());
// 22	}
// 23 }
//			Answer: 第16行？子类重写父类的方法是不是不能直接被调用啊。。
//	
//
//	
}
