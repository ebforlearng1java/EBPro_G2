package co.jp.part2;

public  abstract class Pet {
	
  String name;
  
  int age;
  
  String type;
  
  static int COUNT = 0;
  
  abstract void eat();//抽象方法
  
  //有参数的构造方法生成
  public Pet(String name, int age, String type) {
	super();
	this.name = name;
	this.age = age;
	this.type = type;
}
  //无参数的构造方法
  
  
public Pet() {
	// TODO 自動生成されたコンストラクター・スタブ
}

//setget
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public static int getCOUNT() {
	return COUNT;
}

public static void setCOUNT(int cOUNT) {
	COUNT = cOUNT;
}

public void printInfo() {
	
		System.out.println("宠物的名字是：" + this.name+"  " + "宠物的年龄是："+ this.age + "宠物的类型是："+this.type);
		System.out.println("宠物的数量是：" + COUNT); //静态的调用可以省略this
		
	}
   
  
}
