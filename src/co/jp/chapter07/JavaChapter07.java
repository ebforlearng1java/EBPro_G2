package co.jp.chapter07;

public class JavaChapter07 {

//	public JavaChapter07() {
//		// 1 alive true: 02 false : C02
//		boolean alive;
//		// 2 legs >0  =0
//		int legs;
//		
//		// array ["":膜 "abcdegf]
		
//		String abc = "abc";
//		System.out.println(abc);
//		
//		String efg = new String("abc");
//		System.out.println(efg);
//		
//		if(abc.equals(efg)) {
//			System.out.println("euaqls 比較結果: 一致");
//		}
//		else {
//			System.out.println("euaqls 比較結果: 不一致");
//		}
				
//		Animal xl = new Animal;
//		public String isAnimal(Animal animal) {
//		   	  String rtn = "";
//		
//			  String[] cells = animal.getCells();
//		
//			  int count = 0;
//		
//			  for (int i = 0; i < cells.length; i++) {
//				   if ("".equals(cells[i])) {
//					   count++;
//				   }
//			  }
//
//		  if (animal.isAlive() && animal.getLegs() > 0 && count >= 8) {
//			  rtn = "Animal";
//		  } 
//		  else{
//			  rtn = "Plant";
//		  }
//	
//		  return rtn;
//			 }
//			
//	}

	// Pet.java
	public class Pet {
		public String name;
	 
		public void setName(String value) {
			this.name = value;
		} 
	}
	// Kicker.java
	public class Kicker {
		public static void main(String...args) {
			Pet cat = new Pet();
			cat.setAge(1234);
		} 
	}

}
