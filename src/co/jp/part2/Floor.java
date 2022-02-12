package co.jp.part2;

public class Floor {
	  private final String floorNo;
	    private final int roomCount;
	    private final Room[] rooms;

	    public Floor(String floorNo, int roomCount) { //建立楼层和房间号
	        this.floorNo = floorNo;
	        this.roomCount = roomCount;
	        this.rooms = new Room[roomCount];
	        for (int i = 0; i < roomCount; i++) {
	            this.rooms[i] = new Room(floorNo + "0" + (i + 1));
	        }
	    }

	    public Room[] getRooms() {
	        return rooms;
	    }

	    public void printInfo() { //打印房间信息
	        System.out.printf("====== 当前楼号[%s], 共有房间数[%d]\n", floorNo, roomCount);
	        for (Room room : rooms) {
	            room.printInfo();
	        }
	    }
}
