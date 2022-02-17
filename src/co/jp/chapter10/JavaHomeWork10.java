package co.jp.chapter10;

public class JavaHomeWork10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//Q1

//Q2
		/*
		 * public static String getFileType(String path) { // return ?? }public static
		 * void main(String...args) {
		 * System.out.println(getFileType("c://windows//aa.xlsx")); // xlsx
		 * System.out.println(getFileType("c://windows//a a.test")); // test
		 * System.out.println(getFileType("c://windows//aa.bb.docx")); // docx
		 * System.out.println(getFileType("c://windows//aaaaa")); // Empty }
		 */

//Q3
		
		  String value = "abced12345あいうえお１２３４５";
		  
		  byte[] value_byte = value.getBytes(); //⽂字列のバイト列を返し
		  
		  System.out.println("バイト数は" + value_byte.length); 
		  System.out.println("桁数は" +value.length());
		 
//Q4
		/*
		 * public static boolean nullOrEmpty(String value) { // value は null or Empty
		 * 判断してください。 
		 * String Str1 = null;
		 *  String Str2 = "";
		 *   if(value.equals(Str1)) {
		 * System.out.println("null"); }
		 *  else if (value.equals(Str2)) {
		 * System.out.println(""); 
		 * } 
		 * }
		 */

//Q5
   
     float a = 1.0F;
     int b =6;
     float c = 2.0F;
     System.out.println(String.format("a =%,f", a));
     System.out.println(String.format("b =%05d", b));
     System.out.println(String.format("c =%,.2f", c));
//Q6
     int d =16;
     System.out.println(String.format("d =%x", d));
	}

}
