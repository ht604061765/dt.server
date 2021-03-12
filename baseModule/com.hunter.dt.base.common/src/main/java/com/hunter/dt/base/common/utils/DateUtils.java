package com.hunter.dt.base.common.utils;

import com.hunter.dt.base.common.enumerate.DateFormatPatternEnum;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author caihaopeng
 * @date 17:06 2020/11/10
 **/
public class DateUtils {

    /**
     * 获取某个时间所在天的第一秒
     * @param time 时间
     */
    public static long getDayBeginTime(long time)  {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        //时间设置为零点
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        return calendar.getTimeInMillis();
    }

    /**
     * 获取某个时间所在天的最后一秒
     * @param time 时间
     */
    public static long getDayEndTime(long time)  {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        //时间设置为零点
        calendar.set(Calendar.HOUR_OF_DAY,23);
        calendar.set(Calendar.MINUTE,59);
        calendar.set(Calendar.SECOND,59);
        return calendar.getTimeInMillis();
    }

    /**
     * 获取某个时间几分钟前或者几分钟后的时间
     * @param amount 偏移数量，正数相加，负数相减
     * @return 偏移后的时间戳
     */
    public static long getMinuteOffset(long time, int amount){
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(time);
        c.add(Calendar.MINUTE, amount);
        return c.getTimeInMillis();
    }

    /**
     * 获取某个时间几小时前或者几小时后的时间
     * @param amount 偏移数量，正数相加，负数相减
     * @return 偏移后的时间戳
     */
    public static long getHourOffset(long time, int amount){
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(time);
        c.add(Calendar.HOUR_OF_DAY, amount);
        return c.getTimeInMillis();
    }

    /**
     * 获取某个时间几天前或者几天后的时间
     * @param amount 偏移数量，正数相加，负数相减
     * @return 偏移后的时间戳
     */
    public static long getDayOffset(long time, int amount){
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(time);
        c.add(Calendar.DATE, amount);
        return c.getTimeInMillis();
    }

    /**
     * 获取某个时间几周前或者几周后的时间
     * @param amount 偏移数量，正数相加，负数相减
     * @return 偏移后的时间戳
     */
    public static long getWeekOffset(long time, int amount){
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(time);
        c.add(Calendar.WEEK_OF_YEAR, amount);
        return c.getTimeInMillis();
    }

    /**
     * 获取某个时间几月前或者几月后的时间
     * @param amount 偏移数量，正数相加，负数相减
     * @return 偏移后的时间戳
     */
    public static long getMonthOffset(long time, int amount){
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(time);
        c.add(Calendar.MONTH, amount);
        return c.getTimeInMillis();
    }

    /**
     * 获取某个时间几年前或者几年后的时间
     * @param amount 偏移数量，正数相加，负数相减
     * @return 偏移后的时间戳
     */
    public static long getYearOffset(long time, int amount){
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(time);
        c.add(Calendar.YEAR, amount);
        return c.getTimeInMillis();
    }

    /**
     * 时间戳格式化
     * @param timeStamp 时间戳数据
     * @param dateFormatPatternEnum 格式枚举类
     * @return 格式化后的时间字符串
     */
    public static String format(Long timeStamp, DateFormatPatternEnum dateFormatPatternEnum){
        SimpleDateFormat format = new SimpleDateFormat(dateFormatPatternEnum.getPattern());
        return format.format(timeStamp);
    }

//    public static void main(String[] args) {
//
//        SimpleDateFormat format = new SimpleDateFormat(dateFormatPatternEnum.getPattern());
//
//        long aaa1 = getMinuteOffset(-2);
//        System.out.println("2分钟前："+ format.format(aaa1));
//
//        long aaa2 = getHourOffset(1);
//        System.out.println("一小时后："+ format.format(aaa2));
//
//        long aaa = getDayOffset(1);
//        System.out.println("一天后："+ format.format(aaa));
//
//        long bbb = getWeekOffset(-1);
//        System.out.println("一周前："+ format.format(bbb));
//
//        long ccc = getMonthOffset(1);
//        System.out.println("一月后："+ format.format(ccc));
//
//        long ddd = getYearOffset(-1);
//        System.out.println("一年前："+ format.format(ddd));
//    }
}
