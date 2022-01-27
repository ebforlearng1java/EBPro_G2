package co.jp.chapter08;

public class Employee {
	//質問２︓以下コードの出⼒を回答してください。
	private String id;
	
	public Employee(String id) {
		 this.id = id;
	}
	
	@Override
	public boolean equals(Object another) {
		if (another instanceof Employee) {
			Employee an = (Employee) another;
			return an.id.equals(id);
		}
		return false;
	 }

}
