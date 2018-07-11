package ir.kuroshfarsimadan.clock;

import java.util.Date;

public class SystemClockSource implements ClockSource {

	public Date retrieveTime() {
		return new Date(System.currentTimeMillis());
	}

}
