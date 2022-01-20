package co.jp.chapter05;

public class JavaHomeWork05 {

//	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		設問１︓1から100までの偶数の和を求める(for + if)。
//		Answer:  
//		int sum = 0;
//		for(int i = 1; i < 101; i++) {
//			if(i % 2 == 0) {
//				sum = sum + i;
//			}
//		}
//		  System.out.println(sum);
		
//		設問２︓5の階乗を求める(for)。
//		Answer:
//		int x=1;
//		for(int i=1; i<6; i++) {
//				x=x*i;
//			}
//		System.out.println(x);
		
//		質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
//		Answer:
//		int[] arr = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
//		int max=arr[0];
//		int min=arr[0];
//		int sum=0;
//		for (int i = 0; i < arr.length;i++) {
//			if(arr[i]>max) {
//				max=arr[i];		
//			} 
//			if(arr[i]<min) {
//				min=arr[i];
//			}	
//			sum=sum+arr[i];
//		}
//		
//		System.out.println("最大値："+max);
//		System.out.println("最大値："+min);
//		System.out.println("和："+sum);
//		System.out.println("平均値:"+sum/8);
//		

		 	 
		
//		質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
//		Answer:
//		int[] arr = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
//  
//        for(int i=0;i<arr.length;i++) {
//            for(int j =i+1;j<arr.length;j++) {
//                if(arr[i]==(arr[j])) {
//                    System.out.println("重複ある要素:"+arr[i]);
//                }
//            }
//        }
	
	
//		質問５︓質問３の配列に値「７」のインデックスを求む。
//		Answer:
//		int[] arr = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==7) {
//				 System.out.println(i+1);
//			}
//		}
		
//		質問６︓任意⾏列（２次元配列）の積を求める。
//		Answer:
		
//		int[][]a = new int[2][3];
//		int[][]b = new int[4][5];
//		int[][]c= new int[a.length][b[0].length];
//        for (int i = 0; i<a.length; i++) {
//            for (int j = 0; j<b[0].length; j++) {
//                for (int k = 0; k<a[0].length; k++) {
//                   c[i][j]= c[i][j]+a[i][k]*b[k][j];
//                   System.out.println(c[i][j]);
//                   }
//			}
//		}			
//	}
//
//}
		
		
//		質問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
//		Answer: 
//		int[] arr = new int[] {6, 9, 8, 7, 5};
//		int a=0;
//		  for (int i = 0; i < arr.length; i++) {
//		   for (int j=arr.length-1; j>i; j--) {
//		    if (arr[j-1]>arr[j]) {
//		     a=arr[j-1];
//		     arr[j-1]=arr[j];
//		     arr[j]=a;
//		    }
//		   }
//		  }
//		  for (int i = 0; i < arr.length; i++) {
//		   System.out.print(arr[i]+" ");
//		  }
//	 }
		 		
				
			
		
//	    質問８︓LV10のパスカルの三⾓形を出⼒してください。
//	    Answer:
		public static void main(String[] args) {
		int rows = 10;
		for(int i = 0; i<rows; i++) {
			int number = 1;
			System.out.format("%"+(rows - i) *2 + "s","");
			for(int j = 0; j<= i; j++) {
				System.out.format("%4d", number);
				number = number*(i-j) /(j+1);
			}
			System.out.println();
		}
		
	}	
		
		
		
		
		
		
	}

}
