package co.jp.chapter13;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class JavaHomeWork13 {

    //Q1 readlog
    public static void readlog(){
        String line="";
        try{
            FileInputStream fileInputStream=new FileInputStream("test.log");
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(fileInputStream));
            while((line=bufferedReader.readLine())!=null){
                //analyze here
                System.out.println(line);
            }
            bufferedReader.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    //Q2 readcsv
    public static void readcsv(){
        String line="";
        String csvSplit=",";
        try{
            FileInputStream fileInputStream=new FileInputStream("test.csv");
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(fileInputStream));
            while((line=bufferedReader.readLine())!=null){
                String[] data=line.split(csvSplit);
                int i=0;
                for (String string : data) {
                    System.out.printf("data%d =%s\t",i,string);
                    i++;
                }
                System.out.print("\n");
            }
            bufferedReader.close();
        }catch(Exception e){
            e.printStackTrace();
        }

      
    }
    public static void main(String[] args){
        //readlog start here
        //readlog();
        readcsv();
    }
}
