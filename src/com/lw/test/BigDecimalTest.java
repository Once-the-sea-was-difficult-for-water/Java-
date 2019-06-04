package com.lw.test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class BigDecimalTest {
		public static void main(String[] args) throws ParseException {
			BigDecimal money = new BigDecimal("20.00");
			System.out.println("BigDecimal转double"+Double.parseDouble(money.toString()));
			
			double x = 1.03;
			double y = 1.02;
			System.out.println("Double减"+(x-y));
			System.out.println("----------------------------------");
			
			/*Date date = new Date();
			Long time = date.getTime();
			System.out.println(time);*/
			/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				Long time = (long) 737272;
				Date date= new Date(737274);
	         
			System.out.println("时间："+sdf.format(date));*/
			 	String logDay = "2017-05-01";
		        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		        try {
		            Date date = sdf.parse(logDay);
		            Calendar calendar = new GregorianCalendar();
		            calendar.setTime(date);
		            calendar.add(calendar.DATE, +1); // 负数为提前几天，正数为推迟几天
		            date = calendar.getTime();
		            String greenDay = sdf.format(date);
		           
		            System.out.println(greenDay);
		        } catch (ParseException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }
		      /* Date now = new Date("2018-01-01") ;
		       Date end = new Date("2018-01-08") ;*/
		       
		       String week = getDayOfWeekByDate("2012-12-25");
		       System.out.println("2012-12-25是：" + week);
		       //计算天数
		       /*Scanner scan = new Scanner(System.in);
		        int day = scan.nextInt();*/
		       String dateTest1 = "2018-08-02";
		       String dateTest3 = "2018-08-28";
		       SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		       Date dateTest2 = sim.parse(dateTest1);
		       Date dateTest4 = sim.parse(dateTest3);
		    /*   Calendar cal = Calendar.getInstance();
		       cal.setTime(dateTest2);
		       cal.add(Calendar.DATE, day);*/
		      
		       System.out.println("------>>>>"+(dateTest2.getTime()-dateTest4.getTime())/1000/60/60/24);
			String dateTest5 = "2018-09-02";
			System.out.println("----->>>>>>"+getDayOfWeekByDate(dateTest5));

			int n = Integer.parseInt("1");
			if(n==1){
				System.out.println("true");
			}
			//获取当前天数
			Date date = new Date();
			System.out.println("该月当前天数为"+date.getDay());
		      
		}
		
		/**
		 * 根据日期 找到对应日期的 星期
		 */
		public static String getDayOfWeekByDate(String date) {
			String dayOfweek = "-1";
			try {
				SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
				Date myDate = myFormatter.parse(date);
		      	SimpleDateFormat formatter = new SimpleDateFormat("E");
		      	String str = formatter.format(myDate);
		      	dayOfweek = str;
		      	
			} catch (Exception e) {
				System.out.println("错误!");
			}
			return dayOfweek;
		}
	/**
	 * 获取当前日期是星期几<br>
	 *
	 * @param date
	 * @return 当前日期是星期几
	 */
	public String getWeekOfDate(Date date) {
		String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
		if (w < 0)
			w = 0;
		return weekDays[w];
	}

}
