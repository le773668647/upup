package timeCal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author liangze
 * @create 2020-08-05 下午5:09
 */
public class TimeCalTest {
    public void timecal(){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date= null;
        try {
            date = simpleDateFormat.parse("2021-08-06 20:56:06");
            System.out.println(date);
            System.out.println(simpleDateFormat.format(date));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }


        cal.setTime(date);
        long date1= cal.getTimeInMillis();
        cal.setTime(new Date());
        long date2=cal.getTimeInMillis();
        System.out.println((date1-date2/(3600*1000*24)));

        Date now = new Date();
        System.out.println(simpleDateFormat.format(now));
        System.out.println((date.getTime()-new Date().getTime())/(3600*1000*24));
        int day=(int) ((date.getTime()-new Date().getTime())/(3600*1000*24));
        System.out.println(day);
    }
}
