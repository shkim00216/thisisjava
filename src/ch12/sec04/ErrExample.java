package ch12.sec04;

public class ErrExample {

	public static void main(String[] args) {
		try {
			int value = Integer.parseInt("1oo");
		} catch (Exception e) {
			System.err.println("[에러 내용]");
			System.err.println(e.getMessage()); //콘솔에 에러 내용 출력
		}
	}

}
