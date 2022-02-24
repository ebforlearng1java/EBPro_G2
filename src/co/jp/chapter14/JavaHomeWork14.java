package co.jp.chapter14;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class JavaHomeWork14 {
    //Q1
    public static void eachEveryDay(String startDay,String endDay) throws ParseException{
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date date1=simpleDateFormat.parse(startDay);
        Date date2=simpleDateFormat.parse(endDay);

        while(date1.before(date2)){
            String outputDate=simpleDateFormat.format(date1.getTime());
            System.out.println(outputDate);
            Calendar temp=Calendar.getInstance();
            temp.setTime(date1);
            temp.add(Calendar.DAY_OF_MONTH,1);
            date1=temp.getTime();
        }
        String outputDate=simpleDateFormat.format(date2.getTime());
        System.out.println(outputDate);
    }
    //Q2
    public static void kinmuhyo(){
        String line;
        String splitby=",";
        try{
            FileInputStream fileInputStream=new FileInputStream("src\\co\\jp\\chapter14\\2019-06.csv");
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(fileInputStream));
            //仅对应勤務表中的“⽇付, 開始時刻, 終了時刻, 休憩時間”
            String title=bufferedReader.readLine();
            //工作时间数列
            ArrayList<Integer> workTime=new ArrayList<Integer>();
            //加班时间数列
            ArrayList<Integer> overTime=new ArrayList<Integer>();
            //总工时
            Integer totalWorkTime =0;
            //总加班工时
            Integer totalOvertime=0;
            //读取并计算时间
            while((line=bufferedReader.readLine())!=null){
                String[] time=line.split(splitby);
                Calendar sCal=Calendar.getInstance();
                Calendar eCal=Calendar.getInstance();
                Calendar oCalendar=Calendar.getInstance();
                int day=Integer.valueOf(time[0]);
                if(!time[1].isEmpty()&&!" ".equals(time[1])){
                    String[] tm=time[1].split(":");
                    int hour =Integer.valueOf(tm[0].trim());
                    int minute = Integer.valueOf(tm[1].trim());
                    sCal.set(2019,06,day,hour,minute);
                    if(!time[2].isEmpty()&&!" ".equals(time[2])){
                        String[] tm1=time[2].split(":");
                        int hour2 =Integer.valueOf(tm1[0].trim());
                        int minute2 = Integer.valueOf(tm1[1].trim());
                        eCal.set(2019,06,day,hour2,minute2);
                        oCalendar.set(2019, 06,day,19,0);
                        if(eCal.after(oCalendar)){
                            Long otime =eCal.getTime().getTime()-oCalendar.getTime().getTime();
                            otime=otime/60/1000/15;
                            otime=otime*15;
                            overTime.add(otime.intValue());
                        }
                    }
                    else{
                        workTime.add(0);
                    }
                    Integer restMinute=0;
                    if(!time[3].isEmpty()&&!" ".equals(time[3])){
                        String[] tm3=time[3].split(":");
                        restMinute = Integer.valueOf(tm3[0].trim())*60;
                    }
                    Long workMinute =eCal.getTime().getTime()-sCal.getTime().getTime();
                    workMinute=workMinute/60/1000/15;
                    workMinute=workMinute*15;
                    workMinute=workMinute-restMinute;
                    workTime.add(workMinute.intValue());
                }
                else {
                    workTime.add(0);
                }
            }

            //输出
            int i=1;
            System.out.println("作業時間: ");
            for (Integer integer : workTime) {
                System.out.printf("Day%d　:%d 時%d 分\n",i,integer/60,integer%60);
                totalWorkTime+=integer;
                i++;
            }
            i=1;
            System.out.println("残業時間: ");
            for (Integer integer : overTime) {
                System.out.printf("Day%d　:%d 時%d 分\n",i,integer/60,integer%60);
                totalOvertime+=integer;
                i++;
            }
            System.out.println("総作業時間: "+totalWorkTime/60+"時"+totalWorkTime%60+"分");
            System.out.println("総残業時間: "+totalOvertime/60+"時"+totalOvertime%60+"分");
            bufferedReader.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) throws ParseException{
        //Q1
        eachEveryDay("2022-02-22","2022-02-28");
        //Q2
        kinmuhyo();
    }
}
