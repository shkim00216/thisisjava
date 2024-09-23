package ch12.sec05;

public class StringBuilderExample {

	public static void main(String[] args) {
		String data = new StringBuilder()
				.append("DEF")
				.insert(0,"ABC")
				.delete(3,4)
				.toString();
		System.out.println(data);
		//메소드 체이닝 : 자기 자신의 메소드를 호출하여 자기 자신의 값을 바꿔나가는 것
		}

}
