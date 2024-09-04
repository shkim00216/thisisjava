package ch07.question.answer01;

public class Child extends Parent {
	public int studentNo;
	
	public Child(String name, int studentNo) {
		super(name); //this.name = name; 부모생성자 올바르게 생성하기
		this.studentNo = studentNo;
	}
}
