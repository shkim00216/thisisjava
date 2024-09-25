package ch12.question.exam05;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}

	//학번이 같으면 동등 객체가 될 수 있도록!
	@Override
	public int hashCode() {
		int hashCode = studentNum.hashCode();
		System.out.println(hashCode);
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student target) {
			if(studentNum.equals(target.getStudentNum())) {
				return true;
			}
		}
		return false;
	}
	
	
}
