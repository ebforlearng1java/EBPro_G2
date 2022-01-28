package co.jp.chapter08;

import co.jp.chapter08.Employee;

public class Kicker {
	public static void main(String...args) {
		Employee x = new Employee("1234");
		Employee y = new Employee("1234");
		System.out.println(x == y); // true ? false? 原因は ?
		System.out.println(x.equals(y)); // true ? false? 原因は ?
	} 
}
