package ir.kuroshfarsimadan.clock;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.TimeInfo;

/**
 * Retrieves the time information from the internet server time-a.nist.gov and
 * this application requires the apache commons net library.
 */
public class InternetClockSource implements ClockSource {

	public Date retrieveTime() {
		String server = null;
		try {
			server = NTPProperties.getInstance().getProperty("server_domain");
		} catch (Exception e) {
			throw new InternetClockSourceException("Clockserver address could not be read from the properties file", e);
		}

		NTPUDPClient client = new NTPUDPClient();
		InetAddress address;
		TimeInfo timeinformation;

		try {
			address = InetAddress.getByName(server);
			timeinformation = client.getTime(address);
		} catch (UnknownHostException e) {
			throw new InternetClockSourceException("Clockserver address could not be resolved", e);
		} catch (IOException e) {
			throw new InternetClockSourceException("Time information could not be retrieved from the internet", e);
		}

		long milSecFromEpoch = timeinformation.getReturnTime();
		Date currentDateTime = new Date(milSecFromEpoch);
		return currentDateTime;
	}

}
