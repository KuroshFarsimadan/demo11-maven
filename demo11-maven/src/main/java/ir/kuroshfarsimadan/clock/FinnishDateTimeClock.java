package ir.kuroshfarsimadan.clock;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

/**
 * FinnishDateTimeClock class is a Finnish date time clock. You can set the
 * Finnish date time source other than the ClockSource class instance, which
 * FinnishDateTimeClock uses in figuring out the current date time.
 * 
 * FinnishDateTimeClock does not care in what country it is run, because the
 * datetime will be always shown according the the Eastern-Europe timezone and
 * the time will be formatted to local Finnish format.
 */
public class FinnishDateTimeClock implements Clock {

	private ClockSource clockSource;

	private SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm");
	private SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.yyyy");
	private TimeZone easternEuropeanTime = TimeZone.getTimeZone("Europe/Helsinki");

	public FinnishDateTimeClock(ClockSource clocksource) {
		this.clockSource = clocksource;
		this.timeFormatter.setTimeZone(easternEuropeanTime);
		this.dateFormatter.setTimeZone(easternEuropeanTime);
	}

	public String getTime() {
		return timeFormatter.format(clockSource.retrieveTime());
	}

	public String getDate() {
		return dateFormatter.format(clockSource.retrieveTime());
	}

}