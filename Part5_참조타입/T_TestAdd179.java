package Part5Main;
//������ �߰� ���
enum Country{
	Korea("���ѹα�"), America("�̱�"), Canada("ĳ����"), England("����");
	private String name;
	
	private Country(String name) {
		this.name = name;
	}
	
	public String getname() {
		return name;
	}
}

public class T_TestAdd179 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//enum ���� new�� ������� �ʴ´�!
		Country c =Country.Korea;//�̶� �����ϴ� ���� �����ڰ� ȣ���� �Ǹ鼭 �ν��Ͻ��� �����ȴ�.
		System.out.println(c);//Korea
		System.out.println(c.getname());//���ѹα�
		c=Country.America;
		System.out.println(c);//America
		System.out.println(c.getname());//�̱�
	}

}
