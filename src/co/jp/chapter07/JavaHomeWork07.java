package co.jp.chapter07;

public class JavaHomeWork07 {
//第二题需要单独新建一个Math.java文件
//然后用把上面那行替换为：
//public class Math{

//	質問１︓以下コードのコンパイルエラー理由を教えてください。
//	回答１︓cat是Pet类的一个实例，Pet类中没有setAge方法。
	
//	質問２︓Mathクラスを作成してください。以下メソッドを定義します。
//		1. 配列のMAXを求める静的メソッドを定義。（引数は int 配列）
//		2. 配列のMINを求める静的メソッドを定義。（引数は int 配列）
//		3. 配列の平均値を求める静的メソッドを定義。（引数は int 配列）
//		4. mainメソッドで上記それぞれメソッドを呼び出してください。	
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
	
	public static double pingjun(int[] input) {
		int sum =0;
		for(int i:input) {
			sum+=i;
		}
		return (double)sum/input.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {7,3,5,4,8,2};
		//静态方法不需要实例化即可调用
		System.out.println("最大值为："+max(a));
		System.out.println("最小值为："+min(a));
		System.out.println("平均值为："+pingjun(a));
	}

}

