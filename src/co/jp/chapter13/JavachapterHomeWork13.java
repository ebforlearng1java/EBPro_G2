package co.jp.chapter13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavachapterHomeWork13 {

	/*
	 * 質問２︓ CSV編集ツールを作成してください。 以本java文件为例
	 */

	public static void main(String[] args) {

		FileOutputStream fos = null;

		try {
			// 以追加的方式在文件末尾写入。(目前只测试出以绝对路径的方式找到文件并编写文件)
			fos = new FileOutputStream("/Users/rui/eclipse-workspace//EBpro/EBPro_G2/src/co/jp/chapter13/JavaTest.java",
					true);
			// byte数组的方式写。
			byte[] bytes = { 109, 111, 117 };
			fos.write(bytes); // mou
			// 将字符串转换成byte数组。
			String s = " : EB新卒、よろしくお願い致します。";
			byte[] bs = s.getBytes();
			fos.write(bs);
			System.out.println();

			// 刷新
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
