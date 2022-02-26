package co.jp.chapter13;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class JavaChapter13 {

	public static void main(String[] args) {
		try {
			 Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\jj\\Desktop\\data.xlsx"),
			 "UTF-8"));
			 out.write("DCNetJava教育");
			 out.close();
		} catch (IOException e) {
			 e.printStackTrace();
		}
	}

}
