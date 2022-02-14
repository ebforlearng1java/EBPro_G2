package co.jp.chapter07;

public class Animal {//class 类修饰子 Animal类名 class前的access修饰子必为public
	
	public boolean alive;
	public int legs;
	public String[]cells;
	public Animal(boolean alive, int legs, String[] cells) {
		super();
		this.alive = alive;
		this.legs = legs;
		this.cells = cells;
	}

	
	
	
	
	
//	private boolean alive;//true : alive false : dead 属性私有化后，不可用.来调用，只可用set方法将属性改变(封装)
//	//legs >2
//	int legs;
//	//
//	String[] cells;//cells legs alive 成员变量、属性，クラスメンバ
//	public boolean isAlive() {
//		return alive;
//	}
//	public void setAlive(boolean alive) {
//		this.alive = alive;
//	}
//	public int getLegs() {
//		return legs;
//	}
//	public void setLegs(int legs) {
//		this.legs = legs;
//	}
//	public String[] getCells() {
//		return cells;
//	}
//	public void setCells(String[] cells) {
//		this.cells = cells;//get set 方法
	}
	
	
	


