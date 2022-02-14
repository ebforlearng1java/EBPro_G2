package co.jp.chapter08;

public class Dog extends Animal{

	

	public Dog(boolean alive, int legs, String[] cells,Run run) {//继承Animal，自己新加个string run属性
		super(alive, legs, cells);//super调用animal的属性
		// TODO Auto-generated constructor stub
		this.run= run;
	}

	Run run =new Run();
	//子类可以继承父类属性，但private 不行，protected 可以。
	//子类可以重写override 相同名字的方法，可以覆盖掉父类的方法/函数(而不是成员变量)
	//Run 和 Dog是集约关系  将属性其一设为类
	
	
	

}
