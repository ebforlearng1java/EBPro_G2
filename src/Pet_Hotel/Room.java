package Pet_Hotel;

public class Room{
	public static int aquatic;
	public static int terrestrial;
	public static String[] room_a = new String[] {"101", "102", "103", "104", "105"};
	public static String[] room_t = new String[] {"201", "202", "203", "204", "205"};
	public static Pet[] guest_list_t;
	public static Pet[] guest_list_a;
	
	public static void init(){
			aquatic = 5;
			terrestrial = 5;
			guest_list_a = new Aquatic[5];
			guest_list_t = new Terrestrial[5];
	}
	
	public static String checkin_ava(String type) {
		String roomNo = "null";
		if (type.equals("1")){
			if (Room.aquatic == 0) {
				roomNo = "很抱歉，目前没有相应空房。";
			}
			else {
				roomNo = Room.room_a[5-Room.aquatic];
			}
		}
		
		if (type.equals("2")){
			if (Room.terrestrial == 0) {
				roomNo = "很抱歉，目前没有相应空房。";
			}
			else {
				roomNo = Room.room_t[5-Room.terrestrial];
			}
		}
		
		return roomNo;
	}
	
	public static void checkin(String[] guest) {
		
		if (guest[0].equals("1")){
			aquatic -= 1;
			switch(guest[2]) {
			case "frog":
				Pet a = new Frog();
				break;
			case "turtle":
				Pet a = new Turtle();
				break;
			case "lizard":
				Pet a = new Lizard();
				break;
			case "fish":
				Pet a = new Fish();
				break;
			}
		}
		
		if (guest[0].equals("2")){
			terrestrial -= 0;
			switch(guest[2]) {
			case "dog":
				Pet a = new Dog();
				break;
			case "cat":
				Pet a = new Cat();
				break;
			case "rodent":
				Pet a = new Rodent();
				break;
			case "bird":
				Pet a = new Bird();
				break;
			}
		}
		a.enter();
	}
	
	public static String[][] consult() {
		
	}
	
	public static String roomservice() {
		
	}
	
	public static void checkout() {
		
	}
	
}
