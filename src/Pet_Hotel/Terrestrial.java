package Pet_Hotel;

import Pet_Hotel.Pet;

public abstract class Terrestrial extends Pet {
	
	@Override
	void get_inf(String[] guest) {
		this.guest_name = guest[1];
		this.guest_species = guest[2];
		this.guest_age = guest[3];
		this.roomNo = guest[4];
		this.guest_stay = guest[5];
		this.guest_service = guest[6];
		this.free_service = "play everyday";
	}
	@Override
	abstract public void enter(String sound);
}

class Dog extends Terrestrial{
	private String sound = "：汪汪！"; 
	@Override
	public void enter(String sound) {
	   System.out.printf("%s开心地跑进了%s", this.guest_name, this.roomNo);
	   System.out.printf(this.guest_name +  this.sound);	
	}
}

class Cat extends Terrestrial{
	private String sound = "：喵~";
	@Override
	public void enter(String sound) {
	   System.out.printf("%s慢慢地走进了%s", this.guest_name, this.roomNo);
	   System.out.println(this.guest_name + this.sound);
   }
}

class Rodent extends Terrestrial{
	private String sound = "：叽叽！";
	@Override
	public void enter(String sound) {
		   System.out.printf("%s一下子蹦进了%s", this.guest_name, this.roomNo);
		   System.out.println(this.guest_name +  this.sound);
    }
}

class Bird extends Terrestrial{
	private String sound = "：啾啾！";
	@Override
	public void enter(String sound) {
		   System.out.printf("%s欢快地飞进了%s", this.guest_name, this.roomNo);
		   System.out.println(this.guest_name +  this.sound);
    }

}