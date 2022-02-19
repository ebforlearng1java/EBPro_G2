package co.jp.chapter12;

public class JavachapterHomeWork12 {

	/**
	 * 質問１︓配列の範囲外を指定している場合、ArrayIndexOutOfBoundsException例外を発⽣します。
	 * 該当例外を処理するサンプルコードを書いてください。
	 */

//	public static void main(String[] args) {
//		
//		try {
//			String[] str = new String[20];
//			System.out.println(str[100]);
//			
//		} catch (ArrayIndexOutOfBoundsException e) {
//			// TODO: handle exception
//			System.out.println("数组下标越界");
//		}
//	}

	/**
	 * 質問２︓Validation Exceptionを作成して、ユーザー⼊⼒した値を検証します。 該当は実際商⽤アプリで利⽤しています。
	 */

	public static void main(String[] args) {


		String user = "4568";
		try {
			
			CheckedException(user);
			
			System.out.println("欢迎光临: " + user) ;
			
		} catch (ValidationException e) {
			
			// TODO: handle exception
			System.out.println(e.getName() + e.getMessage());
		}

	}

	// 受检异常
	public static void CheckedException(String name) throws ValidationException{
		
		if(name.matches("^[0-9]+$")) {
			
			 throw new ValidationException("名称", "半角数字を入力してください。");
		
	}
	
	

}
	
}
