package Part_8_Question;

interface DataAccessObject{
	void select();
	void insert();
	void update();
	void delete();
}

class OracleDao implements DataAccessObject{
	private static final String NAME="Oracle DB";
	@Override
	public void select() {
		System.out.println(NAME+"에서 검색");
	}

	@Override
	public void insert() {
		System.out.println(NAME+"에 삽입");
	}

	@Override
	public void update() {
		System.out.println(NAME+"를 수정");
	}

	@Override
	public void delete() {
		System.out.println(NAME+"에서 삭제");
	}
	
}

class MySqlDao implements DataAccessObject{
	private static final String NAME="MySql DB";
	
	@Override
	public void select() {
		System.out.println(NAME+"에서 검색");
	}

	@Override
	public void insert() {
		System.out.println(NAME+"에 삽입");
	}

	@Override
	public void update() {
		System.out.println(NAME+"를 수정");
	}

	@Override
	public void delete() {
		System.out.println(NAME+"에서 삭제");
	}
}

public class Q8_4 {
	
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());

	}

}
