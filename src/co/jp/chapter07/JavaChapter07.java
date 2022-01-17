package co.jp.chapter07;

public class JavaChapter07 {



	static final float PAI = 3.1415926f;






	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		////
		////		String str = "abc";
		//		String str = new String("abc");
		//
		////		int index = 100;
		//		Integer index = 100;
		//
		//		Integer index2 = new Integer(100);

		//		//		String abc = null;
		//		String abc = null;
		//
		//		System.out.println(abc);
		//
		//		//		String efg = "null";
		//		String efg = new String("abc");
		//
		//		System.out.println(efg);
		//
		//		// == アドレスを含めて比較
		////		if (abc == efg) {
		////			System.out.println("==比較結果：一致");
		////		} else {
		////			System.out.println("==比較結果：不一致");
		////		}
		//
		//		// 値のみ比較
		//		if (abc.equals(efg)) {
		//			System.out.println("equals 比較結果：一致");
		//		} else {
		//			System.out.println("equals 比較結果：不一致");
		//		}
		//
		//






		Animal x1 = new Animal(true, 4 , new String[]{"","","","","","","","","",""});
		System.out.println("x1 の結果"+isAnimal(x1) + "   count = " + x1.count);

		Animal x2 = new Animal(false, 0 , new String[]{"1","2","3","4","5","6","7","8","9","0"});
		System.out.println("x2 の結果"+isAnimal(x2) + "   count = " + x2.count);

		Animal x3 = new Animal(true, 3 , new String[]{"","","","","","","","","",""});
		System.out.println("x3 の結果"+isAnimal(x3) + "   count = " + x3.count);

		Animal x4 = new Animal(false, 4 , new String[]{"","","","","","","","","",""});
		System.out.println("x4 の結果"+isAnimal(x4) + "   count = " + x4.count);

		Animal x5 = new Animal(false, 5 , new String[]{"","","","","","","","123123","",""});
		System.out.println("x5 の結果"+isAnimal(x5) + "   count = " + x5.count);

		Animal x6 = new Animal(true, 6 , new String[]{"","","","","123123123","","","","",""});
		System.out.println("x6 の結果"+isAnimal(x6) + "   count = " + x6.count);

		Animal x7 = new Animal(false, 7 , new String[]{"","","","","","","","","",""});
		System.out.println("x7 の結果"+isAnimal(x7) + "   count = " + x7.count);

		Animal x8 = new Animal(true, 8 , new String[]{"","","","","","","","","",""});
		System.out.println("x8 の結果"+isAnimal(x8) + "   count = " + x8.count);

		System.out.println("x1 の結果"+isAnimal(x1) + "   count = " + x1.count);


//		x1.setAlive(true);
//		x1.setLegs(4);
//		x1.setCells(new String[]{"","","","","","","","","",""});

//		x1.alive = true;
//		x1.legs = 4;
//		x1.cells = new String[]{"","","","","","","","","",""};












	}

	public static String isAnimal(Animal animal) {

		String rtn = "";

		String[] cells = animal.getCells();

		int count = 0;

		for (int i = 0; i < cells.length; i++) {
			if ("".equals(cells[i])) {
				count++;
			}
		}

		if (animal.isAlive() &&
				animal.getLegs() > 0 &&
				count >= 8) {
			rtn = "Animal";
		} else {
			rtn = "Plant";
		}

		return rtn;

	}

}
