package co.jp.chapter08;



public class Javachapter08HomeWork {


	/*
	質問1:以下コードの出力するを回答してください。
    public static void main(String[] args) {
		  
	
	String x = "a";
	String y = "a";
	System.out.println(x == y); //①　true ? false? 原因は ?
	System.out.println(x.equals(y)); //② true ? false? 原因は
	
	String empty = "";
	String nullString = null;
	System.out.println(nullString.equals(empty)); //③ true ? false? 原因は ? 
	
	}    
	
	回答:
	①true  x 和 y 指向的是同一个引用，所以 == 也是 true.
	②true　字符串的值是相同的
	③出现错误,java.lang.NullPointerException: Cannot invoke 空指针异常无法调用
	*/
	
	/*
    質問2:以下コードの出力を回答してください。
        //Employee.java
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
		//Kicker.java
		public class Kicker {
		  public static void main(String...args) {
		  Employee x = new Employee("1234");
		  Employee y = new Employee("1234");
		  System.out.println(x == y); // ①true ? false? 原因は ?
		  System.out.println(x.equals(y)); //② true ? false? 原因は
		  }
		}
		
	回答:
	①　false　两次new出来的对象堆内存地址是不一样的,所以引用的地址也是不一样的.
	②　true   equals只负责比较字符串的值,值相同则为true.
	*/
	
	/*
    質問3:以下コンパイルを修正してください。
    //Parent.java
	 public class Parent {
		public void hello() {
		System.out.println("parent method");
		}
     }
	//Child.java
	 public class Child extends Parent {
		@Override // 親クラスの強制的にOverrideする意味(アノテーション)
		public void hello() {
		System.out.println("child method");
		}
	 }
	//Kicker.java
	 public class Kicker {
		public static void print(Child v) {
		v.hello();
		}
		public static void main(String...args) {
		print(new Parent());
		
	回答:
	//Kicker.java部分改写如下.
	
     public class Kicker {

		public static void print(Parent v) {
		v.hello();
		}
		public static void main(String...args) {
		print(new Parent());
		print(new Child());

        }
	*/
}