package co.jp.chapter06;

import java.lang.reflect.Array;

public class JavaHomeWork06 {

//   写在前面，我一不小心把文件给删了。。。。。这是local恢复回来的文件。日文部分都是乱码。。。。我明天修复一下，这太吓人了。如果在check的时候我还没来得及改，请先看代码部分。
//								对不起！！！！！我尽快！！！！！！！
	
//	璩晱锛戯紟浠ヤ笅闁㈡暟銇慨椋锯鸡銆佽繑鍗村瀷銆侀枹鏁板悕銆佸紩鏁帮紙寮曟暟銇瀷銉诲悕绉帮級銈掑洖绛斻仐銇︺亸銇犮仌銇勩��
//	1 public static void main(String[] args);
//
//	Answer: public銆�淇＞饧︺��鍏枊 
//		    static銆�淇＞饧︺��闈欑殑  銆�
//		  	void銆�杩斿嵈鍊ゃ��锛愩��銆�
//			main銆�闁㈡暟鍚�
//			String[]銆�寮曟暟銇瀷銆�String銇厤鍒楀瀷
//			args銆�寮曟暟銇悕
	
	
//	璩晱锛掞紟閰嶅垪銇拰銆丮AX鍊ゃ�丮IN鍊ゃ倰姹傘倎銈嬪嚘鐞嗐倰闁㈡暟鍖栥仐銇︺亸銇犮仌銇勩�乵ain闁㈡暟銇懠銇冲嚭銇椼仸銇忋仩銇曘亜銆�
//	1銆�// 渚嬶細閰嶅垪銇甅ax鍊ゃ倰姹傘倎銈嬨儭銈姐儍銉�
//	2銆�public static int max(int[] datas) {
//	3 	// ...鍑︾悊銈掕杓�
//	4銆�}
//	
//	Answer:
//		public static void main(String[] args) {
//		int[] array = new int[] { 3, 6, 8, 9, 2, 4, 5 };
//		int sum = 0;
//		for (int i = 0; i < array.length; i++) {
//			sum = sum + array[i];
//			}
//		System.out.println("閰嶅垪銇拰:" + sum);
//
//		int max = array[0];
//		for (int i = 0; i < array.length; i++) {
//			if (array[i] > max) {
//				max = array[i];
//			}
//		}
//		System.out.println("MAX:" + max);
//	
//		int min = array[0];
//		for (int i = 0; i < array.length; i++) {
//			if (array[i] > min) {
//				min = array[i];
//			}
//		}
//		System.out.println("MIN:" + min);
//	}
//}

//	

//	
//	璩晱锛擄紟浠ヤ笅銉°偨銉冦儔銇疅鏂界祼鏋溿倰鏁欍亪銇︺亸銇犮仌銇勩��
//	1銆�public class Kicker {
//	2銆�	private static void sayHello(String y) {
//	3 		y = "Hello world";
//	4	}
//	5	public static void main(String args[]) {
//	6 		String x = null;
//	7 		sayHello(x);
//	8銆�		System.out.println(x);
//	9銆�銆�}
// 10銆�}
//	     Answer:   null
//	
//	璩晱锛旓笓浠ヤ笅銉°偨銉冦儔銇疅鏂界祼鏋溿倰鏁欍亪銇︺亸銇犮仌銇勩��
//	1 public class Kicker {
//	2 	private static void fillArray(String[] array) {
//	3 		array[0] = "value2";
//	4 	}
//	5 	public static void main(String args[]) {
//	6 		String[] array = new String[]{"value1"};
//	7 		fillArray(array);
//	8 		System.out.println(array[0]);
//	9 	}
// 10 }
//	
//	Answer: value2
//	
//	 璩晱锛曪笓浠ヤ笅銉°偨銉冦儔銇疅鏂界祼鏋溿倰鏁欍亪銇︺亸銇犮仌銇勩��
//	1 public class Kicker {
//	2 	private static void fillArray(String[] array) {
//	3 		array = new String[]{"1", "2"};
//	4 	}
//	5 	public static void main(String args[]) {
//	6 		String[] array = null;
//	7 		fillArray(array);
//	8 		System.out.println(array == null);
//	9 	}
// 10 }
//	
//	Answer: true
//	
//	
//	璩晱锛�-锛愶笓閰嶅垪銇洿鎺ャ伀鍗板埛銇с亶銇俱仜銈撱�備笅瑷樸儭銈姐儍銉夈倰鍒┾饯銇椼仸銆侀厤鍒椼倰print銇椼伨銇欍�備互涓嬨儭銈姐儍銉夈倰鍛笺伋鍑恒仐銇︺亸銇犮仌銇勩��
//	1 public static void printArray(Object[] objs) {
//	2 	if(objs == null) {
//	3 		System.out.println("null");
//	4 		return;
//	5 	}
//	6 	String prefix = "";
//	7 	StringBuilder sb = new StringBuilder();
//	8 	sb.append("[");
//	9 	for(Object obj : objs) {
// 10 		sb.append(prefix);
// 11 		sb.append(String.valueOf(obj));
// 12 		prefix = ", ";
// 13 	}
// 14 	sb.append("]");
// 15 	System.out.println(sb.toString());
// 16 }
// 
//	
//	璩晱锛�-锛戯笓浠ヤ笅闈欑殑銇儭銈姐儍銉夈倰瀹氱京銇椼仸銇忋仩銇曘亜銆�
//	1. 銉°偨銉冦儔鍚�: megerArray
//	2. 寮曟暟锛戯笓int銇厤鍒� left
//	3. 寮曟暟锛掞笓int銇厤鍒� right
//	4. 鎴汇倞鍊わ笓int銇厤鍒�
//	5. 鍑︾悊鍐呭锔撳紩鏁發eft 銇� 寮曟暟right 銈掋優銉笺偢銇椼仸銆佹柊銇椼亜閰嶅垪銈掍綔鎴愩仐銇﹁繑鍗淬仚銈嬨��
//	浠ヤ笅銉°偨銉冦儔銇疅鏂戒緥锔�
//	1 int[] left = new int[] {1, 2, 3, 4};
//	2 int[] right = new int[] {5, 6, 7, 8};
//	3 // 銉°偨銉冦儔銈掑疅鏂藉緦
//	4 int[] result = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
//	
//	Answer: 
//			public static int[] megerArray(int[]left,int[]right) {
//				int a = left.length+right.length;
//              int[]sum = new int[left.length+right.length];	
//				for(int i=0; i<left.length; i++){
//					sum[i] = left[i];
//				}
//				for(int j=0; j<a; j++){
//					sum[j+left.length-1] = right[j];	
//				}
//			printArray(sum[]);
//     		
//
//
//			}

	
	
	
//	璩晱锛�-锛掞笓浠ヤ笅闈欑殑銇儭銈姐儍銉夈倰瀹氱京銇椼仸銇忋仩銇曘亜銆�
//	1. 銉°偨銉冦儔鍚�: subArray
//	2. 寮曟暟锛戯笓int銇厤鍒� array
//	3. 寮曟暟锛掞笓闁嬪銇畇tartIndex
//	4. 寮曟暟锛擄笓饣戙仌length
//	5. 鎴汇倞鍊わ笓int銇厤鍒�
//	6. 鍑︾悊鍐呭锔搒tartIndex銇嬨倝startIndex + length銇俱仹銈点儢閰嶅垪銈掑彇寰椼仚銈�
//	浠ヤ笅銉°偨銉冦儔銇疅鏂戒緥锔�
//	1 int[] array = new int[] {1, 2, 3, 4};
//	2 // start = 1, length = 2
//	3 int[] result = new int[] {2, 3}
//	
//	Answer: public int[] subArray(int[]array, int startIndex, int length){
//			int[] sub = new int[length];
//			for(int i=0; i<=array.length;i++){
//				array[i] = startIndex;
//			}
//			for(int j=0; j=length; j++){
//	        	sub[j]=array[i]
//			return;
//			}
// 			printArray(sub[])	
//	}
//	
//	
//	璩晱锛楋笓浠ヤ笅闈欑殑銇儭銈姐儍銉夈倰瀹氱京銇椼仸銇忋仩銇曘亜銆�
//	1. 銉°偨銉冦儔鍚嶏笓trim
//	2. 寮曟暟锛戯笓char銇厤鍒�
//	3. 鎴汇倞鍊わ笓char銇厤鍒�
//	4. 鍑︾悊鍐呭锔撳紩鏁帮紤銇甤har銇厤鍒楀厛闋仺鏈熬銇┖饨┾絺瀛楀垪銈掑墛闄ゃ仐銇︺亸銇犮仌銇勩��
//	浠ヤ笅銉°偨銉冦儔銇疅鏂戒緥锔�
//	1 char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '}; // 鍏ュ姏寮曟暟
//	2 // 銉°偨銉冦儔銈掑疅鏂藉緦
//	3 char[] output = new char[] {'A', 'b', ' ', ' ', 'C'}; // 鍏ュ姏寮曟暟
//	銉掋兂銉堬笓
//	1. 閰嶅垪銇捣鐐广亱銈夈�� ' ' 銇с伅銇亜饨傚瓧鍒椼伄銈ゃ兂銉囥儍銈偣銈掓帰銇欍��
//	2. 閰嶅垪銇祩鐐广亱銈夈�� ' ' 銇с伅銇亜饨傚瓧鍒椼伄銈ゃ兂銉囥儍銈偣銈掓帰銇欍��
//	3. 璧风偣銇ㄧ祩鐐广倰寮曟暟銇ㄣ仐銇︺�佽唱鍟忥紪-锛掋仹浣滄垚銇椼仧銈点儢閰嶅垪銉°偨銉冦儔銈掑懠銇冲嚭銇椼仸銆佺祼鏋溿倰姹傘倎銈嬨��
//	
//	Answer:		public static char[] trim(char[]array ){
//					
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	}
//	
//	璩晱锛橈笓銉愩儢銉偨銉笺儓饨ゃ儭銈姐儍銉夈倰浣滄垚銇椼仸銇忋仩銇曘亜銆�
//	1. 銉°偨銉冦儔鍚嶏笓bubbleSort
//	2. 寮曟暟锛戯笓int銇厤鍒�
//	3. 鎴汇倞鍊わ笓銈姐兗銉堟笀銇裤伄閰嶅垪
//	4. 鍑︾悊鍐呭锔揵ubbleSort銈€儷銈淬儶銈恒儬銈掆饯銇勩�佲紛饧掋仐銇熷紩鏁般伄閰嶅垪銈掋偨銉笺儓銇椼仸銇忋仩銇曘亜銆�
//	
//	
//	
//	璩晱锛欙笓銉°偨銉冦儔銇懠銇冲嚭銇欑反缈掋��
//	1. 璩晱锛�-锛戙倰饨ゃ亜銆侊紥銇ら厤鍒椼倰銉炪兗銈搞仐銇俱仚銆�
//	2. 璩晱锛樸倰饨ゃ亜銆併偣銉嗐儍銉楋紤銇優銉笺偢銇椼仧閰嶅垪銈掋偨銉笺儓銇欍倠銆�
//	3. 娉ㄦ剰锔撱偝銉笺儔銈掞紤饩忋伀銇椼仸銇忋仩銇曘亜銆�
//	
	
	

	
	
	

	
	
	


}
