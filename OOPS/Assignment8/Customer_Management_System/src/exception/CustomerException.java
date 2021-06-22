package exception;

@SuppressWarnings("serial")
public class CustomerException extends Exception {
	public CustomerException(String message) {
		super(message);
	}
}