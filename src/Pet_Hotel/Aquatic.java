package Pet_Hotel;

import Pet_Hotel.Pet;

public abstract class Aquatic extends Pet {
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

class Frog extends Aquatic{
	private String sound = "：呱呱！";
	@Override
	public void enter(String sound) {
	   System.out.printf("%s蹦进了%s", this.guest_name, this.roomNo);
	   System.out.printf(this.guest_name +  this.sound);	
	}
}

class Turtle extends Aquatic{
	@Override
	public void enter(String sound) {
	   System.out.printf("%s慢慢地爬进了%s", this.guest_name, this.roomNo);
   }
}

class Lizard extends Aquatic{
	@Override
	public void enter(String sound) {
		   System.out.printf("%s一扭一扭爬进了%s", this.guest_name, this.roomNo);
    }
}

class Fish extends Aquatic{
	@Override
	public void enter(String sound) {
		   System.out.printf("%s游进了%s", this.guest_name, this.roomNo);
    }

}