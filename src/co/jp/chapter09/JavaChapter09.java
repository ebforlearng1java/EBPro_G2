package co.jp.chapter09;

public class JavaChapter09 {

	//内部实装
	class SubClass implements Speak{

		@Override
		public void speak(String word) {
			// TODO 自動生成されたメソッド・スタブ
			System.out.println("SubClass" + word);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		JavaChapter09 obj = new JavaChapter09();
		SubClass subObj = obj.new SubClass();
		subObj.speak("内部实装");
		
		
		//匿名
		Speak obj3 = new Speak() {
			@Override
			public void speak(String word) {
				// TODO 自動生成されたメソッド・スタブ
				System.out.println("省去类名" + word);
			}
		};
		obj3.speak("匿名class");
		
		
		//ラムダ式
		Speak obj4 = (word)->{
			System.out.println("省去new" + word);
		};
		obj4.speak("ラムダ式");
	}

}
