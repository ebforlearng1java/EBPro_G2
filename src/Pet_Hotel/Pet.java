package Pet_Hotel;

public abstract class Pet{
	
	public String roomtype;
	public String guest_name;
	public String guest_species;
	public String guest_age;
	public String guest_stay;
	public String roomNo;
	public String guest_service;
	public String free_service;
	public String sound;

	abstract String main();
	
	abstract void enter();
	
	abstract void leave();


		
	}
