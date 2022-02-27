package co.jp.chapter14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JavachapterHomeWork14 {

//	public static void main(String[] args) throws ParseException {
//
//		eachEveryDay("2022-1-5", "2022-2-18");
//
//	}
//	
//	/**
//	 * 
//	 * @param begin
//	 * @param end
//	 * @return days
//	 */
//	public static List<String> eachEveryDay(String begin, String end) {
//		List<String> days = new ArrayList<String>();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//
//		try {
//			Date begDate = sdf.parse(begin);
//			Date endDate = sdf.parse(end);
//
//			// 测试
////			  System.out.println(begDate);
////			  System.out.println(endDate);
//			// 使用给定的 Date 设置此 Calendar 的时间
//			Calendar calBegin = Calendar.getInstance();
//			calBegin.setTime(begDate);
//
//			Calendar calEnd = Calendar.getInstance();
//			calEnd.setTime(endDate);
//
//			// 日期结束 ➕ 1
//			calEnd.add(Calendar.DATE, +1);
//			while (calBegin.before(calEnd)) { // 判断前后日期是否正确,并且返回日历
//				days.add(sdf.format(calBegin.getTime()));
//				calBegin.add(Calendar.DAY_OF_YEAR, 1);
//			}
//			System.out.println(days);
//
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//
//		return days;
//
//	}
	
	
	/**
	 * 質問２︓勤務表の集計。以下CSVファイルは「2019年06⽉度」の勤務期間です。集計してください。 1. 毎⽇の作業時間（X時間Y分）。（15分切り）
	 * 2. 今⽉の総作業時間（X時間Y分） 3. 19:00以後は残業時間となり、毎⽇＆今⽉の総残業時間（X時間Y分）を集計してください。
	 */

	public static void main(String[] args) {

		String csvFile = "/Users/rui/java/201906.csv";
		String line = "";
		String cvsSplitBy = ",";

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			int calHours = 0;
			int calMinutes = 0;

			int overHours = 0;
			int overMinutes = 0;
			int workTotalHour = 0;
			int workTotalMin = 0;
			int overTotalHour = 0;
			int overTotalMin = 0;
			
			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] data = line.split(cvsSplitBy);

				// 读取出勤日
				String workDay = data[0].replaceAll("\"", "");

				// 读取上班时间
				String[] workBegin = data[1].split(":");
				int workBeginHours = Integer.valueOf(workBegin[0]);
				int workBeginMinutes = Integer.valueOf(workBegin[1]);

				// 读取下班时间
				String[] workEnd = data[2].split(":");
				int workEndHours = Integer.valueOf(workEnd[0]);
				int workEndMinutes = Integer.valueOf(workEnd[1]);

				// 读取休息时间
				String[] timeRest = data[3].split(":");
				int timeRestHours = Integer.valueOf(timeRest[0].replaceAll("\"", ""));
				int timeRestMinutes = Integer.valueOf(timeRest[1].replaceAll("\"", ""));

				calHours = workEndHours - workBeginHours - timeRestHours;
				calMinutes = workEndMinutes - workBeginMinutes - timeRestMinutes;

				overHours = workEndHours - 19;
				overMinutes = workEndMinutes;

				workTotalHour += calHours;
				workTotalMin += calMinutes;

				System.out.println("通勤日" + workDay + "の業務時間:  " + calHours + "時間" + calMinutes + "分");
				if (workEndHours >= 19 && workEndMinutes > 15) {
					overTotalHour += overHours;
					overTotalMin += calMinutes;

					System.out.println("通勤日" + workDay + "の残業時間:  " + overHours + "時間" + overMinutes + "分");
					System.out.println("==================残業注意====================");
				}

			}
			

			System.out.println("==================今月の集計===================");
			System.out.println("6月総業務時間:" + (workTotalHour + workTotalMin/60) + "時間" + (workTotalMin % 60) + "分");
			System.out.println("6月残業時間:" + (overTotalHour + overTotalMin/60) + "時間" + (overTotalMin % 60) + "分");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
