package ch11.question.exam07;

public class NotExistIDException extends Exception {
	public NotExistIDException() {
		
	}
	
	public NotExistIDException(String message) {
		super(message);
	}
}
