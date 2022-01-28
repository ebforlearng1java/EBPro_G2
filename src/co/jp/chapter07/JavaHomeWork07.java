//質問１︓以下コードのコンパイルエラー理由を教えてください。
//「Age]はクラスPetで定義されていない。


//質問２︓Mathクラスを作成してください。以下メソッドを定義します。

//public class Math {
//	  public static int max(int[] input) {
		
//		  int max = input[0];
		
//		  for (int i = 0; i < input.length; i++) {
//			  if (max < input[i]) {
//				  max = input[i];
//			  }
			
//		  }
		
//		  return max;
		
//	  }
	
//     public static int min(int[] input) {
		
//		  int min = input[0];
		
//		  for (int i = 0; i < input.length; i++) {
			
//			  if (min > input[i]) {
//				  min = input[i];
//			  }
			
			
//		  }
		
//		  return min;
		
//	  }
     
     
//     public static double avg(int[] input) {
 		
// 		  int s = 0;
 		
// 		  for (int i = 0; i < input.length; i++) {
 			
 			
// 			  s = s + input[i];
// 		  }
 		
// 		  DecimalFormat d = new DecimalFormat("0.000");
//		  String average = d.format((float)s/input.length);
// 		  return Double.valueOf(average);
 		
// 	  }

//}

//public static void main(String[] args) {
	
//	  int left[] = {1, 2, 3, 4};
//	  int min = Math.min(left);
//	  int max = Math.max(left);
//	  double avg = Math.avg(left);
	
//	  System.out.println(min);
//	  System.out.println(max);
//	  System.out.println(avg);

//}


// 2.⾏列計算。2D⾏列クラスのコンストラクタには１配列引数設定してください。
//public class Matrix{
//   private final int[][]data;
//   public Matrix(int[][]data){
//      this.data = data;
//   }

//   public Matrix add(Matrix b){
//      Matrix c = new Matrix();
//      c.data[0][0] = this.data[0][0] + b.data[0][0];
//      c.data[0][1] = this.data[0][1] + b.data[0][1];
//      c.data[1][0] = this.data[1][0] + b.data[1][0];
//      c.data[1][1] = this.data[1][1] + b.data[1][1];
//      return c;

//  }
//}




















