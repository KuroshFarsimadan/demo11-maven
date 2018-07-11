package ir.kuroshfarsimadan.clock;

import java.util.Date;

import org.junit.Test;

import static org.junit.Assert.*;

public class InternetClockSourceTest {

	@Test
	public void testRetrieveTime() {
		Date datetime = new InternetClockSource().retrieveTime();
		assertNotNull(datetime);
	}

}
