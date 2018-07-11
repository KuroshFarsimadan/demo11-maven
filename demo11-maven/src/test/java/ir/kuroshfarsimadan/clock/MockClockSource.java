package ir.kuroshfarsimadan.clock;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MockClockSource implements ClockSource {

	public Date retrieveTime() {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(new Date(0)); // change calendar position to epoch
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		calendar.add(Calendar.HOUR_OF_DAY, 11);
		calendar.add(Calendar.MINUTE, 22);
		calendar.add(Calendar.SECOND, 33);
		return calendar.getTime();
	}

}
