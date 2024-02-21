package KangJeongTaek.day09.Practice7;

public class MySqlDao implements DataAccessObject{
	public void select() {
		System.out.println("MySqlDao에서 검색");
	}
	
	public void insert() {
		System.out.println("MySqlDao에 삽입");
	}
	public void update() {
		System.out.println("MySqlDao를 수정");
	}
	public void delete() {
		System.out.println("MySqlDao에서 삭제");
	}
}
