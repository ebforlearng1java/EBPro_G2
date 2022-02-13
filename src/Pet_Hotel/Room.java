package Pet_Hotel;

public class Room{
	public static int aquatic;
	public static int terrestrial;
	public static String[] room_a = new String[] {"101", "102", "103", "104", "105"};
	public static String[] room_t = new String[] {"201", "202", "203", "204", "205"};
	public static Pet[] guest_list_a;
	public static Pet[] guest_list_t;
	public static int after_a;
	public static int after_t;	
	
	public static void init(){
		aquatic = 5;
		terrestrial = 5;
		guest_list_a = new Aquatic[5];
		guest_list_t = new Terrestrial[5];
		after_a = 0;
		after_t = 0;
	}
	
	public static int afterdays(Pet[] stays){
		int after = 0;
		int a;	
		int b;	
	    for(int i=0; i<4; i++) {
	    	a = Integer.parseInt(stays[i].guest_stay);
	    	b = Integer.parseInt(stays[i+1].guest_stay);
	    	if(a<b) {
	    		after = a;
	    	}
	    	else {
	    		after = b;
	    	}
	    }
	    return after;
	}
	
	public static String checkin_ava(String type) {
		String roomNo = "null";
		if (type.equals("1")){
			if (Room.aquatic == 0) {
				roomNo = "很抱歉，目前没有相应空房。";
				after_a = afterdays(guest_list_a);
			}
			else {
				roomNo = Room.room_a[5-Room.aquatic];
			}
		}
		
		if (type.equals("2")){
			if (Room.terrestrial == 0) {
				roomNo = "很抱歉，目前没有相应空房。";
				after_t = afterdays(guest_list_t);
			}
			else {
				roomNo = Room.room_t[5-Room.terrestrial];
			}
		}
		
		return roomNo;
	}
	
	public static void guestlist(Pet guestlist, String[] guest) {
	    guestlist.guest_name = guest[1];
	    guestlist.guest_species = guest[2];
	    guestlist.guest_age = guest[3];
	    guestlist.guest_stay = guest[5];
	    guestlist.roomNo = guest[4];
	    guestlist.guest_service = guest[6];
//	    guestlist.free_service = guest[];
	}
	
	public static void checkin(String[] guest) {
		if(guest[2].equals("frog") && guest[2].equals("turtle") && guest[2].equals("lizard") && guest[2].equals("fish")
				 && guest[2].equals("dog") && guest[2].equals("cat") && guest[2].equals("rodent") && guest[2].equals("bird")){
			System.out.printf("很抱歉，本旅馆暂时无法为%s提供合适的服务。", guest[2]);
		}
		else{
			Pet guestlist = null;
			if (guest[0].equals("1")){
				aquatic = aquatic - 1;
				switch(guest[2]) {
					case "frog":
						guestlist = new Frog(guest);
						break;
					case "turtle":
						guestlist = new Turtle(guest);
						break;
					case "lizard":
						guestlist = new Lizard(guest);
						break;
					case "fish":
						guestlist = new Fish(guest);
						break;
					default:
						break;
				}
			}
			
			if (guest[0].equals("2")){
				terrestrial = terrestrial - 1;
				switch(guest[2]) {
					case "dog":
						guestlist = new Dog(guest);
						break;
					case "cat":
						guestlist = new Cat(guest);
						break;
					case "rodent":
						guestlist = new Rodent(guest);
						break;
					case "bird":
						guestlist = new Bird(guest);
						break;
					default:
						break;
				}
			}
			guestlist.free_service = guestlist.main();
			guestlist.enter();
			if (guest[0].equals("1")){
				Room.guest_list_a[5-Room.aquatic-1] = guestlist;
			}
			if (guest[0].equals("2")){
				Room.guest_list_t[5-Room.terrestrial-1] = guestlist;
			}
		}
	}	
}
