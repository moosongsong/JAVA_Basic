package Part8Maint;


@FunctionalInterface
interface Calc{
	public abstract int sum(int a, int b);
	//���ٽĿ����� �ϳ��� �߻�޼ҵ常 ������ �Ѵ�.
	//functional interface ��� �Ѵ�.
}

public class Interface_AppStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calc c = new Calc() {
			
//			@Override
//			public int sum(int a, int b) {
//				return a+b;
//			};//Ŭ���� �̸��� ��� �̸� ���� ����.
//			//calc�� ������ �������̽��� ���� 
//			//�׷��� ���⿡ ���� �ؾ���
//			int s =c.sum(10, 20);
//			
			
	//	};
		
		Calc c2 = (a,b)->{
			return (a+b);
		};
		int s =c2.sum(10, 20);
	}

}
