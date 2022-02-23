package co.jp.chapter14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaHomeWork14 {

	public static void main(String[] args) {
		/*質問１︓以下共通メソッドを作成してください。
		 * 1. メソッド名︓eachEveryDay
		 * 2. 引数１︓ yyyy-MM-dd 開始⽇（⽂字列）
		 * 3. 引数２︓ yyyy-MM-dd 終了⽇（⽂字列）
		 * 4. 処理内容︓開始⽇から終了⽇まで、ループして結果を yyyy-MM-dd で出⼒する。
		 */
		eachEveryDay("2022-02-20","2022-02-28");
		
		
		/*質問２︓勤務表の集計。以下CSVファイルは「2019年06⽉度」の勤務期間です。集計してください。
		 * 1. 毎⽇の作業時間（X時間Y分）。（15分切り）
		 * 2. 今⽉の総作業時間（X時間Y分）
		 * 3. 19:00以後は残業時間となり、毎⽇＆今⽉の総残業時間（X時間Y分）を集計してください。
		 */
		String[][] time = {
				{"00:00","00:00","00:00"},{"00:00","00:00","00:00"},
				{"10:00","20:15","01:00"},{"10:00","20:00","01:00"},
				{"10:00","20:15","01:00"},{"10:00","20:00","01:00"},
				{"10:00","19:30","01:00"},{"00:00","00:00","00:00"},
				{"00:00","00:00","00:00"},{"10:00","21:30","01:00"},
				{"10:00","21:00","01:00"},{"10:00","21:30","01:00"},
				{"10:00","20:00","01:00"},{"00:00","00:00","00:00"},
				{"00:00","00:00","00:00"},{"00:00","00:00","00:00"},
				{"10:00","20:00","01:00"},{"10:00","20:00","01:00"},
				{"00:00","00:00","00:00"},{"10:00","20:30","01:00"},
				{"09:00","20:00","01:00"},{"00:00","00:00","00:00"},
				{"00:00","00:00","00:00"},{"10:00","21:30","01:00"},
				{"10:00","20:30","01:00"},{"10:00","21:00","01:00"},
				{"10:00","20:30","01:00"},{"10:00","19:15","01:00"},
				{"00:00","00:00","00:00"},{"00:00","00:00","00:00"},
		};
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
		
		long workTimeHoursTotal = 0;
		long workTimeMinutesTotal = 0;
		long overTimeHoursTotal = 0;
		long overTimeMinutesTotal = 0;
		
		for(int i = 0; i < time.length; i++) {
			try {
				long workTimeHours = 0;
				long workTimeMinutes = 0;
				long overTimeHours = 0;
				long overTimeMinutes = 0;
				
				if("00:00" != time[i][0]) {
					String[] timeRest = time[i][2].split(":");
					int timeRestHours = Integer.valueOf(timeRest[0]);
					int timeRestMinutes = Integer.valueOf(timeRest[1]);
					
					Date timeBegin = simpleDateFormat.parse(time[i][0]);
					Date timeEnd = simpleDateFormat.parse(time[i][1]);
					Date timeOff = simpleDateFormat.parse("19:00");
					
					long workTime = timeEnd.getTime() - timeBegin.getTime();
					long overTime = timeEnd.getTime() - timeOff.getTime();
				
					workTimeHours = workTime / (60000 * 60) - timeRestHours;
					workTimeMinutes = workTime % (60000 * 60) / 60000 - timeRestMinutes;
					overTimeHours = overTime / (60000 * 60);
					overTimeMinutes = overTime % (60000 * 60) / 60000;
					
					if(workTimeMinutes == 15) {
						workTimeMinutes = 0;
					}
				}
				
				
				System.out.println((i+1) + "日の作業時間：" + workTimeHours + "時間" + workTimeMinutes + "分");
				System.out.println((i+1) + "日の残業時間：" + overTimeHours + "時間" + overTimeMinutes + "分");
				
				workTimeHoursTotal = workTimeHoursTotal + workTimeHours;
				workTimeMinutesTotal = workTimeMinutesTotal + workTimeMinutes;
				overTimeHoursTotal = overTimeHoursTotal + overTimeHours;
				overTimeMinutesTotal = overTimeMinutesTotal + overTimeMinutes;
				
				
			} catch (ParseException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
		workTimeHoursTotal = workTimeHoursTotal + workTimeMinutesTotal / 60;
		workTimeMinutesTotal = workTimeMinutesTotal % 60;
		System.out.println("06⽉の総作業時間：" + workTimeHoursTotal + "時間" + workTimeMinutesTotal + "分");
		
		overTimeHoursTotal = overTimeHoursTotal + overTimeMinutesTotal / 60;
		overTimeMinutesTotal = overTimeMinutesTotal % 60;
		System.out.println("06⽉の総残業時間：" + overTimeHoursTotal + "時間" + overTimeMinutesTotal + "分");
	}
	
	
	
	/*質問１︓以下共通メソッドを作成してください。
	 * 1. メソッド名︓eachEveryDay
	 * 2. 引数１︓ yyyy-MM-dd 開始⽇（⽂字列）
	 * 3. 引数２︓ yyyy-MM-dd 終了⽇（⽂字列）
	 * 4. 処理内容︓開始⽇から終了⽇まで、ループして結果を yyyy-MM-dd で出⼒する。
	 */
	public static void eachEveryDay(String begin, String end) {
		
		try {
			//字符串变成日期
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date dateBegin = simpleDateFormat.parse(begin);
			Date dateEnd = simpleDateFormat.parse(end);
			
			Calendar c = Calendar.getInstance();
			c.setTime(dateBegin);
			//输出开始日
			System.out.println(simpleDateFormat.format(c.getTime()));
			
			do {
				c.add(Calendar.DATE, 1);
				
				Date currentDatePlusOne = c.getTime();
				String dateString = simpleDateFormat.format(currentDatePlusOne);
				System.out.println(dateString);
				
			}while(c.getTime().before(dateEnd));
				
		}catch (ParseException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
