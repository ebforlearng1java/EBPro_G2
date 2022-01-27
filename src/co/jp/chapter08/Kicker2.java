package co.jp.chapter08;

public class Kicker2 {
	//質問２︓以下コードの出⼒を回答してください。
	public static void main(String...args) {
		
		 Employee x = new Employee("1234");
		 
		 Employee y = new Employee("1234");
		 
		 System.out.println(x == y); // true ? false? 原因は ?
		 //false 通过Employee类创建了两个实例对象，位置不同
		 
		 System.out.println(x.equals(y)); // true ? false? 原因は ?
		 //true 利用Employee类中的equals方法对比两个实例对象的id属性的值是否相等，都是字符串“1234”所以相等
	}
}
