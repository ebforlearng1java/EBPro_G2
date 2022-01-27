package co.jp.chapter06;

public class JavaChapter06 {

	public static void main(String[] args) {  //void无返回值类型
		// TODO 自動生成されたメソッド・スタブ
		int a = 100;
		int b = 50;
		
		int c = sum(a,b);
		System.out.println(c);
		
		
		
	}
	static int sum(int a,int b) {
		return a+b;
	}
	
	static int sum(String a,String b) { //函数同名，返回值类型一样，参数类型不同时，为重载
		return 1;
	}
}
