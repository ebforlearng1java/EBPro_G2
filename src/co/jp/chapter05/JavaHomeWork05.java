package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 鑷嫊鐢熸垚銇曘倢銇熴儭銈姐儍銉夈兓銈广偪銉�

		
		
		
		
		
		//設問１︓1から100までの偶数の和を求める(for + if)。
//		
//		int sum=0;
//		for(int i=1;i<=100;i++) {
//			if(i%2==0) {
//				sum+=i;
//			}
//		}
//		System.out.println(sum);
//		
//		
//		
		
		//設問２︓5の階乗を求める(for)。
		
//		int mul=1;
//		for(int i=1;i<=5;i++) {
//				mul*=i;
//		}
//		System.out.println(mul);
//		
		
		
		//質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
//		
//		int[] array = new int[]{1, 2, 6, 7, 9, 6, 2, 1};
//		int max=array[0];
//		int min=array[0];
//		int sum=0;
//		int avg;
//		
//		for(int x : array) {
//			if(x>max) max=x;
//			if(x<min) min=x;
//			sum+=x;
//		}
//		avg=sum/array.length;
//		
//		System.out.println("最⼤値:"+max);
//		System.out.println("最⼩値:"+min);
//		System.out.println("和:"+sum);
//		System.out.println("平均値:"+avg);
//		
//		
		
		
		//質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
		
//		int[] array = new int[]{1, 2, 6, 7, 9, 6, 2, 1};
//		for(int i =0;i<array.length;i++) {
//			for(int j =i+1;j<array.length;j++) {
//				if(array[i]==array[j]) {
//					System.out.println(array[i]);
//				}
//			}
//		}
//		
//		
		
		
		//質問５︓質問３の配列に値「７」のインデックスを求む。
		
//		int[] array = new int[]{1, 2, 6, 7, 9, 6, 2, 1};
//		for(int i =0;i<array.length;i++) {
//			if(array[i]==7) {
//				System.out.println("「７」のインデックスは："+i);
//			}
//		}
//		
//		
		//質問６︓任意⾏列（２次元配列）の積を求める。
		
//		int[][] array1 = new int[][]{
//			 {1,2,3},
//			 {4,5,6},
//			 {7,8,9},
//			};
//		int[][] array2 = new int[][]{
//				 {1,2,3},
//				 {4,5,6},
//				 {7,8,9},
//				};
//		int[][] mul =new int[3][3]; 
//		
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				mul[i][j]=array1[i][j]*array2[i][j];
//				//System.out.print(mul[i][j]+" ");
//			}
//			//System.out.println();
//		}
//		
//		
//		
//		
		
		//質問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
		
//		int[] array = new int[]{1, 2, 6, 7, 9, 6, 2, 1};
//		for (int i = 0; i < array.length -1; i++){    
//			              for(int j = 0 ;j < array.length - i - 1; j++){    
//			                 if(array[j] > array[j + 1]){    
//			                     int temp = array[j];
//			                     array[j] = array[j + 1];
//			                     array[j + 1] = temp;
//			                }
//			           }
//		   }
//		for(int x:array) {
//			System.out.println(x);
//		}
//			              
//			              
//			              
		
		
		
		
		//質問８︓LV10のパスカルの三⾓形を出⼒してください。
		
		
        int row = 10;
        int[][] array = new int[row][row];
         
        for (int i = 0; i < row; i++){
            for(int j = 0;j<= i;j++){
                if (j==0 || j==i){
                	array[i][j]=1;
                     
                }else{
                	array[i][j]=array[i-1][j-1]+array[i-1][j];
                }
            }
        }

        for (int i = 0; i < row; i++){
            int num = row -i;
            for(int j = 0;j<= num;j++){
                System.out.print(" "); 
        }
            for(int k= 0;k<= i;k++){
                System.out.print(array[i][k]+" ");   
        }
            System.out.println();
    }
		
		
	}

}
