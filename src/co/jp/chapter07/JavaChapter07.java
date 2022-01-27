package co.jp.chapter07;

public class JavaChapter07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Animal xl = new Animal();
		xl.setAlive(true);
		xl.setLegs(4);
		xl.setCells(new String[] {"","","","","","",""});
		
		System.out.println(isAnimal(xl));
	}
	
	
	public static String isAnimal(Animal animal) {
		String rtn = "";
		
		String[] cells = animal.getCells();
		
		int count = 0;
		
		for(int i = 0; i < cells.length; i++) {
			if("".equals(cells[i])) {
				count++;
			}
		}
		
		if(animal.isAlive() && animal.getLegs() > 0 &&
				count >= 8) {
			rtn = "Animal";
		}else {
			rtn = "Plant";
		}
		return rtn;
	}

}
