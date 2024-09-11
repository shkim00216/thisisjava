package ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
	public static void printLength(String data) {
		try {
		int result = data.length();
			System.out.println("문자 수: " + result);
		} catch(NullPointerException e) {
			System.out.println(e.getMessage()); //예외 발생 이유 리턴
//			System.out.println(e.toString()); //+ 예외 종류 리턴
//			e.printStackTrace(); //+ 예외가 어디서 발생했는지 추적한 내용 리턴
		} finally {
			System.out.println("[마무리 실행]\n");
		}
	}

	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null); //NullPointerException 발생
		System.out.println("[프로그램 종료]");
	}

}
