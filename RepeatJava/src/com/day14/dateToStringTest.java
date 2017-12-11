package com.day14;

import java.text.ParseException;
import java.util.Date;

public class dateToStringTest {

	public static void main(String[] args) throws ParseException {
//		oneDemo();
		//计算自己出生了多少天
		String format = "yyyy-MM-dd HH:mm:ss";
		
		String time = "1995-12-11 12:12:12";
		Date d = DateUtil.stringToDate(time, format);
		
		long day = (System.currentTimeMillis()-d.getTime())/24/60/60/1000;
		
		System.out.println(day);
		
		
	}

	public static void oneDemo() throws ParseException {
		//时间格式： yyyy-MM-dd HH:mm:ss
		String format = "yyyy-MM-dd HH:mm:ss";
		
		//dateToString
		Date d = new Date();
		System.out.println(DateUtil.dateToString(d, format));

		//stringToDate
		String time = "2017-12-09 18:20:46";
		System.out.println(DateUtil.stringToDate(time, format));
	}

}
