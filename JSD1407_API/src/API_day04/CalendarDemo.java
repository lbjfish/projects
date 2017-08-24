package API_day04;
/**
 * String --> Calendar
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
	public static void main(String[] args) throws ParseException{
		String str = "2008-08-08";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(str);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		System.out.println(c.getTime());
	}

}
