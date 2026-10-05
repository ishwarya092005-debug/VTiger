package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;



/**
 * this is the utility class which has functionality from java library
 */

public class JavaUtility {

	/**
	 * this is a generate method to fetch calandar details
	 * @param pattern
	 * @return
	 */
	public String getCalendarDetails(String pattern) {
		Calendar cal = Calendar.getInstance();
		Date date=cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		String value=sdf.format(date);
		return value;
	
		
	}
	
	/**
	 * this is the generic method to generate random number
	 * @param bound
	 * @return
	 */
	
	public int generateRandomNumber(int bound) {
		Random r= new Random();
		int num=r.nextInt(bound);
		return num;
		
	}

}
