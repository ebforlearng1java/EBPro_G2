package co.jp.chapter11;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;

public class JavaHomework11 {

//	質問１︓駅クラス（Station）、路線クラス（Line）を作成して。路線をインスタンス化してオブジェクト「⼭⼿線」を作成してください。「⼭⼿線」に各駅情報を追加してください。
	
//	
//	public static void main(String[] args) {
//		
//		Line line = new Line();
//		
//		line.print();
//		
//		
//		List<String> station = new ArrayList<String>();
//		station.add("池袋");
//		station.add("大塚（東京）");
//		station.add("巣鴨");
//		station.add("駒込");
//		station.add("田端（東京）");
//		station.add("西日暮里");
//		station.add("日暮里");
//		station.add("鶯谷");
//		station.add("上野");
//		station.add("御徒町");
//		station.add("秋葉原");
//		station.add("神田（東京）");
//		station.add("東京");
//		station.add("有楽町");
//		station.add("新橋");
//		station.add("浜松町");
//		station.add("田町（東京）");
//		station.add("高輪ゲートウェイ");
//		station.add("品川");
//		station.add("大崎");
//		station.add("五反田");	
//		station.add("目黒");
//		station.add("恵比寿（東京）");
//		station.add("渋谷");	
//		station.add("原宿");
//		station.add("代々木");
//		station.add("新宿");
//		station.add("新大久保");
//		station.add("高田馬場");
//		station.add("目白");
//		
//		System.out.println(station);

//	
	
//	質問２︓質問１に作成した⼭⼿線の駅を foreach ⽂を繰り返して、新橋駅は路線内であるかを判断する
	
//	station.forEach(新橋 -> System.out.println(新橋));
//}	
//	
//	質問３︓10両編成している通勤電⾞、各⾞の定員は5⼈です。31⼈の乗⾞の状況をプログラミングしてください。（for⽂で旅客作成しても構わない）

	public void main (String[] args) {
		
		String[] car1 = new String[5];
		String[] car2 = new String[5];
		String[] car3 = new String[5];
		String[] car4 = new String[5];
		String[] car5 = new String[5];
		String[] car6 = new String[5];
		String[] car7 = new String[5];
		String[] car8 = new String[5];
		String[] car9 = new String[5];
		String[] car10 = new String[5];
		
		for (int i=0; i<=31; i++) {
			
			if(i<5) {
			car1[i] = "有人";
			System.out.println("1号车厢："+car1);
			}
			else if(i>=5 && i<10) {
				car2[i-5] = "有人";
				System.out.println("2号车厢："+car2);
			}
			else if(i>=10 && i<15) {
				car3[i-10] = "有人";
				System.out.println("3号车厢："+car3);
			}
			else if(i>=15 && i<20) {
				car4[i-15] = "有人";
				System.out.println("4号车厢："+car4);
			}
			else if(i>=20 && i<25) {
				car5[i-20] = "有人";
				System.out.println("5号车厢："+car5);
			}
			else if(i>=25 && i<30) {
				car6[i-25] = "有人";
				System.out.println("6号车厢："+car6);
			}
			else if(i>=30 && i<=31) {
				car7[i-30] = "有人";
				System.out.println("7号车厢："+car7);
			}
			else {
				System.out.println("8号车厢："+car8);
				System.out.println("9号车厢："+car9);
				System.out.println("10号车厢："+car10);
			}
			}
		
		
	}
	
	
}
	
	
	
	
	
	
	
	
	
	

