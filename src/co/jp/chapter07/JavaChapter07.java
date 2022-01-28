package co.jp.chapter07;

public class JavaChapter07 {

	public static void main (String[] args) {
		
//		
//		String abc = null;
//		System.out.println(abc);
//		
//		String efg = "null";
//		System.out.println(efg);
//		
//		System.out.println("不一致");
		
		Animal x1 = new Animal();
		
		x1.alive = true;
		x1.legs = 4;
		x1.cells = new String[] {"","","","","","","","","",""};
		
		System.out.println(isAnimal(x1));
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
