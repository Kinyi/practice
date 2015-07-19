package Java_IO_practice;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.Test;

public class TestDate {

	@Test
	public void testDate(){
		Date date = new Date();
		System.out.println(date);
	}
	
	@Test
	public void testDateFormat(){
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		Date date = new Date();
		String format = dateFormat.format(date);
		System.out.println(format);
	}
	
	@Test
	public void testSimpleDateFormat() throws ParseException{
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = new Date();
		String format = simpleDateFormat.format(date);
		System.out.println(format);
		
		String time = "2014/06/08 17:50:00";
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss",Locale.ENGLISH);
		Date parse = simpleDateFormat2.parse(time);
		String format3 = simpleDateFormat.format(parse);
		System.out.println(format3);
		
		DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		//SimpleDateFormat dateTimeInstance = new SimpleDateFormat("yyyy骞碝M鏈坉d鏃�涓嬪崍hh鏃秏m鍒唖s绉�);
		String dateStr = "2013骞�鏈�0鏃�涓嬪崍03鏃�8鍒�6绉�";
		Date tmp = dateTimeInstance.parse(dateStr);
		System.out.println(tmp);
	}

}