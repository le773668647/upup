package distributedlock;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liangze
 * @create 2020-09-02 上午9:59
 */

public class TimeTest {
    static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");



    /**
     * 主函数
     * @param args
     */
    public static void main(String[] args) {
        TimeTest test = new TimeTest();
        String start= "2020-09-16 00:00:00";
        String end= "2020-09-17 00:00:00";
        long gap = test.getTimeGap(start, end);
        long last = System.currentTimeMillis();
        while (gap > 0){
            if ((System.currentTimeMillis() - last)%1000 == 0){
                System.out.println(test.getTime(gap));
                gap = gap - 1000;
            }
        }
    }

    public long getTimeGap(String startTime, String endTime) {

        Date startTimeDate = new Date();
        Date endTimeDate = new Date();

        try {
            //时间转化
            startTimeDate = simpleDateFormat.parse(startTime);
            endTimeDate = simpleDateFormat.parse(endTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //计算时间差
        return ((endTimeDate.getTime() - startTimeDate.getTime()));
    }

    /**
     * pin
     * @param time
     * @return
     */
    private String getTime(long time){
        long day = 1000*24*60*60;//一天的毫秒数
        long hour = 1000*60*60;//一小时的毫秒数
        long min = 1000*60;//一分钟的毫秒数
        long sec = 1000;//一秒钟的毫秒数
        return time/day + "天" + time%day/hour + "小时" + time%day%hour/min + "分钟" + time%day%hour%min/sec + "秒";

    }


}
