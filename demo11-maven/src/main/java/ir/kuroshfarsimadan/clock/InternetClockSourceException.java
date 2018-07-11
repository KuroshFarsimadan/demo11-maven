package ir.kuroshfarsimadan.clock;

public class InternetClockSourceException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InternetClockSourceException(String message, Throwable exception) {
		super(message, exception);
	}

}
