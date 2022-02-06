package co.jp.presentation;

public class Room {
	
    String petname;
	int petage;
	int roomnum;
	String pettype;
	String[] existname = {"null","null","null","null"};
	
	
	
	
	static int count = 0;
	static int available = 0;
	
	
	public void food(String type) {
		if("dog".contentEquals(type)) {
			System.out.println("Dog can gnaw. " );
		} else if("cat".contentEquals(type)) {
			System.out.println("Cat can eat. " );
		} else if("bird".contentEquals(type)) {
			System.out.println("Bird can peck. " );
		}
	}
	
	public int info() {
        int index = 0;
        String searchStr1 = "null";
        String searchStr2 = petname;
        for (int i = 0; i <existname.length; i++) {
        	if(searchStr1.equals(existname[i])) {
                index = i; 
                existname[i] = petname;
                System.out.println(petname +" checks in for Room  "+ index);
                count = count + 1;
                available = existname.length - count;
                System.out.println("The hotel now has  "+ available  +  "  rooms available");
                break;
            }else if(searchStr2.equals(existname[i])) {
            	index = i;           
                existname[i] = "null";
                System.out.println(petname +" checks out for Room  "+ index);
                count = count - 1;
                available = existname.length - count;
                System.out.println("The hotel now has  "+ available  +  "  rooms available");
                break;
            }else if(count >= existname.length) {
            	
                System.out.println("No room avilabe");
                
                break;
            }
        }
        
        return index;
 
     }
	
	
	
	
	//public int roominfo(int roomnum, String type) {
	//	if(roomnum < 2) {
	//		roomnum = roomnum;
	//		System.out.println(type + "lives in Room  " + roomnum);
	//	}else {
	//		System.out.println("No room available");
	//	}
		
	//	return roomnum;
	//}
	
	public int roominfo(int age) {
		petage = age;
		System.out.println("The age of the pet is: " + petage);
		return petage;
	}


	public String roominfo(String name) {
		petname = name;
		
		
		System.out.println("The name of the pet is: " + petname);
		return petname;
	}

	public void waterplay() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Dog can swim  ");
	}

	public void ballplay() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Cat likes balls  ");
	}

	
		
	
	

}
