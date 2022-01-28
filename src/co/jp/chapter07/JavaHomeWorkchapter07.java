package co.jp.chapter07;

public class JavaHomeWork07 {

	/*
	質問1:以下コードのコンパイルエラー理由を教えてください。
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
		
	回答:
	Pet类当中没有age变量,无法通过访问set方法赋值.
	*/
	
	/*
	質問2-1:
	1. 配列のMAXを求める静的メソッドを定義。(引数は int 配列)
    2. 配列のMINを求める静的メソッドを定義。(引数は int 配列)
    3. 配列の平均値を求める静的メソッドを定義。(引数は int 配列)
    4. mainメソッドで上記それぞれメソッドを呼び出してください。

	回答:
	public static void main(String[] args) {
		
		int[] array = {4,2,3,4,7,9,5};
		
	    System.out.println("MAX :" + max(array));
	    System.out.println("MIN :" + min(array));
	    System.out.println("平均値:" + average(array));
	}	
	
	public static int max(int[] input) {
		int max = input[0];
		 for(int num : input) {
			if(num > max) {
				max = num;
			}
		}
		return max;
	}

	public static int min(int[] input) {
		int min =input[0];
		  for(int num : input) {
			if(num < min) {
				min = num;
			}
		}
		return min;
	}

	public static double average(int[] input) {
		int sum = 0;
		double average = 0.0;
		for(int num: input) {
			sum += num;
			average = sum/input.length;
		}
		return average;
		
	}
	*/
	
	/*
	質問2-2:Mathクラスを作成してください。以下メソッドを定義します。
    
	回答:
	public class Matrix {
		
	private final int[][] data;
	public Matrix(int[][] data) {
		this.data = data;
	}
	
    public Matrix add(Matrix b) {
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
