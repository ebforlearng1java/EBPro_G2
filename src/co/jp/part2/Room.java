package co.jp.part2;

public class Room {

	 private Pet pet;
	    private final String roomNo;
	    private boolean idle; //true-空闲; false-占用

	    public Room(String roomNo) {
	        this.pet = null;
	        this.roomNo = roomNo;
	        this.idle = true;
	    }

	    
	    public Pet getPet() {
	        return pet;
	    }

	    public String getRoomNo() {
	        return roomNo;
	    }

	    public boolean isIdle() {
	        return idle;
	    }

	    public void printInfo() {
	        if (idle) {
	            System.out.printf("========= 当前房号[%s], 状态空闲\n", roomNo);
	        } else {
	            System.out.printf("========= 当前房号[%s], 状态占用, 住户名称[%s]\n", roomNo, pet.getName());
	        }
	    }

	    public void checkIn(Pet pet) {
	        this.pet = pet;
	        this.idle = false;
	    }

	    public void checkOut() {
	        this.pet = null;
	        this.idle = true;
	    }

}
