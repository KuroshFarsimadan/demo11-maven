package ir.kuroshfarsimadan.clock;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * NTPProperties class will take care of the timeserver configuration reading
 * from the properties class
 */
public class NTPProperties {

	public static final String FILE_NAME = "ntp.properties";
	private static NTPProperties instance;
	private Properties properties;

	private NTPProperties() throws IOException {
		// Loading the values from the properties file
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(FILE_NAME);
		properties = new Properties();
		properties.load(inputStream);
	}

	public String getProperty(String nimi) {
		return this.properties.getProperty(nimi);
	}

	public static NTPProperties getInstance() throws IOException {
		if (instance == null) {
			instance = new NTPProperties();
		}
		return instance;
	}

}
