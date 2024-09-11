package ch11.question.exam07;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {
		
	}
	
	public WrongPasswordException(String message) {
		super(message);
	}
}
