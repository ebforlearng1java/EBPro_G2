package co.jp.chapter07;

public class JavaHomeWork07 {

//		質問１︓以下コードのコンパイルエラー理由を教えてください。
		// Pet.java
		public class Pet {
			public String name;
		 
			public void setName(String value) {
				this.name = value;
			} 
		}
		// Kicker.java
		public class Kicker {
			public static void main(String...args) {
				Pet cat = new Pet();
				cat.setAge(1234);
			} 
		}
//	    答え：「setAge」という機能のメソードまた命令が「Pet」のクラスにありません。 
		
		
		
//		質問２︓Mathクラスを作成してください。以下メソッドを定義します。、
//			1. 配列のMAXを求める静的メソッドを定義。（引数は int 配列） 
//			2. 配列のMINを求める静的メソッドを定義。（引数は int 配列） 
//			3. 配列の平均値を求める静的メソッドを定義。（引数は int 配列） 
//			4. mainメソッドで上記それぞれメソッドを呼び出してください。 
		
//		以下はメソッドの定義のソースの抜枠です。
		public class Math {
			public static int max2(int[] input) {
			 	int max2 = input[0];
				for  (int i=1; i < input.length; i++) {
					if (max2 < input[i]) {
						max2 = input[i];
					}
				}
				return max2;
			}
			
			public static int min2(int[] input) {
				int min2 = input[0];
				for  (int i=1; i < input.length; i++) {
					if (min2 > input[i]) {
						min2 = input[i];
					}
				}
				return min2;
			}
			
			public static int ave2(int[] input) {
				int sum2 = 0;
				for (int i=0; i < input.length; i++) {
					sum2 += input[i];
				int ave2 = sum2/input.length;
				}
				return ave2;
			}
			
			public static void main(String[] args) {
				int[] array2 = new int[]{7, 6, 2, 6, 7, 9, 6, 2, 1};
				int max2 = max2(array2);
				int min2 = min2(array2);
				int ave2 = ave2(array2);
				System.out.printf("配列の最大値は：%d\n", max2);
				System.out.printf("配列の最小値は：%d\n", min2);
				System.out.printf("配列の平均値は：%d\n", ave2);
			} 
		}
			
//		2.行列計算。2D⾏列クラスのコンストラクタには１配列引数設定してください。
			public class Matrix {
				private final int[][] data;
				/** construct method */
				public Matrix(int[][] data) {
					this.data = data;
				}
				// 行列 ADD
				public Matrix add(Matrix b) {
					//....
					return ???
				}
			}
			

}
