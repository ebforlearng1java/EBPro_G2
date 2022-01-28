package co.jp.chapter08;

import co.jp.chapter08.Employee;
import co.jp.chapter08.Parent;
import co.jp.chapter08.Child;

//public class Kicker {
//	public static void main(String...args) {
//		Employee x = new Employee("1234");
//		Employee y = new Employee("1234");
//		System.out.println(x == y); // true ? false? 原因は ?
//		System.out.println(x.equals(y)); // true ? false? 原因は ?
//	}

// Kicker.java
public class Kicker {
	public static void print(Child v) {
		v.hello();
	}
	public static void main(String[] args) {
		print(new Parent());
		print(new Child());
	} 
}
}
