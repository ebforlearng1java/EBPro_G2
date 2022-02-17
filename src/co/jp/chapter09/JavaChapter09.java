package co.jp.chapter09;

import java.util.Objects;

public class JavaChapter09 {
	

	public static String getFileType(String path) {
		int num = -1;
		String ext = null;
		
		for(int i = 1; i < path.length(); i++) {
			if(Objects.equals(Character.toString(path.charAt(i)), ".")) {
				num = i;
			}
		}		
		
		
		if(num > 0) {
			ext = path.substring(num+1);
		}else {
			ext = "empty";
		}
		
		return ext;
	}
	
	
	public static void main(String...args) {
		
	 System.out.println(getFileType("c://windows//aa.xlsx")); // xlsx
	 System.out.println(getFileType("c://windows//aa.test")); // test
	 System.out.println(getFileType("c://windows//aa.bb.docx")); // docx
	 System.out.println(getFileType("c://windows//aaaaa")); // Empty
	}
	

	

}
