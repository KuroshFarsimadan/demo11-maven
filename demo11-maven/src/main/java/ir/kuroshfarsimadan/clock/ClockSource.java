package ir.kuroshfarsimadan.clock;

import java.util.Date;

/**
 * ClockSource interface implementing class must be able to retrieve the current
 * time.
 */
public interface ClockSource {

	public Date retrieveTime();

}
