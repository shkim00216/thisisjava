package ch06.sec07.exam03;

public class Korean {
	//필드 선언
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자 선언
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	} //매개변수명 = 필드명(필드 구분 위해 this 키워드 붙임)
}
