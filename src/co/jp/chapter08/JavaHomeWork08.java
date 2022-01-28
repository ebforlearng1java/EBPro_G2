package co.jp.chapter08;

public class JavaHomeWork08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		質問１︓以下コードの出⼒するを回答してください。
//		String x = "a";
//		String y = "a";
//		System.out.println(x == y); // true ? false? 原因は ?
//		System.out.println(x.equals(y)); // true ? false? 原因は ?
//		String empty = "";
//		String nullString = null;
//		System.out.println(nullString.equals(empty)); // true ? false? 原因は ?
		
//		回答１：
//			①结果是true： ==比较两个对象的地址，本应该是false，但不知道为什么结果是true？
//			②结果是true： equals比较两个字符串内容是否相同
//			③报错，无法运行： null和空字符串不是一个概念

	
//		質問２︓以下コードの出⼒を回答してください。
//		回答２︓
//			①结果是false：==比较对象地址， x/y是内存中两个不同的对象，返回值就是false
//			②结果是true： Employee类定义了equals方法，比较两个对象的id字符串是否相同，这里x/y两个对象的id都是1234，字符串内容相同，返回值就是true

//		質問３︓以下コンパイルを修正してください。
//		回答３︓把print方法的参数类型变为Parent即可
		print(new Parent());
		print(new Child());

	}	
	public static void print(Parent v) {
		 v.hello();
	}

}



