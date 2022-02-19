package co.jp.chapter11;

public class Station {
	
	String name;

	public Station(String name) {
		super();
		this.name = name;
	}

	public Station() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void nameInfo(String name) {
		
		System.out.println(name);
		
		
	}

}
