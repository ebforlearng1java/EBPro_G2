package co.jp.chapter09;

public class Ludi extends Animal{

	@Override //帮忙检测父类里的方法删掉时，会报错
	void speck(String word) {
		System.out.println("i am ludishengwu");
	}
	
}
