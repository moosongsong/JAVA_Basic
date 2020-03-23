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
		System.out.println(NAME+"���� �˻�");
	}

	@Override
	public void insert() {
		System.out.println(NAME+"�� ����");
	}

	@Override
	public void update() {
		System.out.println(NAME+"�� ����");
	}

	@Override
	public void delete() {
		System.out.println(NAME+"���� ����");
	}
	
}

class MySqlDao implements DataAccessObject{
	private static final String NAME="MySql DB";
	
	@Override
	public void select() {
		System.out.println(NAME+"���� �˻�");
	}

	@Override
	public void insert() {
		System.out.println(NAME+"�� ����");
	}

	@Override
	public void update() {
		System.out.println(NAME+"�� ����");
	}

	@Override
	public void delete() {
		System.out.println(NAME+"���� ����");
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
