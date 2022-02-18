package co.jp.chapter11;

public class JavaHomeWork11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	質問１︓駅クラス（Station）、路線クラス（Line）を作成して。路線をインスタンス化してオブジェクト「⼭⼿線」を作成してください。「⼭⼿線」に各駅情報を追加してください。
//	回答１︓		
		Line yamate = new Line("山手線");
		String database ="東京\n有楽町\n新橋\n浜松町\n田町\n品川\n大崎\n五反田\n目黒\n恵比寿\n渋谷\n原宿\n々木\n新宿\n新大久保\n高田馬場\n目白\n池袋\n大塚\n巣鴨\n駒込\n田端\n西日暮里\n日暮里\n鶯谷\n上野\n御徒町\n秋葉原\n神田";		String[] array =database.split("\n");
		for(String name:array) {
			Station station = new Station(name);
			yamate.establish(station);
		}
//	質問２︓質問１に作成した⼭⼿線の駅を foreach ⽂を繰り返して、新橋駅は路線内であるかを判断する。
//	回答２︓	
		yamate.stations.forEach((e)->{ 
			if(e.name.equals("新橋")) { 
				System.out.println("新橋駅は路線内である！");
			}
		});
	}

}
