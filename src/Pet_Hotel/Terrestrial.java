package Pet_Hotel;

public abstract class Terrestrial extends Pet {
	public Terrestrial(String[] guest) {
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

class Dog extends Terrestrial implements Pet_Hotel.Run, Pet_Hotel.Petfood{
	public Dog(String[] guest) {
		super(guest);
		this.sound = "：汪汪！\n"; 
	}
	@Override
	public String main() {
		return Petfood.freeservice;
	}
	@Override
	public void enter(){
	   System.out.printf("前台送给了%s[%s]天份的%s\n", super.guest_name, super.guest_stay, Petfood.freeservice);
	   System.out.printf("%s开心地%s进了%s\n", this.guest_name, Run.move, this.roomNo);
	   System.out.printf(this.guest_name +  this.sound);
	}
	@Override
	public void leave(){
	   System.out.printf("%s%s出了%s\n", this.guest_name, Run.move, this.roomNo);
	   System.out.printf(this.guest_name +  this.sound);
	}
}

class Cat extends Terrestrial implements Pet_Hotel.Run {
	public Cat(String[] guest) {
		super(guest);
		this.sound = "：喵~\n";
	}
	@Override
	public String main() {
		return Petfood.freeservice;
	}
	@Override
	public void enter(){
	   System.out.printf("前台送给了%s[%s]天份的%s\n", super.guest_name, super.guest_stay, Petfood.freeservice);
	   System.out.printf("%s慢慢地%s进了%s\n", this.guest_name, Run.move, this.roomNo);
	   System.out.println(this.guest_name + this.sound);
   }
	@Override
	public void leave() {
	   System.out.printf("%s慢慢地%s出了%s\n", this.guest_name, Run.move, this.roomNo);
	   System.out.println(this.guest_name + this.sound);
	}
}

class Rodent extends Terrestrial implements Pet_Hotel.Hop {
	public Rodent(String[] guest) {
		super(guest);
		this.sound = "：叽叽！\n";
	}
	@Override
	public String main() {
		return Worm.freeservice;
	}
	@Override
	public void enter(){
	   System.out.printf("前台送给了%s[%s]天份的%s\n", super.guest_name, super.guest_stay, Petfood.freeservice);
	   System.out.printf("%s一下子%s进了%s\n", this.guest_name, Hop.move, this.roomNo);
	   System.out.println(this.guest_name +  this.sound);
    }
	@Override
	public void leave(){
	   System.out.printf("%s慢慢地%s出了%s\n", this.guest_name, Hop.move, this.roomNo);
	   System.out.println(this.guest_name + this.sound);
	}
}

class Bird extends Terrestrial implements Pet_Hotel.Fly {
	public Bird(String[] guest) {
		super(guest);
		this.sound = "：啾啾！\n";
	}
	@Override
	public String main() {
		return Worm.freeservice;
	}
	
	@Override
	public void enter(){
	   System.out.printf("前台送给了%s[%s]天份的%s\n", super.guest_name, super.guest_stay, Worm.freeservice);
	   System.out.printf("%s欢快地%s进了%s\n", this.guest_name, Fly.move, this.roomNo);
	   System.out.println(this.guest_name +  this.sound);
    }
	@Override
	public void leave(){
	   System.out.printf("%s%s出了%s\n", this.guest_name, Fly.move, this.roomNo);
	   System.out.println(this.guest_name +  this.sound);
	}
}