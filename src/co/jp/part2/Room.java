package co.jp.part2;

public class Room {

	/*
    房间编号：
    一楼：101 102 103 104 105  ...
    二楼：201 202 203 204 205  ...
    .......
*/
private int no;

/*
   true表示房间空闲，可以预定。
   false表示房间占用，不能预定。
*/

private boolean status;

Pet pet ;
public Pet getPet() {
	return pet;
}

public void setPet(Pet pet) {
	this.pet = pet;
}

public Room() {
	
}

public Room(int no,boolean status) {
   this.no = no;
   this.status = status;
}

//setget
public int getNo() {
   return no;
}

public void setNo(int no) {
   this.no = no;
}

public boolean isStatus() {
   return status;
}

public void setStatus(boolean status) {
   this.status = status;
}

public String toString() {
   return "Room{" + no + "," + (status ? "空闲" : "占用") + " }";
}

}
