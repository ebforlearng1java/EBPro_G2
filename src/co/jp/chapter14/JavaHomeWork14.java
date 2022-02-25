package co.jp.chapter14;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class JavaHomeWork14 {

//	質問１︓以下共通メソッドを作成してください。
//		1. メソッド名︓eachEveryDay
//		2. 引数１︓ yyyy-MM-dd 開始⽇（⽂字列）
//		3. 引数２︓ yyyy-MM-dd 終了⽇（⽂字列）
//		4. 処理内容︓開始⽇から終了⽇まで、ループして結果を yyyy-MM-dd で出⼒する。
//	質問１︓	
//	public static void eachEveryDay(String start,String end) {
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		try {
//			Date current = simpleDateFormat.parse(start);
//			Date last = simpleDateFormat.parse(end);
//			Calendar c =Calendar.getInstance();
//			c.setTime(current);
//			do {
//				System.out.println(simpleDateFormat.format(c.getTime()));
//				c.add(Calendar.DATE, 1);
//				if(c.getTime().after(last))break;
//			}while(true);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		eachEveryDay("2022-02-18","2022-02-25");
//	}

//	質問２︓勤務表の集計。以下CSVファイルは「2019年06⽉度」の勤務期間です。集計してください。
//		1. 毎⽇の作業時間（X時間Y分）。（15分切り）
//		2. 今⽉の総作業時間（X時間Y分）
//		3. 19:00以後は残業時間となり、毎⽇＆今⽉の総残業時間（X時間Y分）を集計してください。	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		final String prefix = "2019-6-";
		
		Calendar c = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");

		try {
			List<String[]> records = readFile();
			List<Work> works = new ArrayList();
			for (String[] array : records) {
				Date date = format.parse(prefix + array[0] + " 00:00");
				Work work;
				if (array[1].isBlank()) {
					work = new Work(date);
				} else {
					Date start = format.parse(prefix + array[0] + array[1]);
					Date end = format.parse(prefix + array[0] + array[2]);
					Date rest = format.parse(prefix + array[0] + array[3]);
					work = new Work(date, start, end, rest);
				}
				works.add(work);
			}
			long sumWorkTime=0;
			long sumOverWorkTime=0;
			System.out.println("==========毎⽇の作業時間と含まれる残業時間（X時間Y分）==========");
			for(Work work : works) {
				String dateString = format.format(work.date).split(" ")[0];
				long workTime =work.workTime();
				long overWorkTime = work.overWorkTime();
				System.out.print("日付："+dateString+"    ");
				if(overWorkTime==0) {
					System.out.print("休日");
				}else {
					System.out.print("作業時間："+Work.format(workTime)+"    ");
				}
				
				if(overWorkTime>0)
				System.out.print("残業時間："+Work.format(overWorkTime));
				System.out.println();
				sumWorkTime+=workTime;
				sumOverWorkTime+=overWorkTime;
			}
			System.out.println("総作業時間："+Work.format(sumWorkTime));
			System.out.println("総残業時間："+Work.format(sumOverWorkTime));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static List<String[]> readFile() throws IOException {
		//把csv文件储存到本地某个位置，然后读取路径
		String path = "C:\\\\Users\\\\TenOne\\\\workspace\\\\EBPro_G2\\\\src\\\\co\\\\jp\\\\chapter14\\\\data.csv";
		BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
		List<String[]> records = new ArrayList<String[]>();
		String record;
		// 跳过首行
		record = file.readLine();
		while ((record = file.readLine()) != null) {
			String[] fields = record.split(",");
			records.add(fields);
		}
		file.close();

		return records;
	}

}
