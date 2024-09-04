package ch08.question.answer03;

public class OracleDao implements DataAccessObject {
	String OD = "Oracle DB";

	@Override
	public void select() {
		System.out.println(OD + "에서 검색");
	}

	@Override
	public void insert() {
		System.out.println(OD + "에서 삽입");

	}

	@Override
	public void update() {
		System.out.println(OD + "에서 수정");
	}

	@Override
	public void delete() {
		System.out.println(OD + "에서 삭제");
	}

}
