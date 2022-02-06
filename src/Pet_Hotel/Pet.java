package Pet_Hotel;

public abstract class Pet{
	
	public String guest_name;
	public String guest_species;
	public String guest_age;
	public String guest_stay;
	public String roomNo;
	public String guest_service;
	public String free_service;

	abstract void get_inf(String[] guest);
//		this.guest_name = guest[1];
//		this.guest_species = guest[2];
//		this.guest_age = guest[3];
//		this.guest_stay = guest[4];
//		this.roomNo = guest[5]
//		this.guest_service = guest[6];
//		
	abstract void enter(String sound);
		
	}
