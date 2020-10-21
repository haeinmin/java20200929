package chap08.textbook.exercises.p04;

public class OracleDao implements DataAccessObject {
	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
		
	}
	@Override
	public void insert() {
		System.out.println("Oracle DB에 삽입");
		
	}
	@Override
	public void select() {
		System.out.println("Oracle DB에서 선택");
		
	}
	@Override
	public void update() {
		System.out.println("Oracle DB를 수정");
		
	}

}