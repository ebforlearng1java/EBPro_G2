package co.jp.chapter11;

import java.util.ArrayList;


public class JavaHomeWork11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//質問１︓駅クラス（Station）、路線クラス（Line）を作成して。路線をインスタンス化し
		//てオブジェクト「⼭⼿線」を作成してください。「⼭⼿線」に各駅情報を追加してください。
		
		Station station = new Station();
		Line line = new Line();
		line.yamanote = new ArrayList<>();
		
		String[] name = {"池袋","上野","秋葉原","神田","東京","品川","渋谷","新宿","新橋", "駒込"};
		
		for (int i = 0; i < name.length; i++) {
			station.name = name[i];
			line.yamanote.add(station.name);
			System.out.println("The station #" + i + " is  " + line.yamanote.get(i));
			
		}
		

		
		//質問２︓質問１に作成した⼭⼿線の駅を foreach ⽂を繰り返して、新橋駅は路線内である
		//かを判断する。
		
		int initial = 0;
		for(int i = 0; i < line.yamanote.size(); i++) {
			if("新橋".equals(line.yamanote.get(i))) {
				initial = 1;
			}
		}
		
		if (initial == 1) {
			System.out.println("あり");
		}else {
			System.out.println("なし");
		}
		
		
		//質問３︓10両編成している通勤電⾞、各⾞の定員は5⼈です。31⼈の乗⾞の状況をプログ
		//ラミングしてください。（for⽂で旅客作成しても構わない）
		
		int upper = 9;
		int lower = 0;
		ArrayList<Integer> capacity = new ArrayList<Integer>();
		int current = 0;
		int r = -1;
		ArrayList<Integer> passenger = new ArrayList<Integer>();
		
		//Initialize the number of passengers for each room and set them all to be 0.
		for(int i = 0; i < 10; i++) {
			capacity.add(0);
		}
		
		
		for (int i = 0; i < 31; i++) {
			String person = "passenger #" + i;
			
			//Generate a number betweemn 0 and 9 which represents the room that passenger i picks for.
			//Update the number of people of the room that passenger i picks up.
			//If the number of people of the room that passenger i picks already exceeds 5 people,
			//then generate again the number that stands for the room for passenger i until the room
			//he pickes up still has space.
			do {
				current = 0;
				// generate random interger between 0 and 9 to be used as random room passenger enters in.
			    r = (int) (Math.random() * (upper - lower)) + lower; 
				current = capacity.get(r)+ 1;
			}while(current > 5);
			
			capacity.set(r, current);
			passenger.add(r);
					
			
		}
		
		
		for(int i = 0; i < 31; i++) {	
			int per = i + 1;
			String person = "Passenger #" + per;
			String room = "Room #" + passenger.get(i);;
		    System.out.println(person + "  is in  " + room);
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Room #" + i + "  has  "+ capacity.get(i) + "  passengers. " + "\n");
		}
		

	}

}
