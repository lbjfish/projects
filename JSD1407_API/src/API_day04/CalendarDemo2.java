package API_day04;
/**
 * Calendar --> String
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo2 {
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
	   Date date = c.getTime();
	   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
	   String str = sdf.format(date);
	   System.out.println(str);
	}

}
