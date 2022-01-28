package co.jp.chapter07;

public class JavaHomeWork07 {

//質問１:	ペットクラスを定義してください。ペットクラスは名称と年齢を保有して。以下
/*		２インスタンスを作成してください。変数１︓cat , 変数２︓dog。
  		catの名称は ”cat”, 年齢=2, dogの名称は ”dog”, 年齢=5。
		1. クラスを定義する。クラス名は Pet。
		2. 該当クラスに、「名称」「年齢」属性が保有しています。
		3. Petクラスをインスタンス化する。以下２つオブジェクトを作成してください。
		4. オブジェクト１︓変数名 = cat。名称 = “cat“, 年齢 = 2。
		5. オブジェクト２︓変数名 = dog。名称 = “dog“, 年齢 = 5。	
*/	
//回答:
		
	
	
//質問１︓以下コードのコンパイルエラー理由を教えてください。	
/*		// Pet.java
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
*/
//回答:
		//catはPetの実例であるうえ、PetクラスにおいてsetAgeというメソッドは定義されていないため。
	

//質問２︓Mathクラスを作成してください。以下メソッドを定義します。
//回答:
/*
  		public class math {
	
		public static int max(int[] input) {
			
			int max = input[0];
			
			for(int i=0; i<input.length;i++) {
				if(max < input[i]) {
					max = input[i];
				}
			}
			return max;
		}
		
		public static int min(int[] input) {
			
			int min = input[0];
			
			for(int i=0; i<input.length;i++) {
				if(min > input[i]) {
					min = input[i];
				}
			}
			return min;
		}
		public static double avg(int[] input) {
			
			int sum = 0;
			
			for(int i=0; i<input.length;i++) {
				 
				sum += input[i];
				}
			
			return sum/input.length;
		}
		
		public static void main(String[] args) {
			int array[] = {1,2,3,4};
			int max = max(array);
			int min = min(array);
			double avg = avg(array);
			System.out.println("max is " + max);
			System.out.println("minimum is " + min);
			System.out.println("average is " + avg);
			
		}
	}
 */
	
	
//2.⾏列計算。2D⾏列クラスのコンストラクタには１配列引数設定してください。	
//回答:
/*		public class Matrix{
	  		private final int[][]data;
	  		public Matrix(int[][]data){
			      this.data = data;
	  	}

	 

		public Matrix add(Matrix b){
			Matrix c = new Matrix(data);
			c.data[0][0] = this.data[0][0] + b.data[0][0];
			c.data[0][1] = this.data[0][1] + b.data[0][1];
			c.data[1][0] = this.data[1][0] + b.data[1][0];
			c.data[1][1] = this.data[1][1] + b.data[1][1];
			return c;

	   }
	}
*/

}
