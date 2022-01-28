package co.jp.chapter07;

public class JavaHomeWork07 {


///Q1
		
  //Class Pet中没有定义setAge这个方法。
		
		
//Q2
	// public class Math {  需单独创建一个Math的源文件
		public static int max(int[] input) {
			int max =input[0];
			for(int i:input) {
				if(i>max) {
					max=i;
				}
			}
			return max;
		}
		
		public static int min(int[] input) {
			int min =input[0];
			for(int i:input) {
				if(i<min) {
					min=i;
				}
			}
			return min;
		}
		
		public static double ave(int[] input) {
			int sum =0;
			for(int i:input) {
				sum+=i;
			}
			return (double)sum/input.length;
		}
		public static void main(String[] args) {

			int[] a= {1,2,3};

			System.out.println("最大值为："+max(a));
			System.out.println("最小值为："+min(a));
			System.out.println("平均值为："+ave(a));
//}

// 2.行列計算。2D行列クラスのコンストラクタには１配列引数設定してください。
//      public class Matrix{
//      private final int[][]data;
//      public Matrix(int[][]data){
//			      this.data = data;
//   }

//       public Matrix add(Matrix b){
//		Matrix c = new Matrix();
//		c.data[0][0] = this.data[0][0] + b.data[0][0];
//		c.data[0][1] = this.data[0][1] + b.data[0][1];
//		c.data[1][0] = this.data[1][0] + b.data[1][0];
//		c.data[1][1] = this.data[1][1] + b.data[1][1];
//		return c;

//  }
		}

}
