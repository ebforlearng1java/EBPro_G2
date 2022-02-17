package co.jp.chapter11;

import java.util.ArrayList;
import java.util.List;

public class JavaHomeWork11 {

	public static void main(String[] args) {
		/*質問１︓駅クラス（Station）、路線クラス（Line）を作成して。路線をインスタンス化し
		 * てオブジェクト「⼭⼿線」を作成してください。「⼭⼿線」に各駅情報を追加してください。
		 */
		Line line = new Line();
		line.name = "⼭⼿線";
		line.station = new ArrayList<Station>();
		
		//山手线各站名字的数组
		String[] Yamanote = {
				"東京","神田","秋葉原","御徒町","上野","鶯谷","日暮里",
				"西日暮里","田端","駒込","巣鴨","大塚","池袋","目白",
				"高田馬場","新大久保","新宿","代々木","原宿","渋谷",
				"恵比寿","目黒","五反田","大崎","品川","高輪ゲートウェイ",
				"田町","浜松町","新橋","有楽町"
		};
		
		System.out.println(line.name);
		//各駅情報を追加
		for(int i = 0; i < Yamanote.length; i++) {
			Station station = new Station();
			station.name = Yamanote[i];
			station.number = i + 1;
			line.station.add(station);
			System.out.print(line.station.get(i).number);
			System.out.println(line.station.get(i).name);
		}
		
		
		//質問２︓質問１に作成した⼭⼿線の駅を foreach ⽂を繰り返して、新橋駅は路線内であるかを判断する。
		if(line.station != null){
			for(int i = 0; i < line.station.size(); i++) {
				if("新橋".equals(line.station.get(i).name)) {
					System.out.println("山手线有新桥站");
					break;
				}
				if(i+1 == line.station.size() && "新橋" != line.station.get(i).name) {
					System.out.println("山手线没有新桥站");
				}
			}
		}
		
		
		/*質問３︓10両編成している通勤電⾞、各⾞の定員は5⼈です。31⼈の乗⾞の状況をプログラミングしてください。
		 * （for⽂で旅客作成しても構わない
		 */
		
		//乘客数
		int passenger = 31;
		//电车
		List<List<String>> tram = new ArrayList<>();
		
		
		//有人是1没人是0
		for(int i = 0; i < 10; i++) {
			List<String> tram_one = new ArrayList<>();
			for(int j = 0; j < 5; j++) {
				
				if(passenger > 0) {
					tram_one.add("1");
					passenger--;
				}else {
					tram_one.add("0");
				}
			}
			tram.add(tram_one);
			System.out.println(tram.get(i));
		}
		
	}

}
