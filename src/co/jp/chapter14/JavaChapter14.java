package co.jp.chapter14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaChapter14 {

	public static void main(String[] args) {
		
		Date currentDate = new Date();
		System.out.println(currentDate);
		
		// ⽇付 ⇒ カレンダーオブジェクト
		Calendar c = Calendar.getInstance();
		c.setTime(currentDate);
		
		// ⽇付加算
		c.add(Calendar.YEAR, 1);
		c.add(Calendar.MONTH, 1);
		c.add(Calendar.DATE, 1);
		c.add(Calendar.HOUR, 1);
		c.add(Calendar.MINUTE, 1);
		c.add(Calendar.SECOND, 1);
		
		// カレンダーオブジェクト ⇒ ⽇付
		Date currentDatePlusOne = c.getTime();
		System.out.println(currentDatePlusOne);
		
		//指定された⽂字列から Date を変換する
		String str = "2013-01-21 15:10:20";  
        Date date=null ;  
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        try {  
            date = sdf.parse(str);  
            System.out.println(date); 
            System.out.println(date.getTime());
        } catch (ParseException e) {  
            System.out.println(e.getMessage());  
        }  
	}

}
