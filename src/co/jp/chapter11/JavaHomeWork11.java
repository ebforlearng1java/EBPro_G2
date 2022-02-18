package co.jp.chapter11;

import java.util.ArrayList;
import java.util.List;

public class JavaHomeWork11 {

	public static void main(String[] args) {
		//Q1
		Line line = new Line();
		line.name = "⼭⼿線";
		line.station = new ArrayList<Station>();
		
	
		String[] Stationlist = {
				"東京駅","神田駅","秋葉原駅","御徒町駅","上野駅","鶯谷駅","日暮里駅",
				"西日暮里駅","田端駅","駒込駅","巣鴨駅","大塚駅","池袋駅","目白駅",
				"高田馬場駅","新大久保駅","新宿駅","代々木駅","原宿駅","渋谷駅",
				"恵比寿駅","目黒駅","五反田駅","大崎駅","品川駅","高輪ゲートウェイ駅",
				"田町駅","浜松町駅","新橋駅","有楽町駅"
		};
		
		System.out.println(line.name);

		for(int i = 0; i < Stationlist.length; i++) {
			Station station = new Station();
			station.name = Stationlist[i];
			station.number = i++;
			line.station.add(station);
//			System.out.print(line.station.get(i).number);
//			System.out.println(line.station.get(i).name);
		}
		
		
		//Q2
		
		if(line.station != null){
			int i;
			for(i = 0; i < line.station.size(); i++) {
				if("新橋駅".equals(line.station.get(i).name)) {
					System.out.println("新橋駅は路線内である");
					break;
				}
			}
			if(i==line.station.size()&&!"新橋駅".equals(line.station.get(i).name)) {
				System.out.println("新橋駅は路線外である");
			}
			
		}
		
		
		//Q3
		
	
		int passenger = 31;

		List<List<String>> train = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			List<String> carriage = new ArrayList<>();
			train.add(carriage);
		}
		
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 10; j++) {
				if(passenger > 0) {
					train.get(j).add("*");
					passenger--;
				}else {
					train.get(j).add("-");
				}
			}
		}

		for(int i = 0; i < 10; i++){
				System.out.println(train.get(i));
		}
	}

	

}
