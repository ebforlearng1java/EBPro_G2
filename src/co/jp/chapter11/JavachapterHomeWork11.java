package co.jp.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;



public class JavachapterHomeWork11 {

	/**
	 * 質問１︓駅クラス（Station）、路線クラス（Line）を作成して。
	 * 路線をインスタンス化してオブジェクト「⼭⼿線」を作成してください。「⼭⼿線」に各駅情報を追加してください。
	 * 
	 * 
	 * 答案:
	 */

//	public static void main(String[] args) {
//		
//
//		 Line yamanote = new Line("山手線");
//		 
//		 yamanote.station = new ArrayList<Station>();
//		 //各駅情報を追加
//		 String addData ="池袋,大塚（東京）,巣鴨,駒込,田端（東京）,西日暮里,日暮里,鶯谷,上野,御徒町,秋葉原,神田（東京）,東京,有楽町,新橋,浜松町,田町（東京）,高輪ゲートウェイ,品川,大崎,五反田,目黒,恵比寿（東京）,渋谷,原宿,代々木,新宿,新大久保,高田馬場,目白";
//		 
//		 String[] temp = addData.split("\\,");
//		 
//		 for (int i = 0; i < temp.length; i++) {
//			 
//			String name = temp[i];
//			Station station = new Station(name);
//			yamanote.station.add(station);
//			
//			//station.nameInfo(name);
//			System.out.println(yamanote.station.get(i).name);
//			
//		 }
//		 
//	 /**
//	  * 質問２︓質問１に作成した⼭⼿線の駅を foreach ⽂を繰り返して、新橋駅は路線内であるかを判断する。
//	  * 
//	  * 答案:
//	  */
//		 
//		 for (int i = 0; i < temp.length; i++) {
//		   if ("新橋".equals(yamanote.station.get(i).name)) {
//				System.out.println("新橋駅は路線内である");
//				break;
//			} else {
//				System.out.println("新橋駅探索中");
//			}
//		 }
//}
//
//}

	/**
	 * 質問３︓10両編成している通勤電⾞、各⾞の定員は5⼈です。31⼈の乗⾞の状況をプログラミングしてください。 （for⽂で旅客作成しても構わない）
	 *
	 *回答:1 每个车厢人数存在的可能性
	 */
//	int count = 0;
//	 for (int i = 0; i < 6; i++) {
//		for (int j = 0; j < 6; j++) {
//			for (int a = 0; a < 6; a++) {
//				for (int b = 0; b < 6; b++) {
//					for (int c = 0; c < 6; c++) {
//						for (int d = 0; d < 6; d++) {
//							for (int e = 0; e < 6; e++) {
//								for (int f = 0; f < 6; f++) {
//									for (int g = 0; g < 6; g++) {
//										if ( i + a + b + c + d + e + f + g == 31) {
//											count++;
//											System.out.println("No." + count + "种乘车情况 :"+ i + a + b + c + d + e + f + g);
//										}
//									}
//								}
//							}
//						}
//					}
//				}
//			}
//		}
//		
//	}
	
//回答:3-2 描述乘车经过(待完善)
	
//	public static void main(String[] args) {
//		
//
//		 int arr[][] = new int[10][6];//存在车厢内无人的情况
//		 int sum = 0;
//		 for(int i=0; i < arr.length; i++) {             // 第一个循环，循环每一行
//			    for (int j=0; j< arr[i].length; j++) {     //第二个循环，循环每行的每一列
//			    	
//			    	
//			    	arr[i][j] = j;
//			    	sum += arr[i][j];
//			
//			    	System.out.print(arr[i][j]);
//			    	
//					
//			    }
//			    System.out.println();
//			}
//		 
//	       
//	        
//	        
//	
//		
//			
//
//		}


	

	}


