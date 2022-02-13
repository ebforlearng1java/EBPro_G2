package Pet_Hotel;

public abstract class Aquatic extends Pet {
	public Aquatic(String[] guest) {
		this.roomtype = guest[0];
		this.guest_name = guest[1];
		this.guest_species = guest[2];
		this.guest_age = guest[3];
		this.roomNo = guest[4];
		this.guest_stay = guest[5];
		this.guest_service = guest[6];
		this.free_service = null;
	}
	@Override
	abstract public String main();
	abstract public void enter();
	abstract public void leave();
}

class Frog extends Aquatic implements Pet_Hotel.Hop, Pet_Hotel.Worm{
	public Frog(String[] guest) {
		super(guest);
		this.sound = "：呱呱！\n";
	}
	@Override
	public String main() {
		return Worm.freeservice;
	}
	@Override
	public void enter() {
	    System.out.printf("前台送给了%s[%s]天份的%s\n", super.guest_name, super.guest_stay, Worm.freeservice);
	    System.out.printf("%s%s进了%s\n", super.guest_name, Hop.move, super.roomNo);
	    System.out.printf(super.guest_name + this.sound);	
	}
	@Override
	public void leave() {
	    System.out.printf("%s%s出了%s\n", super.guest_name, Hop.move, super.roomNo);
	    System.out.printf(super.guest_name + this.sound);	
	}
}

class Turtle extends Aquatic implements Pet_Hotel.Crowl, Pet_Hotel.Worm{	
	public Turtle(String[] guest) {
		super(guest);
		this.sound = "：... ...\n";
	}
	@Override
	public String main(){
		return Worm.freeservice;
	}
	@Override
	public void enter() {
		System.out.printf("前台送给了%s[%s]天份的%s\n", super.guest_name, super.guest_stay, Worm.freeservice);
		System.out.printf("%s慢慢地%s进了%s\n", super.guest_name, Crowl.move, super.roomNo);
	    System.out.printf(super.guest_name +  this.sound);
   }
	@Override
	public void leave() {
	   System.out.printf("%s慢慢地%s出了%s\n", super.guest_name, Crowl.move, super.roomNo);
	   System.out.printf(super.guest_name + this.sound);
	}
}

class Lizard extends Aquatic implements Pet_Hotel.Crowl, Pet_Hotel.Worm{
	public Lizard(String[] guest) {
		super(guest);
		this.sound = "：... ...\n";
	}
	@Override
	public String main(){
		return Worm.freeservice;
	}
	
	@Override
	public void enter() {
		System.out.printf("前台送给了%s[%s]天份的%s\n", super.guest_name, super.guest_stay, Worm.freeservice);
	    System.out.printf("%s一扭一扭%s进了%s\n", super.guest_name, Crowl.move, super.roomNo);
	    System.out.printf(super.guest_name + this.sound);
	}
	@Override
	public void leave() {
	   System.out.printf("%s一扭一扭%s出了%s\n", super.guest_name, Crowl.move, super.roomNo);
	   System.out.printf(super.guest_name + this.sound);
	}
}

class Fish extends Aquatic implements Pet_Hotel.Swim{
	public Fish(String[] guest) {
		super(guest);
		this.sound = "：... ...\n";
	}
	@Override
	public String main(){
		return Worm.freeservice;
	}
	
	@Override
	public void enter() {
	   System.out.printf("%s%s进了%s\n", super.guest_name, Swim.move, super.roomNo);
	   System.out.printf(super.guest_name +  this.sound);
	}
	@Override
	public void leave() {
	   System.out.printf("%s%s出了%s\n", super.guest_name, Swim.move, super.roomNo);
	   System.out.printf(super.guest_name +  this.sound);
	}
}