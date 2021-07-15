package exception;
// Handling Book Exception
@SuppressWarnings("serial")
public class BookHandlingException extends Exception {
	public BookHandlingException(String mesg) {
		super(mesg);
	}
}