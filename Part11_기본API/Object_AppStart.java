package Part11Main;

public class Object_AppStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o1 = new Object();
//		Object o2 = new Object();
		Object o2 = o1;
		
		System.out.println(o1==o2);//false
		
		System.out.println(o1.equals(o2));
		//false
		//��� ��ü���� ������ �� �޶�
		//�������̵��� ���� �ʴ� �̻� ���� ���Ա� �ϱ� ���� �̷���
	}

}
