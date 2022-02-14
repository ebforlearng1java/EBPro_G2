package co.jp.chapter09;

public  class Animal {
	
	//抽象的不可能建立一个实体。没有构造函数
	//抽象的成员变量可以不初始化，可以没有实体。可被继承后再初始化
	//抽象的方法不能有本文(函数的主题，中括号里面的内容)
	//继承抽象类的子类，必须继承父类的抽象方法，否则该子类也为抽象类，将抽象方法传递给孙类
	//抽象方法只能建在抽象类中
	//意义为将方法和成员变量传给子类和孙类
	//强model,子类方法必须继承
	//有抽象类一般都有子类
	//限制下面的类能干什么 现场中一般打头文字为base
	public boolean alive;
	public int legs;
	public int cells[];
	
	public Animal(boolean b, int i, int[] a) {
		// TODO Auto-generated constructor stub
	}

	public   void speek() {
		System.out.println("hello!!!");
	
	};//抽象的方法不能有本文(函数的主题，中括号里面的内容)
	
	

}
