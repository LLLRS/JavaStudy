package com.day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ���ں��ַ����໥ת���Ĺ�����
 */
public class DateUtil {
	private DateUtil() {
	}

	/**
	 * ������������þ��ǰ�����ת��һ���ַ���
	 * 
	 * @param d
	 *            ��ת�������ڶ���
	 * @param format yyyy-MM-dd HH:mm:ss
	 *            ���ݹ�����Ҫ��ת���ĸ�ʽ
	 * @return ��ʽ������ַ���
	 */
	public static String dateToString(Date d, String format) {
		// SimpleDateFormat sdf = new SimpleDateFormat(format);
		// return sdf.format(d);
		return new SimpleDateFormat(format).format(d);
	}

	/**
	 * ������������þ��ǰ�һ���ַ���������һ�����ڶ���
	 * 
	 * @param s
	 *            ���������ַ���
	 * @param format
	 *            ���ݹ�����Ҫ��ת���ĸ�ʽ
	 * @return ����������ڶ���
	 * @throws ParseException
	 */
	public static Date stringToDate(String s, String format)
			throws ParseException {
		return new SimpleDateFormat(format).parse(s);
	}
}
