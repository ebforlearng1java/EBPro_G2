package co.jp.chapter09;

public class JavachapterHomeWork07_09OOP {
	
			/*注意⚠️:
			 * 質問1-12:知识点的总结和回顾  解答：🈚
			 * 質問15-18:知识点的总结和回顾 解答：🈚
			 * 質問13,質問19共用同一份代码.
			 * ️
			 */
	
	
			/*
			 * 質問１３︓クラス「Animal」を定義して、インスタンス化しオブジェクト cat を作成します。
			 *              変数catのsayHello()メソッドを呼び出してください。
								1. 属性︓年齢
								2. 属性︓名前
								3. 属性︓分類
								4. コンストラクタ︓名前を渡して、初期化する
								5. 操作︓sayHello()︓void
								6. 操作︓getName(): String ⾃分の名称を返す
			 * 
			 * 解答：
			 */
				public static void main(String[] args) {
				
					Animal cat = new Cat("猫");
					Animal dog = new Dog("犬");
				    cat.sayHello();
				    dog.sayHello();
				}
			    }
				
				 class Animal {
						int age;
						String name;
						String type;
					public  Animal() {}
					public  Animal(String name) {
						super();
						this.name = name;
					}
					
					public void sayHello() {
						System.out.println("");
					}
					
					public String getName() {
						return name;
					}
					 
				}
				class Cat extends Animal{
					
					int age;
					String name;
					String type;
					public Cat() {}
					public Cat(String name) {
						super(name);
					}
					public void sayHello() {
								System.out.println(super.name + "ニャー");
							  //System.out.println(getName() + "ニャー");
							}
				}
	
	            class Dog extends Animal{
	
					int age;
					String name;
					String type;
					public Dog() {}
					public Dog(String name) {
						super(name);
					}
					public void sayHello() {
								System.out.println(super.name + "ワン");
							  //System.out.println(getName() + "ワン");

					}
	            }
	
			/*
			 * 質問14:以下1行を解釈してください。
			 *       System.out.println(new Animal("cat").getName());
	
			 * 解答：
			 * 
			 * 1 创建一个新的Animal实例对象,调用构造函数,并且对新对象的name属性赋值“cat”.
			 * 2 通过getter的方法访问name属性的值,并且打印.
			 * 
			 */
	
	
			/*
			 * 質問19:以下Animalクラスを継承して以下2クラスを作成してください。
						1. クラス Cat。sayHelloメソッドをオーバーライドして、System.out.println(“ニャー“);  
						2. クラス Dog。sayHelloメソッドをオーバーライドして、System.out.println(“ワン“);
			 * 
			 * 解答： 同質問１３回答.
			 */
	
			/*
			 * 質問20:以下コードをIS-A関係で説明してください。 
					 * is-a:代表继承关系。
					 * has-a:代表从属关系。 
					 * like-a:代表组合关系 (接口)。 
			 * 
			 *  Animal v0 = new Animal(); // 创建新的实例对象为Animal 型.
				Animal v1 = new Cat("a cat"); //Dog is-a Animal: Animal是Dog的父类,v1既是子类Cat型也是父类Animal型.
				Animal v2 = new Dog("a dog"); //Cat is-a Animal: Animal是Cat的父类,v2既是子类Dog型也是父类Animal型.
				Cat v3 = new Cat(""); // 创建Cat型“v3”实例对象,OK(注意内部类继承执行的时候编译通过,但是执行报错,建议用多态).
				Dog v4 = new Dog(""); // 创建Dog型“v4”实例对象,OK (注意内部类继承执行的时候编译通过,但是执行报错,建议用多态).
				Cat v5 = new Animal(""); //  报错,要有子类必须先有父类
				
			 * 解答：
			 */


	



