package co.jp.chapter08;

public class Dog extends Animal{
		String run;
		
		public Dog(boolean alive, int legs, String[] cells, String run) {
			super(alive,legs,cells);//父类
			this.run = run;
		}
}
