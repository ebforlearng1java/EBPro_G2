package co.jp.chapter10;

import java.util.ArrayList;
import java.util.List;

public class JavaHomeWork10 {

	// TODO 自動生成されたメソッド・スタブ
//Q1
	String input = "みみ, 10, 1\n"
			+ "レオ, 1, 0\n"
			+ "マル,2,0";
	public  void Question( ) {
		List<Pet> pets = new ArrayList<>();
		for(String row:input.split("\n")){
			String[] s=row.split(",");
	
			Pet pet = new Pet(s[0].trim(), Integer.parseInt(s[1].trim()), Integer.parseInt(s[2].trim()));
		}
	}
	//Q2-1

	public static String getFileType(String path) { 
		String[] a=path.split("\\.");
		if(a.length!=0) {
			if(a.length==1) {
				return null;
				}
			else 
				return a[a.length-1];
		}
		else return null;
	}

	public static void main(String[] args) {
	// Q2-2
	 System.out.println(getFileType("c://windows//aa.xlsx")); // xlsx
	 System.out.println(getFileType("c://windows//a a.test")); // test
	 System.out.println(getFileType("c://windows//aa.bb.docx")); // docx
	 System.out.println(getFileType("c://windows//aaaaa")); // Empty
	 
	 //	Q3
//	String value = "abced12345あいうえお１２３４５";
//
//	byte[] value_byte = value.getBytes(); // ⽂字列のバイト列を返し
//
//	System.out.println("バイト数は"+value_byte.length);System.out.println("桁数は"+value.length());
//
	
	}
//Q5
	public static void Question5() {
	float a = 1.0F;
	int b = 6;
	float c = 2.0F;System.out.println(String.format("a =%,f",a));System.out.println(String.format("b =%05d",b));System.out.println(String.format("c =%,.2f",c));
	}
//Q6
	public static void Question6() {
	int d = 16;System.out.println(String.format("d =%x",d));
	}

//Q4	
	public static boolean nullOrEmpty(String value) { // value は null orEmpty判断してください。

		String Str1 = null;
		String Str2 = "";
		if (value.equals(Str1)) {
			System.out.println("null");
			return true;
		} else if (value.equals(Str2)) {
			System.out.println("");
			return true;

		}
		return false;
	}
	


	 
}
