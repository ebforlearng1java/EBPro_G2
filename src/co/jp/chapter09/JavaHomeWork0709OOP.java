package co.jp.chapter09;

//質問1-12 回答不要;

//質問13:クラス「Animal」を定義して、インスタンス化しオブジェクト cat を作成します。変数catのsayHello()メソッドを呼び出してください。
/*		1. 属性︓年齢
		2. 属性︓名前
		3. 属性︓分類
		4. コンストラクタ︓名前を渡して、初期化する
		5. 操作︓sayHello()︓void
		6. 操作︓getName(): String ⾃分の名称を返す
*/

/*回答:
		public class Animal{
		
			int age;
			String name;
			String type;
			
			public Animal(String name) {
				this.name = name;
			}
			
			public void sayHello(){
				System.out.println("Hello");
			}
			
			public String getName() {
				return name;
			}						
}
*/


//質問14︓以下１⾏を解釈してください。
//System.out.println(new Animal("cat").getName());

/*回答:
	通过Animal类实例化后调用了getter方法，给新对象的name属性赋值"cat"
*/

//質問15-18 回答不要;


//質問19︓以下Animalクラスを継承して以下２クラスを作成してください。
//	クラス Cat。sayHelloメソッドをオーバーライドして、System.out.println(“ニャー“);
//	クラス Dog。sayHelloメソッドをオーバーライドして、System.out.println(“ワン“);

/*回答:
 
 	public class Cat extends Animal{
	
		@Override
		public void sayHello() {
			System.out.println("ニャー");
	}	
}
 
	public class Dog extends Animal{
	
		@Override
		public void sayHello() {
			System.out.println("ワン");
	}
}
*/


//質問20︓以下コードをIS-A関係で説明してください。
/*	Animal v0 = new Animal(); // v0 は Animal 型
	Animal v1 = new Cat("a cat"); // v1 は Cat 型, v1 は Animal 型
	Animal v2 = new Dog("a dog"); // v2 は Dog 型, v2 は Animal 型
	Cat v3 = new Cat(""); // OK
	Dog v4 = new Dog(""); // OK
	Cat v5 = new Animal(""); // NG
*/

/*回答:
		Animal v0 = new Animal();   		括号里缺少String类型参数
		Animal v1 = new Cat("a cat");		Cat继承Animal，Animal为Cat的父类。
		Animal v2 = new Dog("a dog"); 		Dog继承Animal,Animal为Dog的父类。
		Cat v3 = new Cat(""); // OK			v3为实例化后的子类Cat
		Dog v4 = new Dog(""); // OK			v4为实例化后的子类Dog
		Cat v5 = new Animal(""); // NG		父子类格式错误， Animal v5 = new Cat(""); 是可行的
*/