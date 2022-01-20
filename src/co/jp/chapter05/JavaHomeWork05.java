package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO
		
//		設問１︓1から100までの偶数の和を求める(for + if)。
//		回答１：
//		int sum=0;
//		for(int i=1;i<101;i++) {
//			if(i%2==0) {
//				sum +=i;
//			}
//		}
//		System.out.println(sum);
		
		
//		設問２︓5の階乗を求める(for)。
//		回答２：
//		int factorial =1;
//		for(int i=5;i>0;i--) {
//			factorial *=i;
//			
//		}
//		System.out.println(factorial);		
		
		
//		質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
//		回答３：
		int[] array={1, 2, 6, 7, 9, 6, 2, 1};
		int max =array[0];
		int min = array[0];
		int sum=0;
		for(int i:array) {
			if(i>max) max=i;
			if(i<min) min=i;
			sum+=i;
		}
		double average =(double)sum/array.length;
		System.out.println("最大值："+max);
		System.out.println("最小値："+min);
		System.out.println("和："+sum);
		System.out.println("平均值："+average);
		
//		質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
//		回答４：
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					System.out.println("重复的元素："+array[i]);
					break;
				}
			}
		}
		
		
//		質問５︓質問３の配列に値「７」のインデックスを求む。
//		回答５：
		for(int i=0;i<array.length;i++) {
			if(array[i]==7) {
				System.out.println("「７」のインデックス："+i);
			}
		}		
		
//		質問６︓任意⾏列（２次元配列）の積を求める。
//		回答６：
//		int[][] array1 = {{1,3},{5,7}};
//		int[][] array2 ={{2,4},{6,8}};
//		int[][] result=  new int[3][2];

//		for(int i=0;i<array1.length;i++) {
//			for(int j=0;j<array1[i].length;j++) {
//				result[i][j]=array1[i][j]*array2[i][j];
//				System.out.print(result[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
//		質問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。 
//		回答７：
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					int temp =array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for(int i=0;i<array.length;i++) {
			System.out.println("index"+i+":"+array[i]);
		}
		
//		質問８︓LV10のパスカルの三⾓形を出⼒してください。
//		回答８：
		int[][] sanjiao = new int[10][];
//		System.out.println("包含空格一共有："+(10*2-1)+"位");
//		System.out.println("中心位置是是："+10+"位");
		for(int i=0;i<10;i++) {
			sanjiao[i] = new int[i+1];
			sanjiao[i][0] =1;
			sanjiao[i][i] =1;
			if(i>1) {
				for(int j=1;j<i;j++) {
					sanjiao[i][j]=sanjiao[i-1][j-1]+sanjiao[i-1][j];
				}
			}
		}
		for(int[] line:sanjiao) {
			String space="";
			for(int i=0;i<(10-line.length);i++) {
				space +=" ";
			}
			System.out.print(space);
			for(int num:line) {
				System.out.print(num+" ");
			}
			System.out.println();
		}

	}

}
