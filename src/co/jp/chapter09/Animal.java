package co.jp.chapter09;

public abstract class Animal {



	// 1 alive  true: O2  false: CO2
	public boolean alive;

	// 2 legs   > 0   = 0
	public int legs;

	// 3 array[ "":膜  "abcefg...": 壁  ]
	public String[] cells;


	public static  int COUNT = 0;


//	abstract void speck(String word) ;


	void sum(){
		COUNT++;
	}



}
