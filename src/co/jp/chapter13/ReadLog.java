package co.jp.chapter13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReadLog {

	public static void main(String[] args)  {
		
		try {
			//创建字节流 转换流 字符流
			BufferedReader readLog = new BufferedReader(new InputStreamReader(new FileInputStream("src/co/jp/chapter13/Chapter13Test.java")));
			
			String line = null;
			while((line = readLog.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		}
		
	}

