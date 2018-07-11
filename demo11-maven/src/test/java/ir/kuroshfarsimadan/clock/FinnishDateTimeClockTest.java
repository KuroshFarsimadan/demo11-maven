package ir.kuroshfarsimadan.clock;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FinnishDateTimeClockTest {
	private FinnishDateTimeClock kello;

	@Before
	public void createClocl() {
		ClockSource mockLahde = new MockClockSource();
		this.kello = new FinnishDateTimeClock(mockLahde);
	}

	@Test
	public void testGetTime() {
		String actual = this.kello.getTime();
		String expected = "13:22"; // EASTERN EUROPEAN TIME (GMT + 2 HOURS)
		assertEquals(expected, actual);
	}

	@Test
	public void testGetDate() {
		String actual = this.kello.getDate();
		String expected = "02.01.1970";
		assertEquals(expected, actual);
	}
}
