package Part5Main;

public class T_TestPage142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = new String("ȫ�浿");
		String name2 = new String("ȫ�浿");
		//����� �ʱ�ȭ ���ÿ�!!!!!!!
		
		System.out.println(name==name2);
		System.out.println(name.equals(name2));
		
		Object o1 =new Object();
		Object o2 =new Object();
		
		System.out.println(o1==o2);
		System.out.println(o1.equals(o2));
		
		String str = null;
		//null�� ���ؼ� ������ �ϸ� �ȵȴ�....nullpointerexception
		//System.out.println(str.length());
		
		int a[]=null;
		//System.out.println(a.length);//�迭 ��ü �����Ϸ��� �õ� �� ������ �ͼ��� �߻�.
		 
		int a1[][];
		int[][] b;
		int []c[];
		
		int[] a2= {1,5,2,3,7,4,6}; // member initialize list ��� �ʱ�ȭ ���
		int[] ar=new int [10];
		
		System.out.println(a2.length);
		
		for (int i = 0; i < a2.length; i++) {
			System.out.println(a2[i]);
		}
		
		
	}

}
