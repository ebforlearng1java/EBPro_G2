package co.jp.chapter14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Work {

	Date date;
	Date start;
	Date end;
	Date rest;
	
	public Work(Date date, Date start, Date end, Date rest) {
		this.date = date;
		this.start = start;
		this.end = end;
		this.rest = rest;
	}
	
	public Work(Date date) {
		this.date = date;
	}
	
//	public String workTime(){
//		if(start==null||end==null) {
//			return "Î´³öÇÚ";
//		}else {
//			long restPeriod = rest.getTime()-date.getTime();
//			long workPeriod = end.getTime() - start.getTime() - restPeriod;
//			double workHour = (double)workPeriod / (1000 * 60 * 60);
//			double workMinite = (workHour-(int)workHour)*60;
//			return ""+(int)workHour+"•rég"+(int)workMinite+"·Ö";
//		}
//	}
	
	
	public long workTime(){
		if(start==null||end==null) {
			return 0;
		}else {
			long restPeriod = rest.getTime()-date.getTime();
			long workPeriod = end.getTime() - start.getTime() - restPeriod;
			return workPeriod;
		}
	}
	
	public long overWorkTime() throws ParseException{
		if(start==null||end==null) {
			return 0;
		}else {
			String today = new SimpleDateFormat("yyyy-MM-dd").format(date);
			Date overTime = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(today+" 19:00");
			long over = end.getTime()-overTime.getTime();
			if(over<=0) {
				return 0;
			}else {
				return over;
			}
			
		}
	}
	
	public static String format(long period) {
		if(period==0) return "Ÿo¤·¡¡¡¡¡¡";
		double workHour = (double)period / (1000 * 60 * 60);
		double workMinite = (workHour-(int)workHour)*60;
		if(workMinite==0) return ""+(int)workHour+"•rég¡¡¡¡";
			
		
		return ""+(int)workHour+"•rég"+(int)workMinite+"·Ö¡¡¡¡";
	}
	

	
	
	
}
