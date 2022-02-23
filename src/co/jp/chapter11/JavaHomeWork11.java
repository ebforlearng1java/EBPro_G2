package co.jp.chapter11;

import java.util.List;
import java.util.function.IntPredicate;

import co.jp.part2.hotel;

import java.util.ArrayList;

//質問１︓駅クラス（Station）、路線クラス（Line）を作成して。路線をインスタンス化してオブジェクト「⼭⼿線」を作成してください。「⼭⼿線」に各駅情報を追加してください。
public class JavaHomeWork11 {

	public static void main(String[] args) {
		
		Line yamanoteLine = new Line();

		yamanoteLine.station = new ArrayList<Station>();
		
		String[] stationName = {"池袋,大塚（東京）,巣鴨,駒込,田端,西日暮里,日暮里,鶯谷,上野,御徒町,秋葉原,神田,"
				+ "東京,有楽町,新橋,浜松町,田町（東京）,高輪ゲートウェイ,品川,大崎,五反田,目黒,恵比寿（東京）,渋谷,原宿,代々木,新宿,新大久保,高田馬場,目白"};
				
		for (int i = 0; i < stationName.length; i++) {
			 
			Station station = new Station();
			station.name = stationName[i];
			yamanoteLine.station.add(station);
			
			System.out.println(yamanoteLine.station.get(i).name);
			
		}
//質問２︓質問１に作成した⼭⼿線の駅をforeach⽂を繰り返して、新橋駅は路線内であるかを判断する。	
		for (String data : stationName) {
			if(data.contains("新橋")) {
			 System.out.println("新橋駅は山の手線内にあります");
			 }
				else {
				 System.out.println("新橋駅は山の手線内にありません");
			 }break;
		}
		
//質問３︓10両編成している通勤電⾞、各⾞の定員は5⼈です。31⼈の乗⾞の状況をプログラミングしてください。（for⽂で旅客作成しても構わない）
		int passenger = 31;
		//创建车厢
		List<List<String>> train = new ArrayList<>();
		for(int i=0; i<10; i++) {
			
			//填入人数
			List<String> passengerList = new ArrayList<>();
			for(int j=0; j<5; j++) {
				
				if(passenger >0) {
					passengerList.add("人");
					passenger--;
				}
				
			}
			train.add(passengerList);


			System.out.println(train.get(i));

		}
		
	}
}