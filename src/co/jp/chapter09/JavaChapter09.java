package co.jp.chapter09;

public class JavaChapter09 {

	class SubClass implements Speak {

		@Override
		public void speck(String word) {
			// TODO 自動生成されたメソッド・スタブ
			System.out.println("subClass:" + word);
		}

	}

	public static void main(String[] args) {

		JavaChapter09 obj = new JavaChapter09();
		SubClass subObj = obj.new SubClass();

		subObj.speck("hello world form subObj!");

		// 3
		Speak obj3 = new Speak() {
			@Override
			public void speck(String word) {
				System.out.println("匿名クラス:" + word);
			}

		};
		obj3.speck("hello world form obj3!");

		// 4 ラムダ式
		Speak obj4 = (t) -> {System.out.println("ラムダ:" + t);};

		obj4.speck("hello world form obj4!");

	}

}
